
package visual;

import java.awt.event.KeyEvent;
import marveltry1.MainPro;

public class LoginP extends javax.swing.JPanel {

    public boolean logOCre;
    
    public LoginP(boolean logCre) {
        initComponents();
        logOCre = logCre;
    }
    
    public String takeUsuario(){
        return fUsuario.getText();
    }
    
    public String takePassword(){
        return fPassword.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fUsuario = new javax.swing.JTextField();
        fPassword = new javax.swing.JPasswordField();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        fUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fUsuario.setText("Dego");
        fUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fUsuarioMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fUsuarioMouseReleased(evt);
            }
        });
        fUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fUsuarioActionPerformed(evt);
            }
        });

        fPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fPassword.setText("12345");
        fPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fPasswordMouseReleased(evt);
            }
        });
        fPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fPasswordKeyPressed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bAceptarMouseReleased(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bCancelarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(510, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(fPassword)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(510, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(fUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(fPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addContainerGap(290, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fPasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fPasswordMouseReleased
        fPassword.setText("");
    }//GEN-LAST:event_fPasswordMouseReleased

    private void fUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fUsuarioActionPerformed

    private void fUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fUsuarioMouseReleased
        fUsuario.setText("");
    }//GEN-LAST:event_fUsuarioMouseReleased

    private void fUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fUsuarioMouseClicked

    private void bAceptarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAceptarMouseReleased
        String usu = takeUsuario();
        String pass = takePassword();
        if(logOCre){
            if(MainPro.funcs.login(usu, pass)){
                MainPro.lol.setPanel(new MainMenuP(MainPro.funcs.searchUsu(usu)));
                return;
            }
           MainPro.lol.showMessage("Aviso","Usuario o contrasena incorrecta", 0);
           return;
        }
        if(MainPro.funcs.crearUsu(takeUsuario(), takePassword())){
            MainPro.lol.showMessage("Aviso","Usuario creado exitosamente", 1);
            MainPro.lol.setPanel(new MainMenuP(MainPro.funcs.searchUsu(usu)));
            return;
        }
        MainPro.lol.showMessage("Aviso","Usuario ya esta tomado o contrasena no es de 5 caracteres", 0);        
    }//GEN-LAST:event_bAceptarMouseReleased

    private void bCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCancelarMouseReleased
        MainPro.lol.setPanel(new SplashP());
    }//GEN-LAST:event_bCancelarMouseReleased

    private void fPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String usu = takeUsuario();
            String pass = takePassword();
            if(logOCre){
                if(MainPro.funcs.login(usu, pass)){
                    MainPro.lol.setPanel(new MainMenuP(MainPro.funcs.searchUsu(usu)));
                    return;
                }
            MainPro.lol.showMessage("Aviso","Usuario o contrasena incorrecta", 0);
            return;
            }
            if(MainPro.funcs.crearUsu(takeUsuario(), takePassword())){
                MainPro.lol.showMessage("Aviso","Usuario creado exitosamente", 1);
                MainPro.lol.setPanel(new MainMenuP(MainPro.funcs.searchUsu(usu)));
                return;
            }
            MainPro.lol.showMessage("Aviso","Usuario ya esta tomado o contrasena no es de 5 caracteres", 0);
        }
    }//GEN-LAST:event_fPasswordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JPasswordField fPassword;
    private javax.swing.JTextField fUsuario;
    // End of variables declaration//GEN-END:variables
}
