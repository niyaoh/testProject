package testProject;

import java.util.Scanner;

import alanFile.Login;
import board.Board;
import raina.logout;
import raina.logoutInterface;
import sunwoo.MemberView;




public class Main {

	public static void main(String[] args) {
		Login alan = new Login();
		logoutInterface li = new logout();
		Board board = new Board();
		MemberView View=new MemberView();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("회원 프로그램입니다.");
		System.out.println("1.회원저장 2.회원보기 3.로그인 4.로그아웃 5.게시판열기");
		int select = sc.nextInt();
		
		
		while(true) {
			switch(select) {
			case 1 :
					break;
			case 2 :
				View.display();         //김선우
					break;
			case 3 :alan.display();		//강동원
					break;
			case 4 :li.display();		//김나현			
					break;
			case 5 :board.boardOpen();	//김도윤
					board.boardPrint();
					return;
			}
		}
		
		
	}

}
