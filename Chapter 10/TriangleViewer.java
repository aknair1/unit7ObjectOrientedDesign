
import javax.swing.JFrame;
/**
 * Write a description of class TriangleViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new TriangleFrame();
        frame.setSize(1000,1000);
        frame.setTitle("Bumby");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
