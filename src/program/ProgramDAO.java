package program;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import connection.DBConnection;

public class ProgramDAO {

	// TODO: exact month and desc/asc day
	// TODO: LOGGER

	Program program;

	public ProgramDAO() {
	}

	public ArrayList<Program> selectProgram(String input) {
		ArrayList<Program> arrL = new ArrayList<>();

		int month = Calendar.getInstance().get(Calendar.MONTH);
		int year = Calendar.getInstance().get(Calendar.YEAR);

		String QUERY_MONTH = "SELECT * FROM program p WHERE p.date BETWEEN STR_TO_DATE('" + year + "-0" + month
				+ "-01', '%Y-%m-%d') AND STR_TO_DATE('" + year + "-0" + month
				+ "-31', '%Y-%m-%d') order by p.date asc;";

		String queryWeek = "select * from program p where week(p.date) = week('2017-04-10');";

		String query = (input.equals("month")) ? QUERY_MONTH : queryWeek;

		try {
			Connection con = DBConnection.getInstance().getConnection();
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				Date date = rs.getDate(1);
				Time time = rs.getTime(1);
				String production = rs.getString(2);
				String place = rs.getString(3);

				String dateReturn = date.toString().substring(date.toString().length() - 2, date.toString().length());
				int d = Integer.parseInt(dateReturn);

				Program program = new Program(d, time.toString().substring(0, time.toString().length() - 3), production,
						place);
				arrL.add(program);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return arrL;
	}
}
