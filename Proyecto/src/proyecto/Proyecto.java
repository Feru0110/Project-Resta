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
        


        String botones[] = {"RESTAURANTE", "ORDENES", "MENU", "REPORTES", "SALIR"};

        int boton = JOptionPane.showOptionDialog(null, "-----BIENVENIDO A DELICIAS DEL MAR PROFUNDO-----", "OPCIONES?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, botones, "RESTAURANTE");

        
        
    }
    
}
