package corejava2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class MyClass extends ParentClass implements ProcessInterface{
	
	public static final String FIRST_NAME = "firsName";
	public static final String LAST_NAME = "lastName";
	public static final String ROLL_NUM = "rollNum";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = new MyClass("Vasudev");
		MyClass myClass1 = new MyClass("Vasudev","Kumaran");
		MyClass myClass2 = new MyClass("Dev",1131);
		
		MyClass myClass3 = new MyClass("Vasudev","Kumaran","Hariram","Shiva");
		Student student = new Student();
		student.setFirstName("Vasudev");
		//student.setLastName("Kumaran");
		//student.setRollNum(234124);
		
		ArrayList<Student> students = new ArrayList<Student>();
		Student student2 = new Student();
		student2.setFirstName("Dev");
		students.add(student2);
		Student student3 = new Student();
		student3.setFirstName("Kumaran");
		students.add(student3);
		student2 = new Student();
		student2.setFirstName("Shivam");
		student2.setRollNum(45435);
		students.add(student2);
		//myClass.printStudentObj(student);
		myClass.printStudents(students);
		
		
		HashMap< String, Object> studentObj = new HashMap<String,Object>();
		studentObj.put(MyClass.FIRST_NAME, "Vasudev");
		studentObj.put(MyClass.LAST_NAME, "Kumaran");
		studentObj.put(MyClass.ROLL_NUM, 10023);
		
		System.out.println(studentObj.get(MyClass.FIRST_NAME));
		
		studentObj = new HashMap<String,Object>();
		//studentObj.put(MyClass.FIRST_NAME, "Kumaran");
		studentObj.put(MyClass.LAST_NAME, "Deva");
		studentObj.put(MyClass.LAST_NAME, "Deva");
		studentObj.put(MyClass.ROLL_NUM, 234233);
		
		System.out.println((String)studentObj.get(MyClass.FIRST_NAME));
		System.out.println((int)studentObj.get(MyClass.ROLL_NUM));
		
		ArrayList<HashMap<String, Object>> sts = new ArrayList<HashMap<String, Object>>();
		ProcessRegistration processRegistration = new ProcessRegistration() {
			
			@Override
			public void init(Student student) {
				// TODO Auto-generated method stub
				System.out.println("Called");
			}
		};
		myClass.handleRegistration(processRegistration);
		myClass.handleRegistration(myClass);
		
		
		
		
	}
	
	public MyClass() {
		System.out.println("Base Constructor Called");
		handleRegistration(this);
	}
	
	public MyClass(String firstName) {
		System.out.println("Contructor with Single Arg: "+firstName);
	}
	
	public MyClass(String firstName,String lastName) {
		System.out.println("Contructor with two Arg: "+firstName+", "+lastName);
	}
	
	public MyClass(String firstName,int rollNum) {
		System.out.println("Contructor with String and Int: "+firstName+", "+rollNum);
	}
	
	
	
	public MyClass(String...names) {
		System.out.println("Contructor with strings... called");
		for(int i = 0; i<names.length; i++) {
			
			System.out.println(names[i]);
		}
		
		

	}
	
	public void printStudentObj(Student student) {
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getRollNum());
		System.out.println(student.isPassed());
		
	}
	
	public void printStudents(ArrayList<Student> students) {
		
		for (int i= 0; i <students.size(); i++) {
			
			System.out.println(students.get(i).getFirstName());
			System.out.println(students.get(i).getRollNum());
					
		}
	}

	@Override
	public void init(Student student) {
		// TODO Auto-generated method stub
		System.out.println("Interface Obj Called");
	}
	
	

}
