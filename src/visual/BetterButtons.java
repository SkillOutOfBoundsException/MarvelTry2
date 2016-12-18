
package visual;

import javax.swing.JButton;
import objects.Ficha;

public class BetterButtons extends JButton{
    
    public final int x;
    public final int y;
    public Ficha ficha;
    public boolean available;
    
    public BetterButtons(String name, int x, int y){
        super(name);
        this.x = x;
        this.y = y;
        ficha = null;
        available = false;
    }
       
}
