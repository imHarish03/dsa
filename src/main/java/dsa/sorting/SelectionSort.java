package dsa.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		/* int data[] = { 12, 34, 19, 45, 67, 43, 39 }; */

		// int data[] = { 5, 6, 2, 3, 1, 3, 4 };
		int data[] = { 1, 2, 5, 2, 3 };
		System.out.println("Before Sorting: " + data.length);

		printData(data);
		try {
			////////////////////////////////////////////
			for (int i = 0; i < data.length - 1; i++) {

				int min_index = i;
				for (int j = i + 1; j < data.length; j++) {

					if (data[j] < data[min_index])
						min_index = j;
				}

				int temp = data[min_index];
				data[min_index] = data[i];
				data[i] = temp;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("after Sort");
		printData(data);

	}

	static void printData(int data[]) {

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ",");
		}
		System.out.println(" ");
	}
}
