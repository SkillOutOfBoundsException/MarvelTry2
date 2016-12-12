/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import javax.swing.ImageIcon;
import visual.BetterButtons;
import visual.ButtonsP;

/**
 *
 * @author Diegu7
 */
public abstract class Ficha {
    public boolean hero;
    public int power;
    public ImageIcon img;
    public String rank;
    
    public Ficha(boolean afiliacion, String dir){
        hero = afiliacion;
        img = new ImageIcon(dir);
    }
    
    public boolean selected(BetterButtons x){
        boolean flac = false;
        BetterButtons up = x.y > 0 ? ButtonsP.grid[x.x][x.y-1] : null;
        BetterButtons down = x.y < 9 ? ButtonsP.grid[x.x][x.y+1] : null;
        BetterButtons right = x.x < 9 ? ButtonsP.grid[x.x+1][x.y] : null;
        BetterButtons left = x.x > 0 ? ButtonsP.grid[x.x-1][x.y] : null;
        if(hero){
            if(x.y > 0 && (up.ficha == null || up.ficha.hero == !hero) && !(up.ficha instanceof NullF)){//up
                up.setText("GLOW");//remove later
                up.setIcon(new ImageIcon(up.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                up.available = true;
                flac = true;
            }
            if(x.x < 9 && (right.ficha == null || right.ficha.hero == !hero) && !(right.ficha instanceof NullF)){//right
                right.setText("GLOW");//remove
                right.setIcon(new ImageIcon(right.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                right.available = true;
                flac = true;
            }
            if(x.x > 0 && (left.ficha == null || left.ficha.hero == !hero) && !(left.ficha instanceof NullF)){//left
                left.setText("GLOW");//remove
                left.setIcon(new ImageIcon(left.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                left.available = true;
                flac = true;
            }
            ButtonsP.selected = flac;
            return flac;
        }
        else{
            if(x.y < 9 && (down.ficha == null || down.ficha.hero == !hero) && !(down.ficha instanceof NullF)){//down
                down.setText("GLOW");//remove
                down.setIcon(new ImageIcon(down.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                down.available = true;
                flac = true;
            }
            if(x.x < 9 && (right.ficha == null || right.ficha.hero == !hero) && !(right.ficha instanceof NullF)){
                right.setText("GLOW");
                right.setIcon(new ImageIcon(right.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                right.available = true;
                flac = true;
            }
            if(x.x > 0 && (left.ficha == null || left.ficha.hero == !hero) && !(left.ficha instanceof NullF)){//left
                left.setText("GLOW");
                left.setIcon(new ImageIcon(left.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                left.available = true;
                flac = true;
            }
            ButtonsP.selected = flac;
            return flac;
        }
    }
    
}
