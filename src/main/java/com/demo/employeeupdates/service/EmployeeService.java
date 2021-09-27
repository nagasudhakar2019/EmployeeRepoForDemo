package com.demo.employeeupdates.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Service
public class EmployeeService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String insertEmployee(String Id, String Name, String City){
        try{
            String sqlQuery = "INSERT INTO Employee (Id, Name, City) VALUES (?, ?, ?)";
            int result = jdbcTemplate.update(sqlQuery, Id, Name, City);
            if (result > 0) {
                return "record has been created";
            }else{
                return "records has not been created due to some error";
            }
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
            e.printStackTrace();
            return "exception: " + e.getMessage();
        }
//        String result;
//        String url = "jdbc:mysql://localhost:3307/EmployeeDatabase";
//        String username="root";
//        String password="root@2021";
//        try {
//            Connection connection = DriverManager.getConnection(url,username,password);
//            System.out.println("connected to database");
//            return "connected to database";
//        } catch (SQLException e) {
//            System.out.println("exception: "+e.getMessage());
//            e.printStackTrace();
//            return "exception: "+e.getMessage();
//        }
    }
    public String deleteEmployee(String Id){
        try{
            String sqlQuery = "DELETE FROM Employee where id = ?";
            jdbcTemplate.update(sqlQuery, Id);
            return "record has been deleted";
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
            e.printStackTrace();
            return "exception: " + e.getMessage();
        }
    }
}
