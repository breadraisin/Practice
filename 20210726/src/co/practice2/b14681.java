package co.practice2;

import java.util.Scanner;

public class b14681 {

	public static void main(String[] args) {
		// TODO 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
		
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("제1사분면");
		}else if(x<0 && y>0) {
			System.out.println("제2사분면");
		}else if(x<0 && y<0) {
			System.out.println("제3사분면");
		}else if(x>0 && y<0) {
			System.out.println("제4사분면");
		}
	
	}

}
