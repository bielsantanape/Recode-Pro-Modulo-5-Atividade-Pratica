package contato.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import contato.model.contato;

public class ContatoDao {
	public void cadastrarContato(contato contato) {
		String sql = "INSERT INTO contato VALUES (null,?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new ContatoMySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, contato.getNome());
			pStatement.setString(2, contato.getEmail());
			pStatement.setString(3, contato.getTelefone());
			pStatement.setString(4, contato.getMensagem());

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