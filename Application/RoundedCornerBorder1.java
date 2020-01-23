
package Application;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.Objects;

/**
 *
 * @author Albertino Augusto */

class RoundedCornerBorder1 extends RoundedCornerBorder
{

    //http://ateraimemo.com/Swing/RoundedComboBox.html

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) 
    {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        
        int r = ARC;
        int w = width - 1;
        int h = height - 1;

        Area round = new Area(new RoundRectangle2D.Float(x, y, w, h, r, r));
        Rectangle b = round.getBounds();
        b.setBounds(b.x, b.y + r, b.width, b.height - r);
        round.add(new Area(b));

        Container parent = c.getParent();
        
        if (Objects.nonNull(parent))
        {
            g2.setPaint(parent.getBackground());
            Area corner = new Area(new Rectangle2D.Float(x, y, width, height));
            corner.subtract(round);
            g2.fill(corner);
        }

        g2.setPaint(c.getForeground());
        g2.draw(round);
        g2.dispose();
    }
}