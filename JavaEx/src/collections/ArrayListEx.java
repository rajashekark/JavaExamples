package collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student{

	int id;
	 String name;
	 String branch;
	
	public Student(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	
	
}

public class ArrayListEx {
	
	public static void main(String args[]) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student stu1= new Student(1,"Ajay", "ECE");
		Student stu2 = new Student(2,"Vijay", "Mech");
		Student stu4 = new Student(4,"Hari", "CSE");
		Student stu3 = new Student(3,"Ramu", "IT");
		
		al.add(stu4);
		al.add(stu2);
		al.add(stu1);
		al.add(stu3);
		al.add(stu2);
		al.add(stu3);
		
		System.out.println(al);
		
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.id + " " + st.name + " "+st.branch);
		}
		
		for(Student st:al) {
			System.out.println(st.id + " " + st.name + " "+st.branch);
		}
	}

}
