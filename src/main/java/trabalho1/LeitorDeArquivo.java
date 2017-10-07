package trabalho1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeitorDeArquivo {
	private LeitorDeArquivo() {}

	public static char[] lerCharsArquivo(File arquivo) throws IOException {
		byte[] arrayBytes = Files.readAllBytes(Paths.get(arquivo.getAbsolutePath()));
		String texto = new String(arrayBytes);
		char[] conteudo = texto.toCharArray();
		return conteudo;
	}
}