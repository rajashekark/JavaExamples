package Arrays;

class Student {
	public int roll_no;
	public String name;
	
	Student(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}
}

public class ArrayOfObject {
	public static void main(String args[]) {
		Student[] arr = new Student[2];//array of userdefined
		arr[0] = new Student(1, "name1");
		arr[1] = new Student(2, "name2");
		
		//asscessing the elements of specified array
	for(Student stu : arr)
			System.out.println(stu.roll_no + " " + stu.name);
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i].roll_no + " " + arr[i].name);
		}
	}

}
