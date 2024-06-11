package exercicio13;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioStack01 {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int numero;
		String livro;

		System.out.println("*************************************");
		System.out.println("      1 - Adicionar livro na pilha   ");
		System.out.println("      2 - Listar todos os livro      ");
		System.out.println("      3 - Retirar livro da pilha     ");
		System.out.println("      0 - Sair                       ");
		System.out.println("*************************************");
		System.out.print("Entre com a opção desejada: ");
		numero = sc.nextInt();

		while (numero != 0) {
			if (numero < 0 || numero > 3) {
				System.out.println("Opção inválida!");
			}

			if (numero == 1) {
				System.out.print("Digite o nome do livro: ");
				sc.skip("\\R?");
				livro = sc.nextLine();
				pilha.push(livro);
				System.out.println("\nPilha: ");
				Iterator<String> ilivros = pilha.iterator();
				while (ilivros.hasNext()) {
					System.out.println(ilivros.next());
				}
				System.out.println("\nLivro adicionado!");
			}

			if (numero == 2) {
				if (pilha.isEmpty() == true) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("\nLista de Livros na Pilha:");
					Iterator<String> ilivros = pilha.iterator();
					while (ilivros.hasNext()) {
						System.out.println(ilivros.next());
					}
				}
			}

			if (numero == 3) {
				if (pilha.isEmpty() == true) {
					System.out.println("A pilha está vazia!");
				} else {
					pilha.pop();
					System.out.println("\nPilha: ");
					Iterator<String> ilivros = pilha.iterator();
					while (ilivros.hasNext()) {
						System.out.println(ilivros.next());
					}
					System.out.println("\nUm Livro foi retirado da pilha!");
				}
			}
			System.out.print("\nEntre com a opção desejada: ");
			numero = sc.nextInt();
		}
		System.out.println("\nPrograma finalizado!");

		sc.close();
	}

}
