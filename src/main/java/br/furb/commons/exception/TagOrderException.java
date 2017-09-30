package br.furb.commons.exception;

import br.furb.commons.enums.Mensagens;

public class TagOrderException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TagOrderException() {
		super(Mensagens.TAG_INCOMPATIVEL.toString());
	}

	public TagOrderException(String mensagem) {
		super(mensagem);
	}
}
