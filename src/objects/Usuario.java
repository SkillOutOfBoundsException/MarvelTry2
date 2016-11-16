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
    private int puntos;
    private int evilPlays;
    private int heroPlays;
    
    public Usuario(String nombre, String password){
        this.nombre = nombre;
        this.password = password;
        this.evilPlays = 0;
        this.heroPlays = 0;
        this.puntos = 0;
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
    
    public int getHero(){
        return heroPlays;
    }
    
    public int getEvil(){
        return evilPlays;
    }
    
    public int getPoints(){
        return puntos;
    }
    
    
}
