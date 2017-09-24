package br.furb.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import br.furb.commons.ListaEstatica;

public class ValidadorHtmlFacade {

	public void processarArquivo(File arquivo) throws IOException {
		ListaEstatica<String> tags = separaTags(lerArquivo(arquivo));

		for(int i = 0; i < tags.getTamanho(); i++)
			System.out.println(tags.obterElemento(i));
	}
	
	private char[] lerArquivo(File arquivo) throws IOException {
        byte[] arrayBytes = Files.readAllBytes(Paths.get(arquivo.getAbsolutePath()));
        String texto = new String(arrayBytes);
        char[] conteudo = texto.toCharArray();
        //String[] array = texto.split(">");
        
        return conteudo;
	}

	private ListaEstatica<String> separaTags(char[] conteudo) {
		ListaEstatica<String> tags = new ListaEstatica<String>();
		for(int i = 0; i < conteudo.length; i++) {
			if(conteudo[i] == '<') {
				String tag = "";
				while((conteudo[i] != '>') && (conteudo[i] != ' ')) {
					tag += conteudo[i];
					i++;
				}
				tag += '>';
				tags.inserir(tag);
			}
		}
		return tags;
	}
	
}
