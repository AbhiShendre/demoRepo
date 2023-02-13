	package com.TestProduct1.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;

import com.TestProduct1.Dao.Dao;
import com.TestProduct1.Entity.Product1;

public class Service {

	public static Product1 getProductById(long productId) {
		
		 Product1 product1 = Dao.getProductById(productId);
		return product1;
		
	}

	public static boolean saveProduct1(Product1 product1) {
		boolean isSaved = Dao.saveProduct1(product1);
		return isSaved; 
		
		
	}

	public static boolean delateProduct(long productId) {
		boolean isDelated = Dao.delateProduct(productId);
		return isDelated;
		
		
	}

	public static boolean updateProduct(Product1 product1) {
		boolean isUpdate = Dao.updateProduct(product1);
		return isUpdate;
		
		
	}

	public static List <Product1> getAllProduct() {
		List<Product1> list = Dao.getAllProduct();
		return list;
		
	}

//	public static List<Product1> getProductbyOrder() {
//	 List<Product1> listbyOrder = Dao.getProductbyOrder();
//		return listbyOrder;
//		
//	}

	public static List<Product1> getProductByOrder(Scanner scanner) {
		List<Product1> listbyOrder = Dao.getProductbyOrder(scanner);		
		return listbyOrder;
		
		
	}	

	

		
	}
