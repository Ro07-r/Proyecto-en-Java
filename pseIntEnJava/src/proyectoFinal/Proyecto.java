package proyectoFinal;

import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        //Llamamos al menú principal desde el método main
        menuPrincipal();        
    }
    
    //MENÚ PRINCIPAL DEL PROGRAMA 
    public static void menuPrincipal(){
        int opcionMenuPrincipal = 0;
        while (opcionMenuPrincipal != 1 && opcionMenuPrincipal != 2 && opcionMenuPrincipal != 3) {
            System.out.println("----- Menú Principal Mc UTN -----");
            System.out.println("1. Ingresar nuevo pedido");
            System.out.println("2. Cambio de turno"); //Sirve para cambiar de empleado en el sistema
            System.out.println("3. Salir del sistema");
            Scanner practica = new Scanner(System.in);
            System.out.println("Ingrese el número de la opción deseada: ");
            opcionMenuPrincipal = practica.nextInt();
            if (opcionMenuPrincipal == 1) {
                ingresoPedido(); 
            } else {
                if (opcionMenuPrincipal == 2) {
                    System.out.println("Opcion 2"); //INGRESO EMPLEADO AGREGAR
                } else {
                    if (opcionMenuPrincipal == 3) {
                        System.out.println("¡Gracias por su visita!");
                        break;
                    }
                }
            }
        }
    }

    //METODO PARA PAGAR EL PEDIDO
    public static void pagarPedido() {
        int opcionPago = 0;
        System.out.println("----- Elija el medio de pago -----");
        System.out.println("1. Efectivo");
        System.out.println("2. Credito");
        Scanner practica = new Scanner(System.in);
        System.out.println("Ingrese el número de la opción deseada: ");
        opcionPago = practica.nextInt();
        if (opcionPago == 1) {
            System.out.println("Pago en efectivo"); //AGREGAR
        } else {
            if (opcionPago == 2) {
                System.out.println("Pago con tarjeta"); //AGREGAR
            }
        }
    }

    //METODO PARA PAGAR EN EFECTIVO
    public static void pagoEfectivo() { //FALTA COMPLETAR
    }

    //METODO PARA INGRESAR UN NUEVO PEDIDO
    public static void ingresoPedido() {
        int opcionCombo = 0;
        int combo1 = 0, combo2 = 0, combo3 = 0, comboCono = 0, comboSundae = 0, comboMcFlurry = 0; //opcionPostre,opcionMenu,opcionCafe,comboCapuccino,comboCapTent,comboMac,comboSubm,comboLatte,comboFrappe,comboCroiss,comboPound;
        while (opcionCombo != 1 && opcionCombo != 2 && opcionCombo != 3 && opcionCombo != 4 && opcionCombo != 5) {
            System.out.println("----- Menu Mc UTN -----");
            System.out.println("Elija su pedido");
            System.out.println("1. Combos");
            System.out.println("2. Postres");
            System.out.println("3. Mc Café");
            System.out.println("4. Finalizar pedido");
            System.out.println("5. Volver al menú principal");
            Scanner practica = new Scanner(System.in);
            System.out.println("Seleccione una opción");
            opcionCombo = practica.nextInt();
            if (opcionCombo == 1){
                int opcion = 0;
                System.out.println("1. Combo Simple (Hamburguesa simple + Bebida + Papas) - $800");
                System.out.println("2. Combo Doble (Hamburguesa doble + Bebida + Papas) - $1200");
                System.out.println("3. Combo Triple (Hamburguesa triple + Bebida + Papas) - $1400");
                System.out.println("4. Finalizar pedido");
                System.out.println("5. Volver al menú para elegir pedido");
                Scanner practice = new Scanner(System.in);
                System.out.println("Ingrese el número de la opción deseada: ");
                opcion = practice.nextInt();
                 switch(opcion){
                    case 1:
                        combo1 = combo1 + 1;
                        //montoTotal = montoTotal + 800; //Suma el precio del combo a la variable montoTotal AGREGAR MONTO TOTAL COMO PARAMETRO
			System.out.println("Se ha agregado el Combo Simple");
                        ingresoPedido();
                    case 2:
                        combo2 = combo2 + 1;
                        //montoTotal = montoTotal + 1200; //Suma el precio del combo a la variable montoTotal AGREGAR MONTO TOTAL COMO PARAMETRO
                        System.out.println("Se ha agregado el Combo Doble");
                        ingresoPedido();
                    case 3:
                        combo3 = combo3 + 1;
                         //montoTotal = montoTotal + 1400; //Suma el precio del combo a la variable montoTotal //AGREGAR MONTO TOTAL COMO PARAMETRO
                        System.out.println("Se ha agregado el Combo Triple");
                        ingresoPedido();
                    case 4:
                        //finalizarPedido(montoTotal,combo1,combo2,combo3,comboCono,comboSundae,comboMcFlurry,comboCapuccino,comboCapTent,comboMac,comboSubm,comboLatte,comboFrappe,comboCroiss,comboPound); //Llama a la función finalizarPedido para mostrar el pedido y realizar el pago
                        break;
                    case 5:
                        ingresoPedido(); 
                    default:
                        System.out.println("ERROR: La opción elegida no está dentro del menú. Vuelva a intentarlo.");    
                        ingresoPedido();
                }               
            } else {
                if (opcionCombo == 2){
                    int option = 0;
                    System.out.println("¡POSTRES!");
                    System.out.println("1. Cono");
                    System.out.println("2. Sundae");
                    System.out.println("3. McFlurry");
                    System.out.println("4. Salir");
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Elija su postre: ");
                    option = entrada.nextInt();
                    //Mostramos las opciones de postres
                    switch(option){
                        case 1:
                            comboCono = comboCono + 1;
			    //montoTotal = montoTotal + 60;
			    System.out.println("Se ha agregado el Cono Helado a su pedido");
                            ingresoPedido();                           
                        case 2:
                            comboSundae = comboSundae + 1;
			    //montoTotal = montoTotal + 250;
			    System.out.println("Se ha agregado el Sundae a su pedido");
                            ingresoPedido();                           
                        case 3:
                            comboMcFlurry = comboMcFlurry + 1;
			    //montoTotal = montoTotal + 350;
	                    System.out.println("Se ha agregado el McFlurry a su pedido");
                            ingresoPedido();
                        case 4:
                            //finalizarPedido(montoTotal,combo1,combo2,combo3,comboCono,comboSundae,comboMcFlurry,comboCapuccino,comboCapTent,comboMac,comboSubm,comboLatte,comboFrappe,comboCroiss,comboPound); //Llama a la función finalizarPedido para mostrar el pedido y realizar el pago
                            break;
                        default:
                            System.out.println("Opción inválida");
                            ingresoPedido();
                    }
                    
                    
                }                
            }
        }
    }
}
