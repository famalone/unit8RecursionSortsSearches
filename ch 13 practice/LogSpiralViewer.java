import javax.swing.JFrame;

/**
 * Write a description of class LogSpiralViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LogSpiralViewer
{
    public static void main(String[]args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(1500,1500);
        frame.setTitle("Fibonacci");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        LogSpiralPanel fibo = new LogSpiralPanel();
        frame.add(fibo);
        
        frame.setVisible(true);
    }
}
