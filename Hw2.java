package com.gmail.kh;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a sentense");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] res = text.toCharArray();
		int mas = 0;
		for (int i = 0;i<res.length;i++) {
			if ( res[i] == 'b'|| res[i] == 'B') {
				mas++;
			}
		}
		System.out.println(mas);
	}

}
