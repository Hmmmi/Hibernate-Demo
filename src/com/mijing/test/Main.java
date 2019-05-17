package com.mijing.test;

import java.util.Iterator;
import java.util.List;

import com.mijing.bean.*;
import com.mijing.dao.SeekFriendDAO;
import com.mijing.dao.SeekUserDAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mijing.factory.HibernateSessionFactory;

public class Main {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	public void init() {
		sessionFactory = HibernateSessionFactory.getSessionFactory();
		session = sessionFactory.openSession();
		transaction = (Transaction) session.beginTransaction();
	}

	public void destory() {
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	public void showUser() {
		SeekUserDAO userDAO = new SeekUserDAO();
		List<SeekUser> list = userDAO.findAll();
		Iterator<SeekUser> iterator = list.iterator();
		while(iterator.hasNext()){
			SeekUser user = iterator.next();
			System.out.println(user);
		}
	}
	
	public void showFriend() {
		SeekFriendDAO friendDAO = new SeekFriendDAO();
		List<SeekFriend> list = friendDAO.findAll();
		Iterator<SeekFriend> iterator = list.iterator();
		while(iterator.hasNext()){
			SeekFriend friend = iterator.next();
			System.out.println(friend);
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
		
		main.showFriend();
		
//		main.session.save(s1);
		main.destory();
	}
	
	

}
