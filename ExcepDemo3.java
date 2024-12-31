package edu.peters.session;


class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void serId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
}
public class ExcepDemo3 {

	public static void main(String[] args) {
		
		//Student s1=new Student(100,"Amar");
		try {
			Student s1=null;
			System.out.println("Name:"+s1.getName());
			System.out.println("Id:"+s1.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		Student s2=new Student(7205,"Abhi");
		
		System.out.println("Name:"+s2.getName());
		System.out.println("Id:"+s2.getId());
		
		Student s3=new Student(25,"Nandan");
		
		System.out.println("Name:"+s3.getName());
		System.out.println("Id:"+s3.getId());
		
		
		
		
	}

}
