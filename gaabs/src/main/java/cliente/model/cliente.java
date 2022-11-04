package cliente.model;

import cliente.dao.ClienteDao;

public class cliente {
	
	private int idCliente;
	private String nome;
	private String cpf;
	private String email;
	private String dataNasc;
	private String senha;
	
	public cliente(String nome2, String cpf2, String email2, String dataNasc2, String senha2) {
		
	}

	public cliente(int idCliente, String nome, String cpf, String email, String dataNasc, String senha) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
		this.senha = senha;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void salvar() {
		new ClienteDao().cadastrarCliente(this);
	}
	
}
