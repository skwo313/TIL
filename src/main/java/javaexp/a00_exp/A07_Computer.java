package javaexp.a00_exp;

public class A07_Computer {
	private String company;
	private String cpu;
	private int ram;
	private int hdd;
	public A07_Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A07_Computer(String company, String cpu, int ram, int hdd) {
		super();
		this.company = company;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	
}
