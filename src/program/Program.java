package program;

import java.util.ArrayList;

public class Program {

	private int date;
	private String hour;
	private String production;
	private String place;

	private ArrayList<Program> program;

	public Program(int date, String hour, String production, String place) {
		super();
		this.date = date;
		this.hour = hour;
		this.production = production;
		this.place = place;
	}

	public Program() {
	}

	public int getDate() {
		return date;
	}

	public String getHour() {
		return hour;
	}

	public String getProduction() {
		return production;
	}

	public String getPlace() {
		return place;
	}

	public ArrayList<Program> getProgram() {
		return program;
	}
}