/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Duoc
 */
public interface InterfaceVenta {
int iva = 19;
double descuento=0.4;
void aplicarDescuento();
abstract public String nombreProducto();
}