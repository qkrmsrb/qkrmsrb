package six.member.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBManager {
  private DBManager() {
    System.out.println("connection");
  }
  
  public static Connection getConnection() {
    Connection conn = null;
    try{
      Class.forName(OracleConfig.DRIVER);
      conn = DriverManager.getConnection(OracleConfig.URL, OracleConfig.USER, OracleConfig.PASS);
    }catch(ClassNotFoundException e) {
      e.printStackTrace();
    }catch(SQLException e1){
      e1.printStackTrace();
    }
    return conn;
  }
  
  public static void closeAll(Connection conn, PreparedStatement pstmt) {
    try{
      if(conn != null)
        conn.close();
      if(pstmt != null)
        pstmt.close();
    } catch(SQLException e){
      e.printStackTrace();
    }
  }
  
  public static void closeAll(ResultSet rs, Connection conn, PreparedStatement pstmt) {
    try{
      if(rs != null)
        rs.close();
      closeAll(conn, pstmt);
    }catch(SQLException e){
      e.printStackTrace();
    }
  }
}
