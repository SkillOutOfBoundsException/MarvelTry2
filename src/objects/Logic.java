
package objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Logic {
    
    public ArrayList<Usuario> arrUsu;
    
    public Logic(){
        arrUsu = new ArrayList<>();
        arrUsu.add(new Usuario("Username", "password"));
        arrUsu.add(new Usuario("Dego", "12345"));
        arrUsu.add(new Usuario("Ivan", "12354"));
    }
    
    public boolean crearUsu(String usu, String pass){
        if(searchUsu(usu) == null && pass.length() == 5){
            arrUsu.add(new Usuario(usu, pass));
            return true;
        }
        return false;
    }
    
    public boolean login(String usu, String pass){
        Usuario lol = searchUsu(usu);
        if(lol != null){
            if(lol.getPassword().equals(pass)){
                arrUsu.remove(lol);
                arrUsu.add(lol);
                return true;
            }    
        }
        return false;
    }
    
    public Usuario searchUsu(String usu){
            for(Usuario i : arrUsu){
                if(i.getNombre().equalsIgnoreCase(usu))
                    return i;
            }
            return null;
    }
    
//    public void load() {
//        try {
//            FileInputStream fi = new FileInputStream("Jugadores/jugadores.jug");
//            ObjectInputStream oi = new ObjectInputStream(fi);
//            ArrayList arrUsuario = (ArrayList)oi.readObject();
//            arrUsu = arrUsuario;
//        } catch (IOException e) {
//            System.out.println("Fallo al leer todo");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Clase serializable no fue encontrada");
//        }
//    }
    
    public void delete(String user) {
        //arrUsu.remove(0)
            System.out.println("Si lo encuentra");
    }
    
}