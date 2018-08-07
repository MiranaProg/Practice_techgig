package com.techGig;

import java.util.ArrayList;

public class RecurLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[] = new int[] { 5, 6, 7 };
		int sub = 6;
		ArrayList<ArrayList<Integer>> list = looploop(sub, n);
		for (ArrayList<Integer> arr : list)
			System.out.println(arr);

	}

	public static ArrayList<ArrayList<Integer>> looploop(int subset_ele_size, int n[]) {

		ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> inner;

		int i = 0;
		while (i < subset_ele_size) {
			inner = new ArrayList<>();
			System.out.println("hi im here" + Math.pow(n.length, i));
			while (inner.size() != Math.pow(n.length, subset_ele_size)) {
				for (int item : n) {
					for (int k = 0; k < Math.pow(n.length, i); k++) {

						
						inner.add(item);

					}

				}
			}

			outer.add(inner);
			i++;
		}

		return outer;

	}
}
