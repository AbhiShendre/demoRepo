package com.TestProduct1.Dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import com.TestProduct1.Configur.Configur;
import com.TestProduct1.Entity.Product1;

public class Dao {

	private static SessionFactory sessonFactory = Configur.getSessonFactory();

	public static Product1 getProductById(long productId) {
		Session session = sessonFactory.openSession();
		Product1 product1 = null;
		try {

			product1 = session.get(Product1.class, productId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return product1;

	}

	public static boolean saveProduct1(Product1 product1) {
		Session session = sessonFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		boolean isSaved = false;
		try {
			Product1 dbProduct1 = getProductById(product1.getProductId());
			if (dbProduct1 == null) {
				session.save(product1);
				beginTransaction.commit();
				isSaved = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return isSaved;

	}

	public static boolean delateProduct(long productId) {
		Session session = sessonFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		boolean isDelated = false;
		try {
			Product1 product1 = getProductById(productId);
			if (product1 != null) {
				session.delete(product1);
				beginTransaction.commit();
				isDelated = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return isDelated;

	}

	public static boolean updateProduct(Product1 product1) {
		Session session = sessonFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		boolean isUpdate = false;
		try {
			Product1 dbProduct1 = getProductById(product1.getProductId());

			if (dbProduct1 != null) {
				session.update(product1);
				beginTransaction.commit();
				isUpdate = true;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return isUpdate;

	}

	public static List<Product1> getAllProduct() {
		Session session = sessonFactory.openSession();
		List<Product1> list = null;
		try {
			Criteria criteria = session.createCriteria(Product1.class);
			list = criteria.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;

	}

	public static List<Product1> getProductbyOrder(Scanner scanner) {
		System.out.println("Enter 1 for Asending Order");
		System.out.println("Enter 2 for Desending Order");
		int choiceForOrder = scanner.nextInt();
		Session session = sessonFactory.openSession();
		List<Product1> listbyOrder = null;
		try {

			switch (choiceForOrder) {
			case 1: {

				Criteria criteria = session.createCriteria(Product1.class);
				criteria.addOrder(Order.asc("productName"));
				listbyOrder = criteria.list();
				break;
			}
			case 2: {

				Criteria criteria = session.createCriteria(Product1.class);
				criteria.addOrder(Order.desc("productName"));
				listbyOrder = criteria.list();
				break;
			}

			default:
				listbyOrder = null;
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return listbyOrder;

	}

}
