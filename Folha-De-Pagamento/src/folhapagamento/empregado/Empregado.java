package folhapagamento.empregado;

public abstract class Empregado {
	protected int numeroEmpregado;
	protected String nome;
	protected String endereco;
	protected int tipo;
	protected int metodoPagamento;
	protected int sindicato;
	
	// Construtor
	public Empregado(int numeroEmpregado, String nome, String endereco, int tipo, int metodoPagamento, int sindicato) {
		this.numeroEmpregado = numeroEmpregado;
		this.nome = nome;
		this.endereco = endereco;
		this.tipo = tipo;
		this.metodoPagamento = metodoPagamento;
		this.sindicato = sindicato;
	}
	
	public abstract void salario();
	
	//======================================= Get/Set =================================================
	
	public int getNumeroEmpregado() {
		return this.numeroEmpregado;
	}
	
	public void setNumeroEmpregado(int numeroEmpregado) {
		this.numeroEmpregado = numeroEmpregado;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	public int getMetodoPagamento() {
		return this.metodoPagamento;
	}
	
	public void setMetodoPagamento(int metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	
	
	public int getSindicato() {
		return this.sindicato;
	}
	
	public void setSindicato(int sindicato) {
		this.sindicato = sindicato;
	}
	
}