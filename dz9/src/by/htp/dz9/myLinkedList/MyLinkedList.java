package by.htp.dz9.myLinkedList;

public class MyLinkedList {
private MyEntry firstEntry;
private static int size;
{//Логический блок
size=0;	
}

public MyLinkedList(){
	this.firstEntry=null;	
}

public boolean isEmpty(){
	return(null==firstEntry);
}
public void addEntry(Student student){
	MyEntry newEntry = new MyEntry(student);
	newEntry.setNextEntry(firstEntry);
	firstEntry=newEntry;
	size++;
}

public MyEntry delEntry(){
	MyEntry tempEntry = firstEntry;
	firstEntry=firstEntry.getNextEntry();
	size--;
	return tempEntry;
}

public void printList(){
	if (isEmpty()){
		System.out.println("Список пуст");
	}
	else{
		System.out.println("Все элементы: ");
		MyEntry current = firstEntry;
		while (current!=null){
			current.printEntry();
			current=current.getNextEntry();
		}
		System.out.println("");
	}
	
}

public MyEntry getFirstEntry() {
	return firstEntry;
}

public void setFirstEntry(MyEntry firstEntry) {
	this.firstEntry = firstEntry;
}

public static int getSize() {
	return size;
}



}


