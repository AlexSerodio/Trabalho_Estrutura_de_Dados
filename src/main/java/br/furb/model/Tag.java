package br.furb.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tag {
	List<String> enumNames;

	public Tag() {
		enumNames = Stream.of(EspecialTags.values())
				.map(EspecialTags::toString)
				.collect(Collectors.toList());
	}

	public List<String> getEnumNames() {
		return enumNames;
	}

	public void setEnumNames(List<String> enumNames) {
		this.enumNames = enumNames;
	}
}