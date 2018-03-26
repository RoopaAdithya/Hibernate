package iopackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {


		FileWriter fw=new FileWriter("C:\\Users\\pc\\Desktop\\student1.doc",true);
		
		
	File f=new File("C:\\Users\\pc\\Desktop");
	
	String s[]=f.list();
		
		FileWriter fw1=new FileWriter("Filesbackup.txt",true);
		
		char c[]={'a','b','c','d'};
		
		/*fw.write(65);
		fw.write(97);
		fw.write('B');
		fw.write(c);
		fw.write("***************");*/
		
		fw1.write("***********************8");
		
		for(String ss:s)
		{
			fw1.write(ss);
			fw1.write("\n");
		}
		fw1.flush();
		fw1.close();
		
		
		/*for(int i=0;i<=255;i++)
		{
			System.out.println(i+"\t"+(char)i);
		}
		*/
		
		
		
		
	}

}
