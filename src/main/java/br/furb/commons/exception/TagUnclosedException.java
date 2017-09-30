package br.furb.commons.exception;

import br.furb.commons.enums.Mensagens;

public class TagUnclosedException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TagUnclosedException() {
		super(Mensagens.TAG_NAO_FECHADA.toString());
	}

	public TagUnclosedException(String mensagem) {
		super(mensagem);
	}
}