import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/*
 *Drawing thing I guess 
 * 
 * This is a very exciting project!
 * 
 * 4/21/17
 */
public class FaceComponent extends JComponent
{
    public void paintComponent (Graphics g)
    {
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;      
        //draw hair
        g2.draw(new Line2D.Double(340, 193, 344, 150));
        g2.draw(new Line2D.Double(344, 150, 339, 131));
        g2.draw(new Line2D.Double(340, 130, 358, 121));
        g2.draw(new Line2D.Double(358, 121, 362, 121));
        g2.draw(new Line2D.Double(362, 121, 368, 142));
        g2.draw(new Line2D.Double(368, 142, 368, 150));
        //greeting
        
    }
} 