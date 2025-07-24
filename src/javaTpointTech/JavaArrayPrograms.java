package javaTpointTech;

import java.util.Arrays;

public class JavaArrayPrograms {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = new int[a.length];

		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };

		int[] array = { 4, 5, 6, 7, 5, 6 };

		// copyArrayAtoB(a, b);
		// FrequencyOfEachElement(arr);
		// LeftRotate(a,3);//(array, times)
		// findDuplicate(array);
		// reverseArray(a);
		// printEvenArray(a);
		// printOddNumber(a);
		// printLargest(arr);
		//printSmallest(arr);
		countArray(arr);

	}

	private static void countArray(int[] arr) {
		int count=0;
		for(int i)
	}

	private static void printSmallest(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];

		}
		System.out.println("min value is " + min);

	}

	private static void printLargest(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];

		}
		System.out.println("Max value is " + max);

	}

	private static void printOddNumber(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)
				System.out.print(a[i] + " ");
		}
	}

	private static void printEvenArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}
	}

	private static void reverseArray(int[] a) {

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(" " + a[i]);

		}

	}

	private static void findDuplicate(int[] array) {
		// TODO Auto-generated method stub

	}

	private static void LeftRotate(int[] a, int n) {

		// 1 2 3 4 5 --> 2 3 4 5 1

		while (n > 0) {
			int first = a[0];
			for (int i = 1; i < a.length; i++) {
				a[i - 1] = a[i];
			}
			a[a.length - 1] = first;
			n--;
		}
		printArray(a);

	}

	private static void FrequencyOfEachElement(int[] arr) {
		int[] fr = new int[arr.length];
		int visited = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					fr[j] = visited;
				}

			}
			if (fr[i] != visited)
				fr[i] = count;
		}

		// Displays the frequency of each element present in array
		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + arr[i] + "    |    " + fr[i]);
		}
		System.out.println("----------------------------------------");
	}

	// Program to copy all elements of one array into another array
	public static void copyArrayAtoB(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		printArray(a);
		System.out.println("Elements are coppied to New Array");

	}

	// Print Elements
	private static void printArray(int[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
