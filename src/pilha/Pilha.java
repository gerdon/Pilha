package pilha;

public class Pilha {
	private Object[] elementos;
	private int quantidade = 0;
	
	public Pilha(int tamanho) {
		elementos = new Object[tamanho];
	}

	public boolean estaVazia() {
		return (quantidade == 0);
	}

	public Object tamanho() {	
		return quantidade;
	}

	public void empilha(Object elemento) {
		if(quantidade == elementos.length)
			throw new PilhaCheiaException("N�o � poss�vel empilhar! Pilha Cheia!");
		this.elementos[quantidade] = elemento;
		quantidade++;
		
	}

	public Object topo() {
		return elementos[quantidade - 1];
	}

	public Object desempilha() {
		if(estaVazia())
			throw new PilhaVaziaException("N�o � poss�vel desempilhar! Pilha Vazia!");
		Object topo = topo();
		quantidade--;
		return topo;
	}
}
