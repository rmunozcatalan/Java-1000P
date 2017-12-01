/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Scanner;
import classes.Arbol;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
public class ArbolView {

    public Arbol ingresarArbol() {
        Scanner oScannerIngresarArbol = new Scanner(System.in);

        System.out.println("Ingreso de una ARBOL.");

        System.out.print("Ingrese el nombre de la árbol: ");
        String nombreArbol = oScannerIngresarArbol.nextLine();

//        try {
//        } catch (Exception e) {
//            e.toString();
//        }
        int alturaArbol = 0;
        do {
            System.out.println("La altura máxima debe ser un número mayor a 0.");
            System.out.print("Ingrese la altura de la árbol (en centímetros): ");
            alturaArbol = oScannerIngresarArbol.nextInt();
        } while (alturaArbol == 100);

        int codigoArbol = 0;
        do {
            System.out.println(" El código de la semilla debe ser un número entre 100 y 999.");
            System.out.print("Ingrese el codigo de la árbol: ");
            codigoArbol = oScannerIngresarArbol.nextInt();
        } while (codigoArbol > 100 && codigoArbol < 999);

        int precioArbol = 0;
        do {
            System.out.println(" El precio de la semilla debe ser mayor a 0.");
            System.out.print("Ingrese el precio de la árbol: ");
            precioArbol = oScannerIngresarArbol.nextInt();
        } while (precioArbol < 0);

        Arbol oArbol = new Arbol(alturaArbol, codigoArbol, nombreArbol, precioArbol);

        return oArbol;
    }
}
