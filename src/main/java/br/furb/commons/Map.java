package br.furb.commons;

import java.util.HashMap;

import br.furb.commons.pilha.ListaEstatica;
import br.furb.model.TagTipo;

public interface Map {
	HashMap<String, Integer> tagN = new HashMap<>();
	ListaEstatica<TagTipo> tagNfeio = new ListaEstatica<>();
	ListaEstatica<String> enumNames = new ListaEstatica<>();
}