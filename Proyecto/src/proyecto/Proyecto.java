/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author feru0
 */
public class Proyecto {


    public static void main(String[] args) {
        
        
        //fer
        // lo primero que tiene que aparecer en el programa 
        String botonesPrincipal[] = {"RESTAURANTE", "ORDENES", "MENU", "REPORTES", "SALIR"};

        int botonPrincipal = JOptionPane.showOptionDialog(null, "-----BIENVENIDO A DELICIAS DEL MAR PROFUNDO-----", "OPCIONES?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, botonesPrincipal, "RESTAURANTE");

        
        
        
        
        
        
        
        //fer
       // menu de la clase orden  
        int menu;
        menu = Integer.parseInt(JOptionPane.showInputDialog("-----MENU DE ORDENES-----\n"
                    + "1 - ABRIR ORDEN\n"
                    + "2- AGREGAR PLATILLO A LA ORDEN\n"
                    + "3- CERRAR ORDEN\n"
                    + "4- SALIR\n"));
                    
        
        //fer
       // esto es de la orden  
         String botonesOrden[] = {"AGREGAR OTRO NUMERO", "CANCELAR"};

        int botonOrden = JOptionPane.showOptionDialog(null, "-----ERROR DE NUMERO DE-----", "QUE DESEA?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, botonesOrden, "CANCELAR");
        
        
    }
    
}
