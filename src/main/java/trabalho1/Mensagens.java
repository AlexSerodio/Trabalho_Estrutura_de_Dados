package trabalho1;

public enum Mensagens {
	
	TAG_NAO_FECHADA("Faltam tags finais."),
	TAG_INCOMPATIVEL("Foi encontrada uma tag final não esperada.");
	
	
	private final String mensagem;

	private Mensagens(final String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return mensagem;
	}

}
