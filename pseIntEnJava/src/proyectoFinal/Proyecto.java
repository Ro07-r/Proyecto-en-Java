package proyectoFinal;

import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        //MENÚ PRINCIPAL DEL PROGRAMA 
        int opcionMenuPrincipal = 0;
        while (opcionMenuPrincipal != 1 && opcionMenuPrincipal != 2 && opcionMenuPrincipal != 3){
            System.out.println("----- Menú Principal Mc UTN -----");
            System.out.println("1. Ingresar nuevo pedido");
            System.out.println("2. Cambio de turno"); //Sirve para cambiar de empleado en el sistema
            System.out.println("3. Salir del sistema");
            Scanner practica = new Scanner(System.in);
            System.out.println("Ingrese el número de la opción deseada: ");
            opcionMenuPrincipal= practica.nextInt();
            if (opcionMenuPrincipal == 1){
                System.out.println("Opcion 1"); //INGRESO PEDIDO agregar
            } else {
                if (opcionMenuPrincipal == 2){
                    System.out.println("Opcion 2"); //INGRESO EMPLEADO agregar
                } else {
                    if (opcionMenuPrincipal == 3){
                        System.out.println("¡Gracias por su visita!");
                    }
                }
            }
        }
    }
    
    //CREAMOS OTRO METODO
    public static void pagarPedido(){
        int opcionPago = 0;
        System.out.println("----- Elija el medio de pago -----");
        System.out.println("1. Efectivo");
        System.out.println("2. Credito");
        Scanner practica = new Scanner(System.in);
        System.out.println("Ingrese el número de la opción deseada: ");
        opcionPago= practica.nextInt();
        if (opcionPago == 1){
            System.out.println("Pago en efectivo"); //CAMBIAR
        } else {
            if (opcionPago == 2){
                System.out.println("Pago con tarjeta"); //CAMBIAR
            }
        }
    }
}
