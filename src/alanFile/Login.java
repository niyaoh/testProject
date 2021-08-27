package alanFile;

import java.util.Scanner;

public class Login implements LoginInterface{

	@Override
	public void display() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 로그인  2. 상태확인  3. 시간이 지나서 확인");
			int num = sc.nextInt();
			switch(num) {
			case 1: login(); break;
			case 2: loginIng(); break;
			case 3: loginde(); break;
			} 

		}
	}

	@Override
	public void login() {
		System.out.println("로그인 하셨습니다.");
		
	}

	@Override
	public void loginIng() {
		System.out.println("로그인 중입니다.");
	}

	@Override
	public void loginde() {
		System.out.println("시간이 지나 세션이 만료되셨습니다. 다시 로그인하세요");
	}
	
}
