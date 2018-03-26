package com.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.ProductBean;
import com.configuration.ApplicationConfiguration;
import com.service.ProductService;

public class Test {

	public static void main(String[] args) {


		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		
		ProductService ps=context.getBean(ProductService.class);
		
		ProductBean p=new ProductBean();
		p.setProductName("zzz");
		p.setCost(500);

		ps.addProduct(p);
		
		
		
		ProductBean p1=new ProductBean();
		p1.setCost(2000);
		p1.setProductId(2);
		
		ps.updateProduct(p1);
		
		ps.deleteProduct(1);
		
		List<ProductBean> l=ps.viewAllProducts();
		
		Iterator<ProductBean> i=l.iterator();
		while(i.hasNext())
		{
			ProductBean pp=i.next();
			System.out.println(pp.getProductId()+" "+pp.getProductName()+" "+pp.getCost());
		}

		
		
		
		
		
		
	}

}
