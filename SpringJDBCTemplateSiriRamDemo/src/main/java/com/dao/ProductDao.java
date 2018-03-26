package com.dao;

import java.util.List;

import com.beans.ProductBean;

public interface ProductDao {

	
	void addProduct(ProductBean p);
	void updateProduct(ProductBean p);
	void deleteProduct(int pid);
	List<ProductBean> viewAllProducts();
	
	
}
