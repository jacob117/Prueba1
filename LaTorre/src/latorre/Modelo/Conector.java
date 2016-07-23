
package latorre.Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/** MODELO. */

public class Conector {
    Connection c1 = null;
    String comilla = "'";
    String coma = ",";
    private String IP="localhost";
    private String usuario="root";
    private String password="";
    private String BaseDatos="la_torre";

        
    protected void conectar(){
        try{
            /** SON PUNTOS POR LA GRAN P. **/
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c1 = DriverManager.getConnection(
            "jdbc:mysql://"+IP+"/"+BaseDatos,usuario,password
            );
            System.out.println("Exito");
        }catch(Exception e){
            System.out.println("Fallo la conexion");
            System.out.println(e.getMessage());
        }
    }
    
    protected void desconectar(){
        try{
            c1.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public void consulta_vacia(String SQL){
        this.conectar();
        try{
            Statement st = c1.createStatement();
            st.executeUpdate(SQL);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        this.desconectar();
    }
    
    public String[][] consulta_registros(String SQL){
        ResultSet registros = null;
        String[][] datos = new String[1][1];
        datos[0][0]="Sin Resultados";
        
        int filas = 0; int columnas = 0;
        ResultSetMetaData metaDatos;
        this.conectar();
        /** Esta parte realiza la conexion y hace la consulta cargando los datosen la variable registros. */
        try{
            Statement st = c1.createStatement();
            registros = st.executeQuery(SQL); //Ejecuta
            metaDatos = registros.getMetaData(); /** Datos sobre registros. */
            columnas = metaDatos.getColumnCount(); /** Cuenta las columnas que tiene la consulta. */
            registros.last(); /** Con esto nos posicionamos en la ultima fila, ya que no hay metodo para contarlas como en
             las columnas "getColumnCount". */
            
            filas = registros.getRow(); /** Obtiene le numero de filas. */
            registros.beforeFirst();/** Se posiciona al inicio. */
            datos = new String [filas][ columnas];
            int j = 0;
            while(registros.next()/*next para pasar al siguiente. */){
                for(int i = 0; i<columnas; i++){
                    datos[j][i]= registros.getString(i+1);
                }
                j++;
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        this.desconectar();
        return datos;
    }
    
    // auto incremental
    public int insertar_AI(String SQL){
        int resultado = 0;
        /**********************/
         this.conectar();
         ResultSet pkAI = null; //Primary Key AUTO INCREMENT
        try{
            Statement st = c1.createStatement();
            st.executeUpdate(SQL,Statement.RETURN_GENERATED_KEYS);
            pkAI = st.getGeneratedKeys();
            
            if(pkAI.next()){
                resultado = pkAI.getInt(1); //UNO PORQUE ES LA PRIMERA COLUMNA
               //LOS RESULTSET EMPIEZAN DESDE 1, LOS ARRAY DESDE 0 
            }          
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        this.desconectar();
        return resultado;
    }
       
}
