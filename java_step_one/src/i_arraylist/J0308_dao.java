package i_arraylist;

//import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J0308_dao {

	public String getDepart(J0308_employee emps) {
		String result = "";
		if(emps.getDepart().equals("1")) {
			result = "총무";
		}else if(emps.getDepart().equals("2")) {
			result = "재무";
		}else if(emps.getDepart().equals("3")) {
			result = "영업";
		}
		
		return result;
	}

	public String getEntryDate(J0308_employee emps) {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat dateformat2 = new SimpleDateFormat("yyyy-MM-dd");

		Date EntryDate1;
		try {
			EntryDate1 = dateformat.parse(emps.getEntryDate());
			String EntryDate2 = dateformat2.format(EntryDate1);
			return EntryDate2;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "입력오류입니다.";

		
		
	}

//	public String getSalary(J0308_employee emps) {
//		DecimalFormat df = new DecimalFormat("#,##0");
//		String result = df.format(emps.getSalary());
//		return result;
//	}
	public String getSalary(J0308_employee emps) {
		return String.format("%,d", emps.getSalary());
	}
	
}
