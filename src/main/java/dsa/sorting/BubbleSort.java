package dsa.sorting;

public class BubbleSort {
	static int counter = 0;

	public static void main(String[] args) {

		int data[] = { 12, 34, 19, 45, 67, 43, 39 };
		System.out.println("Before Sorting");
		printData(data);

		for (int i = 0; i < data.length - 1; i++) {

			for (int j = 0; j < data.length - 1 - i; j++) {

				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
				counter++;

				System.out.println("i:" + i + ", j:" + j);
				printData(data);
			}
		}

		System.out.println("Itertaion: " + counter);
		printData(data);

	}

	static void printData(int data[]) {

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ",");
		}
		System.out.println(" ");
	}

}
