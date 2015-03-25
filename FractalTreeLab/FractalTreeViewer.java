import javax.swing.JFrame;
import java.awt.Color;

/**
 * Write a description of class FractalTreeViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractalTreeViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(1500, 1000);
        frame.setTitle("Fractal Tree!!");
        frame.setBackground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FractalTreeComponent component = new FractalTreeComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
