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
public class Orden {
    
    
     private String ID;
     private String nombre ; 
     private int numMesa;
     
     
     public Orden(String ID , String nombre , int numMesa){
         
         
         this.ID = ID;
         this.nombre = nombre;
         this.numMesa= numMesa;
         
     }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
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
