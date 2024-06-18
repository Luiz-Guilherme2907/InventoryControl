/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

public class Connection {

    public Connection getConection() {
        Connection conn = null;
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sistema_estoque", "root", "1234");
            System.out.println("Conexão bem-sucedida!");

        } catch (SQLException sqlExeException) {
            System.out.println("Erro ao conectar ao banco de dados: " + sqlExeException.getMessage());
        }
        return conn;
    }
}

