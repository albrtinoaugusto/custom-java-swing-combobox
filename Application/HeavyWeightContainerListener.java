/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import javax.accessibility.Accessible;
import javax.swing.JComboBox;
import javax.swing.JWindow;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.plaf.basic.BasicComboPopup;

/**
 *
 * @author Albertino Augusto */

public class HeavyWeightContainerListener implements PopupMenuListener 
{
    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent e) 
    {
        EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run()
            {
                JComboBox combo = (JComboBox) e.getSource();
                Accessible a = combo.getUI().getAccessibleChild(combo, 0);
                if (a instanceof BasicComboPopup) 
                {
                    BasicComboPopup pop = (BasicComboPopup) a;
                    Container top = pop.getTopLevelAncestor();
                    if (top instanceof JWindow) 
                    {
                        //http://ateraimemo.com/Swing/DropShadowPopup.html
                        System.out.println("HeavyWeightContainer");
                        ((JWindow) top).setBackground(new Color(0x0, true));
                    }
                }
            }
        });
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
    {
        
    }

    @Override
    public void popupMenuCanceled(PopupMenuEvent e)
    {
        
    }

}