package br.furb.commons;

import java.io.File;
import java.io.IOException;

import br.furb.commons.pilha.ListaEstatica;
import br.furb.model.Tag;

public class FilerProcesser {
	public void processarArquivo(File arquivo) throws IOException {
		ListaEstatica<String> tagList = TagFinder.separaTags(CharReader.lerArquivo(arquivo));

		for (String tag : new Tag().getEnumNames())
			for (int i = 1; i != tagList.getTamanho(); i++)
				if (!tag.equals(tagList.obterElemento(i)) && !tagList.obterElemento(i).startsWith("/")) {

				}
	}
}
