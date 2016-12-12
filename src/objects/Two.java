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
public class Two extends Ficha{
    public Two(boolean afiliacion, String dir) {
        super(afiliacion, dir);
        power = 2;
        rank = "Rango 2";
    }
    
    
    @Override
    public boolean selected(BetterButtons x){
        boolean flac = false;
        BetterButtons up = x.y > 0 ? ButtonsP.grid[x.x][x.y-1] : null;
        BetterButtons down = x.y < 9 ? ButtonsP.grid[x.x][x.y+1] : null;
        BetterButtons right = x.x < 9 ? ButtonsP.grid[x.x+1][x.y] : null;
        BetterButtons left = x.x > 0 ? ButtonsP.grid[x.x-1][x.y] : null;
        BetterButtons upRight = (x.x < 9 && x.y > 0) ? ButtonsP.grid[x.x+1][x.y-1] : null;
        BetterButtons upLeft = (x.x > 0 && x.y > 0) ? ButtonsP.grid[x.x-1][x.y-1] : null;
        BetterButtons downRight = (x.x < 9 && x.y < 9) ? ButtonsP.grid[x.x+1][x.y+1] : null;
        BetterButtons downLeft = (x.x > 0 && x.y < 9 ) ? ButtonsP.grid[x.x-1][x.y+1] : null;
        if(hero){
            if(x.y > 0 && (up.ficha == null|| up.ficha.hero == !hero) && !(up.ficha instanceof NullF)){//up
                up.setText("GLOW");
                up.setIcon(new ImageIcon(up.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                up.available = true;
                flac = true;
            }
            if(x.x < 9 && (right.ficha == null || right.ficha.hero == !hero) && !(right.ficha instanceof NullF)){//right
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
            if(x.x < 9 && x.y > 0 && (upRight.ficha == null || upRight.ficha.hero == !hero) && !(upRight.ficha instanceof NullF)){//diagonal right
                upRight.setText("GLOW");
                upRight.setIcon(new ImageIcon(upRight.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                upRight.available = true;
                flac = true;
            }
            if(x.x > 0 && x.y > 0 && (upLeft.ficha == null || upLeft.ficha.hero == !hero) && !(upLeft.ficha instanceof NullF)){//diagonal left
                upLeft.setText("GLOW");
                upLeft.setIcon(new ImageIcon(upLeft.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                upLeft.available = true;
                flac = true;
            }
            ButtonsP.selected = flac;
            return flac;
        }
        else{
            if(x.y < 9 && (down.ficha == null || down.ficha.hero == !hero) && !(down.ficha instanceof NullF)){//down
                down.setText("GLOW");
                down.setIcon(new ImageIcon(down.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                down.available = true;
                flac = true;
            }
            if(x.x < 9 && (right.ficha == null || right.ficha.hero == !hero) && !(right.ficha instanceof NullF)){//right
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
            if(x.x < 9 && x.y < 9 && (downRight.ficha == null || downRight.ficha.hero == !hero) && !(downRight.ficha instanceof NullF)){//diagonal right
                downRight.setText("GLOW");
                downRight.setIcon(new ImageIcon(downRight.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                downRight.available = true;
                flac = true;
            }
            if(x.x > 0 && x.y < 9 && (downLeft.ficha == null || downLeft.ficha.hero == !hero) && !(downLeft.ficha instanceof NullF)){//diagonal left
                downLeft.setText("GLOW");
                downLeft.setIcon(new ImageIcon(downLeft.ficha == null ? "icons/Glow0.png" : "icons/Glow1.png"));
                downLeft.available = true;
                flac = true;
            }
            ButtonsP.selected = flac;
            return flac;
        }
    }
}
