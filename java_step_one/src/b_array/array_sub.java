package b_array;

public class array_sub {
	String[][] getTotal(String[][] impo) {
		int result = 0;
		for (int y = 0; y < impo.length; y++) {
			result = 0;
			for (int x = 1; x < impo[y].length - 3; x++) {
				result = result + Integer.parseInt(impo[y][x]);
			}
			impo[y][impo[y].length - 3] = Integer.toString(result);

		}

		return impo;
	}

	String[][] getAverage(String[][] impo) {
		for (int y = 0; y < impo.length; y++) {
			impo[y][impo[y].length - 2] = Double.toString(Double.parseDouble(impo[y][(impo[y].length) - 3]) / 11);
		}

		return impo;
	}

	String[][] getRank(String[][] impo) {
		int rank = 0;
		int top = 0;
		int gap = 0;
		for (int y = 0; y < impo.length; y++) {
			rank = 1;
			gap = 0;
			for (int x = 0; x < impo.length; x++) {
				if (Integer.parseInt(impo[y][impo[y].length - 3]) < Integer.parseInt(impo[x][impo[x].length - 3])) {
					rank++;
				}
			}
			if (rank == 1) {
				top = Integer.parseInt(impo[y][impo[y].length - 3]);
			}
			impo[y][impo[y].length - 1] = Integer.toString(rank) + "등";
		}
		for (int y = 0; y < impo.length; y++) {
			gap = top - Integer.parseInt(impo[y][impo[y].length - 3]);
			impo[y][impo[y].length - 1] += "\t 1등과의점수차:" + Integer.toString(gap);

		}

		return impo;
	}

}
