package iopackage;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {


		File f=new File("C:\\Users\\pc\\Desktop\\employee.pdf");
		System.out.println(f.createNewFile());
		
		
		File f1=new File("C:/Users/pc/Desktop/myjava12333333333");
		f1.mkdir();
		
		File f2=new File(f1,"book.xls");
		System.out.println(f2.createNewFile());
		
	}

}
