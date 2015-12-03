package com.hotfey.drill.dao;

import java.sql.SQLException;

import org.junit.Ignore;
import org.junit.Test;

public class BaseDaoTest {
	@Ignore
	@Test
	public void testCQUTF8() {
		try {
			BaseDao.CQUTF8();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void testCQInt() {
		try {
			BaseDao.CQInt();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void testCQDouble() {
		try {
			BaseDao.CQDouble();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void testCount() {
		try {
			BaseDao.count();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void testSum() {
		try {
			BaseDao.sum();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void testAvg() {
		try {
			BaseDao.avg();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void testMax() {
		try {
			BaseDao.max();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
