package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePessoas {
	public static void main(String[] args) throws SQLException, IOException {
		
		Scanner scanner = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Digite a id do usuario: ");
		int id = scanner.nextInt();
		
		String select = "select codigo, nome from pessoas where codigo = ?";
		String update = "update pessoas set nome = ? where codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1),resultado.getString(2));
			
			System.out.println("o nome atual é: " + p.getNome());
			scanner.nextLine();
			
			System.out.println("Digite o novo nome do usuario: ");
			String nomeNovo = scanner.nextLine();
			
			stmt.close();
			
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, nomeNovo);
			stmt.setInt(2, id);
			stmt.execute();
			
			System.out.println("Operacao efetuada com sucesso!");

			stmt.close();
		} else {
			System.out.println("Pessoa não encontrada");
		}
		
		
		conexao.close();
		scanner.close();
	}

}
