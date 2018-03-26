package iopackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {


		
		File f=new File("studentinfo.txt");
		FileReader fr=new FileReader(f);
		
		BufferedReader br=new BufferedReader(fr);
		
		//BufferedReader br1=new BufferedReader(new FileReader(new File("text.txt")));
		
		int i=0;
		double d=0.0;
		String s="";
		while((s=br.readLine())!=null)
				{
		System.out.println(s);
				}
		
//		System.out.println(s.length());
		
	}

}
