package JDBC.src;

import java.sql.*;
import java.sql.DriverManager;

public class Create_DB{

  


    static final String USER="root";
    static final String PASS="";

public static void main(String[] args) throws Exception {
String DB_URL = "jdbc.mysql://localhost:3306/student";
Connection conn=null;
Statement stmt=null;

try{
    Class.forName("com.mysql.cj.jdbc.Driver");

    System.out.println("connecting to database...");
    conn=DriverManager.getConnection(DB_URL,USER,PASS);

    System.out.println("creating statement..,");
    stmt=conn.createStatement();
    String sql;

    sql="SELECT FROM admission";
    ResultSet rs=stmt.executeQuery(sql);

    System.out.println(rs.next());

    rs.close();
    stmt.close();
    conn.close();
}
catch(SQLException se){

se.printStackTrace();


} finally{
    try{
        if(stmt!=null)
            stmt.close();   
    }
        catch(SQLException se2){
        se2.printStackTrace();
        }



    }

    System.out.println("Goodbye!!");
    }


}



