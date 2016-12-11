/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.awt.GridLayout;
import java.util.Random;
import javax.swing.ImageIcon;
import objects.Bomb;
import objects.Eight;
import objects.Ficha;
import objects.Five;
import objects.Flag;
import objects.Four;
import objects.Nine;
import objects.NullF;
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
    public Ficha[] nullFs = new Ficha[8];
    public Ficha[] dedVillains = new Ficha[20];
    public Ficha[] dedHeroes = new Ficha[20];
    public int dedV = 0;
    public int dedH = 0;
    
    public ButtonsP() {
        initComponents();
        grid = new BetterButtons[10][10];
        this.setLayout(new GridLayout(10,10));
        for(int y=0; y<10; y++){
            for(int x=0; x<10; x++){
                    grid[x][y]= new BetterButtons("[" + (x) + "," + y + "]", x, y);
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
        setNullPieces();
        setPieces();
        //GameP.setLabel(GameP.player1.getNombre());
        
    }
 
    public void buttonPressed(BetterButtons i){
        System.out.println(i.x + "-" + i.y);
        if(selected){
            System.out.println("SELECTED");
            if(i.available){
                fight(temp, i);
                setAvailableFalse();
                //i.setText((i.ficha.hero ? "H:" : "V:") + i.ficha.power);
                temp.setIcon(new ImageIcon("icons/Null.png"));
                temp.setText("[" + temp.x + "," + temp.y + "]");
                selected = false;
                heroesTurn = !heroesTurn;
                setNullPiecesOpposite();
                //GameP.setLabel(heroesTurn == MainPro.gameLogic.heroStart ? GameP.player1.getNombre() : GameP.player2.getNombre());
                System.out.println("TURN PASSED");
            }
            else{
                setAvailableFalse();
                selected = false;
                System.out.println("TURN CANCELED");
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
    
    public void fight(BetterButtons attacker, BetterButtons defender){
        //m.A.A.d City - KendrickLamar
        if(defender.ficha == null){
            defender.ficha = attacker.ficha;
            defender.setIcon(defender.ficha.img);
            defender.setText((defender.ficha.hero ? "H:" : "V:") + defender.ficha.power); //remove later
        }
        else if(defender.ficha.power == 11 || (attacker.ficha.power == defender.ficha.power)){
            dedHeroes[dedH++] = heroesTurn ? attacker.ficha : defender.ficha;
            dedVillains[dedV++] = heroesTurn ? defender.ficha : attacker.ficha;
            defender.ficha = null;
        }
        else if(defender.ficha.power == 10 && attacker.ficha.power == 1){
            if(heroesTurn){
                dedVillains[dedV++] = defender.ficha;
            }
            else{
                dedHeroes[dedH++] = defender.ficha;
            }
            defender.ficha = attacker.ficha;
            defender.setIcon(defender.ficha.img);
            defender.setText((defender.ficha.hero ? "H:" : "V:") + defender.ficha.power); //removeeee
        }
        else if((attacker.ficha.power > defender.ficha.power) || (defender.ficha.power == 11 && attacker.ficha.power == 3)){
            if(heroesTurn){
                dedVillains[dedV++] = defender.ficha;
            }
            else{
                dedHeroes[dedH++] = defender.ficha;
            }
            defender.ficha = attacker.ficha;
            defender.setIcon(defender.ficha.img);
            defender.setText((defender.ficha.hero ? "H:" : "V:") + defender.ficha.power); //remmmmve
        }
        else if(attacker.ficha.power < defender.ficha.power){
            if(!heroesTurn){
                dedVillains[dedV++] = attacker.ficha;
            }
            else{
                dedHeroes[dedH++] = attacker.ficha;
            }
        }
        attacker.ficha = null;
    }
    
    public void setAvailableFalse(){
        for(int y = 0; y<10; y++){
            for(int x = 0; x<10; x++){
                grid[x][y].available = false;
                if(grid[x][y].getText().equalsIgnoreCase("glow")){
                    grid[x][y].setText("[" + x +","+ y + "]");
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
        fichas[x][a] = new Flag(afiliacion, afiliacion ? "icons/FlagH.png" : "icons/FlagV.png");//enemies es 0
        fichas[x+1][a] = new Bomb(afiliacion, afiliacion ? "icons/BombH.png" : "icons/BombV.png");//0
        fichas[x-1][a] = new Bomb(afiliacion, afiliacion ? "icons/BombH.png" : "icons/BombV.png");//0
        fichas[x][b] = new Bomb(afiliacion, afiliacion ? "icons/BombH.png" : "icons/BombV.png");//1
        fichas[x+1][b] = new Bomb(afiliacion, afiliacion ? "icons/BombH.png" : "icons/BombV.png");//1
        fichas[x-1][b] = new Bomb(afiliacion, afiliacion ? "icons/BombH.png" : "icons/BombV.png");//1
        while(true){
            x = ran.nextInt(10);//10
            y = ran.nextInt(2)+c;//2+0
            if(fichas[x][y] == null){
                fichas[x][y] = new Bomb(afiliacion, afiliacion ? "icons/BombH.png" : "icons/BombV.png");
                break;
            }
        }
        for(int i = 0; i<8; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(2)+d;//2+2
                if(fichas[x][y] == null){
                    fichas[x][y] = new Two(afiliacion, (afiliacion ? "icons/TwoH" : "icons/TwoV") +  i + ".png");
                    break;
                }
            }
        }
        while(true){
            x = ran.nextInt(10);//10
            y = ran.nextInt(2)+c;//2+0
            if(fichas[x][y] == null){
                fichas[x][y] = new One(afiliacion, afiliacion ? "icons/OneH.png" : "icons/OneV.png");
                break;
            }
        }
        for(int i = 0; i<5; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Three(afiliacion, (afiliacion ? "icons/ThreeH" : "icons/ThreeV") +  i + ".png");
                    break;
                }
            }
        }
        for(int i = 0; i<4; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Four(afiliacion, (afiliacion ? "icons/FourH" : "icons/FourV") +  i + ".png");
                    break;
                }
            }
        }
        for(int i = 0; i<4; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Five(afiliacion, (afiliacion ? "icons/FiveH" : "icons/FiveV") +  i + ".png");
                    break;
                }
            }
        }
        for(int i = 0; i<4; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Six(afiliacion, (afiliacion ? "icons/SixH" : "icons/SixV") +  i + ".png");
                    break;
                }
            }
        }
        for(int i = 0; i<3; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Seven(afiliacion, (afiliacion ? "icons/SevenH" : "icons/SevenV") +  i + ".png");
                    break;
                }
            }
        }
        for(int i = 0; i<2; i++){
            while(true){
                x = ran.nextInt(10);//10
                y = ran.nextInt(4)+e;//4
                if(fichas[x][y] == null){
                    fichas[x][y] = new Eight(afiliacion, (afiliacion ? "icons/EightH" : "icons/EightV") +  i + ".png");
                    break;
                }
            }
        }
        while(true){
            x = ran.nextInt(10);//10
            y = ran.nextInt(4)+e;//4
            if(fichas[x][y] == null){
                fichas[x][y] = new Nine(afiliacion, afiliacion ? "icons/NineH.png" : "icons/NineV.png");
                break;
            }
        }
        while(true){
            x = ran.nextInt(10);//10
            y = ran.nextInt(4)+e;//4
            if(fichas[x][y] == null){
                fichas[x][y] = new Ten(afiliacion, afiliacion ? "icons/TenH.png" : "icons/TenV.png");
                break;
            }
        }
    }
    
    public void setNullPieces(){
        nullFs[0] = fichas[2][4] = new NullF(!heroesTurn, "icons/Fire.png");
        nullFs[1] = fichas[2][5] = new NullF(!heroesTurn, "icons/Fire.png");
        nullFs[2] = fichas[3][4] = new NullF(!heroesTurn, "icons/Fire.png");
        nullFs[3] = fichas[3][5] = new NullF(!heroesTurn, "icons/Fire.png");
        nullFs[4] = fichas[6][4] = new NullF(!heroesTurn, "icons/Fire.png");
        nullFs[5] = fichas[6][5] = new NullF(!heroesTurn, "icons/Fire.png");
        nullFs[6] = fichas[7][4] = new NullF(!heroesTurn, "icons/Fire.png");
        nullFs[7] = fichas[7][5] = new NullF(!heroesTurn, "icons/Fire.png");//ripp
    }
    
    public void setNullPiecesOpposite(){
        for(Ficha i : nullFs){
            i.hero = !heroesTurn;
        }
    }
    
    public void setPieces(){
        for(int y = 0; y<10; y++){
            for(int x = 0; x<10; x++){
                if(fichas[x][y] != null){
                    grid[x][y].ficha = fichas[x][y];
                    grid[x][y].setIcon(fichas[x][y].img);
                    if(fichas[x][y] instanceof NullF)
                        grid[x][y].setText("NULL");
                    else
                        grid[x][y].setText((fichas[x][y].hero ? "H:" : "V:") + fichas[x][y].power);
                    //System.out.print(((BetterButtons)ButtonsP.grid[y][x]).ficha.power + " - ");
                    //System.out.println(fichas[y][x] + " - ");
                }
                else
                    grid[x][y].setIcon(new ImageIcon("icons/Null.png"));
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
