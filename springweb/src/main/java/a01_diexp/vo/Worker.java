package a01_diexp.vo;

public class Worker {
	private String name;
	private WorkLocation loc;
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Worker(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkLocation getLoc() {
		return loc;
	}
	public void setLoc(WorkLocation loc) {
		this.loc = loc;
	}
	public void showInfo() {
		System.out.println("회사원 이름: "+name);
		if(loc!=null) {
			System.out.println("일하는 나라: "+loc.getCountry());
			System.out.println("일하는 나라: "+loc.getCity());
		} else {
			System.out.println("일하는 곳이 없습니다");
		}
	}
}
