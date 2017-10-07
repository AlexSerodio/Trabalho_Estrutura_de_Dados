package trabalho1;

import java.io.File;
import java.io.IOException;

/**
*
* @author Alex Ser�dio Gon�alves e Guilherme dos Santos Pinto
*/
public class ValidadorHtmlFacade {
	
	public void processarArquivo(File arquivo) throws IOException, TagOrderException, TagUnclosedException {
		ValidadorHtml validadorHtml = new ValidadorHtml();
		validadorHtml.validarHtml(arquivo);
	}
	
}