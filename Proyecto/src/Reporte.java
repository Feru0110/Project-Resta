/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Reporte {
    
    
    
    
        int menu;
        menu = Integer.parseInt(JOptionPane.showInputDialog("-*-*-Nuestros equipos-*-*-\n"
                    + "1 -PLATILLOS MAS VENDIDOS\n"
                    + "2- MEJOR MESERO EN VENTAS\n"
                    + "3- MEJOR MESERO EN RATING\n"
                    + "4- DATOS DE LOS MESEROS\n"
                    + "5 -DATOS DE LAS ORDENES\n"
                    + "6- VENTAS TOTALES\n"
                    + "7- VENTAS POR TIPO DE PLATILLO\n"
                    + "8- VENTAS POR TIPO DE MESA\n"
                    + "9- Salir"));
        
    switch (menu) {
                case 1:
                    JOptionPane.showMessageDialog(null, "---- ARROZ CON CAMARONES, CEVICHE, PULPO AL AJILLO, CALAMARES CON ARROZ ----");
                    if ("ARROZ CON CAMARONES" > 0){
                    System.out.println("Es el platillo mas vendido");
                    if ("CEVICHE" > 0){
                    System.out.println("Es el platillo mas vendido");
                    if ("PULPO AL AJILLO" > 0){
                    System.out.println("Es el platillo mas vendido");
                    if ("CALAMARES CON ARROZ" > 0){
                    System.out.println("Es el platillo mas vendido");
                }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "");
                    break;
                     
                case 6:
                    JOptionPane.showMessageDialog(null, "");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "");
                    break;    
                                case 3:
                    JOptionPane.showMessageDialog(null, "");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    

            }
        
        
    
    
    
    
}
