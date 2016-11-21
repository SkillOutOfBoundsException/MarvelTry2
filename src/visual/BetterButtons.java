/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import javax.swing.JButton;

/**
 *
 * @author Diegu7
 */
public class BetterButtons extends JButton{
    
    public final int x;
    public final int y;
    
    public BetterButtons(String name, int x, int y){
        super(name);
        this.x = x;
        this.y = y;
    }
       
}
