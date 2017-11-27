/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Scanner;
import classes.Flor;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
public class FlorView {

    public Flor ingresarFlor() {
        Scanner oScannerIngresarFlor = new Scanner(System.in);
        System.out.println("Ingreso de una FLOR.");

        System.out.print("Ingrese el nombre de la flor: ");
        String nombreFlor = oScannerIngresarFlor.nextLine();

        System.out.print("Ingrese el color de la flor: ");
        String colorFlor = oScannerIngresarFlor.nextLine();

        int codigoFlor = 0;
        do {
            System.out.println(" El código de la semilla debe ser un número entre 100 y 999.");
            System.out.print("Ingrese el codigo de la flor: ");
            codigoFlor = oScannerIngresarFlor.nextInt();
        } while (codigoFlor > 100 && codigoFlor < 999);

        int precioFlor = 0;
        do {
            System.out.println(" El precio de la semilla debe ser mayor a 0.");
            System.out.print("Ingrese el precio de la flor: ");
            precioFlor = oScannerIngresarFlor.nextInt();
        } while (precioFlor > 0);

        Flor oFlor = new Flor(colorFlor, codigoFlor, nombreFlor, precioFlor);

        return oFlor;
    }
}
