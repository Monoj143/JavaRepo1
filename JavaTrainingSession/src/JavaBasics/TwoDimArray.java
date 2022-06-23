package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {

		int i[][] = new int[3][5];
		// 1st row
		i[0][0] = 1;
		i[0][1] = 2;
		i[0][2] = 3;
		i[0][3] = 4;
		i[0][4] = 5;
		
		// 2nd row
		i[1][0] = 6;
		i[1][1] = 7;
		i[1][2] = 8;
		i[1][3] = 9;
		i[1][4] = 10;

		// 3rd row
		i[2][0] = 11;
		i[2][1] = 12;
		i[2][2] = 13;
		i[2][3] = 14;
		i[2][4] = 15;

		for (int row = 0; row < i.length; row++) {
			for (int col = 0; col < i[0].length; col++) {
				System.out.println(i[row][col]);  
			}
		}

	}
}
