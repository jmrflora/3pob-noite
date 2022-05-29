package crud_produtos;

public class Produto {
	private String Id;
	private String nome;
	private String codigoDeBarras;
	private String sku;
	private String descricao;
	private String categoria;
	private float preco;
	private float peso;
	private String fabricante;
	
	
	public Produto (String id, String nome) {
		this.Id = id;
		this.nome = nome;
	}
	
	public Produto (String id,String nome,String codigoDeBarras, String sku, String descricao, String categoria, float preco, float peso, String fabricante) {
		this.Id = id;
		this.nome = nome;
		this.codigoDeBarras = codigoDeBarras;
		this.sku= sku;
		this.descricao = descricao;
		this.categoria = categoria;
		this.preco = preco;
		this.peso = peso;
		this.fabricante = fabricante;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPreco() {
		return preco;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPeso() {
		return peso;
	}
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
