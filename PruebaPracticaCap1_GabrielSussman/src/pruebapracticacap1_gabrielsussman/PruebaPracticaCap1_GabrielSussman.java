/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapracticacap1_gabrielsussman;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class PruebaPracticaCap1_GabrielSussman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int ContMenu = 0;
        while (true) {
            ContMenu++;
            System.out.println("BIENVENIDO A LA PRUEBA PRACTICA DEL CAPITULO 1");
            System.out.println("1. REPETIR MI NOMBRE");
            System.out.println("2. SUBMENU DE MENSAJES");
            System.out.println("3. SALIR DEL PROGRAMA");
            System.out.println("Ingrese su opcion: ");
            int opcion_m = sc.nextInt();
            switch (opcion_m) {
                case 1:
                    System.out.println("BIENVENIDO A REPETIR MI NOMBRE");
                    System.out.println("Cuantas veces desea repetir el texto: ");
                    int numVeces = sc.nextInt();
                    System.out.println("Ingrese su nombre: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    int contName = 0;
                    while (contName < numVeces) {
                        System.out.println("Hola mi nombre es " + name + " y miren mi prueba");
                        contName++;
                    }
                    break;
                case 2:
                    int SubOpcion;
                    while (true) {
                        System.out.println("BIENVENIDO A SUBMENU DE MENSAJES");
                        System.out.println("1. BIENVENIDO");
                        System.out.println("2. DESPEDIDA");
                        System.out.println("3.SALIR");
                        System.out.println("INGRESE SU OPCION DESEADA: ");
                        SubOpcion = sc.nextInt();
                        switch (SubOpcion) {
                            case 1:
                                System.out.println("Ingrese su mensaje deseado: ");
                                sc.nextLine();
                                String msg = sc.nextLine();
                                System.out.println(msg);
                                break;
                            case 2:
                                System.out.println("Hasta luego, gracias por usar mi programa");
                                break;
                            case 3:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;
                        }
                        if (SubOpcion == 3) {
                            break;
                        }

                    }
                    break;
                case 3:
                    System.out.println("Adios esta fue mi prueba");
                    System.out.println("Las veces en el menu principal: " + ContMenu);
                    break;
                default:
                    System.out.println("Ingresar una opcion valida");
            }

        }
    }
}
