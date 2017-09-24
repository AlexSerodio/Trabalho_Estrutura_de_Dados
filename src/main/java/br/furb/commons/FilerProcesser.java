package br.furb.commons;

import java.io.File;
import java.io.IOException;

public class FilerProcesser {
	public void processarArquivo(File arquivo) throws IOException {
		ListaEstatica<String> tags = TagFinder.separaTags(CharReader.lerArquivo(arquivo));

		for (int i = 0; i < tags.getTamanho(); i++)
			System.out.println(tags.obterElemento(i));
	}
}