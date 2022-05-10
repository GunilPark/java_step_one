package l_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class J0323_student_dao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public int insertStudent(J0323_student_dto dto) {
		int result = 0;
		String query = "insert into 박건일_student\r\n" + "(syear, sclass, no, name, kor, eng, mat)\r\n" + "values\r\n"
				+ "('" + dto.getSyear() + "', '" + dto.getSclass() + "', '" + dto.getNo() + "', '" + dto.getName()
				+ "', " + dto.getKor() + ", " + dto.getEng() + ", " + dto.getMat() + ")";

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeDB(con, ps, rs);
		}

		return result;
	}

	public int getCheckStu(String syear, String sclass, String no) {
		int result = 0;
		String query = "select count(*)\r\n" + 
				"from 박건일_student\r\n" + 
				"where syear = '"+syear+"'\r\n" + 
				"and sclass = '" + sclass + "'\r\n" + "and no ='" + no + "'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if(rs.next()) {
				result = rs.getInt(1);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.closeDB(con, ps, rs);
		}
		return result;
	}

	public int updateStudent(J0323_student_dto dto) {
		int result = 0;
		String query = "update 박건일_student\r\n" + 
				"set name ='"+dto.getName()+"',\r\n" + 
				"    kor ='"+dto.getKor()+"',\r\n" + 
				"    eng ='"+dto.getEng()+"',\r\n" + 
				"    mat ='"+dto.getMat()+"'\r\n" + 
				"where syear ='"+dto.getSyear()+"'\r\n" + 
				"and sclass ='"+dto.getSclass()+"'\r\n" + 
				"and no = '"+dto.getNo()+"'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			result = ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.closeDB(con, ps, rs);
		}
		return result;
	}

	public J0323_student_dto getStudentInfo(String syear, String sclass, String no) {
		J0323_student_dto dto = null;
		String query = "select name, kor, eng, mat from 박건일_student\r\n" + 
				"where syear ='"+syear+"'\r\n" + 
				"and sclass ='"+sclass+"'\r\n" + 
				"and no ='"+no+"'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if(rs.next()) {
				String name = rs.getString(1);
				int kor = rs.getInt(2);
				int eng = rs.getInt(3);
				int mat = rs.getInt(4);
				dto = new J0323_student_dto(syear, sclass, no, name, kor, eng, mat);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.closeDB(con, ps, rs);
		}
		
		return dto;
	}

	public int deleteStudent(String syear, String sclass, String no) {
		int result = 0;
		String query = "delete 박건일_student\r\n" + 
				"where syear='"+syear+"'\r\n" + 
				"and sclass = '"+sclass+"'\r\n" + 
				"and no = '"+no+"'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			result = ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.closeDB(con, ps, rs);
		}
		return result;
	}

	public ArrayList<J0323_student_dto> getStudentList() {
		ArrayList<J0323_student_dto> dtos = new ArrayList<J0323_student_dto>();
		String query = "select * from 박건일_student\r\n" + 
				"order by syear,sclass,no";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				String syear = rs.getString(1);
				String sclass = rs.getString(2);
				String no = rs.getString(3);
				String name = rs.getString(4);
				int kor = rs.getInt(5);
				int eng = rs.getInt(6);
				int mat = rs.getInt(7);
				J0323_student_dto dto = new J0323_student_dto(syear, sclass, no, name, kor, eng, mat);
				dtos.add(dto);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.closeDB(con, ps, rs);
		}
		return dtos;
	}
}
