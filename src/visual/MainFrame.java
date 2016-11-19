
package visual;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import marveltry1.MainPro;

public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setPanel(new SplashP());
    }
    
    public final void setPanel(JPanel x){
        mainPanel.removeAll();
        mainPanel.add(x);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public void showMessage(String title, String message, int icon){
        JOptionPane.showMessageDialog(MainPro.lol, message, title, icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        mainPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        mainPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        mainPanel.setLayout(new java.awt.CardLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(mainPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void startFrame() {
        java.awt.EventQueue.invokeLater(() -> {
           MainPro.lol.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
