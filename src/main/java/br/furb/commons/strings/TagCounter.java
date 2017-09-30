package br.furb.commons.strings;

import br.furb.commons.Map;
import br.furb.model.TagTipo;

public class TagCounter implements Map {

	// fiz sem saber que não dava pra usar HashMap, mas ficou tão bonito que ate
	// deixei
	// e não da pra usar lambda porque a nossa lista não implementa Stream

	public void contadorTag(String tag) {
		if (tagN.containsKey(tag))
			tagN.put(tag, tagN.get(tag) + 1);
		else
			tagN.put(tag, 1);
	}

	public void contadorTagFeio(String tag) {
		boolean existe = false;
		if (tagNfeio.getTamanho() != 0) {
			for (int i = 0; i != tagNfeio.getTamanho(); i++) {
				if (tag.equals(tagNfeio.obterElemento(i).getTipo())) {
					existe = true;
					break;
				}
			}

			if (existe) {
				for (int i = 0; i != tagNfeio.getTamanho(); i++) {
					if (tag.equals(tagNfeio.obterElemento(i).getTipo())) {
						tagNfeio.obterElemento(i).setQuantia(1);
					}
				}
			} else 
				tagNfeio.inserir(new TagTipo(tag, 1));
			
		} else
			tagNfeio.inserir(new TagTipo(tag, 1));
	}
}