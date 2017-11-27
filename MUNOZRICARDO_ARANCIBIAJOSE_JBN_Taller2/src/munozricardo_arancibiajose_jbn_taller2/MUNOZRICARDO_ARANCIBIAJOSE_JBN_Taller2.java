/*
El Parque Botánico Nacional desea implementar un sistema de gestión de las semillas que tiene a la
venta. Para ello, se ha solicitado el desarrollo de una aplicación Java que permita conocer y
administrar la información de las semillas ofrecidas.
Un grupo de analistas ha diseñado el siguiente modelo según los requerimientos del cliente:

---
Parte 2: Implemente el modelo en código Java, de acuerdo a lo siguiente:
1. El cliente ha indicado las siguientes reglas de negocio:
 El código de la semilla debe ser un número entre 100 y 999
 El nombre de la semilla debe tener 5 caracteres como mínimo
 El precio de la semilla debe ser mayor a 0
 La altura máxima debe ser un número mayor a 0
2. El método calcularPrecioOferta debe retornar el valor de oferta de una semilla (aplicando el
descuento indicado en el diagrama) considerando:
 Todas las flores tendrán precio oferta a excepción de aquellas de color rojo.
 Todos los árboles con altura mayor a 180 cm. Tendrán precio de oferta.
3. El método listar debe retornar un String con todos los datos de todos los productos, con el
siguiente formato: Código: 999 Nombre: aaa bbb Precio: $9999 Precio Oferta: $8888

 */
package munozricardo_arancibiajose_jbn_taller2;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
import classes.Inventario;
import views.MainMenu;

public class MUNOZRICARDO_ARANCIBIAJOSE_JBN_Taller2 {

    public static void main(String[] args) {
        Inventario oInventario = new Inventario();
        new MainMenu().menu(oInventario);
    }

}
