package exercicio13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioQueue01 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int numero;
		String nome;

		System.out.println("*************************************");
		System.out.println("      1 - Adicionar cliente a fila   ");
		System.out.println("      2 - Listar todos os clientes   ");
		System.out.println("      3 - Retirar cliente da fila    ");
		System.out.println("      0 - Sair                       ");
		System.out.println("*************************************");
		System.out.print("Entre com a opção desejada: ");
		numero = sc.nextInt();

		while (numero != 0) {
			if (numero < 0 || numero > 3) {
				System.out.println("Opção inválida!");
			}

			if (numero == 1) {
				System.out.print("Digite o nome: ");
				nome = sc.next();
				fila.add(nome);
				sc.skip("\\R?");
				System.out.println("\nFila: ");
				Iterator<String> inomes = fila.iterator();
				while (inomes.hasNext()) {
					System.out.println(inomes.next());
				}
				System.out.print("\nCliente Adicionado!\n");
			}
			if (numero == 2) {
				if (fila.isEmpty() == true) {
					System.out.println("A fila está vazia!");

				} else {
					System.out.println("\nLista de Clientes na Fila: ");
					Iterator<String> inomes = fila.iterator();
					while (inomes.hasNext()) {
						System.out.println(inomes.next());
					}
				}
			}
			if (numero == 3) {
				if (fila.isEmpty() == true) {
					System.out.println("A fila está vazia!");

				} else {
					fila.poll();
					System.out.println("\nFila: ");
					Iterator<String> inomes = fila.iterator();
					while (inomes.hasNext()) {
						System.out.println(inomes.next());
					}
					System.out.println("\nO Cliente foi Chamado!");
					
				}

			}
			System.out.print("\nEntre com a opção desejada: ");
			numero = sc.nextInt();
		}
		System.out.println("\nPrograma finalizado!");
		
		sc.close();
	}

}
