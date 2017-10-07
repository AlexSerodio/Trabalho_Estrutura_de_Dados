package trabalho1;

import java.io.File;
import java.io.IOException;

public class ValidadorHtml {

	public void validarHtml(File arquivo) throws IOException, TagOrderException, TagUnclosedException {
		ListaEstatica<String> tagList = TagController.separaTags(LeitorDeArquivo.lerCharsArquivo(arquivo));
		ListaEstatica<String> singletonTags = SingletonTags.listarSingletonTags();
		PilhaLista<String> pilhaLista = new PilhaLista<String>();
		
		//verifica se a tag � uma singleton ou n�o
		for (int i = 0; i < tagList.getTamanho(); i++) {
			boolean tagValida = true;
			for (int j = 0; j < singletonTags.getTamanho(); j++) {
				if (singletonTags.obterElemento(j).equals(tagList.obterElemento(i))) {
					tagValida = false;
					break;
				}
			}
			if (tagValida) {	//se for uma tag v�lida...
				if(!tagList.obterElemento(i).startsWith("/")) {	//...e de abertura, adiciona na pilha
					pilhaLista.push(tagList.obterElemento(i));
					TagController.contaTag(tagList.obterElemento(i));
				} else {
					if(!pilhaLista.estaVazia()) {
						String tagLimpa = tagList.obterElemento(i);
						tagLimpa = tagLimpa.replaceAll("/", "");
						String tag = pilhaLista.pop();
						if (!tagLimpa.equals(tag))
							throw new TagOrderException("</"+tagLimpa+">", "</"+tag+">");
					}else {
						throw new TagOrderException();
					}
				}
			}else {//...se nao for v�lida (singleton tag) ainda assim conta
				TagController.contaTag(tagList.obterElemento(i));
			}
		}
		
		if (!pilhaLista.estaVazia()) {
			String tagsEsperadas = "";
			while(!pilhaLista.estaVazia())
				tagsEsperadas = tagsEsperadas + " </" + pilhaLista.pop() + ">";
			throw new TagUnclosedException(tagsEsperadas);
		}
			
		System.out.println("Arquivo formatado corretamente. Rela��o de tags encontradas:");
		for (int i = 0; i != TagController.tags.getTamanho(); i++) 
			System.out.println("Tag: <" + TagController.tags.obterElemento(i).getTipo()+">" 
					+ " | Quantidade: " + TagController.tags.obterElemento(i).getQuantidade());
			
	}
	
}
