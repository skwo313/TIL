package javaexp.a06_object.vo;

public class Music {
	private String mName;
	private String sName;
	public Music(String mName, String sName) {
		this.mName = mName;
		this.sName = sName;
	}
	public void play() {
		System.out.println("#플레이리스트#");
		System.out.println("곡명: "+mName);
		System.out.println("가수: "+sName);
	}
}
