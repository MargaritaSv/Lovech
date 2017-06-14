package production;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import connection.DBConnection;

public class ProductionDAO {

	private Production production;

	private static final String QUERY = "select pr.name,pr.autor from production pr;";
	// private static final String QUERY_PRODUCTION = "select * from production
	// pr where pr.name= ?;";

	private static final String q = "select * from production";

	public ProductionDAO() {
	}

	public ArrayList<Production> selectAllproduction() {

		ArrayList<Production> arrL = new ArrayList<>();

		Connection con = DBConnection.getInstance().getConnection();
		Statement st;

		try {
			st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(QUERY);

			while (rs.next()) {
				String name = rs.getString(1);
				String autor = rs.getString(2);
				production = new Production(name, autor);
				arrL.add(production);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrL;
	}

	public Production selectProduction(String inputName) {
		System.err.println(inputName);
		Connection con = DBConnection.getInstance().getConnection();
		try {
			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(q);
			// preparedStatement.setString(1, inputName);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				if (rs.getString(2).equals(inputName)) {
					String name = rs.getString(2);
					String autor = rs.getString(3);
					String description = rs.getString(4);
					String actors = rs.getString(5);

					production = new Production(name, autor, description, actors);
					System.out.println(name + " ++++ " + autor);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return production;
	}

	public void insertProduction() {
		// TODO: insert cyrilic etc "????"
		String query = "UPDATE people p SET p.profession = 'actor'  where p.id= ?;";
		Connection connection = DBConnection.getInstance().getConnection();
		try {
			java.sql.PreparedStatement prSt = connection.prepareStatement(query);

			prSt.setInt(1, 1);
			prSt.executeUpdate();
			prSt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally!");
		}

	}

	/*
	 * public static void main(String[] args) { ProductionDAO pr = new
	 * ProductionDAO(); // Production pro =
	 * pr.selectProduction("Черна комедия"); //
	 * System.err.println(pro.getActors()); // ArrayList<Production> sas =
	 * pr.selectAllproduction(); pr.insertProduction(); }
	 */
}