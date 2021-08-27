package board;

public class Board implements IBoard {

	@Override
	public void boardOpen() {
		System.out.println("게시판을 엽니다.");
	}

	@Override
	public void boardPrint() {
		System.out.println("==============================");
		System.out.println("2021-08-27 | 익명 | 조아요옹");
		System.out.println("2021-08-27 | 익명 | 안녕하세요옹");
		System.out.println("==============================");
		
	}
	
}
