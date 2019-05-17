package com.mijing.dao;

import com.mijing.bean.SeekSendMsg;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * SeekSendMsg entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.mijing.bean.SeekSendMsg
 * @author MyEclipse Persistence Tools
 */
public class SeekSendMsgDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(SeekSendMsgDAO.class);
	// property constants
	public static final String RECEIVE_ID = "receiveId";
	public static final String SEND_TIME = "sendTime";
	public static final String MSG_TYPE = "msgType";
	public static final String CONTENT = "content";

	public void save(SeekSendMsg transientInstance) {
		log.debug("saving SeekSendMsg instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SeekSendMsg persistentInstance) {
		log.debug("deleting SeekSendMsg instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SeekSendMsg findById(java.lang.String id) {
		log.debug("getting SeekSendMsg instance with id: " + id);
		try {
			SeekSendMsg instance = (SeekSendMsg) getSession().get(
					"com.mijing.bean.SeekSendMsg", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SeekSendMsg instance) {
		log.debug("finding SeekSendMsg instance by example");
		try {
			List results = getSession()
					.createCriteria("com.mijing.bean.SeekSendMsg")
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
		log.debug("finding SeekSendMsg instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SeekSendMsg as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByReceiveId(Object receiveId) {
		return findByProperty(RECEIVE_ID, receiveId);
	}

	public List findBySendTime(Object sendTime) {
		return findByProperty(SEND_TIME, sendTime);
	}

	public List findByMsgType(Object msgType) {
		return findByProperty(MSG_TYPE, msgType);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findAll() {
		log.debug("finding all SeekSendMsg instances");
		try {
			String queryString = "from SeekSendMsg";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SeekSendMsg merge(SeekSendMsg detachedInstance) {
		log.debug("merging SeekSendMsg instance");
		try {
			SeekSendMsg result = (SeekSendMsg) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SeekSendMsg instance) {
		log.debug("attaching dirty SeekSendMsg instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SeekSendMsg instance) {
		log.debug("attaching clean SeekSendMsg instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}