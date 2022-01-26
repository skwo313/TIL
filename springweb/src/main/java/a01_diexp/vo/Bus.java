package a01_diexp.vo;

import java.util.ArrayList;

public class Bus {
	private int num;
	private ArrayList<Passenger> plist;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int num) {
		super();
		this.num = num;
	}
	public void showPassenger() {
		System.out.println(num+"번 버스의 탑승객");
		if(plist!=null) {
			for(Passenger p:plist) {
				System.out.println("승객이름:"+p.getName());
				System.out.println("승객나이:"+p.getAge());
			}
		}else {
			System.out.println("승객이 없습니다.");
		}
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public ArrayList<Passenger> getPlist() {
		return plist;
	}
	public void setPlist(ArrayList<Passenger> plist) {
		this.plist = plist;
	}
	
}
