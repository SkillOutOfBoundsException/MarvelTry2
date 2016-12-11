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
public class Two extends Ficha{
    public Two(boolean afiliacion) {
        super(afiliacion);
        power = 2;
    }
    
    
    @Override
    public boolean selected(BetterButtons x){
        boolean flac = false;
        if(hero){
            if(x.y > 0 && (ButtonsP.grid[x.x][x.y-1].ficha == null|| ButtonsP.grid[x.x][x.y-1].ficha.hero == !hero)){//up
                ButtonsP.grid[x.x][x.y-1].setText("GLOW");
                ButtonsP.grid[x.x][x.y-1].available = true;
                flac = true;
            }
            if(x.x < 9 && (ButtonsP.grid[x.x+1][x.y].ficha == null || ButtonsP.grid[x.x+1][x.y].ficha.hero == !hero)){//right
                ButtonsP.grid[x.x+1][x.y].setText("GLOW");
                ButtonsP.grid[x.x+1][x.y].available = true;
                flac = true;
            }
            if(x.x > 0 && (ButtonsP.grid[x.x-1][x.y].ficha == null || ButtonsP.grid[x.x-1][x.y].ficha.hero == !hero)){//left
                ButtonsP.grid[x.x-1][x.y].setText("GLOW");
                ButtonsP.grid[x.x-1][x.y].available = true;
                flac = true;
            }
            if(x.x > 0 && x.y > 0 && (ButtonsP.grid[x.x-1][x.y-1].ficha == null || ButtonsP.grid[x.x-1][x.y-1].ficha.hero == !hero)){//diagonal left
                ButtonsP.grid[x.x-1][x.y-1].setText("GLOW");
                ButtonsP.grid[x.x-1][x.y-1].available = true;
                flac = true;
            }
            if(x.x < 9 && x.y > 0 && (ButtonsP.grid[x.x+1][x.y-1].ficha == null || ButtonsP.grid[x.x+1][x.y-1].ficha.hero == !hero)){//diagonal right
                ButtonsP.grid[x.x+1][x.y-1].setText("GLOW");
                ButtonsP.grid[x.x+1][x.y-1].available = true;
                flac = true;
            }
            ButtonsP.selected = flac;
            return flac;
        }
        else{
            if(x.y < 9 && (ButtonsP.grid[x.x][x.y+1].ficha == null || ButtonsP.grid[x.x][x.y+1].ficha.hero == !hero)){//down
                ButtonsP.grid[x.x][x.y+1].setText("GLOW");
                ButtonsP.grid[x.x][x.y+1].available = true;
                flac = true;
            }
            if(x.x < 9 && (ButtonsP.grid[x.x+1][x.y].ficha == null || ButtonsP.grid[x.x+1][x.y].ficha.hero == !hero)){//right
                ButtonsP.grid[x.x+1][x.y].setText("GLOW");
                ButtonsP.grid[x.x+1][x.y].available = true;
                flac = true;
            }
            if(x.x > 0 && (ButtonsP.grid[x.x-1][x.y].ficha == null || ButtonsP.grid[x.x-1][x.y].ficha.hero == !hero)){//left
                ButtonsP.grid[x.x-1][x.y].setText("GLOW");
                ButtonsP.grid[x.x-1][x.y].available = true;
                flac = true;
            }
            if(x.x > 0 && x.y < 9 && (ButtonsP.grid[x.x-1][x.y+1].ficha == null || ButtonsP.grid[x.x-1][x.y+1].ficha.hero == !hero)){//diagonal left
                ButtonsP.grid[x.x-1][x.y+1].setText("GLOW");
                ButtonsP.grid[x.x-1][x.y+1].available = true;
                flac = true;
            }
            if(x.x < 9 && x.y < 9 && (ButtonsP.grid[x.x+1][x.y+1].ficha == null || ButtonsP.grid[x.x+1][x.y+1].ficha.hero == !hero)){//diagonal right
                ButtonsP.grid[x.x+1][x.y+1].setText("GLOW");
                ButtonsP.grid[x.x+1][x.y+1].available = true;
                flac = true;
            }
            ButtonsP.selected = flac;
            return flac;
        }
    }
}
