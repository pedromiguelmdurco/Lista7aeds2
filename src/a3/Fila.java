package a3;

public class Fila {

	private Cliente[] array;
	private int primeiro;
	private int ultimo;

	public Fila() {
		super();
		this.array = new Cliente[6];
		this.primeiro = ultimo = 0;
	}

	public Fila(int tamanho) {
		super();
		this.array = new Cliente[tamanho + 1];
		this.primeiro = ultimo = 0;
	}

	public void inserir(Cliente x) throws Exception {

		if (((ultimo + 1) % array.length) == primeiro) {
			throw new Exception("Erro ao inserir!");
		}
		array[ultimo] = x;
		ultimo = (ultimo + 1) % array.length;
	}

	public Cliente remover() throws Exception {

		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover!");
		}
		Cliente resp = array[primeiro];
		primeiro = (primeiro + 1) % array.length;
		return resp;
	}

	public void mostrarNomes() {
		System.out.print("\nNomes Cliente na fila:");
		for (int i = primeiro; i != ultimo; i = ((i + 1) % array.length)) {
			System.out.print("(Cliente: " + array[i].getNome() + ") ");
		}
		System.out.println("\n");
	}

	public void verificarV() {
		if (primeiro == ultimo) {
			System.out.println("\nA Fila está vazia");
		}else {
			System.out.println("\nA Fila não está vazia");
		}
	}
	
	public void procurar(String x) {
		boolean z = false;
		for (int i = primeiro; i != ultimo; i = ((i + 1) % array.length)) {
			if(array[i].getNome().equals(x)) {
				z = true;
			}
		}
		if(z == true) {
			System.out.println("O cliente está na fila");
		}else {
			System.out.println("O cliente não está na fila");
		}
	}
	
	

	public Cliente[] getArray() {
		return array;
	}

	public void setArray(Cliente[] array) {
		this.array = array;
	}

	public int getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(int primeiro) {
		this.primeiro = primeiro;
	}

	public int getUltimo() {
		return ultimo;
	}

	public void setUltimo(int ultimo) {
		this.ultimo = ultimo;
	}

}
