/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import javax.swing.JButton;

/**
 *
 * @author Diegu7
 */
public class GameLogic {
    public boolean tutorial = true;
    public final JButton[][] grid;
    
    public GameLogic(){
        grid=new JButton[10][10];
    }
}
