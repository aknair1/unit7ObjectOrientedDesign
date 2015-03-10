import java.awt.event.*;
import javax.swing.*;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;
    JFrame frame;
    JPanel panel;
    JButton buttonA, buttonB;
    JLabel label;
    public ButtonViewer()
    {

        frame = new JFrame();
        panel = new JPanel();
        buttonA = new JButton("A");
        panel.add(buttonA);
        buttonB = new JButton("B");
        panel.add(buttonB);
        label = new JLabel("No Button Clicked");
        panel.add(label);
        frame.add(panel);
        ActionListener listener = new ClickListener();
        buttonA.addActionListener(listener);
        buttonB.addActionListener(listener);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public class ClickListener implements ActionListener
    {  
        public void actionPerformed(ActionEvent event)
        {
            label.setText("Button " + event.getActionCommand() + " was clicked!"); 
        }
    }
    

}