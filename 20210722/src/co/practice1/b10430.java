package co.practice1;

import java.util.Scanner;

public class b10430 {
	//(A+B)%C�� ((A%C) + (B%C))%C �� ������?
	//(A��B)%C�� ((A%C) �� (B%C))%C �� ������?
	//�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();
		
		if(((A+B)%C) == ( ((A%C) + (B%C))%C)) {
			System.out.println("����");
			System.out.println((A+B)%C);
			System.out.println( ((A%C) + (B%C))%C);
		}else {
			System.out.println("���� �ʴ�");
		}
		
		if(((A*B)%C) ==  (((A%C)*(B%C))%C)) {
			System.out.println("����");
			System.out.println((A*B)%C);
			System.out.println(((A%C)*(B%C))%C);
		}
	}

}
