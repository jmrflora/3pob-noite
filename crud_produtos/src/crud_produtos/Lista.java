package crud_produtos;
import java.util.ArrayList;
public class Lista {
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public Lista() {
	}
	public int estaNaLista(String id) {
		Produto pr;
		for(int i = 0;i< produtos.size();i++) {
			pr = produtos.get(i);
			if(pr.getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	public void exibeLista() {
		Produto pr;
		for (int i=0;i< produtos.size();i++) {
			pr = produtos.get(i);
			System.out.println("nome:"+ pr.getNome());
		}
	}
	public int exibeElLista(String id) {
		int pos = estaNaLista(id);
		if(pos != -1) {
			Produto pr = produtos.get(pos);
			System.out.println("id:"+ pr.getId() + " nome:" + pr.getNome()+ " codigo de barras:" + pr.getCodigoDeBarras() + " sku:"+ pr.getSku()+ " descricao:" + pr.getDescricao() + " categoria:" + pr.getCategoria() + " preco:" + pr.getPreco() + " peso:" + pr.getPeso() + " fabricante:" + pr.getFabricante());
			return 1;
		}
		return 0;
	}
	
	public int inseriProduto(String nome, String id) {
		Produto pr = new Produto(id,nome);
		if(estaNaLista(id) == -1) {
			produtos.add(pr);
			return 1;
		}
		return 0;
	}
	public int retiraProduto(String id) {
		int pos = estaNaLista(id);
		if(pos != -1) {
			produtos.remove(pos);
			return 1;
		}
		return 0;
	}
	public int alteraProduto(String id, String nome,String codigoDeBarras, String sku, String descricao, String categoria, float preco, float peso, String fabricante) {
		int pos = estaNaLista(id);
		Produto pr = new Produto(id, nome,codigoDeBarras,sku,descricao,categoria,preco,peso,fabricante);
		if(pos != -1) {
			produtos.set(pos, pr);
			return 1;
		}
		
		return 0;
	}
}
