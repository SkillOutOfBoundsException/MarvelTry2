/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import visual.BetterButtons;
import visual.ButtonsP;

/**
 *
 * @author Diegu7
 */
public abstract class Ficha {
    public boolean hero;
    public int power;
    
    public Ficha(boolean afiliacion){
        hero = afiliacion;
    }
    
    public BetterButtons selected(BetterButtons x){
        ButtonsP.selected = true;
        if(hero){
            if(x.y < 9 && (ButtonsP.grid[x.x][x.y-1].ficha == null|| ButtonsP.grid[x.x][x.y-1].ficha.hero == !hero)){
                ButtonsP.grid[x.x][x.y-1].setText("GLOW");
                ButtonsP.grid[x.x][x.y-1].available = true;
                return ButtonsP.grid[x.x][x.y-1];
            }
            if(x.x < 9 && (ButtonsP.grid[x.x+1][x.y].ficha == null || ButtonsP.grid[x.x+1][x.y].ficha.hero == !hero)){
                ButtonsP.grid[x.x+1][x.y].setText("GLOW");
                ButtonsP.grid[x.x+1][x.y].available = true;
                return ButtonsP.grid[x.x+1][x.y];
            }
            if(x.x > 0 && (ButtonsP.grid[x.x-1][x.y].ficha == null || ButtonsP.grid[x.x-1][x.y].ficha.hero == !hero)){
                ButtonsP.grid[x.x-1][x.y].setText("GLOW");
                ButtonsP.grid[x.x-1][x.y].available = true;
                return ButtonsP.grid[x.x-1][x.y];
            }
        }
        else{
            if(x.y < 9 && (ButtonsP.grid[x.x][x.y+1].ficha == null || ButtonsP.grid[x.x][x.y+1].ficha.hero == !hero)){
                ButtonsP.grid[x.x][x.y+1].setText("GLOW");
                ButtonsP.grid[x.x][x.y+1].available = true;
                return ButtonsP.grid[x.x][x.y+1];
            }
            if(x.x < 9 && (ButtonsP.grid[x.x+1][x.y].ficha == null || ButtonsP.grid[x.x+1][x.y].ficha.hero == !hero)){
                ButtonsP.grid[x.x+1][x.y].setText("GLOW");
                ButtonsP.grid[x.x+1][x.y].available = true;
                return ButtonsP.grid[x.x+1][x.y];
            }
            if(x.x > 0 && (ButtonsP.grid[x.x-1][x.y].ficha == null || ButtonsP.grid[x.x-1][x.y].ficha.hero == !hero)){
                ButtonsP.grid[x.x-1][x.y].setText("GLOW");
                ButtonsP.grid[x.x-1][x.y].available = true;
                return ButtonsP.grid[x.x-1][x.y];
            }
        }
        throw new NullPointerException("NIGGA U DUMB");
    }
    
}
