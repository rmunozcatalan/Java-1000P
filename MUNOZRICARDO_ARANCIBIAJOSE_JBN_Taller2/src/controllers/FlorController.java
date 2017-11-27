/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import classes.Flor;
import views.FlorView;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
public class FlorController {

    public Flor ingresar() {
        Flor oFlor = new FlorView().ingresarFlor();
//        oFlor.setPrecio(
//                oFlor.getPrecio() + (int) oFlor.calcularPrecioOferta()
//        );
        return oFlor;
    }
}
