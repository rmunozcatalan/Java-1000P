package ventas;

import java.util.*;
import java.io.*;
import Modelo.*;
import Vista.Inicio;
public class Ventas {

    public static void main(String[] args) throws IOException {
        Inicio i1 = new Inicio();
        //i1.setVisible(true);
        
        Scanner sc = new Scanner(System.in);
        InputStreamReader scanner = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(scanner);

        ArrayList<Medicamentos> arrayMedicamentos = new ArrayList();
        ArrayList<Narcoticos> arrayNarcoticos = new ArrayList();
        ArrayList<Alcohol> arrayAlcohol = new ArrayList();
        ArrayList<Pasajes> arrayPasajes = new ArrayList();
        ArrayList<Cigarros> arrayCigarros = new ArrayList();

        String descProductos;
        int valProducto;
        int cantidad;
        String distribucion;
        String laboratorio;
        double gradoAlcohol;
        int cantidadNicotina;
        String tipoFiltro;
        String destino;
        int opcion;

        do {
            System.out.println("1.- Ingresar");
            System.out.println("2.- Imprimir/Eliminar");
            System.out.println("3.- Buscar");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Seleccione Opciòn a Ingresar");
                        System.out.println("1.- Narcoticos");
                        System.out.println("2.- Pasajes");
                        System.out.println("3.- Medicamentos");
                        System.out.println("4.- Cigarros");
                        System.out.println("5.- Alcohol");
                        System.out.println("6.- Salir");
                        opcion = sc.nextInt();

                        System.out.println("/////////////////////////////////////");

                        switch (opcion) {
                            case 1:
                                System.out.println("Ingresa Descripcion de Productos:");
                                descProductos = new String(br.readLine());
                                System.out.println("Ingresa el Valor del Producto:");
                                valProducto = sc.nextInt();
                                System.out.println("Ingresa la cantidad del Producto:");
                                cantidad = sc.nextInt();
                                System.out.println("Ingresa distribucion del Productos:");
                                distribucion = new String(br.readLine());
                                Narcoticos objNarcoticos = new Narcoticos(descProductos, valProducto, cantidad, distribucion);
                                arrayNarcoticos.add(objNarcoticos);

                                break;
                            case 2:
                                System.out.println("Ingresa Descripcion de Productos:");
                                descProductos = new String(br.readLine());
                                System.out.println("Ingresa el Valor del Producto:");
                                valProducto = sc.nextInt();
                                System.out.println("Ingresa Destino del Pasaje:");
                                destino = new String(br.readLine());
                                Pasajes objPasajes = new Pasajes(descProductos, valProducto, destino);
                                arrayPasajes.add(objPasajes);
                                break;
                            case 3:
                                System.out.println("Ingresa Descripcion de Productos:");
                                descProductos = new String(br.readLine());
                                System.out.println("Ingresa el Valor del Producto:");
                                valProducto = sc.nextInt();
                                System.out.println("Ingresa la cantidad del Producto:");
                                cantidad = sc.nextInt();
                                System.out.println("Ingresa distribucion del Productos:");
                                distribucion = new String(br.readLine());
                                System.out.println("Ingresa Laboratorio:");
                                laboratorio = new String(br.readLine());
                                Medicamentos objMedicamentos = new Medicamentos(descProductos, valProducto, cantidad, distribucion, laboratorio);
                                arrayMedicamentos.add(objMedicamentos);
                                break;
                            case 4:
                                System.out.println("Ingresa Descripcion de Productos:");
                                descProductos = new String(br.readLine());
                                System.out.println("Ingresa el Valor del Producto:");
                                valProducto = sc.nextInt();
                                System.out.println("Ingresa la cantidad del Producto:");
                                cantidad = sc.nextInt();
                                System.out.println("Ingresa distribucion del Productos:");
                                distribucion = new String(br.readLine());
                                System.out.println("Ingresa El tipo Filtro:");
                                tipoFiltro = new String(br.readLine());
                                System.out.println("Ingresa Cantidad Nicotina:");
                                cantidadNicotina = sc.nextInt();
                                Cigarros objCigarros = new Cigarros(descProductos, valProducto, cantidad, distribucion, cantidadNicotina, tipoFiltro);
                                arrayCigarros.add(objCigarros);
                                break;
                            case 5:
                                System.out.println("Ingresa Descripcion de Productos:");
                                descProductos = new String(br.readLine());
                                System.out.println("Ingresa el Valor del Producto:");
                                valProducto = sc.nextInt();
                                //String descProductos, int valProducto, int cantidad, String distribucion, double gradoAlcohol
                                System.out.println("Ingresa la cantidad del Producto:");
                                cantidad = sc.nextInt();
                                System.out.println("Ingresa distribucion del Productos:");
                                distribucion = new String(br.readLine());
                                System.out.println("Ingresa la cantidad del de Grado Alcohol Con Punto:");
                                gradoAlcohol = sc.nextDouble();
                                Alcohol objAlcohol = new Alcohol(descProductos, valProducto, cantidad, distribucion, gradoAlcohol);
                                arrayAlcohol.add(objAlcohol);
                                break;
                        }
                    } while (opcion != 6);
                    break;
                case 2:
                    do {
                        System.out.println("Ingresar Opciòn a leer: ");
                        System.out.println("1.- Narcoticos");
                        System.out.println("2.- Pasajes");
                        System.out.println("3.- Medicamentos");
                        System.out.println("4.- Cigarros");
                        System.out.println("5.- Alcohol");
                        System.out.println("6.- Salir");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                for (int i = 0; i < arrayNarcoticos.size(); i++) {
                                    System.out.println(i + ".- " + arrayNarcoticos.get(i).listarProductos());
                                }
                                System.out.println("Seleccione el que quiera eliminar");
                                opcion = sc.nextInt();
                                arrayNarcoticos.remove(opcion);
                                break;
                            case 2:
                                for (int i = 0; i < arrayPasajes.size(); i++) {
                                    System.out.println(i + ".- " + arrayPasajes.get(i).listarProductos());
                                }
                                System.out.println("Seleccione el que quiera eliminar");
                                opcion = sc.nextInt();
                                arrayPasajes.remove(opcion);
                                break;
                            case 3:
                                for (int i = 0; i < arrayMedicamentos.size(); i++) {
                                    System.out.println(i + ".- " + arrayMedicamentos.get(i).listarProductos());
                                }
                                System.out.println("Seleccione el que quiera eliminar");
                                opcion = sc.nextInt();
                                arrayMedicamentos.remove(opcion);
                                break;
                            case 4:
                                for (int i = 0; i < arrayCigarros.size(); i++) {
                                    System.out.println(i + ".- " + arrayCigarros.get(i).listarProductos());
                                }
                                System.out.println("Seleccione el que quiera eliminar");
                                opcion = sc.nextInt();
                                arrayCigarros.remove(opcion); 
                                break;
                            case 5:
                                for (int i = 0; i < arrayAlcohol.size(); i++) {
                                    System.out.println(i + ".- " + arrayAlcohol.get(i).listarProductos());
                                }
                                
                                System.out.println("Seleccione el que quiera eliminar");
                                opcion = sc.nextInt();
                                arrayAlcohol.remove(opcion);
                                break;
                        }
                    } while (opcion < 6);
                    break;
                case 3:
                    do {
                        System.out.println("Ingresar Opciòn a Buscar: ");
                        System.out.println("1.- Narcoticos");
                        System.out.println("2.- Pasajes");
                        System.out.println("3.- Medicamentos");
                        System.out.println("4.- Cigarros");
                        System.out.println("5.- Alcohol");
                        System.out.println("6.- Salir");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1: {
                        System.out.println("Ingresar Codigo a Buscar: ");
                        opcion = sc.nextInt();
                        for (Narcoticos objS : arrayNarcoticos) {
                            if (objS.getValorProducto()==opcion) {
                                System.out.println("Existe y Chao!");
                                break;
                            }else{
                                System.out.println("No existe!");
                            }
                        } 
    }
                          
                        }
                        break;

                    } while (opcion > 6);
                    break;
            }
        } while (opcion > 2);

    }

}
