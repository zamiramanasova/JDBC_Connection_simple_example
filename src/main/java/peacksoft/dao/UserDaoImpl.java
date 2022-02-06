package peacksoft.dao;

import peacksoft.model.Employee;
import peacksoft.util.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDaoImpl implements UserDao{
    @Override
    public void createTable() {
        String SQL = "create table employee10("+
                "id serial,"+
                "name text,"+
                "age integer);";
        Connection connection = null;
      try {
          connection = JdbcConnection.jdbcConnection();
          PreparedStatement statement = connection.prepareStatement(SQL);
          statement.executeUpdate();
      }catch (SQLException e) {
          e.printStackTrace();
      }finally {
          try {
              connection.close();
          }catch (SQLException e) {
              e.printStackTrace();
          }

      }
    }

    @Override
    public void saveUser(Employee employee) {
      try(Connection connection = JdbcConnection.jdbcConnection()){
          PreparedStatement psmt = connection.prepareStatement("insert into employee10(name,age) values (?,?);");
          psmt.setString(1, employee.getName());
          psmt.setInt(2,employee.getAge());
          psmt.executeUpdate();
          System.out.println("good work");
      }catch (SQLException e) {
          e.printStackTrace();
      }
    }

}
