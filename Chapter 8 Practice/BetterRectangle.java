import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
    
    public BetterRectangle(int height, int width, int x, int y)
    {
        super(height, width, x, y);
    }

    public int getPerimeter()
    {
        return 2 * width + 2 * height;
    }
    
    public int area()
    {
        return height * width;
    }
    
}
