/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latorre.Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author programadorac
 */
public class Producto extends Conector{
    private String tabla = "producto";
    
    
    public void setTabla(String tabla){
        this.tabla = tabla;
    }
    public String getTabla(){
        return tabla;
    }
    
    public int insertar(int id_categoria, String nombre_producto, double precio_costo, double precio_venta){
        int resultado = 0;
        nombre_producto = comilla+nombre_producto+comilla;
        String SQL = "INSERT INTO "+tabla+" (id_categoria,nombre_producto,precio_costo,precio_venta) "
                + "VALUES("+id_categoria+coma+nombre_producto+coma+precio_costo+coma+precio_venta+" "+");";
        resultado = this.insertar_AI(SQL);
        JOptionPane.showMessageDialog(null, "El id del producto es: "+resultado);
        
        return resultado;
    }
    
    public void actualizar(int idproducto, String nombreproducto, float preciocosto, float precioventa){
        nombreproducto = comilla+nombreproducto+comilla;
        String SQL = "UPDATE "+tabla+" SET nombre_producto = "+nombreproducto+","+"precio_costo = "+preciocosto+","+"precio_venta = "+precioventa+" WHERE id_producto = "+idproducto+";";
        System.out.println(SQL);
        this.consulta_vacia(SQL);
    }
    
    public void eliminar(int idproducto){
        String SQL = "DELETE FROM "+tabla+" WHERE id_producto = "+idproducto+";";
        System.out.println(SQL);
        this.consulta_vacia(SQL);
    }
    
    public String[][] consultar_todas(){
        String[][] datos = null;
        String SQL = "SELECT * FROM "+ tabla+";";
        datos = this.consulta_registros(SQL);
        
        return datos;
    }
    public String[] consultar_x_id(int ID){
        String[] resultado = null;
        String[][] datos = null;
        String SQL = "SELECT * FROM "+ tabla+" WHERE "+" id_producto = "+ID+";";
        datos = this.consulta_registros(SQL);
        resultado = datos[0]; //Se manda toda la fila;
        int a = 0;
        return resultado;
    }
        
   public String[][] consultar_x_categoria(int ID) {
        String[][] datos = null;
        String SQL = "SELECT * FROM " + tabla + " WHERE id_categoria = " + ID + ";";
        datos = this.consulta_registros(SQL);
        return datos;

    }

    public String[][] consultar_x_nombre(String nombre) {
        String[][] datos = null;
        nombre = comilla + "%" + nombre + "%" + comilla;
        String SQL = "SELECT * FROM " + tabla + " WHERE nombre_producto LIKE" + nombre + ";";

        datos = this.consulta_registros(SQL);
        return datos;

    }
    
    public String consultar_precio_x_id(int ID){
        String resultado = null;
        String[][] datos = null;
        String SQL = "SELECT precio_costo FROM "+ tabla+" WHERE "+" id_producto = "+ID+";";
        datos = this.consulta_registros(SQL);
        resultado = datos[0][0]; //Se manda toda la fila;
        int a = 0;
        return resultado;
    }

public String consultar_precio_x_prueba_de_uso (int ID){
        String resultado = null;
        String[][] datos = null;
        String SQL = "SELECT precio_costo FROM "+ tabla+" WHERE "+" id_producto = "+ID+";";
        datos = this.consulta_registros(SQL);
        resultado = datos[0][0]; //Se manda toda la fila;
        int a = 0;
        return resultado;
    }
}

