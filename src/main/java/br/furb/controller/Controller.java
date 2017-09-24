package br.furb.controller;

import java.io.File;
import java.io.IOException;

public class Controller {

	public static void main(String[] args) {
		ValidadorHtmlFacade valida = new ValidadorHtmlFacade();
		File arquivo = new File("html.txt");
		try {
			valida.processarArquivo(arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
