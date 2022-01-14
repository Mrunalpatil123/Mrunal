public class SortedArray {

	static void checksorted(int[] arr, int n) {
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is : ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 3, 4, 5, 6 };
		System.out.println("Reverse array is : ");
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i]);
		}
		checksorted(arr, arr.length);

	}

}