package l_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J0322_student_dao {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public int insertStudent(J0322_student_dto dto) {
		int result = 0;
		String query = "insert into 박건일_student\r\n" + "(syear,sclass,no,name,kor,eng,mat)\r\n" + "values\r\n" + "('"
				+ dto.getSyear() + "','" + dto.getSclass() + "','" + dto.getNo() + "','" + dto.getName() + "',"
				+ dto.getKor() + "," + dto.getEng() + "," + dto.getMat() + ")";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public int getCheckStudunt(String syear, String sclass, String no) {
		int result = 0;
		String query = "select count(*)\r\n" + "from 박건일_student\r\n" + "where syear='" + syear + "'\r\n"
				+ "and sclass='" + sclass + "'\r\n" + "and no='" + no + "'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if (rs.next()) {
				result = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeDB(con, ps, rs);
		}

		return result;
	}

}
