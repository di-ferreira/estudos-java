package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        String sqlDelete = "DELETE FROM pessoas WHERE codigo = ?";
        String sqlSelect = "SELECT codigo,nome FROM pessoas WHERE nome LIKE ? XOR codigo = ?";

        System.out.print("Informe o nome atual ou código da pessoa: ");
        String busca = entrada.nextLine();

        PreparedStatement stmt = conexao.prepareStatement(sqlSelect);
        stmt.setString(1, "%" + busca + "%");
        stmt.setString(2, busca);
        ResultSet result = stmt.executeQuery();

        if (result.next()) {
            Pessoa pessoa = new Pessoa(result.getInt(1), result.getString(2));

            System.out.println("A pessoa atual é " + pessoa.getNome());

            stmt.close();

            stmt = conexao.prepareStatement(sqlDelete);
            stmt.setInt(1, pessoa.getCodigo());
            stmt.execute();

            System.out.println("Pessoa excluída com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }


        entrada.close();
        stmt.close();
        conexao.close();
    }
}
