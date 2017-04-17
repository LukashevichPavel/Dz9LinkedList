package by.htp.dz9.myLinkedList;

public class MyLinkedList1 {
private MyEntry firstEntry;
private static int size;
{//Логический блок
size=0;	
}

public MyLinkedList1(){
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
		System.out.println("Всего в листе "+getSize()+" элемент(а)(ов)");
		System.out.println("Содержимое листа:");
		MyEntry current = firstEntry;
		while (current!=null){
			current.printEntry();
			current=current.getNextEntry();
		}
		System.out.println("");
	}
	
}

public MyEntry findEntryId(int num){
	MyEntry current=firstEntry;
	while (current.getStudent().getId()!=num){
	if(current.getNextEntry()==null){return null;}
	else {current = current.getNextEntry();}
	}
	return current;
}
public MyEntry delEntryId(int num){
	MyEntry current = firstEntry;
	MyEntry previous = firstEntry;
	while (current.getStudent().getId()!=num){
		if (current.getNextEntry()==null){return null;}
		else{
			previous=current;
			current=current.getNextEntry();
		}
	}
	if (current==firstEntry){firstEntry=firstEntry.getNextEntry(); size--;}
	else {
		previous.setNextEntry(current.getNextEntry());
	}
	return current;
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


