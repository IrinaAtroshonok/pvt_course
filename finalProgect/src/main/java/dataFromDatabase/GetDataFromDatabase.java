package dataFromDatabase;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDataFromDatabase {
	public static DataForMailRu getDatafromDatabase() { // throws ClassNotFoundException
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String password = "atr3764";
		String query = "SELECT login, password,firstEmail,secondEmail from test_automation.users";
		DataForMailRu data = new DataForMailRu();

		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)) {
			if (rs.next()) {
				data.setLogin(rs.getString(1));
				data.setPassword(rs.getString(2));
				data.setFirstEmail(rs.getString(3));
				data.setSecondEmail(rs.getString(4));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();

		}
		return data;
	}
}
