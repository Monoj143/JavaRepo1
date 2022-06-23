package JavaBasics;

public class LoopCon {

	public static void main(String[] args) {

		// It will generate infinite loop if you don't give increment /
		// decrement part
		/*int i = 1; // initialization
		while (i <= 3) // Conditional
		{
			System.out.println(i);
			i++; // increment / decrement
		}

		System.out.println("********************");*/

		for (int j = 3; j >= -3; j--) {
			System.out.println(j);
		}
	}
}
