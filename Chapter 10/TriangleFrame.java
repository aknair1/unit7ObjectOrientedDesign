import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class TriangleFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleFrame extends JFrame
{
    private TriangleComponent triangle;
    public class PointMouseListener extends MouseAdapter
    {
        public void mousePressed(MouseEvent event)
        {
            triangle.click(event.getX(),event.getY());
        }
    }
    public TriangleFrame()
    {
        triangle = new TriangleComponent();
        MouseListener listener = new PointMouseListener();
        this.add(triangle);
        triangle.addMouseListener(listener);
        
    }
}
