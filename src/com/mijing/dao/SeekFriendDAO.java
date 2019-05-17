package com.mijing.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mijing.bean.SeekFriend;
import com.mijing.bean.SeekFriendId;

/**
 * A data access object (DAO) providing persistence and search support for
 * SeekFriend entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.mijing.bean.SeekFriend
 * @author MyEclipse Persistence Tools
 */
public class SeekFriendDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(SeekFriendDAO.class);
	// property constants
	public static final String FRIEND_LABEL = "friendLabel";
	public static final String ADD_TIME = "addTime";

	public void save(SeekFriend transientInstance) {
		log.debug("saving SeekFriend instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SeekFriend persistentInstance) {
		log.debug("deleting SeekFriend instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SeekFriend findById(com.mijing.bean.SeekFriendId id) {
		log.debug("getting SeekFriend instance with id: " + id);
		try {
			SeekFriend instance = (SeekFriend) getSession().get(
					"com.mijing.bean.SeekFriend", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SeekFriend instance) {
		log.debug("finding SeekFriend instance by example");
		try {
			List results = getSession()
					.createCriteria("com.mijing.bean.SeekFriend")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding SeekFriend instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SeekFriend as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFriendLabel(Object friendLabel) {
		return findByProperty(FRIEND_LABEL, friendLabel);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findAll() {
		log.debug("finding all SeekFriend instances");
		try {
			String queryString = "from SeekFriend";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SeekFriend merge(SeekFriend detachedInstance) {
		log.debug("merging SeekFriend instance");
		try {
			SeekFriend result = (SeekFriend) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SeekFriend instance) {
		log.debug("attaching dirty SeekFriend instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SeekFriend instance) {
		log.debug("attaching clean SeekFriend instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}