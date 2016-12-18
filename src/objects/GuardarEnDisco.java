
package objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import marveltry1.MainPro;

public class GuardarEnDisco {
    
    MainPro mp;
    
    ArrayList<Usuario> al;
    
    public void save() {
        try {
            File carpeta = new File ("Jugadores");
            carpeta.mkdir();
            FileOutputStream fo = new FileOutputStream("Jugadores/jugadores.jug");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(mp.funcs.arrUsu);
        } catch (IOException e) {
            System.out.println("Fallo al guardar todo");
        }
    }
}
