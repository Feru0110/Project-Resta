/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author feru0
 */
public class Proyecto {

    public static void main(String[] args) {
        int opcionSeleccionada = Menu_Principal.menuPrincipal();
        while (opcionSeleccionada != 3) {
            switch (opcionSeleccionada) {
                case 1://Orden
                    String botonesOrden[] = {"ABRIR ORDEN", "AGREGAR PLATILLO A LA ORDEN", "CERRRAR ORDEN", "SALIR"};
                    int menuOrden = JOptionPane.showOptionDialog(null, "--MENU DE ORDENES---", "OPCIONES?", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, botonesOrden, "ABRIR ORDEN");
                    switch (menuOrden) {
                        case 0://ABRIR ORDEN
                            Datos_Orden orden = new Datos_Orden();
                            int newID = orden.generarID();
                            System.out.println("el numero de orden es: " + orden.getID());
                            opcionSeleccionada = Menu_Principal.menuPrincipal();
                        case 1://AGREGAR PLATILLO A LA ORDEN
                        case 2://CERRRAR ORDEN
                        case 3://SALIR
                            opcionSeleccionada = Menu_Principal.menuPrincipal();

                    }

            }
        }
    }

}
