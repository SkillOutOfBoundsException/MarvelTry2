
package visual;

import marveltry1.MainPro;
import objects.Usuario;

public class PlayerComboP extends javax.swing.JPanel {

    private String[] arrPlayers;
    private Usuario player1;
    
    
    public PlayerComboP(Usuario player1) {
        initComponents();
        this.player1 = player1;
        arrPlayers = new String[MainPro.funcs.arrUsu.size()-1];
        for(int i = 0; i < arrPlayers.length; i++) {
            if(MainPro.funcs.arrUsu.get(i) == player1)
                continue;
            arrPlayers[i] = MainPro.funcs.arrUsu.get(i).getNombre();
        }
        for(String x : arrPlayers)
            cPlayers.addItem(x);
        rHeroStart.setSelected(MainPro.gameLogic.heroStart);
        rVillainStart.setSelected(!MainPro.gameLogic.heroStart);
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
        cPlayers = new javax.swing.JComboBox<>();
        bAceptar = new javax.swing.JButton();
        rHeroStart = new javax.swing.JRadioButton();
        rVillainStart = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1280, 720));

        bRegresar.setText("Regresar");
        bRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bRegresarMouseReleased(evt);
            }
        });

        cPlayers.setModel(new javax.swing.DefaultComboBoxModel<>());

        bAceptar.setText("Aceptar");
        bAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bAceptarMouseReleased(evt);
            }
        });

        buttonGroup1.add(rHeroStart);
        rHeroStart.setText("Heroes");

        buttonGroup1.add(rVillainStart);
        rVillainStart.setText("Villanos");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Que equipo elije?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(cPlayers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rVillainStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rHeroStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(540, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(cPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rHeroStart)
                .addGap(7, 7, 7)
                .addComponent(rVillainStart)
                .addGap(19, 19, 19)
                .addComponent(bAceptar)
                .addGap(27, 27, 27)
                .addComponent(bRegresar)
                .addContainerGap(291, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bRegresarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRegresarMouseReleased
        MainPro.lol.setPanel(new NewGameP(player1));
    }//GEN-LAST:event_bRegresarMouseReleased

    private void bAceptarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAceptarMouseReleased
        ButtonsP.heroesTurn = rHeroStart.isSelected();
        Usuario usu = MainPro.funcs.searchUsu((String)cPlayers.getSelectedItem());
        MainPro.lol.setPanel(MainPro.game  = new GameP(player1, usu));
           
        
        
    }//GEN-LAST:event_bAceptarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bRegresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cPlayers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rHeroStart;
    private javax.swing.JRadioButton rVillainStart;
    // End of variables declaration//GEN-END:variables
}
