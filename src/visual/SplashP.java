
package visual;

import marveltry1.MainPro;

public class SplashP extends javax.swing.JPanel {

    public SplashP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCrearUsu = new javax.swing.JButton();
        bLogin = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1280, 720));

        bCrearUsu.setText("Crear Usuario");
        bCrearUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bCrearUsuMouseReleased(evt);
            }
        });
        bCrearUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearUsuActionPerformed(evt);
            }
        });

        bLogin.setText("Login");
        bLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bLoginMouseReleased(evt);
            }
        });
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(510, 510, 510)
                    .addComponent(bLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addComponent(bCrearUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(511, 511, 511)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(346, 346, 346)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bCrearUsu)
                        .addComponent(bLogin))
                    .addContainerGap(346, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bCrearUsuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCrearUsuMouseReleased
        MainPro.lol.setPanel(new LoginP(false));
    }//GEN-LAST:event_bCrearUsuMouseReleased

    private void bCrearUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCrearUsuActionPerformed

    private void bLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLoginMouseReleased
        MainPro.lol.setPanel(new LoginP(true));
    }//GEN-LAST:event_bLoginMouseReleased

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrearUsu;
    private javax.swing.JButton bLogin;
    // End of variables declaration//GEN-END:variables
}
