package crud_alunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String nome, mat;
		Lista listaAlunos = new Lista();
		int i=1;
		while(i == 1) {
			System.out.println("(1)-adicionar um aluno (2)-remover um aluno da lista (3)-alterar um aluno (4)-exibir lista (0)-sair do programa: ");
			int option = scanner.nextInt();
			switch (option) {
			case 1: 
				System.out.println("digite o nome do aluno: ");
				nome = scanner.next();
				System.out.println("digite agora a matricula: ");
				mat = scanner.next();
				
				if(listaAlunos.inseriAluno(nome, mat) == 1) {
					System.out.println("sucesso na insercao");
				}
				else {
					System.out.println("falha na insercao");
				}
				
				break;
			case 2:
				System.out.println("digite a matricula do aluno a ser removida:");
				mat = scanner.next();
				
				if(listaAlunos.retiraAluno(mat) == 1) {
					System.out.println("sucesso");
				}else {
					System.out.println("falha");
				}
				break;
			case 3:
				System.out.println("digite a matricula do aluno que voce quer alterar:");
				mat = scanner.next();
				System.out.println("digite o nvo nome do aluno:");
				nome = scanner.next();
				if(listaAlunos.atualizaAluno(nome, mat) == 1) {
					System.out.println("sucesso");
				}else {
					System.out.println("falha");
				}
				break;
			case 4:
				listaAlunos.exibeLista();
				break;
			
			case 0:
				i =0;
				break;
		
			}
		}
	}

}
