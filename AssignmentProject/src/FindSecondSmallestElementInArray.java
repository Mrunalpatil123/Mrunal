public class FindSecondSmallestElementInArray {

	static int secondSmallest(int arr[], int n) {
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
		return arr[1];

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 4, 5, 6 };
		int result = secondSmallest(arr, arr.length);
		System.out.println("Second smallest element : " + result);

	}

}