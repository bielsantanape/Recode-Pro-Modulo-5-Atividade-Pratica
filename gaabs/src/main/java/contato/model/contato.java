package contato.model;

import contato.dao.ContatoDao;

public class contato {
	private int idContato;
	private String nome;
	private String email;
	private String telefone;
	private String mensagem;
	
	
	public contato(){
		
	}


	public contato(String nome, String email, String telefone, String mensagem) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.mensagem = mensagem;
	}


	public int getIdContato() {
		return idContato;
	}


	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	public void salvar() {
		new ContatoDao().cadastrarContato(this);
	}
	

}
