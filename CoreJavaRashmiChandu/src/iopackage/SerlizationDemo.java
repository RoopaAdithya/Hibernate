package iopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerlizationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		
		Student s=new Student(100, "Ram", 35,"Hyd");
		
		Student s1=new Student(101, "Kiran", 45,"Hyderabad");

		
		/*File f=new File("std.ser");
		f.createNewFile();
		FileOutputStream fos=new FileOutputStream(f);*/
		
		
		FileOutputStream fos=new FileOutputStream("std.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(s);  //Serliztion
		oos.writeObject(s1);
		
		oos.close();
		fos.close();
		
		
		FileInputStream fis=new FileInputStream("std.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		System.out.println(ois.readObject()); //deserilization
		System.out.println(ois.readObject());
		
		ois.close();
		fis.close();
		
	}

}
