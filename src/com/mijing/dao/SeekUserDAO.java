package com.mijing.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mijing.bean.SeekUser;

/**
 * A data access object (DAO) providing persistence and search support for
 * SeekUser entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.mijing.bean.SeekUser
 * @author MyEclipse Persistence Tools
 */
public class SeekUserDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(SeekUserDAO.class);
	// property constants
	public static final String PASSWORD = "password";
	public static final String HEAD_IMG = "headImg";
	public static final String BACKGROUND = "background";
	public static final String SIGN = "sign";
	public static final String NICKNAME = "nickname";
	public static final String BIRTHDAY = "birthday";
	public static final String SEX = "sex";
	public static final String ADDRESS_ID = "addressId";
	public static final String EDUCATION = "education";

	public void save(SeekUser transientInstance) {
		log.debug("saving SeekUser instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SeekUser persistentInstance) {
		log.debug("deleting SeekUser instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SeekUser findById(java.lang.String id) {
		log.debug("getting SeekUser instance with id: " + id);
		try {
			SeekUser instance = (SeekUser) getSession().get(
					"com.mijing.bean.SeekUser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SeekUser instance) {
		log.debug("finding SeekUser instance by example");
		try {
			List results = getSession()
					.createCriteria("com.mijing.bean.SeekUser")
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
		log.debug("finding SeekUser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SeekUser as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByHeadImg(Object headImg) {
		return findByProperty(HEAD_IMG, headImg);
	}

	public List findByBackground(Object background) {
		return findByProperty(BACKGROUND, background);
	}

	public List findBySign(Object sign) {
		return findByProperty(SIGN, sign);
	}

	public List findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List findByBirthday(Object birthday) {
		return findByProperty(BIRTHDAY, birthday);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByAddressId(Object addressId) {
		return findByProperty(ADDRESS_ID, addressId);
	}

	public List findByEducation(Object education) {
		return findByProperty(EDUCATION, education);
	}

	public List findAll() {
		log.debug("finding all SeekUser instances");
		try {
			String queryString = "from SeekUser";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SeekUser merge(SeekUser detachedInstance) {
		log.debug("merging SeekUser instance");
		try {
			SeekUser result = (SeekUser) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SeekUser instance) {
		log.debug("attaching dirty SeekUser instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SeekUser instance) {
		log.debug("attaching clean SeekUser instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}