import java.util.*;

public class Alphabets {
	public static void checkAlphabets(int arrayCount, String[] c) {

		if (arrayCount % 2 == 0) {

			for (int i = 0; i < arrayCount / 2; i++) {

				c[i] = c[i].toUpperCase();
			}
			for (int i = arrayCount / 2; i < arrayCount; i++) {

				c[i] = c[i].toLowerCase();
			}
		} else {
			for (int i = 0; i < arrayCount / 2 + 1; i++) {
				c[i] = c[i].toUpperCase();
			}
			for (int i = arrayCount / 2 + 1; i < arrayCount; i++) {
				c[i] = c[i].toLowerCase();
			}
		}
		for (int j = 0; j < arrayCount; j++)
			System.out.println(c[j]);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  string:");

		String str = sc.nextLine();
		System.out.println("String is :");

		StringTokenizer st = new StringTokenizer(str, " ");

		String[] c = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens() && i < c.length) {
			c[i] = st.nextToken();
			i++;
		}
		Arrays.sort(c);
		checkAlphabets(c.length, c);

	}

}