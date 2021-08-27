package sunwoo;

import java.util.Scanner;

public class MemberView implements MemberView_Interface{
	
	@Override
	public void display() {
		Scanner input=new Scanner(System.in);
		System.out.print("1.회원조회 2.회원검색 3.나가기");
		int n=input.nextInt();
		switch(n) {
		case 1:
			회원조회();
			break;
		case 2:
			회원검색();
			break;
		case 3:
			나가기();
			break;
		}
	}

	@Override
	public void 회원조회() {
		System.out.println("회원을 조회합니다");
	}

	@Override
	public void 회원검색() {
		System.out.println("회원을 검색합니다");
	}

	@Override
	public void 나가기() {
		System.out.println("회원 조회에서 나갑니다");
	}

}
