/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import classes.Inventario;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
public class InventarioController {

    public void listar(Inventario oInventario) {
        System.out.println("LISTAR");

        System.out.print(oInventario.listar());

    }
}
