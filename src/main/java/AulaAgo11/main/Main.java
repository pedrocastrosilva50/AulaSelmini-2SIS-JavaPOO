package AulaAgo11.main;
import AulaAgo11.Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String sql;
        PreparedStatement ps;
        ResultSet rs;

        // inserir um registro na tabela java_categoria
        sql = "insert into java_categoria(categoria) values (?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, "camisinha");
            //ps.executeUpdate();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }

        //listagem das categorias

        sql = "select * from java_categoria";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Categoria: "+rs.getString("categoria"));
            }
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}