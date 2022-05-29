package crud_produtos;
import java.util.ArrayList;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String nome,id,codigoDeBarras,sku,descricao,categoria,fabricante;
		float preco,peso;
		Lista listaProdutos = new Lista();
		int i =1;
		while(i == 1) {
			System.out.println("(1)-adicionar um produto (2)-remover um produto da lista (3)-alterar um produto (4)-exibir lista (5)-exibir um produto (0)-sair do programa: ");
			int option = scanner.nextInt();
			switch(option) {
				case 1:
					System.out.println("digite o nome do produto: ");
					nome = scanner.next();
					System.out.println("digite agora a id: ");
					id = scanner.next();
					
					if(listaProdutos.inseriProduto(nome, id) == 1) {
						System.out.println("sucesso na insercao");
					}
					else {
						System.out.println("falha na insercao");
					}
					break;
				case 2:
					System.out.println("digite o id do produto a ser removido:");
					id = scanner.next();
					
					if(listaProdutos.retiraProduto(id) == 1) {
						System.out.println("sucesso");
					}else {
						System.out.println("falha");
					}
					break;
				case 3:
					System.out.println("digite a id do produto que voce quer alterar:");
					id = scanner.next();
					System.out.println("digite o novo nome do produto:");
					nome = scanner.next();
					System.out.println("digite o codigo de barras:");
					codigoDeBarras = scanner.next();
					System.out.println("digite o sku:");
					sku = scanner.next();
					System.out.println("digite a descricao:");
					descricao = scanner.next();
					System.out.println("digite a categoria:");
					categoria = scanner.next();
					System.out.println("digite o fabricante:");
					fabricante = scanner.next();
					System.out.println("digite o preco:");
					preco = scanner.nextFloat();
					System.out.println("digite o peso:");
					peso = scanner.nextFloat();
					
					if(listaProdutos.alteraProduto(id,nome,codigoDeBarras,sku,descricao,categoria,preco,peso,fabricante) == 1) {
						System.out.println("sucesso");
					}else {
						System.out.println("falha");
					}
					break;
				case 4:
					listaProdutos.exibeLista();
					break;
				case 5:
					System.out.println("digite o id do produto:");
					id = scanner.next();
					
					if(listaProdutos.exibeElLista(id) == 0) {
						System.out.println("não presente na lista");
					}
					break;
				case 0:
					i =0;
					break;
			}
		
		}

	}

}
