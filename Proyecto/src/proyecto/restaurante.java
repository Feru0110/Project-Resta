/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.Random;
/**
 *
 * @author jose1
 */
public class restaurante {
    private static final String[] nombresMeseros={"Jose","Mellisa","Fernanda","Sofia"};
    private static final String[] apellidosMeseros={"Ulloa","Ugalde","Mora","Sanchez"};
    
    public static String genNombre(String[] listaNombre){
        Random random = new Random();
        return listaNombre[random.nextInt(listaNombre.length)];
    }
    public static int genId(int[] idUsados){
        Random random=new Random();
        int idNuevo;
        boolean repetido;
        do{
            idNuevo=random.nextInt(9000)+1000;
            repetido=false;
            for(int id :idUsados){
                if (id == idNuevo){
                    repetido=true;
                    break;
                }
            }
        }while (repetido);
        return idNuevo;
    }
    public static Turno generarTurno(){
        Random random= new Random();
        int probabilidad= random.nextInt(3);
        switch (probabilidad){
            case 0:
                return Turno.maniana;
            case 1:
                return Turno.tarde;
            default:
                return Turno.noche;
        }
    }
    public static Datos_Mesa[] generarRes(){
        Random random=new Random();
        int min=8;
        int max=12;
        int cantidadM=random.nextInt(max-min+1)+min;
        int[] idUsados= new int[4];
        Mesero[] mesero = new Mesero[4];
        for (int i=0;i<4;i++){
            String nombre =genNombre(nombresMeseros)+" "+genNombre(apellidosMeseros);
            int idMesero=genId(idUsados);
            idUsados[i]=idMesero;
            int[]mesaAsig=new int[cantidadM/4];
            Turno turno=generarTurno();
            mesero[i]=new Mesero(idMesero,mesaAsig,nombre,turno);
        }
       Datos_Mesa[] mesas=new Datos_Mesa[cantidadM];
        for (int numMesa=0;numMesa<cantidadM;numMesa++){
            int cantidad_sillas=random.nextInt(5)+2;
            String estado="Desocupado";
            boolean vista=random.nextDouble()<0.25;
            mesas[numMesa]=new Datos_Mesa(numMesa+1,cantidad_sillas,estado,vista);
        }
        int mesasxMs=cantidadM/4;
        int mesaActual=0;
        for (Mesero meseros : mesero){
            int mesaAsig=0;
            while (mesaAsig<mesasxMs){
                meseros.getMesasAsig()[mesaAsig]=mesaActual+1;
                mesas[mesaActual].setMesero(meseros);
                mesaActual++;
                mesaAsig++;
            }
        }
        return mesas;
    }
    public static void mostrarEstadoRes(Datos_Mesa[] mesas){
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("| Mesa #\\t\\t| Cantidad de sillas\\t| Estado\\t\\t| Mesero\\t\\t| Vista al mar\\t|");
        for (Datos_Mesa mesa : mesas){
            String estado=mesa.getEstado().equals("Ocupado")?"Ocupado":"Desocupado";
            String meseroNombre = mesa.getMesero() != null ? mesa.getMesero().getNombre(): "";
            System.out.println("| " + mesa.getMesa()+"\t\t| Cantidad de sillas: "+ mesa.getSillas()
                    + "\t| Estado: " + estado + "\t| Mesero: " + meseroNombre + "\t| " + (mesa.getVista()? "Con vista al mar" : "Sin vista al mar") + "\t\t|");
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    }                       
    
}

