package br.furb.model;

import br.furb.commons.Map;
import br.furb.commons.enums.EspecialTags;

public class Tag implements Map{
	public Tag() {
		for (EspecialTags especialTag : EspecialTags.values()) {
			enumNames.inserir(especialTag.toString());
		}
	}
}