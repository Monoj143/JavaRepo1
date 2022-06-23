package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		//Array to store similar data type values in array variable
		//Dis-advantage of array
		//1.size fixed --static array -- to overcome of this problem-- we use collections
		//2.Store only similar data type -- to overcome of this problem -- we use object array  
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);
		System.out.println(i.length);

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		System.out.println("**************************");
		//object array 
		Object ob[]=new Object[4];
		ob[0]="monoj";
		ob[1]=25;
		ob[3]=9.0;
		
		for(int k=0;k<ob.length;k++)
		{
			System.out.println(ob[k]);
		}
	}
}