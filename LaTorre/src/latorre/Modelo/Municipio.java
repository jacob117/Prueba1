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
public class Municipio extends Conector {
    private String tabla = "municipio";
    
    
    
    public String[][] municipio_x_departamento(String ID_departamento){
        String[][] datos = null;
        String SQL = "SELECT * FROM " + tabla + " WHERE id_depto = "+ID_departamento+" ORDER BY nombre_municipio ASC;";
        datos = this.consulta_registros(SQL);
        
        return datos;
    }
    public String[] municipio_x_ID(String id_departamento, String id_municipio){
        String[] datos = null;
        String[][] datosSQL = null;
        String SQL = "SELECT * FROM "+tabla+" WHERE id_depto"+id_departamento +" AND id_municipio = "+id_municipio+";";
        datosSQL = this.consulta_registros(SQL);
        datos = datosSQL[0];
        
        return datos;
    }
}
