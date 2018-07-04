package corejava2;

public class ParentClass {
	
	public void handleRegistration(ProcessRegistration processRegistration) {
		Student student = new Student();
		processRegistration.init(student);
	}
	
	public void handleRegistration(ProcessInterface processInterface) {
		Student student = new Student();
		processInterface.init(student);
	}

}
