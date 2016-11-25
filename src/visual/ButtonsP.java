/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.awt.GridLayout;
import java.util.Random;
import marveltry1.MainPro;
import objects.Bomb;
import objects.Eight;
import objects.Ficha;
import objects.Five;
import objects.Flag;
import objects.Four;
import objects.Nine;
import objects.One;
import objects.Seven;
import objects.Six;
import objects.Ten;
import objects.Three;
import objects.Two;

/**
 *
 * @author Diegu7
 */
public class ButtonsP extends javax.swing.JPanel {

    /**
     * Creates new form ButtonsP
     */
    public static BetterButtons[][] grid;
    public Ficha[][] fichas = new Ficha[10][10];
    public static boolean selected = false;
    public static BetterButtons temp;
    public static boolean heroesTurn = true;
    public Random ran = new Random();
    
    public ButtonsP() {
        initComponents();
        grid = new BetterButtons[10][10];
        this.setLayout(new GridLayout(10,10));
        for(int y=0; y<10; y++){
            for(int x=0; x<10; x++){
                    grid[x][y]= new BetterButtons((char)(65+x)+"-"+y, x, y);
                    grid[x][y].addMouseListener(new java.awt.event.MouseAdapter() {
                            @Override
                            public void mouseReleased(java.awt.event.MouseEvent evt) {
                                buttonPressed((BetterButtons)evt.getSource());
                            }
                        });
                    this.add(grid[x][y]);
            }
        }
        randPlacement(true);
        randPlacement(false);
        setPieces();
        
    }
 
    public void buttonPressed(BetterButtons i){
        System.out.println(i.x + "-" + i.y);
        if(selected){
            System.out.println("SELECTED");
            if(i.available){
                i.ficha = temp.ficha;
                temp.ficha = null;
                setAvailableFalse();
                i.setText((i.ficha.hero ? "H:" : "V:") + i.ficha.power);
                temp.setText(((char)(65+temp.x)) +"-"+ temp.y );
                selected = false;
                heroesTurn = !heroesTurn;
                System.out.println("TURN PASSED");
            }
        }
        else if(i.ficha != null){
            if(i.ficha.hero != heroesTurn)
                return;
            if(i.ficha.selected(i))
                temp = i;
            System.out.println("RIP");
        }
    }
    
    public void setAvailableFalse(){
        for(int y = 0; y<10; y++){
            for(int x = 0; x<10; x++){
                grid[x][y].available = false;
                if(grid[x][y].getText().equalsIgnoreCase("glow")){
                    grid[x][y].setText(((char)(65+x)) +"-"+ y );
                    if(grid[x][y].ficha != null)
                        grid[x][y].setText((grid[x][y].ficha.hero ? "H:" : "V:") + grid[x][y].ficha.power);
                }
            }
        }
    }
        
    public void randPlacement(boolean afiliacion){
        int x;
        int y;
        int a = afiliacion ? 9 : 0;
        int b = afiliacion ? 8 : 1;
        int c = afiliacion ? 8 : 0;
        int d = afiliacion ? 6 : 2;
        int e = afiliacion ? 6 : 0;
        x = ran.nextInt(8)+1;//enemies es 8+1
        fichas[x][a] = new Flag(afiliacion);//enemies es 0
        fichas[x+1][a] = new Bomb(afiliacion);//0
        fichas[x-1][a] = new Bomb(afiliacion);//0
        fichas[x][b] = new Bomb(afiliacion);//1
        fichas[x+1][b] = new Bomb(afiliacion);//1
        fichas[x-1][b] = new Bomb(afiliacion);//1
        while(true){
            x = ran.nextInt(10);//10
            y = ran.nextInt(2)+c;//2+0
            if(fichas[x][y] == null){
                fichas[x][y] = new Bomb(afiliacion);
                break;
            }
        }
        for(int i = 0; i<8; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(2)+d;//2+2
                if(fichas[x][y] == null){
                    fichas[x][y] = new Two(afiliacion);
                    break;
                }
            }
        }
        while(true){
            x = ran.nextInt(10);//10
            y = ran.nextInt(2)+c;//2+0
            if(fichas[x][y] == null){
                fichas[x][y] = new One(afiliacion);
                break;
            }
        }
        for(int i = 0; i<5; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Three(afiliacion);
                    break;
                }
            }
        }
        for(int i = 0; i<4; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Four(afiliacion);
                    break;
                }
            }
        }
        for(int i = 0; i<4; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Five(afiliacion);
                    break;
                }
            }
        }
        for(int i = 0; i<4; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Six(afiliacion);
                    break;
                }
            }
        }
        for(int i = 0; i<3; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Seven(afiliacion);
                    break;
                }
            }
        }
        for(int i = 0; i<2; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Eight(afiliacion);
                    break;
                }
            }
        }
        while(true){
            x = ran.nextInt(10);//10
            y = ran.nextInt(4)+e;//4
            if(fichas[x][y] == null){
                fichas[x][y] = new Nine(afiliacion);
                break;
            }
        }
        while(true){
            x = ran.nextInt(10);//10
            y = ran.nextInt(4)+e;//4
            if(fichas[x][y] == null){
                fichas[x][y] = new Ten(afiliacion);
                break;
            }
        }
    }
    
    public void setPieces(){
        for(int y = 0; y<10; y++){
            for(int x = 0; x<10; x++){
                if(fichas[x][y] != null){
                    ButtonsP.grid[x][y].ficha = fichas[x][y];
                    //System.out.print(((BetterButtons)ButtonsP.grid[y][x]).ficha.power + " - ");
                    //System.out.println(fichas[y][x] + " - ");
                    ButtonsP.grid[x][y].setText((fichas[x][y].hero ? "H:" : "V:") + fichas[x][y].power);
                }
            }
            //System.out.println();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(700, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
