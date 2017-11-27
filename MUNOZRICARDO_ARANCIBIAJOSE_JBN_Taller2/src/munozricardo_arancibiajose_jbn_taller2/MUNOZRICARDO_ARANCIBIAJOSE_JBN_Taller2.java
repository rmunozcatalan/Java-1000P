/*
El Parque Botánico Nacional desea implementar un sistema de gestión de las semillas que tiene a la
venta. Para ello, se ha solicitado el desarrollo de una aplicación Java que permita conocer y
administrar la información de las semillas ofrecidas.
Un grupo de analistas ha diseñado el siguiente modelo según los requerimientos del cliente:

---
Parte 2: Implemente el modelo en código Java, de acuerdo a lo siguiente:
1. El cliente ha indicado las siguientes reglas de negocio:
 El código de la semilla debe ser un número entre 100 y 999
 El nombre de la semilla debe tener 5 caracteres como mínimo
 El precio de la semilla debe ser mayor a 0
 La altura máxima debe ser un número mayor a 0
2. El método calcularPrecioOferta debe retornar el valor de oferta de una semilla (aplicando el
descuento indicado en el diagrama) considerando:
 Todas las flores tendrán precio oferta a excepción de aquellas de color rojo.
 Todos los árboles con altura mayor a 180 cm. Tendrán precio de oferta.
3. El método listar debe retornar un String con todos los datos de todos los productos, con el
siguiente formato: Código: 999 Nombre: aaa bbb Precio: $9999 Precio Oferta: $8888

 */
package munozricardo_arancibiajose_jbn_taller2;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
import classes.*;
import java.util.*;

public class MUNOZRICARDO_ARANCIBIAJOSE_JBN_Taller2 {

//    private int contadorSemillas = 0 ; // para agregar codigos default
    public static void main(String[] args) {
        // TODO code application logic here
        Inventario oInventario = new Inventario();

//        Arbol oArbol = new Arbol(10, 100, "arbol1", 3000);
//        System.out.println(" oArbol.toString" + oArbol.toString());
//        Flor oFlor = new Flor("azul", 200, "flor", 5000);
//        System.out.println(" oFlor.toString" + oFlor.toString());
//        boolean bAgregadoAInventario =
//        oInventario.agregar(oArbol);
//        oInventario.agregar(oFlor);
//
//        System.out.println(" oInventario.toString" + oInventario.listar());
//        
//        oInventario.eliminar(1);
//        System.out.println(" oInventario.toString" + oInventario.listar());
//        
//        
//        oInventario.buscar(1);
        menu(oInventario);
    }

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

    private static void menu(Inventario oInventario) {

        Scanner oScannerMenu = new Scanner(System.in);
        int opcionMenu = 1;

        do {

            opcionesMenu();
            System.out.print("Ingrese una opción válida:");
            opcionMenu = oScannerMenu.nextInt();

            switch (opcionMenu) {

                case 1:
                    ingresar(oInventario);
                    break;
                case 2:
//                    mostrarListado(Semillas);
//                    opcionMenu = 5 ; 
                    break;
                case 5:
                    salirAplicacion();
                    break;
                default:
                    System.out.print("Debe ingresar una opción válida: 1 , 2 o 0 ");
                    break;

            }

        } while (opcionMenu != 0);
    }

    private static void opcionesMenuIngresar() {
        System.out.println("Opciones validas");
        System.out.println("1: Ingresar flor");
        System.out.println("2: Ingresar arbol");
        System.out.println("0: Volver");
    }

    private static Flor ingresarFlor() {
        Scanner oScannerIngresarFlor = new Scanner(System.in);
        System.out.println("Ingreso de una FLOR.");

        System.out.print("Ingrese el nombre de la flor: ");
        String nombreFlor = oScannerIngresarFlor.nextLine();

        System.out.print("Ingrese el color de la flor: ");
        String colorFlor = oScannerIngresarFlor.nextLine();

        System.out.print("Ingrese el codigo de la flor: ");
        int codigoFlor = oScannerIngresarFlor.nextInt();

        System.out.print("Ingrese el precio de la flor: ");
        int precioFlor = oScannerIngresarFlor.nextInt();

        Flor oFlor = new Flor(colorFlor, codigoFlor, nombreFlor, precioFlor);

        return oFlor;

    }

    private static void ingresarArbol() {
        System.out.print("Ingreso de un ARBOL.");
    }

    private static void ingresar(Inventario oInventario) {
        Scanner oScannerIngresar = new Scanner(System.in);
        int opcionMenuIngresar = 0;

        do {

            opcionesMenuIngresar();
            System.out.print("Ingrese una opción válida:");
            opcionMenuIngresar = oScannerIngresar.nextInt();

            switch (opcionMenuIngresar) {

                case 1:
                    Flor oFlor = ingresarFlor();
                    oInventario.agregar(oFlor);
                    break;
                case 2:
                    ingresarArbol();
                    break;
                case 5:
                    salirAplicacion();
                    break;
                default:
                    System.out.print("Debe ingresar una opción válida: 1 , 2 o 0 ");
                    break;

            }

        } while (opcionMenuIngresar != 0);

    }

}
