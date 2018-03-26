package utilpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter Password");
		String password=sc.next();
		FileInputStream fis=new FileInputStream("D:\\Roopa\\CoreJavaRashmiChandu\\myproperties.properties");
		
		Properties p=new Properties();
		
		p.load(fis);
		
String dbemail=p.getProperty("email");
String dbpassword=p.getProperty("password");
		System.out.println("email ==="+p.getProperty("email")+" "+p.getProperty("password"));
		
		if(email.equals(dbemail) && password.equals(dbpassword))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Fail");
		}
		
	}

}
