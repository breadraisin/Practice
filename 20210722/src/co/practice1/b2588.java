package co.practice1;

import java.util.Scanner;

public class b2588 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		System.out.println(a * (b%10));
		System.out.println(a * (b%100/10));
		System.out.println(a * (b/100));
		System.out.println(a * b);
		
	}

}
