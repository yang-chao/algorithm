package com.yc.soap;

public class ShellSort extends Sort {

	@Override
	public void sort(Comparable[] a) {
		int h = 1;
		int N = a.length;
		while (h < N / 3) {
			h = 3 * h + 1;
		}
		while (h >= 1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a, j, j - h); j -= h) {
					exch(a, j, j - h);
				}
			}
			h = h / 3;
		}
	}
}