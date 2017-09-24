package br.furb.model;

public enum EspecialTags {
	
	a("meta"),
	b("base"),
	c("br"),
	d("col"),
	e("command"),
	f("embed"),
	g("hr"),
	h("img"),
	i("input"),
	j("link"),
	k("param"),
	l("source"),
	m("source"),
	n("DOCTYPE");
	
	
	private final String tag;

	private EspecialTags(final String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return tag;
	}
}