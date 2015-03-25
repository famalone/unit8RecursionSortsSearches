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
    private final int PANEL_WIDTH = 1500;
    private final int PANEL_HEIGHT = 1000;

    private final int START_X = 750;
    private final int START_Y = 900;

    private int current = 1;
    private int angle = 30;
    private final double LINE_FACTOR = .8;

    /**
     * Default constructor for objects of class FractalTreeComponent
     */
    public FractalTreeComponent()
    {
        this.setBackground(Color.blue);
        this.setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    public void drawFractal(int order, int x1, int y1, int x2, int y2,
    Graphics page, int previousAngle)
    {
        int distX, distY;
        if(order == 1)
        {
            page.drawLine(x1, y1, x2, y2);
            current++;
        }
        else if(order >= 200)
        {
            return;
        }
        else
        {
            angle = previousAngle + angle;
            
            current++;
        }
    }

    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);

        page.setColor (Color.green);

        drawFractal (current, START_X, START_Y, START_X,START_Y - 100 , page, angle);
    }
}
