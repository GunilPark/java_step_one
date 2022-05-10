package l_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class J0316_dao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	String getName() {
		String name = "";
		String query = "select area \" + \"from 홍길동_member \" + \"where id = '402'";

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if (rs.next()) { /* 커리문에 행이 존재하면 */
				name = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnection.closeDB(con, ps, rs);
		}

		return name;
	}

//아이디가 102인 사람의 이름 나이 지역을 가져온다.
	J0316_member_dto getMemberInfo() {
		J0316_member_dto dto = null;
		String id, name, area;
		int age;
		String query = "select id,name,area,age " + "from 홍길동_member " + "where id = '102'";

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if (rs.next()) { /* 커리문에 행이 존재하면 */
				id = rs.getString(1);
				name = rs.getString(2);
				area = rs.getString(3);
				age = rs.getInt(4);

				dto = new J0316_member_dto(id, name, area, age);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnection.closeDB(con, ps, rs);
		}
		return dto;

	}

	public J0316_member_dto getMemberInfo(String id) {
		J0316_member_dto dto = null;
		String query = "select name, area, age " + "from 홍길동_member " + "where id = '" + id + "'";
		String name, area;
		int age;

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if (rs.next()) { /* 커리문에 행이 존재하면 */

				name = rs.getString(1);
				area = rs.getString(2);
				age = rs.getInt(3);

				dto = new J0316_member_dto(id, name, area, age);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnection.closeDB(con, ps, rs);
		}

		return dto;
	}

	public int getMemberAge(String id) {
		int age = 0;
		String query = "select age from 홍길동_member where id = '" + id + "'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if (rs.next()) {
				age = rs.getInt(1);

			}
		} catch (SQLException n) {

			n.printStackTrace();
		} finally {
			DBConnection.closeDB(con, ps, rs);
		}

		return age;
	}

	public String getMemberArea(String string) {
		String area = null;
		String query = "select area from 홍길동_member where id = '102'";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if (rs.next()) {
				area = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeDB(con, ps, rs);
		}

		return area;
	}

	public ArrayList<J0316_member_dto> getMemberList() {
		ArrayList<J0316_member_dto> dtos = new ArrayList<>();
		String query = "select id,name,area,age from 홍길동_member where id='201'";

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String area = rs.getString(3);
				int age = rs.getInt(4);
				J0316_member_dto dto = new J0316_member_dto(id, name, area, age);
				dtos.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return dtos;
	}

	public ArrayList<J0316_member_dto> getKimList() {

		ArrayList<J0316_member_dto> dtos = new ArrayList<>();
		String query = "select id,name,area,age from 홍길동_member where name like '%김%'";

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String area = rs.getString(3);
				int age = rs.getInt(4);
				J0316_member_dto dto = new J0316_member_dto(id, name, area, age);
				dtos.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeDB(con, ps, rs);
		}

		return dtos;
	}

	public ArrayList<J0316_member_dto> getNameList(String nameParts) {

		ArrayList<J0316_member_dto> dtos = new ArrayList<>();
		String query = "select id,name,area,age from 홍길동_member where name like '%" + nameParts + "%'";

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String area = rs.getString(3);
				int age = rs.getInt(4);
				J0316_member_dto dto = new J0316_member_dto(id, name, area, age);
				dtos.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeDB(con, ps, rs);
		}

		return dtos;
	}

}
