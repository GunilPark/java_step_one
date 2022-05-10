package l_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class J0318_dao {
	Connection con		 = null;
	PreparedStatement ps = null;
	ResultSet rs 		 = null;
	
	public J0318_dto getMemberInfo(String id) {
		J0318_dto dto = null;
		String query = "select a.id, a.name, a.area, a.age, a.dept_code, b.dept_name\r\n" + 
				"from 홍길동_MEMBER a, a00_dept_info b\r\n" + 
				"where a.dept_code = b.dept_code\r\n" + 
				"and a.id ='"+id+"'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				String idd = rs.getString(1);
				String name = rs.getString(2);
				String area = rs.getString(3);
				int age = rs.getInt(4);
				String dept_code = rs.getString(5);
				String dept_name = rs.getString(6);
				dto = new J0318_dto(idd, name, area, dept_code, dept_name, age);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.closeDB(con, ps, rs);
		}
		
		return dto;
		

		
		/*J0318_dto dto = null;
		String query = "select a.id, a.name, a.area, a.age, a.dept_code, b.dept_name\r\n" + 
				"from 홍길동_MEMBER a, a00_dept_info b\r\n" + 
				"where a.dept_code = b.dept_code\r\n" + 
				"and a.id ='" + id + "'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if(rs.next()) {
				String idd = rs.getString(1);
				String name = rs.getString(2);
				String area = rs.getString(3);
				int age = rs.getInt(4);
				String dept_code = rs.getString(5);
				String dept_name = rs.getString(6);
				dto = new J0318_dto(idd, name, area, dept_code, dept_name, age);
				
			}
		}
		catch(SQLException e){
			e.printStackTrace();
			System.out.println("getMemberInfo() 오류 : " + query);
			
		}
		finally {
			DBConnection.closeDB(con, ps, rs);
		}
		
		return dto;
		*/
	}

	public String getName(String searchId) {
		String name = "";
		String query = "select name\r\n" + 
				"from 홍길동_member\r\n" + 
				"where id = '"+searchId+"'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if(rs.next()) {
				name = rs.getString(1);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.closeDB(con, ps, rs);
		}
		
		return name;		
	}

	public ArrayList<J0318_dto> getMemberList(String searchName) {
		ArrayList<J0318_dto> dtos = new ArrayList<J0318_dto>();
		String query = "select a.id, a.name, a.area, a.age, a.dept_code, b.dept_name\r\n" + 
				"from 홍길동_MEMBER a, a00_dept_info b\r\n" + 
				"where a.dept_code = b.dept_code\r\n" + 
				"and name like '%"+searchName+"%'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String area = rs.getString(3);
				int age = rs.getInt(4);
				String dept_code = rs.getString(5);
				String dept_name = rs.getString(6);
				J0318_dto dto = new J0318_dto(id, name, area, dept_code, dept_name, age);
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
	
	
	


	
	
/*
	public J0318_dto getMemberInfo(String id) {
		J0318_dto dto = null;
		String query = "select a.id, a.name, a.area, a.age, a.dept_code, b.dept_name\r\n" + 
				"from 홍길동_MEMBER a, a00_dept_info b\r\n" + 
				"where a.dept_code = b.dept_code\r\n" + 
				"and a.id ='"+ id +"'";

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			if (rs.next()) {
				String idd = rs.getString(1);
				String name = rs.getString(2);
				String area = rs.getString(3);
				int age = rs.getInt(4);
				String dept_cod = rs.getString(5);
				String dept_name = rs.getString(6);

				dto = new J0318_dto(idd, name, area, dept_cod, dept_name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("getMemberInfo() 오류! " + query);
		} finally {
			DBConnection.closeDB(con, ps, rs);
		}

		return dto;
	}
*/
}
