
package objects;

import visual.BetterButtons;

public class Bomb extends Ficha{
    public Bomb(boolean afiliacion, String dir) {
        super(afiliacion, dir);
        power = 11;
        rank = "Bomba";
    }
    
    @Override
    public boolean selected(BetterButtons x){
        return false;
    }
}
