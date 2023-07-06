/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author feru0
 */
public class Datos_Orden {
    
    
     public int ID;
     private String nombre ; 
     private int numMesa;
     
     
     public Datos_Orden(int ID , String nombre , int numMesa){
         
         
         this.ID = ID;
         this.nombre = nombre;
         this.numMesa= numMesa;
         
     }
    public Datos_Orden(){
        this.ID=200;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID=ID;
    }

    public String getNombre() {
        return nombre;
    }
    public int generarID(){
        ID++;
        int newID=ID;
        return newID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }
     
     
     
     
    
    
}
