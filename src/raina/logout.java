package raina;

import java.util.Scanner;

public class logout implements logoutInterface {

	Scanner sc = new Scanner(System.in);
	
	public void 로그아웃() {
		System.out.println("로그아웃을 누르셨습니다.");
		
	}
	public void 로그아웃정말() {
		System.out.println("정말 로그아웃 하시겠습니까?");
	}

	public void 로그아웃확인() {
		System.out.println("로그아웃이 확인되었습니다.");
	}
	
	public void display() {
		System.out.println("1.로그아웃 2.로그아웃정말 3.로그아웃확인");
		System.out.println("번호를 입력: ");
		int n=sc.nextInt();
		
		switch(n) {
		case 1: 로그아웃(); break;
		case 2: 로그아웃정말();break;
		case 3: 로그아웃확인(); break;
		}
	}
}
