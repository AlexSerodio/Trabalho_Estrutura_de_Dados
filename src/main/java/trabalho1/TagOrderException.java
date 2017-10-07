package trabalho1;

public class TagOrderException extends Exception {

	public TagOrderException(String tagEncontrada, String tagEsperada) {
		super(Mensagens.TAG_INCOMPATIVEL.toString() + " Tag encontrada: " + 
				tagEncontrada + ". Tag esperada: " + tagEsperada);
	}
	
	public TagOrderException() {
		super(Mensagens.TAG_INCOMPATIVEL.toString());
	}

	public TagOrderException(String mensagem) {
		super(mensagem);
	}
}
