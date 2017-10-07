package trabalho1;

public class TagController {

	public static ListaEstatica<TagTipo> tags = new ListaEstatica<TagTipo>();
	
	// fiz sem saber que não dava pra usar HashMap, mas ficou tão bonito que até
	// deixei
	// e não da pra usar lambda porque a nossa lista não implementa Stream
	/*public void contadorTag(String tag) {
		if (tagN.containsKey(tag))
			tagN.put(tag, tagN.get(tag) + 1);
		else
			tagN.put(tag, 1);
	}*/

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
	
	public static void contaTag(String tag) {
		boolean existe = false;
		if (!tags.estaVazia()) {
			for (int i = 0; i < tags.getTamanho(); i++) {
				if (tag.equals(tags.obterElemento(i).getTipo())) {
					existe = true;
					tags.obterElemento(i).setQuantidade(1);
				}
			}
			if(!existe)
				tags.inserir(new TagTipo(tag, 1));
		} else {
			tags.inserir(new TagTipo(tag, 1));
		}
	}
}