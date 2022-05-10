package l_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J0322_dao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs; // select 로 찾은 값을 나타낼때만 사용된다.

	public int insertMember(J0322_dto dto) {
		int result = 0;
		String query = "insert into 박건일_member\r\n" + "(id,name,area,age)\r\n" + "values\r\n" + "('" + dto.getId()
				+ "','" + dto.getName() + "','" + dto.getArea() + "','" + dto.getAge() + "')";

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insertMember(): " + query);
		} finally {
			DBConnection.closeDB(con, ps, rs);
		}

		return result;
	}

	public int getCheckId(String id) {
		int result = 0;
		String query = "select count(*)\r\n" + 
				"from 박건일_member\r\n" + 
				"where id = '"+ id +"'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt(1);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			
		}
		
		
		
		return result;
	}

}
