package com.yc.soap.sort;

public class MergeSort extends Sort {

	static Comparable[] temp;

	@Override
	public void sort(Comparable[] a) {
		temp = new Comparable[a.length];
		sort(a, 0, a.length - 1);
	}

	public void sort(Comparable[] a, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			sort(a, low, mid);
			sort(a, mid + 1, high);
			merge(a, low, mid, high);
		}
	}

	private void merge(Comparable[] a, int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			temp[i] = a[i];
		}

		int j = low;
		int x = low;
		int y = mid + 1;
		while (j <= high) {
			if (x > mid) {
				a[j] = temp[y++];
			} else if (y > high) {
				a[j] = temp[x++];
			} else if (less(temp, x, y)) {
				a[j] = temp[x++];
			} else {
				a[j] = temp[y++];
			}
			j++;
		}
	}
	
}