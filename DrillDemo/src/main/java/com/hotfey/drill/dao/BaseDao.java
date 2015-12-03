package com.hotfey.drill.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	public static void CQUTF8() throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.drill.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:drill:zk= master.hadoop:2181/drill/drillbits");
		Statement st = connection.createStatement();
		ResultSet rs = st
				.executeQuery("SELECT row_key,CONVERT_FROM(web_initial.cf1.q5,'UTF8') from hbase.web_initial limit 3");
		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
	}

	public static void CQInt() throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.drill.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:drill:zk= master.hadoop:2181/drill/drillbits");
		Statement st = connection.createStatement();
		ResultSet rs = st
				.executeQuery("SELECT row_key,CONVERT_FROM(web_url.cf1.q2,'INT_BE') from hbase.web_url limit 3");
		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
	}

	public static void CQDouble() throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.drill.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:drill:zk= master.hadoop:2181/drill/drillbits");
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(
				"SELECT row_key,CONVERT_FROM(web_initial.cf1.qc,'DOUBLE_BE') from hbase.web_initial limit 3");
		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
	}

	public static void count() throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.drill.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:drill:zk= master.hadoop:2181/drill/drillbits");
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("SELECT count(*) from hbase.web_initial");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
	}

	public static void sum() throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.drill.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:drill:zk= master.hadoop:2181/drill/drillbits");
		Statement st = connection.createStatement();
		ResultSet rs = st
				.executeQuery("SELECT sum(CONVERT_FROM(web_initial.cf1.qc,'DOUBLE_BE')) from hbase.web_initial");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
	}

	public static void avg() throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.drill.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:drill:zk= master.hadoop:2181/drill/drillbits");
		Statement st = connection.createStatement();
		ResultSet rs = st
				.executeQuery("SELECT avg(CONVERT_FROM(web_initial.cf1.qc,'DOUBLE_BE')) from hbase.web_initial");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
	}

	public static void max() throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.drill.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:drill:zk= master.hadoop:2181/drill/drillbits");
		Statement st = connection.createStatement();
		ResultSet rs = st
				.executeQuery("SELECT max(CONVERT_FROM(web_initial.cf1.qc,'DOUBLE_BE')) from hbase.web_initial");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
	}

	public static void min() throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.drill.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:drill:zk= master.hadoop:2181/drill/drillbits");
		Statement st = connection.createStatement();
		ResultSet rs = st
				.executeQuery("SELECT min(CONVERT_FROM(web_initial.cf1.qc,'DOUBLE_BE')) from hbase.web_initial");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
	}
}
