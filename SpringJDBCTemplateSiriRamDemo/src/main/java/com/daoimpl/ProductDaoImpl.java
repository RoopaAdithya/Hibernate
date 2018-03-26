package com.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.beans.ProductBean;
import com.dao.ProductDao;

@Repository
//@Component

public class ProductDaoImpl implements ProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	
	public void addProduct(ProductBean p) {

		jdbcTemplate.update(
				"insert into product(product_name,cost) values(?,?)",
				p.getProductName(), p.getCost());
		System.out.println("Product Added");

	}

	public void updateProduct(ProductBean p) {

		jdbcTemplate.update("update product set cost=? where product_id=?",
				p.getCost(), p.getProductId());
		
		System.out.println("Product updated");

	}

	public void deleteProduct(int pid) {


		jdbcTemplate.update("delete from product where product_id=?",pid);
		System.out.println("Product deleted");

	}

	public List<ProductBean> viewAllProducts() {

	ArrayList<ProductBean> al=(ArrayList<ProductBean>) jdbcTemplate.query("select * from product",new BeanPropertyRowMapper<ProductBean>(ProductBean.class));
		
		return al;
	}

}
