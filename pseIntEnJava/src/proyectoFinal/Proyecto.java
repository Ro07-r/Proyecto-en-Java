package proyectoFinal;

import java.util.Scanner;

public class Proyecto {
    static double montoTotal; //Declaramos una variable global
        
    public static void main(String[] args) {
        //Llamamos al menú principal desde el método main
        montoTotal = 0; //Inicializamos la variable global
        menuPrincipal(montoTotal);
    }
    
    //MENÚ PRINCIPAL DEL PROGRAMA 
    public static void menuPrincipal(double montoTotal){        
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
                ingresoPedido(montoTotal); 
            } else {
                if (opcionMenuPrincipal == 2) {
                    System.out.println("Opcion 2"); //ACÁ FALTA AGREGAR EL PROCESO INGRESO EMPLEADO. POR AHORA COLOQUÉ EL PROCESO PAGAR PEDIDO PARA VER SI FUNCIONA.
                    pagarPedido(montoTotal);
                } else {
                    if (opcionMenuPrincipal == 3) {
                        System.out.println("¡Gracias por su visita!");
                        break;
                    } else {
                        System.out.println("ERROR: La opción elegida no está dentro del menú. Vuelva a intentarlo.");
                    }
                }
            }
        }
    }

    //METODO PARA PAGAR EL PEDIDO
    public static void pagarPedido(double montoTotal) {
        int opcionPago = 0;
        while (opcionPago != 1 && opcionPago != 2){
            System.out.println("----- Elija el medio de pago -----");
            System.out.println("1. Efectivo");
            System.out.println("2. Credito");
            Scanner practica = new Scanner(System.in);
            System.out.println("Ingrese el número de la opción deseada: ");
            opcionPago = practica.nextInt();
            if (opcionPago == 1){
                System.out.println("PAGO EFECTIVO");
                pagoEfectivo(montoTotal);
            } else {
                if (opcionPago == 2){
                    planCuotas(montoTotal);
                } else {
                    System.out.println("ERROR: La opción elegida no es válida. Porfavor vuelva a intentarlo.");
                }
            }            
        }
        montoTotal = 0; //Vuelve a cero el monto para que no siga sumando y poder iniciar un nuevo pedido
    }
    
    //METODO PARA PAGAR CON TARJETA EN UN PAGO
    public static void pagoConTarjeta(double montoTotal){
        String datos, cvv = " ", numTarjeta = " ";
        int año = 0, mes = 0;
        Scanner practica = new Scanner(System.in);
        System.out.println("Ingrese nombre y apellido como figura en la tarjeta: ");
        datos = practica.nextLine();
        numTarjeta.length(); //Sirve para obtener la longitud de una cadena
        Scanner entrada = new Scanner(System.in);
        while (numTarjeta.length() < 16 || numTarjeta.length() > 16){
            System.out.println("Ingrese los 16 dígitos de la tarjeta: ");
            numTarjeta = entrada.nextLine();
            if (numTarjeta.length() > 16){
                System.out.println("La cantidad de números tiene que ser menor.");
            } else {
                if (numTarjeta.length() < 16){
                    System.out.println("La cantidad de números tiene que ser mayor.");
                } else {
                    if (numTarjeta.length() == 16){
                        System.out.println("Ingresaste correctamente los números de la tarjeta.");
                    }
                }
            }
        }
        while (año < 2022){
            Scanner en = new Scanner(System.in);
            System.out.println("Ingrese el año de vencimiento de la tarjeta: ");
            año = en.nextInt();
            if (año < 2022){
                System.out.println("Su tarjeta está vencida.");
            } 
        }
        while (mes < 11 && año == 2022){
            Scanner practice = new Scanner(System.in);
            System.out.println("Ingrese el número de mes de vencimiento de la tarjeta: ");
            mes = practice.nextInt();
            if (mes < 11 && año == 2022){
                System.out.println("Su tarjeta está vencida.");
            }
            while (mes > 12){
                Scanner on = new Scanner(System.in);
                System.out.println("El mes no existe.");
                mes = on.nextInt();
            }
        }
        cvv.length(); //Sirve para obtener la longitud de una cadena
        Scanner entrance = new Scanner(System.in);
        while (cvv.length() < 3 || cvv.length() > 3){
            System.out.println("Ingrese los 3 dígitos del código de seguridad (CVV): ");
            cvv = entrance.nextLine();       
        }
        //Mostramos los datos ingresados
        System.out.println("Usted ingresó los siguientes datos: ");
        System.out.println("Número de tarjeta: " + numTarjeta + " Vencimiento: " + mes + "/" + año + " CVV: " + cvv);
    }
    
    //METODO PARA PAGAR CON TARJETA
    public static void planCuotas(double montoTotal){
        int opcionCuotas = 0;
        System.out.println("1 cuota ---> Sin interes");
        System.out.println("2 cuotas ---> 5% interes");
        System.out.println("3 cuotas ---> 10% interes");
        Scanner practica = new Scanner(System.in);
        while (opcionCuotas != 1 && opcionCuotas != 2 && opcionCuotas !=3){
            System.out.println("Elija una opción");
            opcionCuotas = practica.nextInt();
            if (opcionCuotas == 1){
                pagoConTarjeta(montoTotal); 
            } else {
                if (opcionCuotas == 2){
                    System.out.println("PAGO EN 2 CUOTAS"); //FALTA AGREGAR METODO PARA PAGAR EN 2 CUOTAS
                } else {
                    if (opcionCuotas == 3){
                        System.out.println("PAGO EN 3 CUOTAS"); //FALTA AGREGAR METODO PARA PAGAR EN 3 CUOTAS
                    }
                }
            }
        }        
    }

    //METODO PARA PAGAR EN EFECTIVO
    public static void pagoEfectivo(double montoTotal) { 
        double pagoFinal = 0, vuelto = 0;
        int efectivo = 0;
        pagoFinal = montoTotal - (montoTotal*0.05);
        System.out.println("///5% de descuento///");
        System.out.println("Pago final: "+pagoFinal);
        Scanner practica = new Scanner(System.in);
        while (efectivo < pagoFinal){
            System.out.println("¿Con cuánto va a abonar?");
            efectivo = practica.nextInt();
            if (efectivo < pagoFinal){
                System.out.println("El pago es insuficiente.");
            } else {
                if (efectivo > pagoFinal){
                    vuelto = efectivo - pagoFinal;
                    System.out.println("El vuelto del cliente es: "+vuelto);
                    System.out.println("¡Gracias por su compra!");
                } else {
                    if (efectivo == pagoFinal){
                        System.out.println("El monto abonado es exacto, no debes darle vuelto al cliente.");
                        System.out.println("¡Gracias por su compra!");
                    }
                }
            }
        }
    }
    
    //METODO PARA INGRESAR UN NUEVO PEDIDO
    public static void ingresoPedido(double montoTotal) {
        int combo1 = 0, combo2 = 0, combo3 = 0, comboCono = 0, comboSundae = 0, comboMcFlurry = 0, opcionPostre = 0, opcionMenu = 0, opcionCafe = 0, comboCapuccino = 0, comboCapTent = 0, comboMac = 0,comboSubm = 0, comboLatte = 0, comboFrappe = 0, comboCroiss = 0, comboPound = 0;
        while (opcionMenu != 1 && opcionMenu != 2 && opcionMenu != 3 && opcionMenu != 4 && opcionMenu != 5) {
            System.out.println("----- Menu Mc UTN -----");
            System.out.println("Elija su pedido");
            System.out.println("1. Combos");
            System.out.println("2. Postres");
            System.out.println("3. Mc Café");
            System.out.println("4. Finalizar pedido"); //Llama la función finalizarPedido()
            System.out.println("5. Volver al menú principal"); //Llama la función menuPrincipal()
            Scanner practica = new Scanner(System.in);
            System.out.println("Ingrese el número de la opción deseada: ");
            opcionMenu = practica.nextInt();
            if (opcionMenu == 1){ //Mostramos los combos de hamburguesas
                int opcion = 0; //Declaro la variable opcion para luego usar en el switch y que no se confunda con la variable opcionMenu
                System.out.println("1. Combo Simple (Hamburguesa simple + Bebida + Papas) - $800");
                System.out.println("2. Combo Doble (Hamburguesa doble + Bebida + Papas) - $1200");
                System.out.println("3. Combo Triple (Hamburguesa triple + Bebida + Papas) - $1400");
                System.out.println("4. Finalizar pedido"); //Llama la función finalizarPedido()
                System.out.println("5. Volver al menú para elegir pedido"); //Llama la función ingresoPedido()
                Scanner practice = new Scanner(System.in);
                System.out.println("Ingrese el número de la opción deseada: ");
                opcion = practice.nextInt();
                 switch(opcion){
                    case 1:
                        combo1 = combo1 + 1;
                        montoTotal = montoTotal + 800; //Suma el precio del combo a la variable montoTotal 
			System.out.println("Se ha agregado el Combo Simple a su pedido");
                        ingresoPedido(montoTotal);
                    case 2:
                        combo2 = combo2 + 1;
                        montoTotal = montoTotal + 1200; //Suma el precio del combo a la variable montoTotal 
                        System.out.println("Se ha agregado el Combo Doble a su pedido");
                        ingresoPedido(montoTotal);
                    case 3:
                        combo3 = combo3 + 1;
                        montoTotal = montoTotal + 1400; //Suma el precio del combo a la variable montoTotal 
                        System.out.println("Se ha agregado el Combo Triple a su pedido");
                        ingresoPedido(montoTotal);
                    case 4:
                        //finalizarPedido(montoTotal,combo1,combo2,combo3,comboCono,comboSundae,comboMcFlurry,comboCapuccino,comboCapTent,comboMac,comboSubm,comboLatte,comboFrappe,comboCroiss,comboPound);
                        //Llama a la función finalizarPedido para mostrar el pedido y realizar el pago
                        //FALTA AGREGAR METODO PARA FINALIZAR EL PEDIDO
                        break;
                    case 5:
                        ingresoPedido(montoTotal); 
                    default:
                        System.out.println("ERROR: La opción elegida no está dentro del menú. Vuelva a intentarlo.");    
                        ingresoPedido(montoTotal);
                }               
            } else {
                if (opcionMenu == 2){ //Mostramos las opciones de postres
                    System.out.println("¡POSTRES!");
                    System.out.println("1. Cono");
                    System.out.println("2. Sundae");
                    System.out.println("3. McFlurry");
                    System.out.println("4. Finalizar pedido"); //Llama la función finalizarPedido()
                    System.out.println("5. Volver al menú para elegir pedido"); //Llama la función ingresoPedido()
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Elija su postre: ");
                    opcionPostre = entrada.nextInt();
                    switch(opcionPostre){
                        case 1:
                            comboCono = comboCono + 1;
			    montoTotal = montoTotal + 60;
			    System.out.println("Se ha agregado el postre Cono a su pedido");
                            ingresoPedido(montoTotal);
                        case 2:
                            comboSundae = comboSundae + 1;
			    montoTotal = montoTotal + 250;
			    System.out.println("Se ha agregado el postre Sundae a su pedido");
                            ingresoPedido(montoTotal);                           
                        case 3:
                            comboMcFlurry = comboMcFlurry + 1;
			    montoTotal = montoTotal + 350;
	                    System.out.println("Se ha agregado el postre McFlurry a su pedido");
                            ingresoPedido(montoTotal);
                        case 4:
                            //finalizarPedido(montoTotal,combo1,combo2,combo3,comboCono,comboSundae,comboMcFlurry,comboCapuccino,comboCapTent,comboMac,comboSubm,comboLatte,comboFrappe,comboCroiss,comboPound);
                            //Llama a la función finalizarPedido para mostrar el pedido y realizar el pago
                            //FALTA AGREGAR METODO PARA FINALIZAR EL PEDIDO
                            break;
                        case 5:
                            ingresoPedido(montoTotal);
                        default:
                            System.out.println("ERROR: La opción elegida no está dentro del menú. Vuelva a intentarlo.");
                            ingresoPedido(montoTotal);
                    }                   
                } else {
                    if (opcionMenu == 3){ //Mostramos las opciones de café
                        System.out.println("1. Capuccino - $350");
                        System.out.println("2. Capuccino Tentación - $390");
                        System.out.println("3. Macchiato Bombón - $390");
                        System.out.println("4. Submarino - $390"); 
                        System.out.println("5. Latte - $250");
                        System.out.println("6. Frappe - $350");
                        System.out.println("7. Croissant - $90");
                        System.out.println("8. Poundcake - $100");
                        System.out.println("9. Finalizar pedido"); //Llama la función finalizarPedido()
                        System.out.println("10. Volver al menú para elegir pedido"); //Llama la función ingresoPedido()
                        Scanner entrance = new Scanner(System.in);
                        System.out.println("Elija la opción Mc café: ");
                        opcionCafe = entrance.nextInt();
                        switch(opcionCafe){
                            case 1:
                                comboCapuccino = comboCapuccino + 1;
                                montoTotal = montoTotal + 350;
                                System.out.println("Se ha agregado Capuccino a su pedido");
                                ingresoPedido(montoTotal);
                            case 2:
                                comboCapTent = comboCapTent + 1;
			        montoTotal = montoTotal + 390;
			        System.out.println("Se ha agregado Capuccino Tentación a su pedido");
                                ingresoPedido(montoTotal);
                            case 3:
                                comboMac = comboMac + 1;
			        montoTotal = montoTotal + 390;
                                System.out.println("Se ha agregado Macchiato Bombón a su pedido");
                                ingresoPedido(montoTotal);
                            case 4:
                                comboSubm = comboSubm + 1;
				montoTotal = montoTotal + 390;
				System.out.println("Se ha agregado Submarino a su pedido");
                                ingresoPedido(montoTotal);
                            case 5:
                                comboLatte = comboLatte + 1;
				montoTotal = montoTotal + 250;
				System.out.println("Se ha agregado Latte a su pedido");
                                ingresoPedido(montoTotal);
                            case 6:
                                comboFrappe = comboFrappe + 1;
			        montoTotal = montoTotal + 350;
				System.out.println("Se ha agregado Frappe a su pedido");
                                ingresoPedido(montoTotal);
                            case 7:
                                comboCroiss = comboCroiss + 1;
			        montoTotal = montoTotal + 90;
				System.out.println("Se ha agregado Croissant a su pedido");
                                ingresoPedido(montoTotal);
                            case 8:
                                comboPound = comboPound + 1;
				montoTotal = montoTotal + 100;
                                System.out.println("Se ha agregado Poundcake a su pedido");
                                ingresoPedido(montoTotal);
                            case 9:
                                //finalizarPedido(montoTotal,combo1,combo2,combo3,comboCono,comboSundae,comboMcFlurry,comboCapuccino,comboCapTent,comboMac,comboSubm,comboLatte,comboFrappe,comboCroiss,comboPound);
                                //Llama a la función finalizarPedido para mostrar el pedido y realizar el pago
                                //FALTA AGREGAR METODO PARA FINALIZAR EL PEDIDO
                                break;
                            case 10:
                                ingresoPedido(montoTotal);
                            default:
                                System.out.println("ERROR: La opción elegida no está dentro del menú. Vuelva a intentarlo.");
                                ingresoPedido(montoTotal);
                        }
                    } else {
                        if (opcionMenu == 4 ){
                            //finalizarPedido(montoTotal,combo1,combo2,combo3,comboCono,comboSundae,comboMcFlurry,comboCapuccino,comboCapTent,comboMac,comboSubm,comboLatte,comboFrappe,comboCroiss,comboPound);
                            //Llama a la función finalizarPedido para mostrar el pedido y realizar el pago
                            //FALTA AGREGAR METODO PARA FINALIZAR EL PEDIDO
                            break;
                        } else {
                            if (opcionMenu == 5){
                                menuPrincipal(montoTotal);
                            } else {
                                System.out.println("ERROR: La opción elegida no está dentro del menú. Vuelva a intentarlo.");
                                menuPrincipal(montoTotal);
                            }
                        }
                    }                                        
                }           
            }
        }
    }
}

				
