/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.ArrayList;

/**
 *
 * @author Diegu7
 */
public class Logic {
    
    public ArrayList<Usuario> arrUsu;
    
    public Logic(){
        arrUsu = new ArrayList<>();
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
            if(lol.getPassword().equals(pass))
                return true;
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