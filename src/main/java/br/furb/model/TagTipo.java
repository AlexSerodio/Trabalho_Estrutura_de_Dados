package br.furb.model;

public class TagTipo {

	String tipo;
	int quantia;

	public TagTipo(String tipo, int quantia) {
		super();
		this.tipo = tipo;
		this.quantia = quantia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantia() {
		return quantia;
	}

	public void setQuantia(int quantia) {
		this.quantia = this.quantia+ quantia;
	}
}