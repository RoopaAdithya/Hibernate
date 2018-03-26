package java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Add {

	Add()
	{
		System.out.println("in ADDD");
	}
	@RequestMapping("/add")
	public String  add()
	{
		System.out.println("Add Calleddd");
	/*	String s="Im ghere";
		System.out.println(s);*/
		
		return "display.jsp";
		
	}
}
