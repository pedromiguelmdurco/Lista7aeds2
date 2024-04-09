package lista7;

import java.util.Scanner;

public class Teste {

	public static void menu(Fila x, Scanner teclado) throws Exception {
		int p;
		for (int i = 0; i != 6; i = p) {
			System.out.println("Selecione umas das opções\n" + "1- Inserir Cliente\n" + "2- Remover\n" + "3- Listar\n"
					+ "4- Pesquisar Se esta na fila\n" + "5- Verificar Fila\n" + "6- sair\n");
			p = teclado.nextInt();

			switch (p) {
			case 1: {
				System.out.println("Digite o nome do cliente");
				x.inserir(new Cliente(teclado.next()));
				break;
			}
			case 2: {
				System.out.println("Cliente: "+x.remover().getNome()+" removido");
				break;
			}
			case 3: {
				x.mostrarNomes();
				break;
			}
			case 4: {
				System.out.println("Qual Cliente você procura? ");
				x.procurar(teclado.next());
				break;
			}
			case 5: {
				x.verificarV();
				break;
			}
			case 6: {
				teclado.close();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + p);
			}
		}

	}

	public static void main(String[] args) throws Exception {
		Scanner teclado = new Scanner(System.in, "UTF-8");

		Fila f = new Fila(10);
		
		menu(f,teclado);
		

	}

}
