package javaexp.a02_middle;

public class A18_MethodExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music02 m1 = new Music02("신호등");
		String getMusic = m1.getMname();
		System.out.println("리턴된 노래명: "+getMusic);
	}

}
class Music02{
	String musicTit;
	Music02(String musicTit){
		this.musicTit = musicTit;
	}
	String getMname() {
		return musicTit;
	}
}