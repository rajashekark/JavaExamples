package collections;

import java.util.HashSet;

class Employee{
	
	int id;
	String name;
	String position;
	public Employee(int id, String name, String position) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
	}
	
	
}

public class HashSetEx {
	
	public static void main(String args[]) {
	
		HashSet<Employee> hs = new HashSet<Employee>();
		
		Employee emp1 = new Employee(1,"Hari","SD");
		
		Employee emp2 = new Employee(2,"Ramu","Manager");
		
		//Employee emp3 = new Employee(2,"Ramu","Manager");

		
		hs.add(emp1);
		hs.add(emp2);
		//hs.add(emp3);
		
		
		
		for(Employee e:hs) {
			System.out.println(e.id+" " + e.name+ " "+ e.position);
		}
	}

}
