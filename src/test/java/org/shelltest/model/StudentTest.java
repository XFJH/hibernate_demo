package org.shelltest.model;

import org.hibernate.Session;
import org.junit.Test;

/**
 * @Description //TODO
 * @Date 2020-01-12 18:25
 * @Author Nash·CC
 **/
public class StudentTest {

	@Test
	public void testDataSource(){
		Session session = HibernateSessionFactory.getSession();
		System.out.println(session);
	}
}