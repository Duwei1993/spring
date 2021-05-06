package com.springinaction.jdbc.entity.employee.test;

import com.springinaction.jdbc.entity.employee.Employee;

import java.sql.*;

public class EmployeeTest {
    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
    //static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";

    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    //static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final private String DB_URL = "jdbc:mysql://47.114.191.47:3306/springdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    // 数据库的用户名与密码，需要根据自己的设置
    static final private String USER = "springdb";
    static final private String PASS = "p@$$1705pc";

    private Employee getEmployeeById(int id){
        Connection conn = null;
        PreparedStatement stmt ;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.prepareStatement("select id,firstname,lastname,salary from employee where id = ?");
            stmt.setInt(1,id);
            rs = stmt.executeQuery();
            Employee employee = new Employee();
            if (rs.next()){
                employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setFirstName(rs.getString("firstname"));
                employee.setLastName(rs.getString("lastname"));
                employee.setSalary(rs.getBigDecimal("salary"));
            }
            return employee;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (rs != null){
                try {
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int id = 1;
       Employee employee =  (new EmployeeTest()).getEmployeeById(id);
        System.out.println(employee);
    }
}
