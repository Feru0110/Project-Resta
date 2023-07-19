/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author jose1
 */
public class Datos_Mesa {
    private int Mesa;
    private int cantidad_sillas;
    private String estado;
    private boolean vista;
    private Mesero mesero;
    
    public Datos_Mesa(int Mesa,int cantidad_sillas, String estado, boolean vista ){
        this.Mesa=Mesa;
        this.cantidad_sillas=cantidad_sillas;
        this.estado=estado;
        this.vista=vista;
    }
     public int getMesa() {
        return Mesa;
    }
      public int getSillas() {
        return cantidad_sillas;
    }
       public String getEstado() {
        return estado;
    }
        public boolean getVista() {
        return vista;
    }
         public Mesero getMesero() {
        return mesero;
    }
}
