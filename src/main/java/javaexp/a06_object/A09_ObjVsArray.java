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