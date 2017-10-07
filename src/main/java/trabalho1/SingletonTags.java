package trabalho1;

public enum SingletonTags {
	
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
	DOCTYPE("!DOCTYPE");
	
	private final String tag;

	private SingletonTags(final String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return tag;
	}
	
	public static ListaEstatica<String> listarSingletonTags(){
		ListaEstatica<String> singletonTags = new ListaEstatica<String>();
		for (SingletonTags especialTag : SingletonTags.values())
			singletonTags.inserir(especialTag.toString());
		return singletonTags;
	}
}