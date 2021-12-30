package javaexp.a02_middle;

public class A19_MethodExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Screen s1 = new Screen("아이언맨", 8000);
		int buyPrice = s1.buy(3);
		System.out.println("영화 수익금: " +buyPrice);
	}

}
class Screen{
	String movieName;
	int entPrice;
	int entCnt;
	Screen(String movieName, int entPrice){
		this.movieName = movieName;
		this.entPrice = entPrice;
	}
	int buy(int entCnt){
		this.entCnt = entCnt; // 외부에서 입력받은 내용을 필드로 할당.
		System.out.println("# 영화구매 #");
		System.out.println("영화명: "+movieName);
		System.out.println("입장료: "+entPrice);
		System.out.println("입장관객수: "+entCnt);
		return entPrice*entCnt;
	}
}