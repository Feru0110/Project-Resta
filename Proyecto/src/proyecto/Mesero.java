/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author jose1
 */
public class Mesero {
    private int idMesero;
    private int[] mesaAsig;
    private String nombre;
    private int turno;
    private int propinas;
    private int rating;
    
    public Mesero(int idMesero, int[] mesaAsig, String nombre, int turno, int propinas, int rating){
        this.idMesero=idMesero;
        this.mesaAsig=mesaAsig;
        this.nombre=nombre;
        this.turno=turno;
    
    }
    public int getIdMesero(){
        return idMesero;
    }
    public String getNombre(){
        return nombre;
    }
    public int[] getMesasAsig(){
        return mesaAsig;
    }
    public int getTurno(){
        return turno;
    }
    public int getPropinas(){
        return propinas;
    }
    public void setPropinas(int propinas){
        this.propinas=propinas;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int rating){
        this.rating=rating;
    }
    
}
