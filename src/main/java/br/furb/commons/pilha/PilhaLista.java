package br.furb.commons.pilha;

public class PilhaLista<T> implements Pilha<T>{

	private ListaEncadeada<T> lista;
	
	public PilhaLista() {
		lista = new ListaEncadeada<T>();
	}
	
	public void push(T info) {
		lista.inserir(info);
	}

	public T pop() {
		if(estaVazia())
			throw new RuntimeException("Pilha vazia");
		
		T valor = lista.getPrimeiro().getInfo();
		lista.retirar(valor);
		
		return valor;
	}

	public T peek() {
		if(estaVazia())
			throw new RuntimeException("Pilha vazia");
		
		return lista.getPrimeiro().getInfo();
	}

	public boolean estaVazia() {
		return lista.estaVazia();
	}

	public void liberar() {
		lista.liberar();
	}	
}
