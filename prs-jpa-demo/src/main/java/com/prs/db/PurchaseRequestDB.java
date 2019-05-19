package com.prs.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.business.PurchaseRequest;

public class PurchaseRequestDB {
	
	public static List<PurchaseRequest> getAll() {
			List<PurchaseRequest> purchaserequests = null;
			
			EntityManager em = DBUtil.getEmFactory().createEntityManager();
			
			try {
				Query q = em.createQuery("Select pr from PurchaseRequest pr");
				purchaserequests = q.getResultList();
			}
	finally {
		em.close();
	}
			return purchaserequests;	
	}
}