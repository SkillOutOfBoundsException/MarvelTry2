/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import visual.BetterButtons;

/**
 *
 * @author Diegu7
 */
public class Bomb extends Ficha{
    public Bomb(boolean afiliacion, String dir) {
        super(afiliacion, dir);
        power = 11;
    }
    
    @Override
    public boolean selected(BetterButtons x){
        return false;
    }
}
