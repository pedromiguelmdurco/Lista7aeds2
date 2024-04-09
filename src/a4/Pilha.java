package a4;

public class Pilha {
	private int[] pilha;
	private int topo;

	public Pilha(int x) {
		super();
		this.pilha = new int[x];
		this.topo = 0;
	}
	
	public void inserir(int x) {
		this.pilha[topo] = x;
		topo++;
	}
	
	public void remover(){
		this.topo--;
	}
	
	public void mostrar() {
		for(int cont = this.pilha.length; cont > 0; cont--) {
			System.out.print(this.pilha[cont-1]+",");
		}
	}

	public void fibonacci() {
		this.pilha[0] = 1;
		this.pilha[1] = 1;
		
		for(int cont = 2; cont < pilha.length; cont++) {
			this.pilha[cont] = this.pilha[cont-2] + this.pilha[cont-1];
		}
		
	}
}

