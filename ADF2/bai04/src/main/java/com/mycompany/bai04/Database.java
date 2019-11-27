/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bai04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import com.mysql.cj.jdbc.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author sunli
 */
public class Database {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String MAX_POOL = "250";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/javatutorial";
    
    
    private static Database instance;
    private Connection connection;
    
    //constructor
    private Database() {
        System.out.println("This is a constructor for DB");
    }
    //singleton pattern
    public static Database getInstance() {
        if(instance == null) {
            instance = new Database();
            return instance;
        }
        return instance;
    }
    public Connection getConnection() {
        try {
            Properties dbParams = new Properties();
            dbParams.setProperty("user", USERNAME);
            dbParams.setProperty("password", PASSWORD);
            dbParams.setProperty("MaxPooledStatements", MAX_POOL);
            Class.forName("com.mysql.cj.jdbc.Driver");
            //this.connection = DriverManager.getConnection(DATABASE_URL, dbParams);
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/javatutorial?" +
                                   "user=root&password=&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            System.out.println("Connect DB successfully");
        } catch(SQLException e){
            System.err.println("Error connect to DB : "+e.toString());
            this.connection = null;           
        } catch(ClassNotFoundException e) {
            System.err.println("Cannot find driver : "+e.toString());
            this.connection = null;           
        }
        return connection;
    }
    public void disconnect(){
        try {
            this.connection.close();
            this.connection = null;
        } catch(SQLException e) {
        }
        
    }
    public void insertProduct(String name, Double price, String description) {
        try {
            String sql = "INSERT INTO Products(name, price, description)\n" +
                            "VALUES(?, ?, ?)";
            PreparedStatement preparedStatement = this.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setString(3, description);
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if(resultSet.next()) {
                System.out.println("product ID = "+resultSet.getInt(1));
            }
            System.out.println("Insert Product successfully");
        } catch(SQLException e){
            System.err.println("Error insert Product to DB : "+e.toString());
            this.connection = null;           
        }  
    }
    public void deleteProduct(Integer id) {
        try {
            String sql = "DELETE FROM Products WHERE id = ?";
            PreparedStatement preparedStatement = this.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Delete Product successfully");
        } catch(SQLException e){
            System.err.println("Error insert Product to DB : "+e.toString());
            this.connection = null;           
        }  
    }
    
}
