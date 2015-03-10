import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.*;

/**
 * Write a description of class TriangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent extends JComponent
{
    private Ellipse2D.Double c1,c2,c3;
    private Line2D.Double l1,l2,l3;
    private int count = 0;
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(c1);
        g2.draw(c2);
        g2.draw(l1);
        g2.draw(c3);
        g2.draw(l2);
        g2.draw(l3);
    }
    public void click(int x, int y)
    {
        switch(count%4){
            case 0: c1 = new Ellipse2D.Double(x,y,10,10);                    
                    break;     
            case 1: c2 = new Ellipse2D.Double(x,y,10,10);
                    l1 = new Line2D.Double(c1.getX(),c1.getY(),x,y);                  
                    break;
            case 2: c3 = new Ellipse2D.Double(x,y,10,10);
                    l2 = new Line2D.Double(c2.getX(),c2.getY(),x,y);
                    l3 = new Line2D.Double(c1.getX(),c1.getY(),x,y);                   
                    break;
            case 3: c1 = new Ellipse2D.Double();
                    c2 = new Ellipse2D.Double();
                    c3 = new Ellipse2D.Double();
                    l1 = new Line2D.Double();
                    l2 = new Line2D.Double();
                    l3 = new Line2D.Double();                    
                    break;
        }
        repaint();
        count ++;
    }
}
