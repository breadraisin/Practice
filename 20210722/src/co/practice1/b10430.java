package co.practice1;

import java.util.Scanner;

public class b10430 {
	//(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
	//(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
	//세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();
		
		if(((A+B)%C) == ( ((A%C) + (B%C))%C)) {
			System.out.println("같다");
			System.out.println((A+B)%C);
			System.out.println( ((A%C) + (B%C))%C);
		}else {
			System.out.println("같지 않다");
		}
		
		if(((A*B)%C) ==  (((A%C)*(B%C))%C)) {
			System.out.println("같다");
			System.out.println((A*B)%C);
			System.out.println(((A%C)*(B%C))%C);
		}
	}

}
