package projetoLoja;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int id;
		String nomeProduto;
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("digite o id do produto:");
		id = scn.nextInt();
		System.out.println("digite agora o nome do produto:");
		nomeProduto = scn.next();
		Produto pr = new Produto(id,nomeProduto);
		pr.exibeProduto();
	}

}
