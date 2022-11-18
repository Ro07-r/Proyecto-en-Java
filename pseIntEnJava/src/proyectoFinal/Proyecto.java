package proyectoFinal;

import login_JFrame.login;
import java.util.Scanner;

public class Proyecto {

    static double montoTotal; //Declaramos una variable global

    public static void main(String[] args) {
        //Llamamos al menú principal desde el método main
        montoTotal = 0; //Inicializamos la variable global
        login login = new login();
        login.setVisible(true);
        //menuPrincipal(montoTotal); Está agregado en el login
    }

    //MENÚ PRINCIPAL DEL PROGRAMA 
    public static void menuPrincipal(double montoTotal) {
        int opcionMenuPrincipal = 0;
        while (opcionMenuPrincipal != 1 && opcionMenuPrincipal != 2 && opcionMenuPrincipal != 3) {
            System.out.println("");
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
                    System.out.println("Opcion 2");
                    login login = new login();
                    login.setVisible(true);

                } else {
                    if (opcionMenuPrincipal == 3) {
                        System.out.println("");
                        System.out.println("¡Gracias por su visita!");
                        System.exit(0);
                        
                    } else {
                        System.out.println("");
                        System.out.println("ERROR: La opción elegida no está dentro del menú. Vuelva a intentarlo.");
                    }
                }
            }
        }
    }

    //METODO PARA PAGAR EL PEDIDO
    public static void pagarPedido(double montoTotal) {
        int opcionPago = 0;
        while (opcionPago != 1 && opcionPago != 2) {
            System.out.println("----- Elija el medio de pago -----");
            System.out.println("1. Efectivo");
            System.out.println("2. Credito");
            Scanner practica = new Scanner(System.in);
            System.out.println("Ingrese el número de la opción deseada: ");
            opcionPago = practica.nextInt();
            if (opcionPago == 1) {
                pagoEfectivo(montoTotal);
            } else {
                if (opcionPago == 2) {
                    System.out.println("");
                    planCuotas(montoTotal);
                } else {
                    System.out.println("");
                    System.out.println("ERROR: La opción elegida no es válida. Porfavor vuelva a intentarlo.");
                }
            }
        }
        montoTotal = 0; //Vuelve a cero el monto para que no siga sumando y poder iniciar un nuevo pedido

    }

    //METODO PARA PAGAR CON TARJETA EN UN PAGO
    public static void pagoConTarjeta(double montoTotal) {
        String datos, cvv = " ", numTarjeta = " ";
        int año = 0, mes = 0;
        Scanner practica = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese nombre y apellido como figura en la tarjeta: ");
        datos = practica.nextLine();
        numTarjeta.length(); //Sirve para obtener la longitud de una cadena
        Scanner entrada = new Scanner(System.in);
        while (numTarjeta.length() < 16 || numTarjeta.length() > 16) {
            System.out.println("");
            System.out.println("Ingrese los 16 dígitos de la tarjeta: ");
            numTarjeta = entrada.nextLine();
            if (numTarjeta.length() > 16) {
                System.out.println("");
                System.out.println("La cantidad de números tiene que ser menor.");
            } else {
                if (numTarjeta.length() < 16) {
                    System.out.println("");
                    System.out.println("La cantidad de números tiene que ser mayor.");
                } else {
                    if (numTarjeta.length() == 16) {
                        System.out.println("");
                        System.out.println("Ingresaste correctamente los números de la tarjeta.");
                    }
                }
            }
        }
        while (año < 2022) {
            Scanner prac = new Scanner(System.in);
            System.out.println("");
            System.out.println("Ingrese el año: ");
            año = prac.nextInt();
            if (año > 2022) {
                Scanner practice = new Scanner(System.in);
                System.out.println("");
                System.out.println("Ingrese el mes: ");
                mes = practice.nextInt();
                while (mes < 1 || mes > 12) {
                    Scanner en = new Scanner(System.in);
                    System.out.println("Ingrese el mes: ");
                    mes = en.nextInt();
                }
            } else {
                if (año == 2022) {
                    Scanner practice = new Scanner(System.in);
                    System.out.println("");
                    System.out.println("Ingrese el mes: ");
                    mes = practice.nextInt();
                    while (mes < 11 || mes > 12) {
                        Scanner en = new Scanner(System.in);
                        System.out.println("");
                        System.out.println("Ingrese el mes: ");
                        mes = en.nextInt();
                    }
                }
            }
        }
        cvv.length(); //Sirve para obtener la longitud de una cadena
        Scanner entrance = new Scanner(System.in);
        while (cvv.length() < 3 || cvv.length() > 3) {
            System.out.println("");
            System.out.println("Ingrese los 3 dígitos del código de seguridad (CVV): ");
            cvv = entrance.nextLine();
        }
        //Mostramos los datos ingresados
        System.out.println("");
        System.out.println("Usted ingresó los siguientes datos: ");
        System.out.println("");
        System.out.println("Número de tarjeta: " + numTarjeta + " Vencimiento: " + mes + "/" + año + " CVV: " + cvv);
        System.out.println("");
        System.out.println("El pago se ha efectuado de forama exitosa ¡Gracias por su compra!");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
    }

    //METODO PARA PAGAR CON TARJETA
    public static void planCuotas(double montoTotal) {
        int opcionCuotas = 0;
        System.out.println("1 cuota ---> Sin interes");
        System.out.println("2 cuotas ---> 5% interes");
        System.out.println("3 cuotas ---> 10% interes");
        Scanner practica = new Scanner(System.in);
        while (opcionCuotas != 1 && opcionCuotas != 2 && opcionCuotas != 3) {
            System.out.println("Elija una opción");
            opcionCuotas = practica.nextInt();
            if (opcionCuotas == 1) {
                pagoConTarjeta(montoTotal);
            } else {
                if (opcionCuotas == 2) {
                    System.out.println("");
                    System.out.println("PAGO EN 2 CUOTAS");
                    pagoDosCuotas(montoTotal);
                } else {
                    if (opcionCuotas == 3) {
                        System.out.println("");
                        System.out.println("PAGO EN 3 CUOTAS");
                        pagoTresCuotas(montoTotal);
                    }
                }
            }
        }
    }

    //metodo para pagar en 2 cuotas 
    public static void pagoDosCuotas(double montoTotal) {
        pagoConTarjeta(montoTotal);
        System.out.println(" ");
        double cuotas, opcionDosCuotas;
        opcionDosCuotas = montoTotal + (montoTotal * 0.05);
        cuotas = opcionDosCuotas / 2;
        System.out.println("");
        System.out.println("El precio final es: $" + opcionDosCuotas + " y lascuotas de:$ " + cuotas);

    }

    //Metodo Para pagar en 3 cuotas 
    public static void pagoTresCuotas(double montoTotal) {
        pagoConTarjeta(montoTotal);
        System.out.println(" ");
        double cuotas, opcionTresCuotas;
        opcionTresCuotas = montoTotal + (montoTotal * 0.10);
        cuotas = opcionTresCuotas / 3;
        System.out.println("");
        System.out.println("El precio final es: $ " + opcionTresCuotas + " y las cuotas de:$" + cuotas);

    }

    //METODO PARA PAGAR EN EFECTIVO
    public static void pagoEfectivo(double montoTotal) {
        double pagoFinal = 0, vuelto = 0;
        int efectivo = 0;
        pagoFinal = montoTotal - (montoTotal * 0.05);
        System.out.println("");
        System.out.println("///5% de descuento///");
        System.out.println("Pago final: " + pagoFinal);

        Scanner practica = new Scanner(System.in);
        while (efectivo < pagoFinal) {
            System.out.println("");
            System.out.println("¿Con cuánto va a abonar?");
            efectivo = practica.nextInt();
            if (efectivo < pagoFinal) {
                System.out.println("");
                System.out.println("El pago es insuficiente.");
            } else {
                if (efectivo > pagoFinal) {
                    vuelto = efectivo - pagoFinal;
                    System.out.println("");
                    System.out.println("El vuelto del cliente es: " + vuelto);
                    System.out.println("");
                    System.out.println("¡Gracias por su compra!");
                    System.out.println("------------------------------------------------");
                    System.out.println("------------------------------------------------");
                    break;
                } else {
                    if (efectivo == pagoFinal) {
                        System.out.println("El monto abonado es exacto, no debes darle vuelto al cliente.");
                        System.out.println("");
                        System.out.println("¡Gracias por su compra!");
                        System.out.println("------------------------------------------------");
                        System.out.println("------------------------------------------------");
                        break;
                    }
                }
            }

        }
    }

    // METODO PARA FINALIZAR PEDIDO
    public static void finalizarPedido(double montoTotal, int combo1, int combo2, int combo3, int opcionMenu, int comboCono,
            int comboSundae, int comboMcFlurry, int opcionPostre, int opcionCafe, int comboCapuccino,
            int comboCapTent, int comboMac, int comboSubm, int comboLatte, int comboFrappe, int comboCroiss,
            int comboPound) {
        System.out.println("********************************************************************************");
        System.out.println("Se ha cerrado la orden");
        //mostrarCombos(); //FALTA HACER EL METODO mostrarCombos()
        System.out.println("El monto total a abonar es $" + montoTotal);
        System.out.println("********************************************************************************");
        System.out.println("Proceda a elegir el medio de pago");
        pagarPedido(montoTotal);
    }

    //METODO PARA INGRESAR UN NUEVO PEDIDO
    public static void ingresoPedido(double montoTotal) {
        int combo1 = 0, combo2 = 0, combo3 = 0, comboCono = 0, comboSundae = 0, comboMcFlurry = 0, opcionPostre = 0, opcionMenu = 0, opcionCafe = 0, comboCapuccino = 0, comboCapTent = 0, comboMac = 0, comboSubm = 0, comboLatte = 0, comboFrappe = 0, comboCroiss = 0, comboPound = 0;
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
            if (opcionMenu == 1) { //Mostramos los combos de hamburguesas
                int opcion = 0; //Declaro la variable opcion para luego usar en el switch y que no se confunda con la variable opcionMenu
                System.out.println("");
                System.out.println("1. Combo Simple (Hamburguesa simple + Bebida + Papas) - $800");
                System.out.println("2. Combo Doble (Hamburguesa doble + Bebida + Papas) - $1200");
                System.out.println("3. Combo Triple (Hamburguesa triple + Bebida + Papas) - $1400");
                System.out.println("4. Finalizar pedido"); //Llama la función finalizarPedido()
                System.out.println("5. Volver al menú para elegir pedido"); //Llama la función ingresoPedido()
                Scanner practice = new Scanner(System.in);
                System.out.println("Ingrese el número de la opción deseada: ");
                opcion = practice.nextInt();
                switch (opcion) {
                    case 1:
                        combo1 = combo1 + 1;
                        montoTotal = montoTotal + 800; //Suma el precio del combo a la variable montoTotal 
                        System.out.println("**********************************************");
                        System.out.println("Se ha agregado el Combo Simple a su pedido");
                        System.out.println("**********************************************");
                        ingresoPedido(montoTotal);
                    case 2:
                        combo2 = combo2 + 1;
                        montoTotal = montoTotal + 1200; //Suma el precio del combo a la variable montoTotal
                        System.out.println("**********************************************");
                        System.out.println("Se ha agregado el Combo Doble a su pedido");
                        System.out.println("**********************************************");
                        ingresoPedido(montoTotal);
                    case 3:
                        combo3 = combo3 + 1;
                        montoTotal = montoTotal + 1400; //Suma el precio del combo a la variable montoTotal
                        System.out.println("**********************************************");
                        System.out.println("Se ha agregado el Combo Triple a su pedido");
                        System.out.println("**********************************************");
                        ingresoPedido(montoTotal);
                    case 4:
                        System.out.println("");
                        //Llama a la función finalizarPedido para mostrar el pedido y realizar el pago
                        finalizarPedido(montoTotal, combo1, combo2, combo3, comboCono, comboSundae, comboMcFlurry, opcionPostre, opcionMenu, opcionCafe, comboCapuccino,
                                comboCapTent, comboMac, comboSubm, comboLatte, comboFrappe, comboCroiss, comboPound);
                        break;
                    case 5:
                        ingresoPedido(montoTotal);
                    default:
                        System.out.println("");
                        System.out.println("ERROR: La opción elegida no está dentro del menú. Vuelva a intentarlo.");
                        System.out.println("");
                        ingresoPedido(montoTotal);
                }
            } else {
                if (opcionMenu == 2) { //Mostramos las opciones de postres
                    System.out.println("");
                    System.out.println("¡POSTRES!");
                    System.out.println("1. Cono");
                    System.out.println("2. Sundae");
                    System.out.println("3. McFlurry");
                    System.out.println("4. Finalizar pedido"); //Llama la función finalizarPedido()
                    System.out.println("5. Volver al menú para elegir pedido"); //Llama la función ingresoPedido()
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Elija su postre: ");
                    opcionPostre = entrada.nextInt();
                    switch (opcionPostre) {
                        case 1:
                            comboCono = comboCono + 1;
                            montoTotal = montoTotal + 60;
                            System.out.println("**********************************************");
                            System.out.println("Se ha agregado el postre Cono a su pedido");
                            System.out.println("**********************************************");
                            ingresoPedido(montoTotal);
                        case 2:
                            comboSundae = comboSundae + 1;
                            montoTotal = montoTotal + 250;
                            System.out.println("**********************************************");
                            System.out.println("Se ha agregado el postre Sundae a su pedido");
                            System.out.println("**********************************************");
                            ingresoPedido(montoTotal);
                        case 3:
                            comboMcFlurry = comboMcFlurry + 1;
                            montoTotal = montoTotal + 350;
                            System.out.println("**********************************************");
                            System.out.println("Se ha agregado el postre McFlurry a su pedido");
                            System.out.println("**********************************************");
                            ingresoPedido(montoTotal);
                        case 4:
                            //Llama a la función finalizarPedido para mostrar el pedido y realizar el pago
                            System.out.println("");
                            finalizarPedido(montoTotal, combo1, combo2, combo3, comboCono, comboSundae, comboMcFlurry, opcionPostre, opcionMenu, opcionCafe, comboCapuccino,
                                    comboCapTent, comboMac, comboSubm, comboLatte, comboFrappe, comboCroiss, comboPound);
                            break;
                        case 5:
                            ingresoPedido(montoTotal);
                        default:
                            System.out.println("");
                            System.out.println("ERROR: La opción elegida no está dentro del menú. Vuelva a intentarlo.");
                            System.out.println("");
                            ingresoPedido(montoTotal);
                    }
                } else {
                    if (opcionMenu == 3) { //Mostramos las opciones de café
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
                        switch (opcionCafe) {
                            case 1:
                                comboCapuccino = comboCapuccino + 1;
                                montoTotal = montoTotal + 350;
                                System.out.println("**********************************************");
                                System.out.println("Se ha agregado Capuccino a su pedido");
                                System.out.println("**********************************************");
                                ingresoPedido(montoTotal);
                            case 2:
                                comboCapTent = comboCapTent + 1;
                                montoTotal = montoTotal + 390;
                                System.out.println("**********************************************");
                                System.out.println("Se ha agregado Capuccino Tentación a su pedido");
                                System.out.println("**********************************************");
                                ingresoPedido(montoTotal);
                            case 3:
                                comboMac = comboMac + 1;
                                montoTotal = montoTotal + 390;
                                System.out.println("**********************************************");
                                System.out.println("Se ha agregado Macchiato Bombón a su pedido");
                                System.out.println("**********************************************");
                                ingresoPedido(montoTotal);
                            case 4:
                                comboSubm = comboSubm + 1;
                                montoTotal = montoTotal + 390;
                                System.out.println("**********************************************");
                                System.out.println("Se ha agregado Submarino a su pedido");
                                System.out.println("**********************************************");
                                ingresoPedido(montoTotal);
                            case 5:
                                comboLatte = comboLatte + 1;
                                montoTotal = montoTotal + 250;
                                System.out.println("**********************************************");
                                System.out.println("Se ha agregado Latte a su pedido");
                                System.out.println("**********************************************");
                                ingresoPedido(montoTotal);
                            case 6:
                                comboFrappe = comboFrappe + 1;
                                montoTotal = montoTotal + 350;
                                System.out.println("**********************************************");
                                System.out.println("Se ha agregado Frappe a su pedido");
                                System.out.println("**********************************************");
                                ingresoPedido(montoTotal);
                            case 7:
                                comboCroiss = comboCroiss + 1;
                                montoTotal = montoTotal + 90;
                                System.out.println("**********************************************");
                                System.out.println("Se ha agregado Croissant a su pedido");
                                System.out.println("**********************************************");
                                ingresoPedido(montoTotal);
                            case 8:
                                comboPound = comboPound + 1;
                                montoTotal = montoTotal + 100;
                                System.out.println("**********************************************");
                                System.out.println("Se ha agregado Poundcake a su pedido");
                                System.out.println("**********************************************");
                                ingresoPedido(montoTotal);
                            case 9:
                                //Llama a la función finalizarPedido para mostrar el pedido y realizar el pago
                                System.out.println("");
                                finalizarPedido(montoTotal, combo1, combo2, combo3, comboCono, comboSundae, comboMcFlurry, opcionPostre, opcionMenu, opcionCafe, comboCapuccino,
                                        comboCapTent, comboMac, comboSubm, comboLatte, comboFrappe, comboCroiss, comboPound);
                                break;
                            case 10:
                                System.out.println("");
                                ingresoPedido(montoTotal);
                            default:
                                System.out.println("************************************************************************");
                                System.out.println("ERROR: La opción elegida no está dentro del menú. Vuelva a intentarlo.");
                                System.out.println("************************************************************************yami");
                                ingresoPedido(montoTotal);
                        }
                    } else {
                        if (opcionMenu == 4) {
                            //Llama a la función finalizarPedido para mostrar el pedido y realizar el pago
                            System.out.println("");
                            finalizarPedido(montoTotal, combo1, combo2, combo3, comboCono, comboSundae, comboMcFlurry, opcionPostre, opcionMenu, opcionCafe, comboCapuccino,
                                    comboCapTent, comboMac, comboSubm, comboLatte, comboFrappe, comboCroiss, comboPound);
                            break;
                        } else {
                            if (opcionMenu == 5) {
                                System.out.println("");
                                menuPrincipal(montoTotal);
                            } else {
                                System.out.println("");
                                System.out.println("ERROR: La opción elegida no está dentro del menú. Vuelva a intentarlo.");
                                System.out.println("");
                                menuPrincipal(montoTotal);
                            }
                        }
                    }
                }
            }
        }
    }
}
