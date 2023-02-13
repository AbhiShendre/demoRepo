package com.TestProduct1;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;

import com.TestProduct1.Dao.Dao;
import com.TestProduct1.Entity.Product1;
import com.TestProduct1.Utility.Utility;
import com.TestProduct1.service.Service;

public class TestProduct1 {
	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("press 1 for getproductbyId");
			System.out.println("press 2 for save");
			System.out.println("press 3 for Delete product");
			System.out.println("press 4 for update product");
			System.out.println("press 5 for getAll product");
			System.out.println("press 6 for getAll product as per ordet");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:{
				long productId = Utility.getProductId(scanner);
				Product1 product1 = Service.getProductById(productId);
				if(product1!=null) {
					
					System.out.println(product1);
				}
				else {
					System.out.println("product not available");
				}
				break;
			}
			case 2:{
				Product1 product1 = Utility.getUtility(scanner);
				boolean isSaved = Service.saveProduct1(product1);
				if(isSaved) {
					System.out.println("product is save");
				}
				else {
					System.out.println("product is already exit");
				}
				
				break;
			}
			case 3:{
				long productId = Utility.getProductId(scanner);
				boolean isDelated = Service.delateProduct(productId);
				if(isDelated) {
					System.out.println("product id delate");
				}
				else {
					System.out.println("product is not exit");
				}
				break;
			}
			case 4:{
				
				Product1 product1 = Utility.getUtility(scanner);
				boolean isUpdate = Service.updateProduct(product1);
				if(isUpdate) {
					System.out.println("product is update");
					
				}
				else {
					System.out.println("product is not exit");
				}
				break;
				
			}
			case 5:{
				List<Product1> list = Service.getAllProduct();
				if(list.isEmpty() || list==null) {
					System.out.println("enter product not exit");
				}
				else {
					for(Product1 allproduct : list) {
						System.out.println(allproduct);
					}
					break;
				}
			}
			case 6:{
				List<Product1> listbyOrder = Service.getProductByOrder(scanner);
				
				 
				if(listbyOrder==null || listbyOrder.isEmpty()) {
					System.out.println("profile is not Exit");
				}
				else {
					for(Product1 list:listbyOrder) {
						
						System.out.println(list);
					}
				}
				break;
			}
			default:
			{
				System.out.println("pleas press correct value");
				break;
			}
			}
			System.out.println("do you want continew press yes else no");
			ch = scanner.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

		System.out.println("Thanke You");
	}
}


