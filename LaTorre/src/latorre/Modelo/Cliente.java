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
public class Cliente extends Conector {
    private String tabla = "cliente";
    
    public void setTabla(String tabla){
        this.tabla = tabla;
    }
    public String getTabla(){
        return tabla;
    }
    
    
    public void insertar(String nitCliente, String nombre1, String nombre2, String apellido1, 
            String apellido2, String direccion, String email, String telefono, int idMunicipio, int idDepartamento){
        nitCliente = comilla + nitCliente+comilla ;
        nombre1 = comilla +nombre1 +comilla;
        nombre2 = comilla +nombre2 +comilla;
        apellido1 = comilla + apellido1+comilla;
        apellido2 = comilla + apellido2+comilla;
        direccion = comilla +direccion +comilla;
        email = comilla + email+comilla;
        telefono = comilla +telefono +comilla;
        String SQL = "INSERT INTO "+tabla+" (nit_cliente,nombre1,nombre2,apellido1,apellido2,direccion,correo_electronico,telefono,id_municipio,id_depto)\n" +
"VALUES ("+nitCliente+coma+nombre1+coma+nombre2+coma+apellido1+coma+
                apellido2+coma+direccion+coma+email+coma+telefono+coma+idMunicipio+coma+idDepartamento+");";
        System.out.println(SQL);
        this.consulta_vacia(SQL);
        
    }
    
    public void actualizar(String nitCliente,String nombre1, String nombre2, String apellido1, String apellido2, String direccion, String email, String telefono){
        nitCliente = comilla+nombre1+comilla;
        nombre1 = comilla +nombre1 +comilla;
        nombre2 = comilla +nombre2 +comilla;
        apellido1 = comilla + apellido1+comilla;
        apellido2 = comilla + apellido2+comilla;
        direccion = comilla +direccion +comilla;
        email = comilla + email+comilla;
        telefono = comilla +telefono +comilla;
        
        String SQL = "UPDATE "+tabla+" SET nombre1 = "+nombre1+coma+" nombre2 = "+nombre2+coma+" apellido1 = " +
                apellido1+coma+" apellido2 = " + apellido2+coma+" direccion = "+direccion+coma+" correo_electronico = "+
                email+coma+" telefono = "+telefono+coma+" WHERE nit_cliente = "+nitCliente+";";
        System.out.println(SQL);
        //this.consulta_vacia(SQL);
    }
    
    public void eliminar(String nitCliente){
        nitCliente = comilla+nitCliente+comilla;
        String SQL = "DELETE FROM "+tabla+" WHERE nit_cliente = "+nitCliente+";";
        System.out.println(SQL);
        //this.consulta_vacia(SQL);
    }
    
    public String[][] consultar_todas(){
        String[][] datos = null;
        String SQL = "SELECT * FROM " +tabla+ " ORDER BY nit_cliente DESC;";
        System.out.println(SQL);
        datos = this.consulta_registros(SQL);
        
        return datos;
    }
    
    public String[][] consultar_campos_nombres(){
        String[][] datos = null;
        String SQL ="SELECT c.nit_cliente, c.nombre1,c.nombre2,c.apellido1,c.apellido2,c.direccion,c.correo_electronico,"
                + "c.telefono, m.nombre_municipio, d.nombre_depto,c.id_municipio,c.id_depto "
                + "FROM cliente c JOIN municipio m ON c.id_municipio AND c.id_depto = m.id_municipio AND m.id_depto "
                + "JOIN departamento d ON m.id_depto = d.id_depto WHERE c.id_depto = d.id_depto ORDER BY c.nit_cliente DESC;";
        datos=this.consulta_registros(SQL);
        return datos;
    }
    
    public String[][] consultar_departamento(String depto){
        String[][] datos = null;
        String SQL = "SELECT * FROM "+depto +" ;";
        datos = this.consulta_registros(SQL);
        return datos;
    }
    
    public String[][] consultar_municipio(int idDepartamento){
        String[][] datos = null;
        int a = 0;
        String SQL ="SELECT * FROM municipio AS m INNER JOIN departamento AS d ON d.id_depto=m.id_depto \n" +
"WHERE d.id_depto = " + idDepartamento+";" ;
        datos = this.consulta_registros(SQL);
        return datos;
        //return a;
    }
    
    public String[] cliente_x_nit(String NIT){
        String[] resultado= null;
        String[][] datosConector = null;
        NIT = comilla+NIT+comilla;
        
        String SQL = "SELECT direccion, CONCAT(apellido1,' ',apellido2,   ', '  ,nombre1, ' ' ,nombre2) AS Nombre FROM "+tabla+" WHERE nit_cliente = "+NIT+";";
        datosConector = this.consulta_registros(SQL);
        if(datosConector.length != 0){
            resultado = datosConector[0];
        }else{
            resultado = new String[2];
            resultado[0] = "";
            resultado[1] = "";
            JOptionPane.showMessageDialog(null, "El nit no se encuentra en la BD.");
                        
        }
        return resultado;
    }
}

