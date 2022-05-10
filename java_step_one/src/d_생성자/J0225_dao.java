package d_생성자;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class J0225_dao {

	public String getPart(int part) {
		String result = "잘못입력하셨습니다.";
		if (part == 10) {
			result = "총무";
		} else if (part == 20) {
			result = "인사";
		} else if (part == 30) {
			result = "재무";
		} else if (part == 40) {
			result = "영업";
		}
		return result;
	}

	public String getSex(int sex) {
		String result = "잘못입력하셨습니다.";
		if (sex == 1) {
			result = "남자";
		} else if (sex == 2) {
			result = "여자";
		}
		return result;
	}

	public String getDate_2(J0225_dto dto) throws ParseException {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat dateformat2 = new SimpleDateFormat("yyyy-MM-dd");

		Date convert = dateformat.parse(dto.getDate());
		String strNowDate = dateformat2.format(convert);
		return strNowDate;
		
	}

}
