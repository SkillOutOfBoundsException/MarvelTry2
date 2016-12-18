
package visual;

import javax.swing.JOptionPane;
import marveltry1.MainPro;
import objects.Usuario;
import twitter4j.Twitter;
import objects.GuardarEnDisco;
import twitter4j.TwitterFactory;

public class MiPerfil extends javax.swing.JPanel {
    
    public Usuario player1;
    MainPro mp;

    public MiPerfil(Usuario player1) {
        initComponents();
        this.player1 = player1;
        txtusuario.setText(this.player1.getNombre());
        txtpuntos.setText(""+player1.getPoints());
        
        String registros = "";
        for (String i : player1.getArrayList()) {
            registros += i;
            registros += "\n";
        }
        areaRegistros.setText(registros);
        areaRegistros.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JLabel();
        txtpuntos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaRegistros = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Datos del Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        jLabel2.setText("Nombre : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        jLabel3.setText("Puntos: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        txtusuario.setText("usuario");
        add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));
        txtusuario.getAccessibleContext().setAccessibleDescription("");

        txtpuntos.setText("puntaje");
        add(txtpuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, -1));

        areaRegistros.setColumns(20);
        areaRegistros.setRows(5);
        jScrollPane1.setViewportView(areaRegistros);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 460, 160));

        jLabel4.setText("Registros: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        jButton1.setText("Cambiar Contrasena");
        jButton1.setMinimumSize(new java.awt.Dimension(190, 32));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        eliminar.setText("Eliminar Mi Cuenta");
        eliminar.setMaximumSize(new java.awt.Dimension(190, 32));
        eliminar.setMinimumSize(new java.awt.Dimension(190, 32));
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eliminarMouseReleased(evt);
            }
        });
        add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 150, -1));

        jButton3.setText("Regresar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, 150, -1));

        jButton4.setText("Conectar a Twitter");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        MainPro.lol.setPanel(new MainMenuP(player1));
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased

    }//GEN-LAST:event_jButton1KeyReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        player1.setPassword(JOptionPane.showInputDialog("Ponga su nueva contrasena: "));
    }//GEN-LAST:event_jButton1MouseReleased

    private void eliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseReleased
        if (player1.getPassword().equals(JOptionPane.showInputDialog("Escriba su contrasena actual: "))) {
            mp.funcs.arrUsu.remove(player1);
            Usuario.activos--;
            MainPro.lol.setPanel(new SplashP());
        } else
            JOptionPane.showMessageDialog(null, "No escribio bien su contrasena");
    }//GEN-LAST:event_eliminarMouseReleased

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        Twitter twitter;
        String userTweet = JOptionPane.showInputDialog("Escriba su usuario de twitter: ");
        String passTweet = JOptionPane.showInputDialog("Escriba su contrase de twitter");
        //twitter = new TwitterFactory().getInstance(userTweet, passTweet);
    }//GEN-LAST:event_jButton4MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaRegistros;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtpuntos;
    private javax.swing.JLabel txtusuario;
    // End of variables declaration//GEN-END:variables
}
