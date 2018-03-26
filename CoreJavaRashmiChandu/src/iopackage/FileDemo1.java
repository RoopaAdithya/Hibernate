package iopackage;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {


		/*File f=new File("C:\\Users\\pc\\Desktop");
		
		String s[]=f.list();
		
		
		for(String ss:s)
		{
			System.out.println(ss);
		}*/
		
		
		File ff=new File("C:\\Users\\pc\\Desktop\\employee.txt");
		System.out.println(ff.delete());
		
		
		
		File ff1=new File("C:\\Users\\pc\\Desktop\\employee.pdf");
		
		File ff2=new File("C:\\Users\\pc\\Desktop\\student.doc");
		
		System.out.println(ff1.renameTo(ff2));
		
		System.out.println(ff2.isDirectory());
		
		
	}
	

}

/*
for(datatype variablename:arrayname or collectionname)
{
	sop(variablename);
}*/