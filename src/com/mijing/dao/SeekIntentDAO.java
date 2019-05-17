package com.mijing.dao;

import com.mijing.bean.SeekIntent;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * SeekIntent entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.mijing.bean.SeekIntent
 * @author MyEclipse Persistence Tools
 */
public class SeekIntentDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(SeekIntentDAO.class);
	// property constants
	public static final String INTENT_CTX = "intentCtx";

	public void save(SeekIntent transientInstance) {
		log.debug("saving SeekIntent instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SeekIntent persistentInstance) {
		log.debug("deleting SeekIntent instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SeekIntent findById(java.lang.String id) {
		log.debug("getting SeekIntent instance with id: " + id);
		try {
			SeekIntent instance = (SeekIntent) getSession().get(
					"com.mijing.bean.SeekIntent", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SeekIntent instance) {
		log.debug("finding SeekIntent instance by example");
		try {
			List results = getSession()
					.createCriteria("com.mijing.bean.SeekIntent")
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
		log.debug("finding SeekIntent instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SeekIntent as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIntentCtx(Object intentCtx) {
		return findByProperty(INTENT_CTX, intentCtx);
	}

	public List findAll() {
		log.debug("finding all SeekIntent instances");
		try {
			String queryString = "from SeekIntent";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SeekIntent merge(SeekIntent detachedInstance) {
		log.debug("merging SeekIntent instance");
		try {
			SeekIntent result = (SeekIntent) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SeekIntent instance) {
		log.debug("attaching dirty SeekIntent instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SeekIntent instance) {
		log.debug("attaching clean SeekIntent instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}