package by.htp.dz9.myLinkedList;

public class MyEntry {
	private Student student;
	private MyEntry nextEntry;
	private MyEntry lastEntry;
	
public MyEntry(){}

public MyEntry(Student student){
	this.student=student;
//	this.nextEntry=null; 
	}
public void printEntry(){
	try {
	System.out.print(this.student.toString()+" ");
	}
	catch (NullPointerException e){
	System.out.print("Нет элемента"+e);	
	}
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

public MyEntry getLastEntry() {
	return lastEntry;
}

public void setLastEntry(MyEntry lastEntry) {
	this.lastEntry = lastEntry;
}
	
}
