/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
import java.util.*;

public class Inventario {

    private List<Semilla> semillas = new ArrayList<>();

    public boolean agregar(Semilla semilla) {
        System.out.println("AGREGAR");
        boolean bAgregar = false;
        try {
            semillas.add(semilla);
            bAgregar = true;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return bAgregar;
    }

    public boolean eliminar(int codigo) {
        System.out.println("ELIMINAR");
        boolean bEliminar = false;

        try {

            System.out.println("semillas.size() " + semillas.size());
            for (int i = 0; i < semillas.size(); i++) {

                    semillas.get(i).toString();
//                if (semillas.get(i).getCodigo().equals(codigo)) {
//                    semillas.remove(i);
//                    bEliminar = true;
//                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

        return bEliminar;
    }

    public String listar() {
        System.out.println("LISTAR");
        String sListar = "";

        for (Semilla semilla : semillas) {
            sListar = sListar + " " + semilla.toString();
        }

        return sListar;
    }

    public boolean buscar(int codigo) {
        System.out.println("BUSCAR");
        boolean bBuscar = false;

        return bBuscar;
    }
}
