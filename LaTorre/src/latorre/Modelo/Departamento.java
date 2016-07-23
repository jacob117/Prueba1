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
public class Departamento extends Conector {
    
    private String tabla = "departamento";
    
    
    
    public String[][] listado_departamento(){
        String[][] datos = null;
        String SQL = "SELECT * FROM " + tabla + ";";
        datos = this.consulta_registros(SQL);
        
        return datos;
    }
    public String[] departamento_x_ID(int ID){
        String[] datos = null;
        String[][] datosSQL = null;
        String SQL = "SELECT * FROM "+tabla+" WHERE id_depto = "+ID +";";
        datosSQL = this.consulta_registros(SQL);
        datos = datosSQL[0];
        
        return datos;
    }
    
    
}
