package project1;

//value object
public class Production {
	private int id;
	private String name;
	private String autor;
	//private int scene;
	private String description;
	private String actors;

	public Production(int id, String name, String autor, String description, String acthors) {
		super();
		this.id = id;
		this.name = name;
		this.autor = autor;
	//	this.scene = scene;
		this.description = description;
		this.actors = acthors;
	}

	public String getActors() {
		return actors;
	}

	public int getId() {
		return id;
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
/*
	public int getScene() {
		return scene;
	}

	public void setScene(int scene) {
		this.scene = scene;
	}
*/
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
