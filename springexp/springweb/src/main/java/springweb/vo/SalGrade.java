package springweb.vo;

public class SalGrade {
	private int empno;
	private String ename;
	private double sal;
	private int grade;
	public SalGrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalGrade(int empno, String ename, double sal, int grade) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.grade = grade;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
