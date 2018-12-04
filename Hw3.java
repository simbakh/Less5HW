package com.gmail.kh;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha amount of numbers");
		int a = sc.nextInt();
		int[] mas = new int[a];
		for (int i = 0;i<mas.length;i++) {
			System.out.println("Enter the numbers");
			mas[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(mas));
	}

}
