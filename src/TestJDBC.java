package src;

import java.sql.*;

public class TestJDBC {

    public static void main(String[]args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_glsid","root","");
            PreparedStatement ps = conn.prepareStatement
                    ("select * from produits");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            for(int i = 1; i <= rsmd.getColumnCount(); i++){
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println();
            while(rs.next()){
                for(int i = 1; i <= rsmd.getColumnCount(); i++){
                    System.out.print(rs.getString(i)+"\t\t");
                }
            }    System.out.println();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
