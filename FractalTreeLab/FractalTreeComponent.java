import java.awt.*;
import javax.swing.JComponent;

/**
 * Write a description of class FractalTreeComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractalTreeComponent extends JComponent
{
    private final int PANEL_WIDTH = 2000;
    private final int PANEL_HEIGHT = 1100;

    private final int START_X = 1000;
    private final int START_Y = 950;

    private int current = 1;
    /**
     * Default constructor for objects of class FractalTreeComponent
     */
    public FractalTreeComponent()
    {
        setBackground(Color.blue);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }
    
    public void drawFractal(int order,int x1,int y1, int x2, int y2, Graphics page)
    {
        if(order == 1)
            page.drawLine(x1, y1, x2, y2);
        else if(order >= 500)
        {
            return;
        }
        else
        {
            
        }
    }
}
