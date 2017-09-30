package br.furb.commons.enums;

public enum Mensagens {
	
	TAG_NAO_FECHADA("Faltam tags finais"),
	TAG_INCOMPATIVEL("Foi encontrada uma tag final não esperada");
	
	
	private final String Mensagens;

	private Mensagens(final String Mensagens) {
		this.Mensagens = Mensagens;
	}

	@Override
	public String toString() {
		return Mensagens;
	}

}
