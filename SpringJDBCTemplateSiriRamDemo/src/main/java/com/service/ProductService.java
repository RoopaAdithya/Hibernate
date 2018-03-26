package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.beans.ProductBean;
import com.dao.ProductDao;
@Service
//@Component
public class ProductService implements ProductDao {

	@Autowired
	ProductDao pd;

	public void addProduct(ProductBean p) {

		pd.addProduct(p);

	}

	public void updateProduct(ProductBean p) {

		pd.updateProduct(p);

	}

	public void deleteProduct(int pid) {

		pd.deleteProduct(pid);
	}

	public List<ProductBean> viewAllProducts() {

		List<ProductBean> l=pd.viewAllProducts();
		return l;
	}

}
