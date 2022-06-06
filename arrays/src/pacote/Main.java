package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		double preco;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o tamanho do vetor:");
		int tamanho = sc.nextInt();
		sc.nextLine();
		
		Produto[] prs = new Produto[tamanho];
		
		for(int i=0;i<tamanho;i++) {
			System.out.println("digite o nome do produto:");
			nome = sc.next();
			System.out.println("digite agora o preco:");
			preco = sc.nextDouble();
			prs[i] = new Produto(nome,preco);
			
		}
		for() {
			
		}
	}

}
