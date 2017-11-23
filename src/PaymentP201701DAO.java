
// default package

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * PaymentP201701 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see .PaymentP201701
 * @author MyEclipse Persistence Tools
 */
public class PaymentP201701DAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(PaymentP201701DAO.class);
	// property constants

	public void save(PaymentP201701 transientInstance) {
		log.debug("saving PaymentP201701 instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PaymentP201701 persistentInstance) {
		log.debug("deleting PaymentP201701 instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PaymentP201701 findById(PaymentP201701Id id) {
		log.debug("getting PaymentP201701 instance with id: " + id);
		try {
			PaymentP201701 instance = (PaymentP201701) getSession().get("PaymentP201701", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<PaymentP201701> findByExample(PaymentP201701 instance) {
		log.debug("finding PaymentP201701 instance by example");
		try {
			List<PaymentP201701> results = (List<PaymentP201701>) getSession().createCriteria("PaymentP201701")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PaymentP201701 instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PaymentP201701 as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PaymentP201701 instances");
		try {
			String queryString = "from PaymentP201701";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PaymentP201701 merge(PaymentP201701 detachedInstance) {
		log.debug("merging PaymentP201701 instance");
		try {
			PaymentP201701 result = (PaymentP201701) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PaymentP201701 instance) {
		log.debug("attaching dirty PaymentP201701 instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PaymentP201701 instance) {
		log.debug("attaching clean PaymentP201701 instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}