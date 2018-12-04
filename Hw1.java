package com.gmail.kh;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		int mas = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0 ) {
				mas =mas+1;
			}
		}
		System.out.println(mas);
	}

}
