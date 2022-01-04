package javaexp.a06_object;

import java.util.ArrayList;

public class A09_ObjVsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 1대 다관계 처리..
		1. 하나의 객체안에 여러개의 객체들을 연결되어 처리되는 것을 말한다.
		2. 종류에 따라.
			1) 동일한 종류는 배열이나 ArrayList<객체>를 사용하거나
			2) 다른 종류는 객체1, 객체2, ArrayList<상위공통객체>
		 */
		Mart m1 = new Mart("행복마트");
		m1.showList();
		m1.buyProduct(new MProduct("사과",2000));
		m1.buyProduct(new MProduct("바나나",4000));
		m1.showList();
	}

}
/*
# 1:다 관계 객체 처리 방법
1. 포함된 배열/리스트 형태의 객체를 위한 단일 클래스 선언하기
 	- 필드만 생성
 	- 생성자, set/get메서드 만들기(자동)
2. 위 배열/리스트 객체를 포함할 객체를 위한 클래스 선언하기
 	- 필드(메인속성, ArrayList<포함될단위객체> )
 		ex) class Mart{
 			private String name;
			private ArrayList<MProduct> mlist;
 	- 생성자 선언
 		매개변수가 없는 생성자.'
 		메인속성 하나의 값을 받는 생성자.
 		list = ArrayList<VO>()로 초기화 처리.
 	- set/get메서드 생성.
 	- list에 하나씩 추가할 메서드 선언.
 		ex)
 		public void buyProduct(MProduct prod) {
 			list.add(prod)
 		}
 	- name과 list를 출력할 메서드 선언.
 		public void showList()	{
 			sysout(name+"에서 구매한 내역");
 			if(mlist.size()>0) { // 등록한 내용이 있을 떄
 				for(MProduct mp : mlist) {
 */

class MProduct{
	private String name;
	private int price;
	public MProduct() {
	}
	public MProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
class Mart{
	private String name;
	private ArrayList<MProduct> mlist;
	public Mart() {
		super();
		mlist = new ArrayList<MProduct>();
		// TODO Auto-generated constructor stub
	}
	public Mart(String name) {
		super();
		mlist = new ArrayList<MProduct>();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<MProduct> getMlist() {
		return mlist;
	}
	public void setMlist(ArrayList<MProduct> mlist) {
		this.mlist = mlist;
	}
	public void buyProduct(MProduct prod) {
		System.out.println("# 물건을 구매합니다 #");
		mlist.add(prod);
	}
	public void showList() {
		System.out.println(name+"에서 구매한 내역");
		if(mlist.size()>0) {	// 등록된 내용이 있을 떄
			for(MProduct mp : mlist) {
				System.out.println(mp.getName()+"\t");
				System.out.println(mp.getPrice());
			}
		}else {
			System.out.println("구매한 물건이 없습니다.");
		}
	}
}