/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import marveltry1.MainPro;
import static marveltry1.MainPro.lol;
import objects.Usuario;

/**
 *
 * @author Diegu7
 */
public class ConfiguracionP extends javax.swing.JPanel {

    /**
     * Creates new form ConfiguracionP
     */
    private Usuario player1;
    public boolean tutorial = MainPro.game.tutorial;
    
    public ConfiguracionP(Usuario player1) {
        initComponents();
        this.player1 = player1;
        rTutorial.setSelected(tutorial);
        rClasico.setSelected(!tutorial);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bRegresar = new javax.swing.JButton();
        rTutorial = new javax.swing.JRadioButton();
        rClasico = new javax.swing.JRadioButton();

        setMinimumSize(new java.awt.Dimension(1280, 720));

        bRegresar.setText("Regresar");
        bRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bRegresarMouseReleased(evt);
            }
        });

        buttonGroup1.add(rTutorial);
        rTutorial.setText("Tutorial");

        buttonGroup1.add(rClasico);
        rClasico.setText("Clasico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(rTutorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rClasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(540, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(rTutorial)
                .addGap(37, 37, 37)
                .addComponent(rClasico)
                .addGap(34, 34, 34)
                .addComponent(bRegresar)
                .addGap(325, 325, 325))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bRegresarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRegresarMouseReleased
        MainPro.game.tutorial = rTutorial.isSelected();
        MainPro.lol.setPanel(new MainMenuP(player1));
    }//GEN-LAST:event_bRegresarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton rClasico;
    private javax.swing.JRadioButton rTutorial;
    // End of variables declaration//GEN-END:variables
}
