
package Application;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Path2D;

/**
 *
 * @author Albertino Augusto */

public class RoundedCornerBorder2 extends RoundedCornerBorder 
{

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) 
    {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        
        int r = ARC;
        int w = width - 1;
        int h = height - 1;

        Path2D.Float p = new Path2D.Float();
        p.moveTo(x, y);
        p.lineTo(x, y + h - r);
        p.quadTo(x, y + h, x + r, y + h);
        p.lineTo(x + w - r, y + h);
        p.quadTo(x + w, y + h, x + w, y + h - r);
        p.lineTo(x + w, y);
        p.closePath();
        Area round = new Area(p);

        g2.setPaint(c.getBackground());
        g2.fill(round);

        g2.setPaint(c.getForeground());
        g2.draw(round);
        g2.setPaint(c.getBackground());
        g2.drawLine(x + 1, y, x + width - 2, y);
        g2.dispose();
    }
}