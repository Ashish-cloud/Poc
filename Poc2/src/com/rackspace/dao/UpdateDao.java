package com.rackspace.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.racksapace.dto.RegDto;

public class UpdateDao {
	public boolean updatecustomer(RegDto rd) {
		
		boolean upval = false;
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx  = s.beginTransaction();
		s.createQuery("");
		
		
		return upval;
		
	}
	

}
