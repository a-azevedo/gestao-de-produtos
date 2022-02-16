package gdp.model;

public class Produto {
	
	private int cod;
	private String nome;
	private String descricao;
	private double preco;
	
	public Produto(int cod, String nome, String descricao, double preco) {
		this.cod = cod;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
		
}
