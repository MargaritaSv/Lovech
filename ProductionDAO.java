package project1;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

//data access object /prazdelqne na obekta kato dani i tova kude se suhranqva/

public class ProductionDAO {

	private static final String INSERT_INTO_PRODUCTION_VALUES = "INSERT INTO production VALUES(?,?,?,?,?)";

	public void registerProduction(Production production) {
		Connection con = DBConnection.getInstance().getConnection();
		try {
			con.setAutoCommit(true);

			PreparedStatement ps = (PreparedStatement) con.prepareCall(INSERT_INTO_PRODUCTION_VALUES);
			ps.setInt(1, production.getId());
			ps.setString(2, production.getName());
			ps.setString(3, production.getAutor());
			ps.setString(4, production.getDescription());
			ps.setString(5, production.getActors());

			ps.executeUpdate();
			// con.commit();
			System.out.println(production.getActors());
		} catch (SQLException e) {
			try {
				throw new UserException("Production is not saved!", e);
			} catch (UserException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}