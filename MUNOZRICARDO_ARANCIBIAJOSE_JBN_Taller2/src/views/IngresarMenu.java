/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Scanner;
import classes.*;
import controllers.*;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
public class IngresarMenu {

    private static void opcionesMenuIngresar() {
        System.out.println("Opciones validas");
        System.out.println("1: Ingresar flor");
        System.out.println("2: Ingresar árbol");
        System.out.println("0: Volver");
    }

    public void ingresar(Inventario oInventario) {
        Scanner oScannerIngresar = new Scanner(System.in);
        int opcionMenuIngresar = 0;

        do {

            opcionesMenuIngresar();
            System.out.print("Ingrese una opción válida:");
            opcionMenuIngresar = oScannerIngresar.nextInt();

            switch (opcionMenuIngresar) {

                case 1:
                    System.out.println("INGRESE UNA FLOR.");
                    Flor oFlor = new FlorController().ingresar();
                    oInventario.agregar(oFlor);
                    break;
                case 2:
                    System.out.println("INGRESE UN ARBOL.");
                    Arbol oArbol = new ArbolController().ingresar();
                    oInventario.agregar(oArbol);
                    break;
                case 0:
                    new MainMenu().menu(oInventario);
                    break;
                default:
                    System.out.print("Debe ingresar una opción válida: 1 , 2 o 0 ");
                    break;

            }

        } while (opcionMenuIngresar != 0);

    }
}
