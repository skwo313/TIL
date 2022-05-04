package javaexp.a02_middle;

public class A15_ClassExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex1
		Book1 B1 = new Book1();
		Book1 B2 = new Book1();
		Book1 B3 = new Book1();
		B1.bookName = "국어책";
		B1.bookPrice = 8000;
		B2.bookName = "수학책";
		B2.bookPrice = 9000;
		B3.bookName = "영어책";
		B3.bookPrice = 10000;
		System.out.println(B1.bookName+":"+B1.bookPrice);
		System.out.println(B2.bookName+":"+B2.bookPrice);
		System.out.println(B3.bookName+":"+B3.bookPrice);
		// ex2
		Book1 B4 = new Book1("수학책",12000);
		Book1 B5 = new Book1("국어책",11000);
	}

}
// ex1
class Book1 {
	String bookName;
	int bookPrice;
	Book1(){}
	Book1(String bookName,int bookPrice){
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		System.out.println("제목: "+bookName+" 가격: "+bookPrice);
	}
}




