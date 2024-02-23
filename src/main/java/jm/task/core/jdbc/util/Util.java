package jm.task.core.jdbc.util;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
  private static final String URL = "jdbc:mysql://localhost:3306/test";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "Rootroot123!";
  static Connection connection = null;
    public static Connection getConnection () {
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
          return  connection;
      } catch (ClassNotFoundException | SQLException e) {
          throw new RuntimeException(e);
      }
  }
  public static void closeConnection () throws SQLException {
      if (connection != null)
          connection.close();
  }
}
