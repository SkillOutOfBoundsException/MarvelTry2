
package objects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import marveltry1.MainPro;

public final class GuardarEnDisco {
    
    MainPro mp;
    
    public void save() {
        try {
            FileOutputStream fo = new FileOutputStream("stratego_players.mav");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(mp.funcs.arrUsu);
        } catch (IOException e) {
            System.out.println("Fallo al guardar todo");
        }
    }
}
