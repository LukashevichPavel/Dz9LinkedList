package by.htp.dz9.myLinkedList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//Создать экземпляр класса LinkedList (связанный список)разместить в нем 3 ссылки  на объекты класса Student (name, dateBirdth)
//Программно Удалить второго студента
//Посмотреть CopyOnWriteArraySet в множествах
//Почему класс арай лист имплементирует интерфейс лист в то время как он наследует класс абстракт лист,
//который в свою очередь тоже реализует интерфейс лист
//ДЗ написать свой линкед лист
public class Main {

	public static void main(String[] args) throws IOException {
	//Вариант 1
	MyLinkedList myList = new MyLinkedList();
	Student st1= new Student (0,"Ivan",23);
	Student st2= new Student (1,"Petr",21);
	Student st3= new Student (2,"Igor",25);
	Student st4= new Student (3,"Ivan",23);
	myList.addEntry(st1);
	myList.addEntry(st2);
	myList.addEntry(st3);
	myList.addEntry(st4);
	myList.printList();
	
	/*
	//Set <Student> set = new HashSet <Student>();
	Map <Student, Integer> map = new HashMap <Student, Integer>();
	map.put(st1,3);
	map.put(st2,5);
	map.put(st3,7);
	map.put(st4,10);
	map.put(null, 9);
	map.put(null, 13);
	Set<Entry<Student, Integer>> entries = map.entrySet();
	System.out.println(entries);
	//set.remove(st3);
	//map.keySet()
	for (Student str:map.keySet()){
		System.out.println(map.get(str));
	}
		
		
		/*
	LinkedList<String> list = new LinkedList<String>();
	list.add("Firts");
	list.addFirst("Second");
	list.add("Third");
	list.add("Fourth");
	//list.ensureCapacity(39);
	//System.out.println(list.size());
	//for (int i = 0; i<list.size(); i++){System.out.println(list.get(i));}
	
	for (String str: list){
		System.out.println(str);
		}
	
	
	Iterator it = list.iterator();
	while (it.hasNext()){
		System.out.println(it.next());
	}
	//list.trimToSize();
		
		/*
		Student student1; 
		String name;
		name="Ivan";
		student1=new Student(name);
		Student student2; 
		name="Petr";
		student2=new Student(name);
		Student student3; 
		name="Kolya";
		student3=new Student(name);
		
		LinkedList<Student> list = new LinkedList();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		list.get(0).print();
		list.get(1).print();
		list.get(2).print();
		list.remove(1);
		list.get(0).print();
		list.get(1).print();
		list.get(2).print();
		/*byte[] buff;
		int size = 0;
		/
		try(FileInputStream file=new FileInputStream("C://Workspace//group_list.txt"))
	        {
	            System.out.println("Размер файла: " +  file.available() + " байт(а)");
	            size=file.available();
	            int i=-1;
	            while((i=file.read())!=-1){
	         
	                System.out.print((char)i);
	            }   
	        }
	        catch(IOException ex){
	             
	            System.out.println(ex.getMessage());
	        } 
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		 BufferedReader reader = null;
		    try {
		        reader = new BufferedReader(
		                new InputStreamReader(new FileInputStream("C:\\Workspace\\group_list.txt")));
		        int i=-1;
		        int k=0;
		        buff = new byte[size];
		        while((i=reader.read())!=-1){
		        System.out.println(reader.readLine());
		     
		        buff[k]=(byte)reader.read();
		        k++;
		        }
		    } 
		    catch (FileNotFoundException e1) {
		        System.out.println("Файл не найден");
		        System.exit(0);
		    }
		
		    String text = "Захаренко Светлана Юрьевна!"; // строка для записи
	        try(FileOutputStream fos=new FileOutputStream("C:\\Workspace\\group_list.txt"))
	        {
	            // перевод строки в байты
	            byte[] buffer = text.getBytes();
	             
	            fos.write(buffer, 0, buffer.length);
	        }
	        catch(IOException ex){
	             
	            System.out.println(ex.getMessage());
	        } 
		*/
		
	}

}
