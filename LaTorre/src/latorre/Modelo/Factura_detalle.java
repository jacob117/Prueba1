/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latorre.Modelo;

/**
 *
 * @author programadorac
 */
public class Factura_detalle extends Conector{
    private String tabla = "factura_detalle";

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }
    
    public void ingresar_fila_detalle(String numeroFactura, String serie, String idProducto, String cantidad,
            String precioCosto, String precioVenta){
        
        serie = comilla + serie + comilla;
        String SQL = "INSERT INTO "+tabla+"(numero_factura, serie, id_producto, cantidad, precio_historico_costo,"
                + "precio_historico_venta) VALUES("+numeroFactura+coma+serie+coma+idProducto+coma+
                cantidad+coma+precioCosto+coma+precioVenta+");";
        this.consulta_vacia(SQL);
        System.out.println(SQL);
    }
    
    
}
