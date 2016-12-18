
package objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Logic {
    
    public ArrayList<Usuario> arrUsu;
    
    public Logic(){ 
//        arrUsu = new ArrayList<>();
//        arrUsu.add(new Usuario("Dego", "12345"));
//        arrUsu.add(new Usuario("Ivan", "01234"));               
        try {
            FileInputStream fi = new FileInputStream("stratego_players.mav");
            ObjectInputStream oi = new ObjectInputStream(fi);
            arrUsu = (ArrayList)oi.readObject();
        } catch (IOException e) {
            System.out.println("no lo abrio");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no serializable");
        }
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
    
}