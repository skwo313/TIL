package javaexp.a04_vo;

public class Player {
	private String pname;
	private String kind;
	private String team;
	private int score;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String pname, String kind, String team, int score) {
		super();
		this.pname = pname;
		this.kind = kind;
		this.team = team;
		this.score = score;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
