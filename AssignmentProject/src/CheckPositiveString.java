	import java.util.Arrays;
	import java.util.Scanner;

	public class CheckPositiveString {

		boolean checkString(String str) {

			char[] charArray = str.toCharArray();
			int[] intArray1 = new int[charArray.length];
			int[] intArray2 = new int[charArray.length];
			for (int i = 0; i < charArray.length; i++) {
				intArray1[i] = (int) charArray[i];
				intArray2[i] = intArray1[i];
			}
			Arrays.sort(intArray1);
			if (Arrays.equals(intArray1, intArray2)) {
				return true;
			} else {
				return false;
			}

		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter string");
			String str = sc.nextLine();

			CheckPositiveString p = new CheckPositiveString();

			boolean a = p.checkString(str);
			if (a) {
				System.out.println("String is Positive");
			} else {
				System.out.println("String is Negative");
			}


}
}
