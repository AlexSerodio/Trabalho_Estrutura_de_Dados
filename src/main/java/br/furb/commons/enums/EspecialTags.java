package br.furb.commons.enums;

public enum EspecialTags {
	
	META("meta"),
	BASE("base"),
	BR("br"),
	COL("col"),
	COMMAND("command"),
	EMBED("embed"),
	HR("hr"),
	IMG("img"),
	INPUT("input"),
	LINK("link"),
	PARAM("param"),
	SOURCE("source"),
	DOCTYPE("DOCTYPE");
	
	private final String tag;

	private EspecialTags(final String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return tag;
	}
}