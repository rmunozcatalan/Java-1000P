package Controller;

public class AlcoholController {

    public static boolean validarDatos(
            javax.swing.JTextField txtDescProductos,
            javax.swing.JTextField txtCantidad,
            javax.swing.JTextField txtValProducto,
            javax.swing.JTextField txtDistribucion,
            javax.swing.JTextField txtGradoAlcohol
    ) {

        // valida descripcion debe ser solo letras
        txtDescProductos.setText(
                ventas.Ventas.validaSoloLetras(
                        txtDescProductos.getText()
                )
        );
        // valida cantidad debe ser numero
        txtCantidad.setText(
                ventas.Ventas.validaNumero(
                        txtCantidad.getText()
                )
        );
        // valida valor  debe ser numero
        txtValProducto.setText(
                ventas.Ventas.validaNumero(
                        txtValProducto.getText()
                )
        );
        // valida distribucion debe ser solo letras
        txtDistribucion.setText(
                ventas.Ventas.validaSoloLetras(
                        txtDistribucion.getText()
                )
        );
        // valida grados alcoholico debe ser numero
        // TODO: ERROR Error al convertir string en numero: 11.2 debe validar que sea double
        txtGradoAlcohol.setText(
                ventas.Ventas.validaNumero(
                        txtGradoAlcohol.getText()
                )
        );

        // valida descripcion debe tener algo
//        if (txtDescProductos.getText().length() == 0
//                || txtValProducto.getText().length() == 0
//                || txtCantidad.getText().length() == 0
//                || txtDistribucion.getText().length() == 0
//                || txtGradoAlcohol.getText().length() == 0) {
//            return false;
//        }
//
//        return true;
        

        return !(txtDescProductos.getText().length() == 0
                || txtValProducto.getText().length() == 0
                || txtCantidad.getText().length() == 0
                || txtDistribucion.getText().length() == 0
                || txtGradoAlcohol.getText().length() == 0);
    }
}
