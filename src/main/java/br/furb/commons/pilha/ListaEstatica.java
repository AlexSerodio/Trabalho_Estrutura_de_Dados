package br.furb.commons.pilha;
@SuppressWarnings("unchecked")
public class ListaEstatica <ClasseParametrizada>{
	
	private ClasseParametrizada[] info;
	private int tamanho;
	
	public ListaEstatica() {
		info = (ClasseParametrizada[]) new Object[10];
		this.tamanho = 0; 
	}
	
	/*melhor caso: constante*/
	/*pior caso: constante*/
	public void inserir(ClasseParametrizada valor) {		
		if(this.tamanho >= info.length)
			redimensionar();
		info[this.tamanho] = valor;
		this.tamanho++;
	}
	
	/*melhor caso: linear*/
	/*pior caso: linear*/
	private void redimensionar() {
		ClasseParametrizada[] novo = (ClasseParametrizada[]) new Object[tamanho+10];
		for(int i = 0; i < tamanho; i++)
			novo[i] = info[i];
		info = novo;
	}
	
	/*melhor caso: linear*/
	/*pior caso: linear*/
	public void exibir() {
		for(ClasseParametrizada i : info)
			System.out.println(i);
	}
	
	/*melhor caso: constante*/
	/*pior caso: linear*/
	public int buscar(ClasseParametrizada valor) {
		for(int i = 0; i < tamanho; i++)
			if(info[i] == valor)
				return i;
		return -1;
	}
	
	/*melhor caso: constante*/
	/*pior caso: linear*/
	public void retirar(ClasseParametrizada valor) {
		int posicao = buscar(valor);
		if(posicao != -1) {
			for(int i = posicao; i < tamanho; i++)
				info[i] = info[i+1];
			tamanho--;
		}
	}
	
	/*melhor caso: constante*/
	/*pior caso: constante*/
	public void liberar() {
		info = (ClasseParametrizada[])new Object[10];
		tamanho = 0;
	}
	
	/*melhor caso: constante*/
	/*pior caso: constante*/
	public ClasseParametrizada obterElemento(int posicao) {
		if(posicao < 0 || posicao > tamanho)
			throw new IndexOutOfBoundsException();
		return info[posicao];
	}
	
	/*melhor caso: constante*/
	/*pior caso: constante*/
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	/*melhor caso: constante*/
	/*pior caso: constante*/
	public int getTamanho() {
		return this.tamanho;
	}
	
	/*melhor caso: linear*/
	/*pior caso: linear*/
	public void inverter() {
		int j = tamanho-1;
		ClasseParametrizada tmp;
		for(int i = 0; i < tamanho/2; i++) {
			tmp = info[i];
			info[i] = info[j];
			info[j] = tmp;
			j--;
		}
	}
	
	/*melhor caso: linear*/
	/*pior caso: linear*/
	@Override
	public String toString() {
		String conteudo = "";
		for(int i = 0; i < tamanho; i++) {
			conteudo += info[i];
			if(i != tamanho-1)
				conteudo+= ", ";
		}
		return conteudo;
	}
}
