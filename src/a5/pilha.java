package a5;

public class pilha {

	private String[] pilha;
	private int topo;

	public pilha(int x) {
		super();
		this.pilha = new String[x];
		this.topo = 0;

	}

	public void mostrar() {

		System.out.print("=" + this.pilha[topo-1]);

	}

	public void inserir(String x) {
		this.pilha[topo] = x;
		topo++;
	}
	
	public void remover(){
		this.topo--;
	}
	
	public void Calcular() {
		double num1, num2,conts;
		
			switch (pilha[topo-1]) {
			case "+": {
				num1 = Double.parseDouble(pilha[topo-2]);
				num2 = Double.parseDouble(pilha[topo - 3]);
				conts = num1 + num2;
				pilha[topo-1] = String.valueOf(conts);
				break;
			}
			case "-": {
				num1 = Double.parseDouble(pilha[topo-2]);
				num2 = Double.parseDouble(pilha[topo-3]);
				if(num1 > num2) {
					conts = num1 - num2;
				}else{
					conts = num2 - num1;
				}

				pilha[topo-1] = String.valueOf(conts);
				break;
			}
			case "/": {
				num1 = Double.parseDouble(pilha[topo-2]);
				num2 = Double.parseDouble(pilha[topo-3]);
				if(num1 > num2) {
					conts = num1 / num2;
				}else{
					conts = num2 / num1;
				}
				pilha[topo-1] = String.valueOf(conts);
				
				break;
			}
			case "*": {
				num1 = Double.parseDouble(pilha[topo-2]);
				num2 = Double.parseDouble(pilha[topo-3]);
				conts = num1 * num2;
				pilha[topo-1] = String.valueOf(conts);
				break;
			}

			default:

			}
		
		
		/*
		double num1, num2,conts;
		for (int cont = 0; cont < pilha.length; cont++) {
			switch (pilha[cont]) {
			case "+": {
				num1 = Double.parseDouble(pilha[topo]);
				num2 = Double.parseDouble(pilha[topo + 1]);
				conts = num1 + num2;
				pilha[cont] = String.valueOf(conts);
				topo += 2;
				break;
			}
			case "-": {
				num1 = Double.parseDouble(pilha[topo]);
				num2 = Double.parseDouble(pilha[topo + 1]);
				if(num1 > num2) {
					conts = num1 - num2;
				}else{
					conts = num2 - num1;
				}

				pilha[cont] = String.valueOf(conts);
				topo += 2;
			}
			case "/": {
				num1 = Double.parseDouble(pilha[topo]);
				num2 = Double.parseDouble(pilha[topo + 1]);
				if(num1 > num2) {
					conts = num1 / num2;
				}else{
					conts = num2 / num1;
				}
				pilha[cont] = String.valueOf(conts);
				topo += 2;
				break;
			}
			case "*": {
				num1 = Double.parseDouble(pilha[topo]);
				num2 = Double.parseDouble(pilha[topo + 1]);
				conts = num1 * num2;
				pilha[cont] = String.valueOf(conts);
				topo += 2;
				break;
			}

			default:

			}
		}*/

	}

	public String[] getPilha() {
		return pilha;
	}

	public void setPilha(String[] pilha) {
		this.pilha = pilha;
	}

	public int getTopo() {
		return topo;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}

	/*
	 * for (int cont2 = cont+1; cont2 > topo ; topo++) { conts -=
	 * Double.parseDouble(pilha[topo]); } pilha[topo] = String.valueOf(conts);
	 * break;
	 */

}
