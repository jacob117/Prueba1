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
public class Categoria extends Conector{
    private String tabla = "categoria_producto";
    
    public void setTabla(String tabla){
        this.tabla=tabla;
    }
    public String getTabla(){
        return tabla;
    }
    public void insertar(int ID,String nombre){
        //agregamos comilla a nombre
        nombre = comilla+nombre+comilla;
        String SQL = "INSERT INTO "+ tabla+ " (id_categoria,descripcion)VALUES(" +ID+","+nombre+");"; 
        System.out.println(SQL);
        this.consulta_vacia(SQL);
    }
    public void actualizar(int ID, String nuevaDescripcion){
        nuevaDescripcion = comilla+nuevaDescripcion+comilla;
        String SQL = "UPDATE "+tabla+" SET descripcion = "+nuevaDescripcion+" WHERE id_categoria = "+ID+";";
        this.consulta_vacia(SQL);
    }
    public void eliminar(int ID){
        String SQL = "DELETE FROM "+tabla+" WHERE id_categoria = "+ID+";";
        System.out.println(SQL);
        this.consulta_vacia(SQL);
    }
    public String[][] consultar(){
        String[][] datos = null;
        
        return datos;
    }
    public String[][] consultar_todas(){
        String[][] datos = null;
        String SQL = "SELECT * FROM "+ tabla+";";
        datos = this.consulta_registros(SQL);
        
        return datos;
    }
    
    public String[][] consulta_por_codigo(int ID){
        String[][] datos = null;
        String SQL = "SELECT * FROM "+ tabla+" WHERE "+" id_categoria = "+ID+";";
        datos = this.consulta_registros(SQL);
        
        return datos;
    }
        
    public String[][] consultar_rango(){
        String[][] datos = null;
        
        return datos;
    }
}
