package corejava2;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = new MyClass("Vasudev");
		MyClass myClass1 = new MyClass("Vasudev","Kumaran");
		MyClass myClass2 = new MyClass("Dev",1131);
		
		MyClass myClass3 = new MyClass("Vasudev","Kumaran","Hariram","Shiva");
		Student student = new Student();
		student.setFirstName("Vasudev");
		student.setLastName("Kumaran");
		student.setRollNum(234124);
		myClass.printStudentObj(student);
		
		
	}
	
	public MyClass() {
		System.out.println("Base Constructor Called");
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
	}
	
	

}
