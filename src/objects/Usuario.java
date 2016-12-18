
package objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class Usuario implements Serializable{
    
    private String nombre;
    private String password;
    private int puntos;
    static int evilPlays = 0;
    static int heroPlays = 0;
    public static int activos = 0;
    private ArrayList<String> logs;
    
    
    public Usuario(String nombre, String password){
        this.nombre = nombre;
        this.password = password;
        this.puntos = 0;
        logs = new ArrayList<>();
        activos += 1;
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
    
    public ArrayList<String> getArrayList() {
        return logs;
    }
    
    public void iWin(int i, String winner, String loser, String fichas, boolean b, Usuario usu) {
        puntos += 3;
        if (b)
            heroPlays += 1;
        else
            evilPlays += 1;
        String fecha = Calendar.getInstance().getTime().toString();
        switch (i) {
            case 1:
                String tierra = (b) ? "Salvado" : "Capturado";
                logs.add(winner + " usando los " + fichas + " ha " + tierra + " la TIERRA! Venciendo a " + loser + fecha);
                break;
            case 2:
                logs.add(loser + " usando " + fichas + " ha perdido por no tener movimientos validos disponibles ante " + winner + fecha);
                break;
            case 3:
                String opuesto = (!b) ? "Heroes" : "Villanos";
                logs.add(loser + " usando " + opuesto + " ha ganado ya que " + winner + " usando " + fichas +  " se ha retirado del juego, " + fecha);
                puntos -= 3;
                usu.puntos += 3;
                usu.logs.add(loser + " usando " + opuesto + " ha ganado ya que " + winner + " usando " + fichas +  " se ha retirado del juego, " + fecha);
                break;
        }
    }
    
}
