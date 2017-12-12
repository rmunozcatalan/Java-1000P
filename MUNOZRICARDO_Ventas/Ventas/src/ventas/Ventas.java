package ventas;

import java.util.*;
import Modelo.*;

public class Ventas {

    public static ArrayList<Medicamentos> arrayMedicamentos = new ArrayList();
    public static ArrayList<Narcoticos> arrayNarcoticos = new ArrayList();
    public static ArrayList<Alcohol> arrayAlcohol = new ArrayList();
    public static ArrayList<Pasajes> arrayPasajes = new ArrayList();
    public static ArrayList<Cigarros> arrayCigarros = new ArrayList();

    public static String validaNumero(String num) {
        int NumeroIngresado;
        try {
            NumeroIngresado = Integer.parseInt(num);
            if (NumeroIngresado > 0) {
                return String.valueOf(NumeroIngresado);
            } else {
                return null;
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Error al convertir string en numero: " + num);
            return null;
        }
    }

    public static String validaSoloLetras(String texto) {
        char letra;
        try {
            for (int i = 0; i < texto.length(); i++) {
                letra = texto.charAt(i);
                if (!Character.isLetter(letra)) {
                    System.out.println("El texto ingresado no puede tener numeros: " + texto);
                    return null;
                }
            }
        } catch (Exception e) {
            System.out.println("El texto ingresado no puede tener numeros: " + texto);
            return null;
        }
        return texto;
    }
}
