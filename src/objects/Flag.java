
package objects;

import visual.BetterButtons;

public class Flag extends Ficha{
    public Flag(boolean afiliacion, String dir) {
        super(afiliacion, dir);
        power = 0;
        rank = "Flag";
    }
    
    @Override
    public boolean selected(BetterButtons x){
        return false;
    }
        
    
}
