/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import classes.Arbol;
import views.ArbolView;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
public class ArbolController {

    public Arbol ingresar() {
        Arbol oArbol = new ArbolView().ingresarArbol();
//        oArbol.setPrecio(
//                oArbol.getPrecio() + (int) oArbol.calcularPrecioOferta()
//        );
        return oArbol;
    }
}
