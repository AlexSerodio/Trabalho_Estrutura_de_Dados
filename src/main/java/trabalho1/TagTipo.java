package trabalho1;

public class TagTipo {

	private String tipo;
	private int quantidade;

	public TagTipo(String tipo, int quantidade) {
		super();
		this.tipo = tipo;
		this.quantidade = quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = this.quantidade+ quantidade;
	}
}