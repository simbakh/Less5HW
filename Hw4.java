package com.gmail.kh;

import java.util.Arrays;

public class Hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 87, 65, 43, 323, 2, 345 };
		int[] arr = Arrays.copyOf(mas, 30);
		for (int i = 15; i < arr.length; i++) {
			arr[i] = arr[i- 15] * 2;
		}
		System.out.println(Arrays.toString(arr));
	}

}
