/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import java.util.ArrayList;
import model.Produtos;

/**
 *
 * @author Gui
 */
public class ProdutoController {

    private final Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Produtos> lista = new ArrayList<>();

    public ProdutoController(Connection connection) {
        this.connection = connection;
    }

    //Inserir Produto no Banco de dados (Create) 
    public void insertBD(Produtos produtos) throws SQLException {
        String sql = "INSERT INTO produtos (nome, marca, validade) VALUES ('" + produtos.getNome() + "', '" + produtos.getMarca() + "', '" + produtos.getValidade() + "') ";
        ps = connection.prepareStatement(sql);
        ps.execute();
        connection.close();
    }

}
