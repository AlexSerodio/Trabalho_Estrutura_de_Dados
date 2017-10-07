package br.furb.view;

import java.io.File;
import java.io.IOException;

import trabalho1.TagOrderException;
import trabalho1.TagUnclosedException;
import trabalho1.ValidadorHtmlFacade;

public class Main {

	public static void main(String[] args) throws TagOrderException, TagUnclosedException {
		ValidadorHtmlFacade valida = new ValidadorHtmlFacade();
		File arquivo = new File("html.txt");
		try {
			valida.processarArquivo(arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}