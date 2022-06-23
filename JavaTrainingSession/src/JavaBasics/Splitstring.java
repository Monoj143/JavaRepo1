package JavaBasics;

public class Splitstring {

	public static void main(String[] args) {

		String s="abc1d@&%2q4q%r$e#*h)";

		String num="";
		String alph="";
		String spl="";

		char a[]=s.toCharArray();
		
		
		for(int i=0;i<a.length;i++)
		{
			//char a=s.charAt(i);

			if(Character.isDigit(a[i]))
			{
				num=num+a[i];
			}
			else if(Character.isAlphabetic(a[i]))
			{
				alph=alph+a[i];
			}
			else
			{
				spl=spl+a[i];
			}
		}

		System.out.println("\n Before split :" + s);
		System.out.println("\n After split : ");
		System.out.println("\n Numbers in string =" + num);
		System.out.println("\n Alphabets in string =" + alph);
		System.out.println("\n Special characters in string =" + spl);
	}
	
}
