package br.furb.controller;

import java.io.File;
import java.io.IOException;

import br.furb.commons.FilerProcesser;
import br.furb.commons.exception.TagOrderException;
import br.furb.commons.exception.TagUnclosedException;

public class ValidadorHtmlFacade {
	
	public void facede(File arquivo) throws IOException, TagOrderException, TagUnclosedException {
		FilerProcesser filerProcesser = new FilerProcesser();
		filerProcesser.processarArquivo(arquivo);
	}
}