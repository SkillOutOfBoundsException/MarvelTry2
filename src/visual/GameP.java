/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import marveltry1.MainPro;
import objects.Usuario;

/**
 *
 * @author Diegu7
 */
public class GameP extends javax.swing.JPanel {

    /**
     * Creates new form GameP
     */
    public static Usuario player1;
    public static Usuario player2;
    
    public GameP(Usuario player1, Usuario player2) {
        initComponents();
        this.player1 = player1;
        this.player2 = player2;
        lTurnoDe.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonsP1 = new visual.ButtonsP();
        bRendir = new javax.swing.JButton();
        lTurnoDe = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        buttonsP1.setPreferredSize(new java.awt.Dimension(700, 700));

        bRendir.setText("RENDIRSE");
        bRendir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bRendirMouseReleased(evt);
            }
        });

        lTurnoDe.setText("Turno de: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(buttonsP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bRendir, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(lTurnoDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(buttonsP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(lTurnoDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bRendir)
                .addGap(313, 313, 313))
        );
    }// </editor-fold>//GEN-END:initComponents

    public static void setLabel(String s){
        lTurnoDe.setText(s);
    }
    
    private void bRendirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRendirMouseReleased
        MainPro.lol.setPanel(new MainMenuP(player1));
    }//GEN-LAST:event_bRendirMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRendir;
    private visual.ButtonsP buttonsP1;
    private static javax.swing.JLabel lTurnoDe;
    // End of variables declaration//GEN-END:variables
}
