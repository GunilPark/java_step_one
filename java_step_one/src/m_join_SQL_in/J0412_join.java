package m_join_SQL_in;

public class J0412_join {

	public static void main(String[] args) {
		String[] munja = {"1","2","3","박건일","60","70","80"};

		String test = String.join(" ', '", munja);
		
		
		System.out.println(test);
		
	}

}

/*
 SQL이랑 활용

query = "where sclass in("+test+") \r\n and syear = '';





*/