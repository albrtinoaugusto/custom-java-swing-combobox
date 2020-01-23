package Application;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.*;

public class RoundedCombobox 
{

    private static final Color BACKGROUND = Color.decode("#342a2a");
    private static final Color FOREGROUND = Color.WHITE;
    private static final Color SELECTIONFOREGROUND = Color.YELLOW;
    
    private JComponent makeUI()
    {
        UIManager.put("ComboBox.foreground", FOREGROUND);
        UIManager.put("ComboBox.background", BACKGROUND);
        UIManager.put("ComboBox.selectionForeground", SELECTIONFOREGROUND);
        UIManager.put("ComboBox.selectionBackground", BACKGROUND);

        UIManager.put("ComboBox.buttonDarkShadow", BACKGROUND);
        UIManager.put("ComboBox.buttonBackground", FOREGROUND);
        UIManager.put("ComboBox.buttonHighlight", FOREGROUND);
        UIManager.put("ComboBox.buttonShadow", FOREGROUND);

        UIManager.put("ComboBox.border", new RoundedCornerBorder());
        JComboBox<String> combo1 = new JComboBox<>(makeModel());
        combo1.setUI(new BasicComboBoxUI());
        
        Object o = combo1.getAccessibleContext().getAccessibleChild(0);
        
        if(o instanceof JComponent)
        {
            JComponent c = (JComponent) o;
            c.setBorder(new RoundedCornerBorder());
            c.setForeground(FOREGROUND);
            c.setBackground(BACKGROUND);          
        }  
        combo1.addPopupMenuListener(new HeavyWeightContainerListener());

        
////        UIManager.put("ComboBox.border", new RoundedCornerBorder1());
////        JComboBox<String> combo2 = new JComboBox<>(makeModel());
////        combo2.setUI(new BasicComboBoxUI());
////        o = combo2.getAccessibleContext().getAccessibleChild(0);
//        
//        if (o instanceof JComponent) 
//        {
//            JComponent c = (JComponent) o;
//            c.setBorder(new RoundedCornerBorder2());
//            c.setForeground(FOREGROUND);
//            c.setBackground(BACKGROUND);
//        }
//        combo2.addPopupMenuListener(new HeavyWeightContainerListener());

        JPanel p = new JPanel();
        p.add(combo1);
//        p.add(combo2);
        p.setOpaque(true);
        p.setBackground(Color.GRAY);
        return p;
    }

    private static DefaultComboBoxModel<String> makeModel() 
    {
        DefaultComboBoxModel<String> m = new DefaultComboBoxModel<>();
        m.addElement("1234");
        m.addElement("5555555555555555555555");
        m.addElement("6789000000000");
        return m;
    }

//    public static void main(String... args) 
//    {
//        EventQueue.invokeLater(() -> 
//        {
//            JFrame f = new JFrame();
//            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            f.getContentPane().add(new RoundedCombobox().makeUI());
//            f.setSize(800, 400);
//            f.setLocationRelativeTo(null);
//            f.setVisible(true);
//        });
//    }
}







