/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Diegu7
 */
public class Usuario {
    private String nombre;
    private String password;
    public Usuario(String nombre, String password){
        this.nombre = nombre;
        this.password = password;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String x){
        nombre = x;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String x){
        password = x;
    }
    
    
}
