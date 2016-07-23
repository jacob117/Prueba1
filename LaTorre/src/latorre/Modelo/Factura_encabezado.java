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
public class Factura_encabezado extends Conector{
    private String tabla = "factura_encabezado";

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }
    
    
    public int next_factura_x_serie(String serie){

        int resultado = -999; // =999 se refiere a que hubo un error po si no carga otro numero. 
        String[][] datos = null;
        serie = comilla + serie + comilla;
        String SQL = "SELECT MAX(numero_factura), serie FROM "+tabla+" WHERE serie = "+serie+";";
        datos = this.consulta_registros(SQL);
        
        try{
            resultado = Integer.parseInt(datos[0][0]);
            resultado ++;
            JOptionPane.showMessageDialog(null, resultado);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return resultado;
    }
    
    public void nueva_factura_encabezado(String numeroFactura, String serie, String nitCliente,String direccion, String fechaSQL){
        numeroFactura = comilla + numeroFactura + comilla;
        serie = comilla + serie + comilla;
        nitCliente = comilla + nitCliente + comilla;
        direccion = comilla + direccion + comilla;
        fechaSQL = comilla + fechaSQL + comilla;
        String SQL = "INSERT INTO "+tabla+" VALUES("+numeroFactura+coma+serie+coma+fechaSQL+coma+nitCliente+coma+direccion+");";
        this.consulta_vacia(SQL);
        System.out.println(SQL);
    }
}
