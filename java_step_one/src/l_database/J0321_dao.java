package l_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import 박건일.DBConnection;

public class J0321_dao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public ArrayList<J0321_dto> getYearList(String syear) {
		ArrayList<J0321_dto> dtos = new ArrayList<J0321_dto>();
		String query = "select syear,sclass,no,name,kor,eng,mat\r\n" + "from  홍길동_student\r\n" + "where syear = '" + syear
				+ "'";

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				syear = rs.getString(1);
				String sclass = rs.getString(2);
				String no = rs.getString(3);
				String name = rs.getString(4);
				int kor = rs.getInt(5);
				int eng = rs.getInt(6);
				int mat = rs.getInt(7);

				J0321_dto dto = new J0321_dto(syear, sclass, no, name, kor, eng, mat);
				dtos.add(dto);
			}

		} catch (SQLException n) {
			n.printStackTrace();

		}finally {
			DBConnection.closeDB(con, ps, rs);
		}

		return dtos;
	}

	public ArrayList<J0321_dto> getNameList(String name2) {
		ArrayList<J0321_dto> dtos = new ArrayList<J0321_dto>();
		String query = "select syear,sclass,no,name,kor,eng,mat\r\n" + 
				"from  홍길동_student\r\n" + 
				"where name like '%"+ name2 +"%'";
		
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
				
				J0321_dto dto = new J0321_dto(syear, sclass, no, name, kor, eng, mat);
				dtos.add(dto);
			}	
		}catch(SQLException n) {
			n.printStackTrace();
		}finally {
			DBConnection.closeDB(con, ps, rs);
		}
		
		return dtos;
	}

	public J0321_dto getStudent(String syear, String sclass, String no) {
		J0321_dto dto = null;
		String query = "select syear,sclass,no,name,kor,eng,mat\r\n" + 
				"from  홍길동_student\r\n" + 
				"where syear='"+ syear +"'\r\n" + 
				"and sclass='"+ sclass +"'\r\n" + 
				"and no='"+ no +"'";
		
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if(rs.next()) {
				syear = rs.getString(1);
				sclass = rs.getString(2);
				no = rs.getString(3);
				String name = rs.getString(4);
				int kor = rs.getInt(5);
				int eng = rs.getInt(6);
				int mat = rs.getInt(7);
				
				dto = new J0321_dto(syear, sclass, no, name, kor, eng, mat);
			}
			
		}catch(SQLException n) {
			n.printStackTrace();
		}finally {
			DBConnection.closeDB(con, ps, rs);
		}
		
		
		
		
		
		return dto;
	}

}
