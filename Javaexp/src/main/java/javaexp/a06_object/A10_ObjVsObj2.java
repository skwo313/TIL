package javaexp.a06_object;

import java.util.ArrayList;

public class A10_ObjVsObj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchClass sc = new SchClass("1학년 2반");
		sc.commit(new Student(1,"홍길동"));
		sc.commit(new Student(2,"신길동"));
		sc.showList();
	}
	
}
class Student{
	private int number;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class SchClass {
	private String sclass;
	private ArrayList<Student> slist;
	public SchClass() {
		super();
		slist = new ArrayList<Student>();
		// TODO Auto-generated constructor stub
	}
	public SchClass(String sclass) {
		super();
		slist = new ArrayList<Student>();
		this.sclass = sclass;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public ArrayList<Student> getSlist() {
		return slist;
	}
	public void setSlist(ArrayList<Student> slist) {
		this.slist = slist;
	}
	public void commit(Student stud) {
		System.out.println("# 학생을 등록합니다 #");
		slist.add(stud);
	}
	public void showList() {
		System.out.println("# "+sclass+" 학생의 정보 #");
		System.out.println("번호\t이름");
		if(slist.size()>0) {
			for(Student S : slist) {
				System.out.println(S.getNumber()+"\t"+S.getName());
			}
		}else {
			System.out.println("등록된 학생이 없습니다.");
		}
	}
}
