package com.roopa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import org.apache.catalina.connector.Request;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String helloWorld(Model model) {
		model.addAttribute("message", "Hello World!");
		return "helloworld";
	}

	@RequestMapping("/")
	public String welcomepage(Model model) {
		// model.addAttribute("message", "Hello World!");
		return "index";
	}

	@RequestMapping("/register")
	public String register(Model model) {
		// model.addAttribute("message", "Hello World!");
		return "Register";
	}

	
	 @RequestMapping("/view") 
	 public String view(Model model) { //
	  model.addAttribute("message", "Hello World!"); 
	  return "View";
	  }
	 
	@RequestMapping(value = "/addBank", method = RequestMethod.POST)
	public String addBank(@RequestParam("bankname") String bankname,
			@RequestParam("address") String address, Model model) {
		System.out.println("Details " + bankname + " " + address);
		String status = "Register";
		model.addAttribute("message", "Bank Added!");
		Session session = DbConnection.getConnection();

		Transaction t = session.beginTransaction();
		Bank b = new Bank();
		b.setBankName(bankname);
		b.setAddress(address);
		session.save(b);
		t.commit();

		return status;

	}

	@RequestMapping(value="/viewallbanks",method=RequestMethod.GET)
	
	public String viewAll(Model model) {
		System.out.println("In view ALLLLLLLLLLl");
		ArrayList<Bank> al = new ArrayList<Bank>();

		
		Session session = DbConnection.getConnection();
		Transaction t = session.beginTransaction();

		Query q = session.createQuery("from Bank");


			List<Bank> i=q.list();
			
			Iterator<Bank> ii=i.iterator();
		while (ii.hasNext()) {
			Bank b = new Bank();
			b=ii.next();
			al.add(b);

		}
System.out.println("Bank      =="+al);
		model.addAttribute("message", al);
		t.commit();
		return "ViewBanks";

	}
}
