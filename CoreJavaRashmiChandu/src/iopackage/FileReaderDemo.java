package iopackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		
		
		File f=new File("Filesbackup.txt");
		
		FileReader fr=new FileReader(f);

		for(int i=0;i<f.length();i++)
		{
		
		System.out.println((char)fr.read());
		}
		
	}

}
