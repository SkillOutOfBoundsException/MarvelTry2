/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Random;
import visual.BetterButtons;
import visual.ButtonsP;

/**
 *
 * @author Diegu7
 */
public class GameLogic {
    public boolean tutorial = true;
    public Ficha[][] fichas = new Ficha[10][10];
    public Random ran = new Random();
    
    
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
    
   
}
 