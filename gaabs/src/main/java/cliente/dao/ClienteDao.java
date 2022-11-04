package cliente.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import cliente.model.cliente;

public class ClienteDao {
	public void cadastrarCliente(cliente cliente) {
		String sql = "INSERT INTO clientes VALUES (null,?,?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new ClienteMySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, cliente.getNome());
			pStatement.setString(2, cliente.getCpf());
			pStatement.setString(3, cliente.getEmail());
			pStatement.setString(4, cliente.getDataNasc());
			pStatement.setString(5, cliente.getSenha());	
			pStatement.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pStatement != null) {
					pStatement.close();
				}
			}catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
