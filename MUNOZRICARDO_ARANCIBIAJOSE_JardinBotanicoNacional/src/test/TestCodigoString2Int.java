/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import classes.FamiliaSemilla;
import classes.Semilla;
import java.util.*;
import static munozricardo_arancibiajose_jardinbotaniconacional.MUNOZRICARDO_ARANCIBIAJOSE_JardinBotanicoNacional.cantidadSemillas;

/**
 *
 * @author ricardo.munoz <ricardo.munoz@pucv.cl>
 */
public class TestCodigoString2Int {

    public static void main(String[] args) {

        List<FamiliaSemilla> lista = new ArrayList<>();

        //Carga 
        FamiliaSemilla Fabaceae = new FamiliaSemilla(1, "Fabaceae");
        FamiliaSemilla Aextoxicaceae = new FamiliaSemilla(2, "Aextoxicaceae");

        lista.add(0, Fabaceae);
        lista.add(1, Aextoxicaceae);

        String txtCodigoBuscar = "1"; // variable que escribes en el textbox
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Semillas.get(i).getCodigo() " + lista.get(i).getCodigo());

            if (lista.get(i).getCodigo() == Integer.parseInt(txtCodigoBuscar)) {
                System.out.println("Iguales");
            }
        }

    }

}
