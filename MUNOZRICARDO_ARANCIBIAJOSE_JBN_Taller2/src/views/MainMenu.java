/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import classes.Inventario;
import controllers.InventarioController;
import java.util.Scanner;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
public class MainMenu {

    private static void salirAplicacion() {
        System.out.println("Muchas gracias por usar nuestro sistema");
        System.out.println("Ricardo Muñoz");
        System.out.println("José Arancibia");
    }

    private static void opcionesMenu() {
        System.out.println("Opciones validas");
        System.out.println("1: Ingresar");
        System.out.println("2: Listar");
        System.out.println("0: Salir");
    }

    public void menu(Inventario oInventario) {

        Scanner oScannerMenu = new Scanner(System.in);
        int opcionMenu = 1;

        do {

            opcionesMenu();
            System.out.print("Ingrese una opción válida:");
            opcionMenu = oScannerMenu.nextInt();

            switch (opcionMenu) {

                case 1:
                    new IngresarMenu().ingresar(oInventario);
                    break;
                case 2:
                    new InventarioController().listar(oInventario);
                    break;
                case 0:
                    salirAplicacion();
                    break;
                default:
                    System.out.print("Debe ingresar una opción válida: 1 , 2 o 0 ");
                    break;

            }

        } while (opcionMenu != 0);
    }

}
