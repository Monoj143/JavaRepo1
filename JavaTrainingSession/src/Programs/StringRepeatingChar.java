package Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringRepeatingChar {

	public static void main(String[] args) {

		String str = "This ist an example";
		StringBuilder sb = new StringBuilder();
		Set<Character> ch = new LinkedHashSet<Character>();

		for (int i = 0; i < str.length(); i++) {

			ch.add(str.charAt(i));
		}
		for (Character chr : ch) {
			sb.append(chr);
		}
		System.out.println(sb);
	}
}
