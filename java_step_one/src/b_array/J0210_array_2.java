package b_array;

public class J0210_array_2 {

	public static void main(String[] args) {
		String[][] arrays = { 
				{ "홍길동", "90", "85", "75" }, 
				{ "이상진", "80", "95", "95" }, 
				{ "안문숙", "70", "80", "80" }

		};
		int total = 0;
		for(int y = 0; y < arrays.length; y++) {
			total =0;
			for(int x = 0; x < arrays[y].length; x++) {
				if(x>0) {
					total += Integer.parseInt(arrays[y][x]);
				}
				System.out.print(arrays[y][x]+"\t");
			}
			System.out.print(total + "\n");
		}
		
		
	}

}
