package br.furb.commons;

public class TagFinder {

	private TagFinder() {}

	public static ListaEstatica<String> separaTags(char[] conteudo) {
		ListaEstatica<String> tags = new ListaEstatica<String>();
		for (int i = 1; i < conteudo.length; i++) {
			if (conteudo[i - 1] == '<') {
				String tag = "";
				while ((conteudo[i] != '>') && (conteudo[i] != ' '))
					tag += conteudo[i++];

				tags.inserir(tag);
			}
		}
		return tags;
	}
}