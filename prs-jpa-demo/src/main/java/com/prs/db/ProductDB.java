package com.prs.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.business.Product;

public class ProductDB {
	
	public static List<Product> getAll() {
			List<Product> products = null;
			
			EntityManager em = DBUtil.getEmFactory().createEntityManager();
			
			try {
				Query q = em.createQuery("Select p from Product p");
				products = q.getResultList();
			}
	finally {
		em.close();
	}
			return products;
	}
}