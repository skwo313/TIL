package a01_diexp.vo;

public class Juliet {
	private int age;
	private Romeo romeo;
	public Juliet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Juliet(int age) {
		super();
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Romeo getRomeo() {
		return romeo;
	}
	public void setRomeo(Romeo romeo) {
		this.romeo = romeo;
	}
	public void showInfo() {
		 System.out.println("줄리엣의 나이:"+age);
		if(romeo!=null) {
			System.out.println("줄리엣의 남자친구 정보");
			System.out.println("성별:"+romeo.getGender());
			System.out.println("나이:"+romeo.getAge());
		}else {
			System.out.println("남자친구 정보가 없음");
		}
	}
}
