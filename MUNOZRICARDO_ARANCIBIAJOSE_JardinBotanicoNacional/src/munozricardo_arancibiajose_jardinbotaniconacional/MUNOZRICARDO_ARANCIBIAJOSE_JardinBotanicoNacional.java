package munozricardo_arancibiajose_jardinbotaniconacional;

import java.util.*;
import classes.FamiliaSemilla;
import classes.Semilla;

/**
 * @author Ricardo Munoz
 * @author Jose Arancibia
 */
public class MUNOZRICARDO_ARANCIBIAJOSE_JardinBotanicoNacional {

    public static void main(String[] args) {

        List Semillas = new LinkedList();

        //Carga 
        FamiliaSemilla Fabaceae = new FamiliaSemilla(1, "Fabaceae");
        FamiliaSemilla Aextoxicaceae = new FamiliaSemilla(2, "Aextoxicaceae");

        Semilla Acacia_caven = new Semilla(1, "Acacia caven", Fabaceae, "Espino", 1, "Chile, Bolivia, Argentina, Uruguay, Paraguay, sur de Brasil", 1000);
        Semillas.add(Acacia_caven);

        Semilla Aextoxicon_punctatum = new Semilla(2, "Aextoxicon punctatum", Aextoxicaceae, "Olivillo", 1, "Chile y Argentina", 1600);
        Semillas.add(Aextoxicon_punctatum);

        // ingreso de Semilla
        Semilla oSemilla = new Semilla();

        System.out.println("SEMILLA  ");
        System.out.println("Ingrese datos de un nuevo registro  ");
        System.out.print("Ingrese el código de la semilla:  ");
        Scanner oScanner = new Scanner(System.in);
        oSemilla.setCodigo(oScanner.nextInt());
//            rut = lector.next();
//            rut = lector.nextInt();

        Semillas.add(oSemilla);
        // listar
        Iterator iterador = Semillas.iterator();

        while (iterador.hasNext()) {
            Semilla elemento = (Semilla) iterador.next();
            System.out.println(elemento + " ");
        }

    }

}
