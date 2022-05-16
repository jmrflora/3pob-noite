package projetoLoja;

public class Produto {
	private int id;
	private String categoria;
	private String nomeProduto;
	private double valor;
	
	public Produto(int id, String nomeProduto, String categoria, double valor) {
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.categoria = categoria;
		this.valor = valor;
	}
	public Produto(int id, String nomeProduto) {
		this.id = id;
		this.nomeProduto = nomeProduto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	public void exibeProduto() {
		System.out.println("id:"+id+" nome do produto:"+nomeProduto);
	}
}
