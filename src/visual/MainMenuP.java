
package visual;

import marveltry1.MainPro;
import objects.Usuario;

public class MainMenuP extends javax.swing.JPanel {

    /**
     *
     */
    public Usuario player1;
    
    public MainMenuP(Usuario player1) {
        initComponents();
        this.player1 = player1;
        lLoggedIn.setText(this.player1.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bStrategoMarvel = new javax.swing.JButton();
        bConfiguracion = new javax.swing.JButton();
        bMiPerfil = new javax.swing.JButton();
        bUniverso = new javax.swing.JButton();
        bCerrarSesion = new javax.swing.JButton();
        lLoggedIn = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1280, 720));

        bStrategoMarvel.setText("Stratego - MARVEL HEROES!");
        bStrategoMarvel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bStrategoMarvelMouseReleased(evt);
            }
        });

        bConfiguracion.setText("Configuracion");
        bConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bConfiguracionMouseReleased(evt);
            }
        });

        bMiPerfil.setText("Mi Perfil");
        bMiPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bMiPerfilMouseReleased(evt);
            }
        });

        bUniverso.setText("Universo Marvel");
        bUniverso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bUniversoMouseReleased(evt);
            }
        });

        bCerrarSesion.setText("Cerrar Sesion");
        bCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bCerrarSesionMouseReleased(evt);
            }
        });

        lLoggedIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLoggedIn.setText("user");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(540, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bStrategoMarvel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(bConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMiPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bUniverso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lLoggedIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(540, 540, 540))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(lLoggedIn)
                .addGap(49, 49, 49)
                .addComponent(bStrategoMarvel)
                .addGap(45, 45, 45)
                .addComponent(bConfiguracion)
                .addGap(45, 45, 45)
                .addComponent(bMiPerfil)
                .addGap(45, 45, 45)
                .addComponent(bUniverso)
                .addGap(45, 45, 45)
                .addComponent(bCerrarSesion)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bCerrarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCerrarSesionMouseReleased
        MainPro.lol.setPanel(new SplashP());
    }//GEN-LAST:event_bCerrarSesionMouseReleased

    private void bStrategoMarvelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bStrategoMarvelMouseReleased
        MainPro.lol.setPanel(new NewGameP(player1));
    }//GEN-LAST:event_bStrategoMarvelMouseReleased

    private void bConfiguracionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bConfiguracionMouseReleased
        MainPro.lol.setPanel(new ConfiguracionP(player1));
    }//GEN-LAST:event_bConfiguracionMouseReleased

    private void bUniversoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bUniversoMouseReleased
        MainPro.lol.showMessage("Aviso","PROXIMAMENTE", 1);
    }//GEN-LAST:event_bUniversoMouseReleased

    private void bMiPerfilMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMiPerfilMouseReleased
        MainPro.lol.showMessage("Aviso","PROXIMAMENTE", 1);
    }//GEN-LAST:event_bMiPerfilMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrarSesion;
    private javax.swing.JButton bConfiguracion;
    private javax.swing.JButton bMiPerfil;
    private javax.swing.JButton bStrategoMarvel;
    private javax.swing.JButton bUniverso;
    private javax.swing.JLabel lLoggedIn;
    // End of variables declaration//GEN-END:variables
}
