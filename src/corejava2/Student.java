package corejava2;

import java.util.ArrayList;

public class Student {
	
	private String firstName;
	private String lastName;
	private int rollNum = -1;
	private boolean isPassed = false;
	//private String[] subjects = new String[] {"English","Math","Science"};
	private ArrayList<String> subjects = new ArrayList<String>()
;	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		subjects.add("Math");
		subjects.add("English");
		subjects.set(0, "Physics");
	
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public boolean isPassed() {
		return isPassed;
	}

	public void setPassed(boolean isPassed) {
		this.isPassed = isPassed;
	}

}
