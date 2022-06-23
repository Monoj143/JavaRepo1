package JavaBasics;

import java.io.FileReader;

class CheckedUncheckedException {
	
	public static void main(String[] args) {

		//FileReader file = new FileReader("somefile.txt");  //Checked exception
		
		System.out.println(10/0); //Unchecked exception
	}
}
