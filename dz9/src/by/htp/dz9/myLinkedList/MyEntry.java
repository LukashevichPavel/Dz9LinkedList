package by.htp.dz9.myLinkedList;

public class MyEntry {
	private Student student;
	private MyEntry nextEntry;
	
public MyEntry(){}

public MyEntry(Student student){
	this.student=student;
//	this.nextEntry=null; 
	}
public void printEntry(){
	System.out.println(this.student.toString());
}

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

public MyEntry getNextEntry() {
	return nextEntry;
}

public void setNextEntry(MyEntry nextEntry) {
	this.nextEntry = nextEntry;
}
	
}
