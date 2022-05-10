package b_array;

public class Array_Main {

	public static void main(String[] args) {

		ArrayData array = new ArrayData();
		array_sub method = new array_sub();

		array.studentScore3 = method.getTotal(array.studentScore3);
		array.studentScore3 = method.getAverage(array.studentScore3);
		array.studentScore3 = method.getRank(array.studentScore3);

		for (int y = 0; y < array.studentScore3.length; y++) {
			for (int x = 0; x < array.studentScore3[y].length; x++) {
				if(x == array.studentScore3[y].length-2) {
					System.out.printf("%3.1f  ",Double.parseDouble(array.studentScore3[y][x]));
					
				}else {
				System.out.print(array.studentScore3[y][x] + " ");
				}
			}
			System.out.println();
		}

	}

}
