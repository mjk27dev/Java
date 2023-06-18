package com.ratanitjava.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author Manoj Kumar
 *
 */
public class Serialization {

	/*For Two modules running in separate JVM instance for that the modules are
	 * connected via network. file data, the process of writing the object for the
	 * target module via network is called Serialization. It requires 2 classes FileOutPutStream and ObjectOutputStream Class
	 * 
	 * the process of reading the object from the
	 * source module via network is called DeSerialization.It requires 2 classes FileInputPutStream and ObjectInputStream Class
	 */
	
	void serialization() throws IOException {
		Employee e = new Employee(1, "Ayumi");
		Student student = new Student(1, "Michelle");
		FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(e);
		objectOutputStream.writeObject(student);
		objectOutputStream.close();
		System.out.println("Serialization Process Complete");
	}
	
	void deSerialization() throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("abc.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//		Student student = (Student) objectInputStream.readObject();//ClassCastException because the order of DeSerialization changes
		Employee employee = (Employee) objectInputStream.readObject();
		Student student = (Student) objectInputStream.readObject();
		System.out.println(student.sid+" "+student.sname);
		System.out.println(employee.eid+ " "+ employee.name);
		objectInputStream.close();
		
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Serialization serialization1 = new Serialization();
		serialization1.serialization();
		serialization1.deSerialization();
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(1, "Ayumi"));
		arrayList.add(new Employee(2, "Michelle"));
		arrayList.add(new Employee(3, "Jill valentine"));
		arrayList.add(new Employee(4, "Sheva"));

		//Serialization of ArrayList
		FileOutputStream fileOutputStream = new FileOutputStream("Empdata.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(arrayList);
		objectOutputStream.close();
		System.out.println("Serialization process complete");
	
		//DeSerialization of ArrayList
		FileInputStream fileInputStream = new FileInputStream("Empdata.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		ArrayList<Employee> arrayList2 = (ArrayList<Employee>) objectInputStream.readObject();
		for(Employee e: arrayList2) {
			System.out.println(e.eid+" "+e.name);
		}
	
//		In which order we done serialization the same order we have to do the DeSerialization. If not we get ClasscastException
		
		
	
	}

}
