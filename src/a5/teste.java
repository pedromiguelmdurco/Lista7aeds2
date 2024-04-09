package a5;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String conta;
		String[] frase;
		
		System.out.println("Digite a conta:");
		conta = teclado.next();
		
		frase= conta.split("");
		pilha pil = new pilha(frase.length);
		
		for(int cont =0 ;cont < frase.length;cont++) {
			pil.inserir(frase[cont]);
			pil.Calcular();
		}
		
		pil.mostrar();
		
		teclado.close();
	}

}
