package br.furb.commons.pilha;

public class ListaEncadeada <T>{
	
	private NoLista<T> primeiro;

	public ListaEncadeada() {
		primeiro = null;
	}
	
	/*melhor caso: constante*/
	/*pior caso: constante*/
	public NoLista<T> getPrimeiro() {
		return primeiro;
	}	
	
	/*melhor caso: constante*/
	/*pior caso: constante*/
	public void inserir(T info) {
		NoLista<T> nova = new NoLista<T>();
		nova.setInfo(info);
		nova.setProximo(primeiro);
		primeiro = nova;
	}
	
	/*melhor caso: linear*/
	/*pior caso: linear*/
	public void exibir() {
		NoLista<T> p = primeiro;
		while(p != null) {
			System.out.println(p.getInfo());
			p = p.getProximo();
		}
	}
	
	/*melhor caso: constante*/
	/*pior caso: constante*/
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	/*melhor caso: linear*/
	/*pior caso: linear*/
	public void liberar() {
		NoLista<T> p = primeiro;
		NoLista<T> tmp = p;
		while(p != null) {
			tmp = p.getProximo();
			p.setProximo(null);
			p = tmp;
		}
		primeiro = null;
	}
	
	/*melhor caso: constante*/
	/*pior caso: linear*/
	public NoLista<T> buscar(T info){
		NoLista<T> p = primeiro;
		while(p != null) {
			if(p.getInfo().equals(info))
				return p;
			p = p.getProximo();
		}
		return null;
	}
	
	/*melhor caso: constante*/
	/*pior caso: linear*/
	public void retirar(T info) {
		NoLista<T> p = primeiro;
		NoLista<T> anterior = null;
		while(p!=null && !p.getInfo().equals(info)) {
			anterior = p;
			p = p.getProximo();
		}

		if(p != null)
			if(anterior == null)
				primeiro = p.getProximo();
			else
				anterior.setProximo(p.getProximo());
	}
	
	/*melhor caso: linear*/
	/*pior caso: linear*/
	public int obterComprimento() {
		NoLista<T> p = primeiro;
		int tamanho = 0;
		while(p != null) {
			tamanho++;
			p = p.getProximo();
		}
		return tamanho;
	}
	
	/*melhor caso: constante*/
	/*pior caso: linear*/
	public NoLista<T> obterNo(int idx){
		if(idx < 0)
			throw new IndexOutOfBoundsException();
		
		NoLista<T> p = primeiro;
		for(int i = 0; (p != null) && i < idx; i++)
			p = p.getProximo();
		
		if(p == null)
			throw new IndexOutOfBoundsException();
		
		return p;
	}
}
