package br.furb.commons;

import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;

import br.furb.commons.exception.TagOrderException;
import br.furb.commons.exception.TagUnclosedException;
import br.furb.commons.pilha.ListaEstatica;
import br.furb.commons.pilha.PilhaLista;
import br.furb.commons.strings.CharReader;
import br.furb.commons.strings.TagCounter;
import br.furb.commons.strings.TagFinder;
import br.furb.model.Tag;

public class FilerProcesser implements Map {
	TagCounter tagConter = new TagCounter();

	public void processarArquivo(File arquivo) throws IOException, TagOrderException, TagUnclosedException {
		ListaEstatica<String> tagList = TagFinder.separaTags(CharReader.lerArquivo(arquivo));
		PilhaLista<String> pilhaLista = new PilhaLista<>();
		Tag tag = new Tag();

		for (int i = 0; i != tagList.getTamanho(); i++) {
			boolean tagValida = true;
			for (int j = 0; j != enumNames.getTamanho(); j++) {
				if (enumNames.obterElemento(j).equals(tagList.obterElemento(i))) {
					tagValida = false;
					break;
				}
			}

			if (tagValida && !tagList.obterElemento(i).startsWith("/")) {
				pilhaLista.push(tagList.obterElemento(i));
				tagConter.contadorTagFeio(tagList.obterElemento(i));
				;
			} else {
				String tagLimpa = tagList.obterElemento(i);
				tagLimpa = tagLimpa.replaceAll("/", "");
				if (!tagLimpa.equals(pilhaLista.pop()))
					throw new TagOrderException();
			}
		}
		if (!pilhaLista.estaVazia())
			throw new TagUnclosedException();

		for (int i = 0; i != tagNfeio.getTamanho(); i++) {
			System.out.println(tagNfeio.obterElemento(i).getTipo() + ": " + tagNfeio.obterElemento(i).getQuantia());
		}
	}
}