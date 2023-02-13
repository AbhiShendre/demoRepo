package com.TestProduct1.Utility;

import java.util.List;
import java.util.Scanner;

import com.TestProduct1.Entity.Product1;

public class Utility {
	
	public static Product1 getUtility(Scanner scanner) {
		
		System.out.println("Enter the productId");
		long productId = scanner.nextLong();
		
		System.out.println("Enter the categoryId");
		long categoryId = scanner.nextLong();
		
		System.out.println("Enter the productName");
		String productName = scanner.next();
		
		System.out.println("Enter the productPrice");
		double productPrice = scanner.nextDouble();
		
		System.out.println("Enter the longproductQty");
		int longproductQty = scanner.nextInt();
		
		System.out.println("Enter the supplierId");
		long supplierId = scanner.nextLong();
		
		Product1 product1= new Product1(productId, categoryId, productName, productPrice, longproductQty, supplierId);
		
		
		return product1;
		
	}

       public static long getProductId(Scanner scanner) {
		
		System.out.println("Enter the productId");
		long productId = scanner.nextLong();
		return productId;
       }

	       

       










}

