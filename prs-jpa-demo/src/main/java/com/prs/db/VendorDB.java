package com.prs.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.business.Vendor;

public class VendorDB {

	public static List<Vendor> getAll() {
		List<Vendor> vendors = null;

		EntityManager em = DBUtil.getEmFactory().createEntityManager();

		try {
			Query q = em.createQuery("Select v from Vendor v");
			vendors = q.getResultList();
		} finally {
			em.close();
		}
		return vendors;

	}
}
