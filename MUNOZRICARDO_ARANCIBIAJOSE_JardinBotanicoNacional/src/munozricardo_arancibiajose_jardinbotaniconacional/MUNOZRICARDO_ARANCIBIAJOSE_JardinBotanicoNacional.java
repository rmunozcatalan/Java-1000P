package munozricardo_arancibiajose_jardinbotaniconacional;

import java.util.*;
import classes.FamiliaSemilla;
import classes.Semilla;

/**
 * @author Ricardo Munoz
 * @author Jose Arancibia
 */
public class MUNOZRICARDO_ARANCIBIAJOSE_JardinBotanicoNacional {

    public static int cantidadSemillas = 0;

    public static void main(String[] args) {
        //        List Semillas = new LinkedList();
        //        List Semillas = new LinkedList();

        List<Semilla> Semillas = new ArrayList<>();

        //Carga 
        FamiliaSemilla Fabaceae = new FamiliaSemilla(1, "Fabaceae");
        FamiliaSemilla Aextoxicaceae = new FamiliaSemilla(2, "Aextoxicaceae");

        Semilla Acacia_caven = addSemilla("Acacia caven", Fabaceae, "Espino", 1, "Chile, Bolivia, Argentina, Uruguay, Paraguay, sur de Brasil", 1000);

        Semillas.add(1, Acacia_caven);

        Semilla Aextoxicon_punctatum = addSemilla("Aextoxicon punctatum", Aextoxicaceae, "Olivillo", 1, "Chile y Argentina", 1600);

        Semillas.add(2, Aextoxicon_punctatum);
        
        for( int i = 0 ; i < Semillas.size() ; i++){
            System.out.println("Semillas.get(i).getCodigo() "+ Semillas.get(i).getCodigo());
        }
        /**
         *
         * //menu Scanner oScannerMenu = new Scanner(System.in); int opcionMenu
         * = 1;
         *
         * do {
         *
         * menu(); System.out.print("Ingrese una opción válida:"); opcionMenu =
         * oScannerMenu.nextInt();
         *
         * switch (opcionMenu) {
         *
         * case 1: Semilla oSemilla = ingresaSemilla(); Semillas.add(oSemilla);
         * // opcionMenu = 2 ; break; case 2: mostrarListado(Semillas); //
         * opcionMenu = 5 ; break; case 5: salirAplicacion(); break; default:
         * System.out.print("Debe ingresar una opción válida: 1 , 2 o 5 ");
         * break;
         *
         * }
         *
         * } while (opcionMenu != 5);
         *
         */
    }

    /**
     * metodo para crear semillas con un codigo autonumerico
     */
    private static Semilla addSemilla(String nombreCientifico, FamiliaSemilla oFamiliaSemilla, String nombreComun, int numero, String origen, int precio) {
        Semilla oSemilla = new Semilla(cantidadSemillas, nombreCientifico, oFamiliaSemilla, nombreComun, numero, origen, precio);
        cantidadSemillas++;
        return oSemilla;
    }

    private static Semilla ingresaSemilla() {

        //Carga 
        FamiliaSemilla Fabaceae = new FamiliaSemilla(1, "Fabaceae");
        FamiliaSemilla Aextoxicaceae = new FamiliaSemilla(2, "Aextoxicaceae");

        // ingreso de Semilla
        Scanner oScanner = new Scanner(System.in);
        Semilla oNewSemilla = new Semilla();
        int iCodigoFamiliaSemillaAux = 1;

        System.out.println("INGRESE SEMILLA  ");
        System.out.println("Ingrese datos de un nuevo registro  ");

        System.out.print("Ingrese el nombre cientifico de la semilla (Puede tener espacios):  ");
        oNewSemilla.setNombreCientifico(oScanner.nextLine());

        // test listar Objeto FamiliaSemilla basico
        System.out.println("Escriba  " + Fabaceae.getCodigo() + ": " + Fabaceae.getDescripcion());
        System.out.println("Escriba  " + Aextoxicaceae.getCodigo() + ": " + Aextoxicaceae.getDescripcion());
        System.out.print("Ingrese la familia de la semilla:  ");
        iCodigoFamiliaSemillaAux = oScanner.nextInt();
        if (iCodigoFamiliaSemillaAux == 1) {
            oNewSemilla.setFamiliaSemilla(Fabaceae);
        }
        if (iCodigoFamiliaSemillaAux == 2) {
            oNewSemilla.setFamiliaSemilla(Aextoxicaceae);
        }

        System.out.print("Ingrese el nombre comun de la semilla (Sin espacios):   ");
        oNewSemilla.setNombreComun(oScanner.next());

        System.out.print("Ingrese el número de la semilla:  ");
        oNewSemilla.setNumero(oScanner.nextInt());

        System.out.print("Ingrese el precio de la semilla:  ");
        oNewSemilla.setPrecio(oScanner.nextInt());

        Semilla oSemilla = addSemilla(
                oNewSemilla.getNombreCientifico(),
                oNewSemilla.getFamiliaSemilla(),
                oNewSemilla.getNombreComun(),
                oNewSemilla.getNumero(),
                oNewSemilla.getOrigen(),
                oNewSemilla.getPrecio()
        );
        return oSemilla;
    }

    // falta una 2da variable para el tipo de dato a mostrar
    private static void mostrarListado(List Listado /* Clase */) {
        System.out.println("MOSTRAR LISTADO DE SEMILLAS");
        // test listar Objeto Semilla List
        Iterator iterador = Listado.iterator();

        while (iterador.hasNext()) {
//            Clase elemento = (Clase) iterador.next(); 
            Semilla elemento = (Semilla) iterador.next();
            System.out.println(elemento + " ");
        }
    }

    private static void salirAplicacion() {
        System.out.println("Muchas gracias por usar nuestro sistema");
        System.out.println("Ricardo Muñoz");
        System.out.println("José Arancibia");
    }

    private static void menu() {
        System.out.println("Opciones validas");
        System.out.println("1: ingresar semilla");
        System.out.println("2: mostrar listado de semillas");
        System.out.println("5: salir");
    }
}
