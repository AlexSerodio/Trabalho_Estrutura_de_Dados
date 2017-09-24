package br.furb.controller;

import java.io.File;
import java.io.IOException;

import br.furb.commons.FilerProcesser;

public class ValidadorHtmlFacade {
	
	public void facede(File arquivo) throws IOException {
		FilerProcesser filerProcesser = new FilerProcesser();
		filerProcesser.processarArquivo(arquivo);
	}
}