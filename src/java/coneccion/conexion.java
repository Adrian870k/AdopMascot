package coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class conexion {

    static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/soulmate?serverTimezone=UTC&autoReconnect=true&useSSL=false", "root", "abc123");

        } catch (Exception e) {
            con = null;
            System.out.println("Error de la conexion: "+e);
        }
        return con;
    }

//    public static void main(String[] args) throws SQLException {
//        Connection pruebaCon = conexion.getConnection();
//        if (pruebaCon != null) {
//            PreparedStatement stmt;
////            Statement s = pruebaCon.createStatement();
////            ResultSet rs = s.executeQuery("SELECT * FROM soulmate.usuario");
////            
////            while (rs.next()) {
////                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3)+ " " + rs.getInt(4)+ " " + rs.getInt(5)+ " " + rs.getString(6)+ " " + rs.getString(7));
////            }
//
//            stmt = con.prepareStatement("insert into soulmate.usuario (nombre,edad,documento,telefono,correo,password) values(?,?,?,?,?,?)");
//            String a = "Lipaldo";
//            int b = 263;
//            int c = 232;
//            int d = 234;
//            String e = "cor@cpr";
//            String f = "abc";
//            
//            stmt.setString(1, a);
//            stmt.setInt(2, b);
//            stmt.setInt(3, c);
//            stmt.setInt(4, d);
//            stmt.setString(5, e);
//            stmt.setString(6, f);
//            
//            if(stmt.executeUpdate()==1 ){
//                System.out.println("yes");
//            
//            }else{
//                System.out.println("no");
//            }
//            //String consulta = "insert into usuario (nombre,edad,documento,telefono,correo,password) values(?,?,?,?,?,?)";
//            //pst = getConnection().prepareStatement(consulta);
////            pst.executeQuery("SELECT * FROM soulmate.usuario");
////            System.out.println("Conectado");
////            System.out.println("" + pruebaCon);
//        } else {
//            System.out.println("Desconectado");
//        }
//    }

}
