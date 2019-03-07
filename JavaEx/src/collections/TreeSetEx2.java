package collections;

import java.util.Iterator;
import java.util.TreeSet;

class Employee1 implements Comparable<Employee1>{
	private int id;
	private String name;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public int compareTo(Employee1 e) {
		// TODO Auto-generated method stub
		if(id>e.id) {
			return 1;
		}
		else if(id<e.id){
			return -1;
		}else {
		return 0;
		}
	}
	
	
}
public class TreeSetEx2 {
	
	public static void main(String args[]) {
		
		Employee1 emp1 = new Employee1();
		emp1.setId(2);
		emp1.setName("Hari");
		emp1.setRole("Developer");
		
		Employee1 emp2 = new Employee1();
		emp2.setId(1);
		emp2.setName("Ramu");
		emp2.setRole("Tester");
		
		TreeSet<Employee1> ts = new TreeSet<Employee1>();
		ts.add(emp1);
		ts.add(emp2);
		
		Iterator<Employee1> itr = ts.iterator();
		while(itr.hasNext()) {
			Employee1 emp = (Employee1)itr.next();
			System.out.println(emp.getId()+ " "+ emp.getName()+ " "+ emp.getRole());
		}
	}

}
