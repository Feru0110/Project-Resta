/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author jose1
 */
public class Menu_Principal {
     public static int menuPrincipal(){
        String botonesPrincipal[] = {"RESTAURANTE", "ORDENES", "MENU", "REPORTES", "SALIR"};
        return JOptionPane.showOptionDialog(null, "-----BIENVENIDO A DELICIAS DEL MAR PROFUNDO-----", "OPCIONES?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, botonesPrincipal, "RESTAURANTE");
    
}
}

