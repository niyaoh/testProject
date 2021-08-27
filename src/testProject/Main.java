package testProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		IMember mem = new saveMember_func();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원 프로그램입니다.");
		int select = sc.nextInt();
		
		while(true) {
			switch(select) {
			case 1 :
				mem.saveMember();
					break;
			case 2 :
					break;
			case 3 :
					break;
			case 4 :
					break;
			case 5 :
					break;
			}
		}
		
		
	}

}
