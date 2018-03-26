package iopackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {


		File f=new File("studentinfo.txt");
		PrintWriter p=new PrintWriter(f);
		
		p.print(100+"\t");
		p.print("Ram"+"\t");
		p.println(25);
		
		p.print(101+"\t");
		p.print("Jai"+"\t");
		p.print(25);
		p.flush();
		p.close();
		
		
		
		
		

	}

}
