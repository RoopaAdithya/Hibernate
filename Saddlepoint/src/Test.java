import java.util.Scanner;


public class Test {

	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		
		
		String s=sc.next();
		String ss[]=s.split(",");
		
		
		for(String sss:ss)
		{
			
			System.out.println(sss);
			if(sss.equals(""))
			{
			//	sss.replaceAll( " ");
			}
		}
		
		
	}
}
