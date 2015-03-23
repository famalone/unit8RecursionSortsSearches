import javax.swing.JFrame;

/**
 * Write a description of class FractalTreeViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractalTreeViewer
{
    JFrame frame = new JFrame();
    
    frame.setSize(2000, 1100);
    frame.setTitle("Fractal Tree!!");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    FractalTreeComponent component = new FractalTreeComponent();
    frame.add(component);
    
    frame.setVisible(true);
}
