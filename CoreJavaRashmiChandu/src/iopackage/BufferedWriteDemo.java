package iopackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("test.txt");

		f.createNewFile();
		FileWriter fw = new FileWriter(f);

		BufferedWriter bw = new BufferedWriter(fw);

		BufferedWriter bw1 = new BufferedWriter(new FileWriter(new File(
				"test1.txt")));

		bw1.write(100);
		bw1.write("Kiran");
		bw1.write(25);
		bw1.newLine();

		bw1.write(101);
		bw1.write("Jai");
		bw1.write(30);
		

		bw1.newLine();

		bw1.write(102);
		bw1.write("Pooja");
		bw1.write(67);

		bw1.flush();
		bw1.close();

	}

}
