package com.roopa;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.BankBean;
import com.configuration.ApplicationConfiguration;
import com.service.BankServiceImpl;

public class Test {

	public static void main(String[] args) {


		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		BankServiceImpl b= (BankServiceImpl) context.getBean(BankServiceImpl.class);
		BankBean b1=new BankBean();
		b1.setBankName("ICICI");
		b1.setAddress("Hyderabad");
		b.addBank(b1);
		
		BankBean b2=new BankBean();
		b2.setBankName("Kotak");
		b2.setBankId(2);
		b.updateBank(b2);
		
		
		b.deleteBank(3);
		
		
		List<BankBean> l=b.viewAllBanks();
		
		Iterator<BankBean> i=l.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
