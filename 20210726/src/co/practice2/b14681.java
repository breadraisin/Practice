package co.practice2;

import java.util.Scanner;

public class b14681 {

	public static void main(String[] args) {
		// TODO ���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("��1��и�");
		}else if(x<0 && y>0) {
			System.out.println("��2��и�");
		}else if(x<0 && y<0) {
			System.out.println("��3��и�");
		}else if(x>0 && y<0) {
			System.out.println("��4��и�");
		}
	
	}

}
