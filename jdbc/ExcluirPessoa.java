package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException, IOException {
		
		Scanner scanner = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Digite a id do usuario a ser excluido: ");
		int id = scanner.nextInt();
		
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String delete = "DELETE from pessoas WHERE codigo > ?";
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1),resultado.getString(2));
			
			System.out.println("Usuario encontrado: " + p.getNome());
			scanner.nextLine();
			
			stmt.close();
			
			System.out.println("Confirmar exclusão?");
			String resposta = scanner.nextLine();
			scanner.nextLine();
			
			String respostaCerta = "sim";
			if(resposta.equalsIgnoreCase(respostaCerta)) {
				
				stmt = conexao.prepareStatement(delete);
				stmt.setInt(1, id);
				stmt.execute();
				
				System.out.println("Operacao efetuada com sucesso!");
			} else {
				System.out.println("Operação cancelada");
			}
			
		} else {
			System.out.println("Pessoa não encontrada");
		}
		
		conexao.close();
		scanner.close();
	}

}
