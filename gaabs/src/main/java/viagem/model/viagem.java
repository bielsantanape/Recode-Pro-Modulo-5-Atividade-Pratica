package viagem.model;

import viagem.dao.ViagemDao;

public class viagem {
	
	private int idCadastroViagem;
	private String dataIda;
	private String dataVolta;
	private String origem;
	private String destino;
	private String formaPagamento;
	private float valorPago;
	
	public viagem() {
		
	}
	
	public viagem(String dataIda, String dataVolta, String origem, String destino, String formaPagamento, float valorPago) {
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.origem = origem;
		this.destino = destino;
		this.formaPagamento = formaPagamento;
		this.valorPago = valorPago;
	}

	public viagem(int idCadastroViagem, String dataIda, String dataVolta, String origem, String destino,
			String formaPagamento, float valorPago) {
		this.idCadastroViagem = idCadastroViagem;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.origem = origem;
		this.destino = destino;
		this.formaPagamento = formaPagamento;
		this.valorPago = valorPago;
	}

	public int getIdCadastroViagem() {
		return idCadastroViagem;
	}

	public void setIdCadastroViagem(int idCadastroViagem) {
		this.idCadastroViagem = idCadastroViagem;
	}

	public String getDataIda() {
		return dataIda;
	}

	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}

	public String getDataVolta() {
		return dataVolta;
	}

	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}

	public void salvar() {
		new ViagemDao().cadastrarViagem(this);
	}
}
