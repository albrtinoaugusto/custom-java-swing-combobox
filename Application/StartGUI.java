
package Application;

import java.awt.Color;

/**
 *
 * @author Albertino Augusto */

public class StartGUI extends javax.swing.JFrame 
{

    private static final Color BACKGROUND = Color.decode("#342a2a");
    private static final Color FOREGROUND = Color.WHITE;
    private static final Color SELECTIONFOREGROUND = Color.YELLOW;
    
    public StartGUI() 
    {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbProduct = new org.edisoncor.gui.comboBox.ComboBoxRect();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbProduct.setBorder(null);
        cbProduct.setEditable(true);
        cbProduct.setForeground(new java.awt.Color(255, 255, 255));
        cbProduct.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "hadghwad", "awkdwaudghuaw", "awkjdhkwaudhukaw", "akwdjwaiud", " " }));
        cbProduct.setAnchoDeBorde(0.0F);
        cbProduct.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(cbProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 259, 28));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 535, 339));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new StartGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.comboBox.ComboBoxRect cbProduct;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
