package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException{
		
		String url = "jdbc:mysql://localhost"; 
		//localhost é a porta de conexão padrão
		String usuario = "root";
		String senha = "Ande1604";
		
		Connection conexao = DriverManager		//esse método lança uma excecao checada
				.getConnection(url, usuario, senha); 
	
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}

}
