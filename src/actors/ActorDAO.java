package actors;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import connection.DBConnection;

public class ActorDAO {

	private Actor actor;

	private final static String QUERY = "select * from people";

	private final static String QUERY_COUNT = "select count(*) from people";

	public ActorDAO() {

	}

	public void selectActor() {

		try {
			Connection con = DBConnection.getInstance().getConnection();
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(QUERY);

			while (rs.next()) {
				String firstName = rs.getString(2);
				String secondName = rs.getString(3);
				String lastame = rs.getString(4);

				String profession = rs.getString(5);
				String roles = rs.getString(6);

				String name = firstName + " " + secondName + " " + lastame;
				actor = new Actor(name, profession, roles);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList selectAllActors() {
		ArrayList<Actor> actors = new ArrayList<>();
		Actor actor = null;
		try {
			Connection con = DBConnection.getInstance().getConnection();
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(QUERY);

			while (rs.next()) {
				String firstName = rs.getString(2);
				String secondName = rs.getString(3);
				// String lastame = rs.getString(4);

				String profession = rs.getString(5);
				// String roles = rs.getString(6);

				String name = firstName + " " + secondName;
				actor = new Actor(name, profession);
				actors.add(actor);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return actors;
		// actor.setActors(actors);
	}

	public int numberOfActor() {
		int number = -1;
		try {
			Connection con = DBConnection.getInstance().getConnection();
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(QUERY_COUNT);

			number = rs.getInt(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return number;
	}

	/*
	 * public static void main(String args[]) { ActorDAO actor = new ActorDAO();
	 * actor.selectActor();
	 * 
	 * }
	 */
}