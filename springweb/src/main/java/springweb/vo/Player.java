package springweb.vo;

public class Player {
	private String pname;
	private int record;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String pname, int record) {
		super();
		this.pname = pname;
		this.record = record;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	
}
