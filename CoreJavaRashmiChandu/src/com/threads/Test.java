package com.threads;

public class Test {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 4, 4, 5, 5, 5, 5, 6, 6 };
		int b[] = removeDuplicates(a);

		for (int aa : b) {
			System.out.print(aa);
		}
	}

	public static int[] removeDuplicates(int[] arr) {

		int end = arr.length;

		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (arr[i] == arr[j]) {
					int ii = j;
					for (int k = j + 1; k < end; k++, ii++) {
						arr[ii] = arr[k];
					}
					end--;
					j--;
				}
			}
		}

		int[] jj = new int[end];
		for (int i = 0; i < end; i++) {
			jj[i] = arr[i];
		}
		return jj;
	}

}
