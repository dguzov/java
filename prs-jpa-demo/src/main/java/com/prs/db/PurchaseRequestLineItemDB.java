package com.prs.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.business.PurchaseRequestLineItem;

public class PurchaseRequestLineItemDB {

	public static List<PurchaseRequestLineItem> getAll() {
		List<PurchaseRequestLineItem> purchaserequestlineitems = null;

		EntityManager em = DBUtil.getEmFactory().createEntityManager();

		try {
			Query q = em.createQuery("Select prli from PurchaseRequestLineItem prli");
			purchaserequestlineitems = q.getResultList();
		} finally {
			em.close();
		}
		return purchaserequestlineitems;

	}
}