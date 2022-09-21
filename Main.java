import java.util.*;
import java.net.*;
import java.io.*;
import java.sql.*;

public class Main {
  public static void main(String[] args) throws Exception {
    String url = "jdbc:mysql://localhost/my_db";
    String userName = "hoge";
    String password = "hoge";
    calcDb(url, userName, password);
  }
  
  public static void calcDb(String url, String userName, String password) {
    String DRIVER = "oracle.jdbc.driver.OracleDriver";
    try {
      Class.forName(DRIVER);
    } catch (Exception e) {
      
    }
    try(
      Connection con = DriverManager.getConnection(url, userName, password);
      PreparedStatement pstmt = con.prepareStatement("select * from posts");
      ResultSet rs = pstmt.executeQuery();
    )
    {
      StringBuilder result = new StringBuilder();
      while(rs.next()) {
        result.append(rs.getString("message"));
        result.append(" ");
        result.append(rs.getInt("likes"));
        if(!(rs.isLast())) {
          result.append(System.lineSeparator());
        }
      }
      System.out.println(result);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}