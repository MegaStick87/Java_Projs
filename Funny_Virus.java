import java.util.Random;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import javax.swing.JWindow;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Funny_Virus {

    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final int height = (int) screenSize.getHeight();
    private final int width = (int) screenSize.getWidth();
    private final Random Randm = new Random();

    public void BlockAll() throws AWTException
    { 
        Robot _robot = new Robot();
        _robot.keyPress(KeyEvent.VK_0);
        _robot.mouseMove(Randm.nextInt(width),Randm.nextInt(height));
    }

    public void Popup()
    {
        JWindow window = new JWindow();
        JLabel label = new JLabel("DON'T TRY TO KILL ME, U ARE INFECTED :D", JLabel.CENTER);
        window.add(label);
        window.setSize(150, 50);
        window.setLocation(Randm.nextInt(width), Randm.nextInt(height));
        window.setVisible(true);
    }

    public static void main(String[] args) throws AWTException, InterruptedException {
        Funny_Virus ar = new Funny_Virus();

        for(int i=0; i<200; i++) //while (true) 
        {
            ar.BlockAll();
            ar.Popup();
        }
    }
}