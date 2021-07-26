package co.practice2;

import java.util.Scanner;

public class b2884 {

	public static void main(String[] args) {
		// TODO 45분 일찍 알람 설정하기
		Scanner scn = new Scanner(System.in);
		
		int h = scn.nextInt();
		int m = scn.nextInt();
		
		if(h!=0&&m<45) {
			System.out.println((h-1)+" " +(m+15));
		}else if(h==0 && m<45) {
			System.out.println("23 "+(m+15));
		}else {
			System.out.println(h +" "+(m-45));
		}
		

	}
}
