package trabalho1;

public class TagUnclosedException extends Exception{

	public TagUnclosedException() {
		super(Mensagens.TAG_NAO_FECHADA.toString());
	}
	
	public TagUnclosedException(String tagsEsperadas) {
		super(Mensagens.TAG_NAO_FECHADA.toString() + " Tags esperadas mas não encontradas: " 
				+ tagsEsperadas);
	}

	//public TagUnclosedException(String mensagem) {
	//	super(mensagem);
	//}
}