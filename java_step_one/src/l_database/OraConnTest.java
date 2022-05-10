/*
ojdbc6.jar 파일 아래 폴더에
C:\Program Files\Java\jre1.8.0_121\lib\ext
*/
package l_database;
import java.sql.Connection;
import java.sql.DriverManager;
public class OraConnTest {
	
	public static void main(String[] args) {
		
		Connection con = null;
		boolean goIng = true;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	 //oracle		
		} catch (Exception ex) {
			System.out.println("===드라이버없음======: " + ex.getMessage());
			goIng = false;
		}	
		if(goIng) { 
			try{ 
				String DB_URL = "jdbc:oracle:thin:@track-7:1521:xe";
				String DB_USER = "track7";
				String DB_PASSWORD= "1234";
				con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				if(con != null){
					System.out.println("db 연결성공===========");	
				}
			} catch (Exception ex) {
				System.out.println("===계정설정 오류======: " + ex.getMessage());
			}
			try {
				if(con != null)		con.close();
				System.out.println("종료~");
			} catch(Exception e) {
				System.out.println("=========== 종료 error ===========");	
			}
		}
	}		
}

