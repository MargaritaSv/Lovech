package production;

public class Production {

	private String name;
	private String autor;
	private String description;
	private String actors;

	public Production(String name, String autor) {
		this.name = name;
		this.autor = autor;
	}

	public Production(String name, String autor, String description, String actors) {
		this.name = name;
		this.autor = autor;
		this.description = description;
		this.actors = actors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}
}