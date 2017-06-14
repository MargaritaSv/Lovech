package actors;

import java.util.ArrayList;

public class Actor {

	private String name;
	private String profession;
	private String roles;
	private ArrayList<Actor> actors = new ArrayList<>();
	
//	private ActorDAO actorDAO = new ActorDAO();
	
	
	public Actor(String name, String profession, String roles) {
		super();
		this.name = name;
		this.profession = profession;
		this.roles = roles;
	
	
	}

	public Actor(String name, String profession) {
		this.name = name;
		this.profession = profession;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public ArrayList<Actor> getActors() {
		return actors;
	}

	/*
	public void selectActors(){
		this.actors = ActorDAO.selectAllActors();
	}
	/*
		public void setActors(ArrayList<Actor> actors) {
		this.actors =actors;
	}	
	*/
		
		
	
}