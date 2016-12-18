
package visual;

import objects.Usuario;
import marveltry1.MainPro;

public class UniversoPanel extends javax.swing.JPanel {
    
    public Usuario player1;
    MainPro mp;
    

    public UniversoPanel(Usuario player1) {
        initComponents();
        this.player1 = player1;
        Hganes.setText(""+player1.getHero() + " veces");
        Vganes.setText(""+player1.getEvil() + " veces");
        activos.setText(""+Usuario.activos);
        
        String usuarios = "";
        for (Usuario s : mp.funcs.arrUsu) {
            usuarios += s.getNombre() + " Puntaje: " + s.getPoints() + "\n";
        }
        
        jugadores.setText(usuarios);
        jugadores.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jugadores = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        activos = new javax.swing.JLabel();
        historicos = new javax.swing.JLabel();
        Hganes = new javax.swing.JLabel();
        Vganes = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Lista de Jugadores");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 64, -1, -1));

        jugadores.setColumns(20);
        jugadores.setRows(5);
        jScrollPane1.setViewportView(jugadores);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 130, 310, 150));

        jLabel2.setText("Usuarios Activos: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel3.setText("Usuarios Historicos:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        jLabel4.setText("Heroes Ganaron: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));

        jLabel5.setText("Villanos Ganaron: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        jButton1.setText("Regresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 110, -1));

        activos.setText("1");
        add(activos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, -1, -1));

        historicos.setText("...");
        add(historicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 40, -1));

        Hganes.setText("heores");
        add(Hganes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, -1, -1));

        Vganes.setText("villains");
        add(Vganes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        MainPro.lol.setPanel(new MainMenuP(player1));
    }//GEN-LAST:event_jButton1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hganes;
    private javax.swing.JLabel Vganes;
    private javax.swing.JLabel activos;
    private javax.swing.JLabel historicos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jugadores;
    // End of variables declaration//GEN-END:variables
}
