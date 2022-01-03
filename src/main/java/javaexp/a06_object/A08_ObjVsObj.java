package javaexp.a06_object;

public class A08_ObjVsObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex) 1:1 = SPhone(회사), SPerson관계로 SPerson에 필드로(이름과 SPhone)을 설정하여 처리
		SPerson pers = new SPerson("홍길동");
		pers.setPhone(new SPhone("삼성","강남"));
		pers.SPersonInfo();
	}

}
class SPhone{
	private String pname;
	private String loc;
	public SPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SPhone(String pname, String loc) {
		super();
		this.pname = pname;
		this.loc = loc;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
class SPerson{
	private String name;
	private SPhone phone;
	public SPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SPerson(String name) {
		super();
		this.name = name;
	}
	public void SPersonInfo() {
		System.out.println("사용자: "+name);
		if(phone!=null) {
			System.out.println("보유한 휴대폰");
			System.out.println(phone.getPname());
		}else {
			System.out.println("핸드폰이 없습니다.");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SPhone getPhone() {
		return phone;
	}
	public void setPhone(SPhone phone) {
		this.phone = phone;
	}
	
}