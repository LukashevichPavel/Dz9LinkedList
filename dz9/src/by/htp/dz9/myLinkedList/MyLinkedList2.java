package by.htp.dz9.myLinkedList;

public class MyLinkedList2 {
	private MyEntry firstEntry;
	private MyEntry lastEntry;
	private static int size;
	{//Логический блок
	size=0;	
	}

	public MyLinkedList2(){
		this.lastEntry=null;
		this.firstEntry=null;
	}

	public boolean isEmpty(){
		return(null==lastEntry);
	}
	
	public void addEntryFirst(Student student){
		MyEntry newEntry = new MyEntry(student);
		if (isEmpty()){lastEntry=newEntry;}
		newEntry.setNextEntry(firstEntry);
		firstEntry=newEntry;
		size++;
	}
	
	public void addEntryLast(Student student){
		MyEntry newEntry = new MyEntry(student);
		if (isEmpty()){firstEntry=newEntry;}
		else {lastEntry.setNextEntry(newEntry);}
		lastEntry=newEntry;
		size++;
	}

	public MyEntry delEntry(){
		MyEntry tempEntry = lastEntry;
		lastEntry=lastEntry.getLastEntry();
		size--;
		return tempEntry;
	}

	public void printList(){
		if (isEmpty()){
			System.out.println("Список пуст");
		}
		else{
			System.out.println("Содержимое листа:");
			MyEntry current = firstEntry;
			while (current!=null){
				current.printEntry();
				current=current.getNextEntry();
			}
			System.out.println("");
		}
		
	}

	public MyEntry getLastEntry() {
		return lastEntry;
	}

	public void setLastEntry(MyEntry lastEntry) {
		this.lastEntry = lastEntry;
	}

	public static int getSize() {
		return size;
	}



	


}
