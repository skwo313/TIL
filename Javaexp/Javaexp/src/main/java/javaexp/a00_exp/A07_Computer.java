package javaexp.a00_exp;

public class A07_Computer {
	private String cpu;
	private int ram;
	private int hdd;
	public A07_Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A07_Computer(String cpu, int ram, int hdd) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
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
