
// default package

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * PaymentP201705 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see .PaymentP201705
 * @author MyEclipse Persistence Tools
 */
public class PaymentP201705DAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(PaymentP201705DAO.class);
	// property constants

	public void save(PaymentP201705 transientInstance) {
		log.debug("saving PaymentP201705 instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PaymentP201705 persistentInstance) {
		log.debug("deleting PaymentP201705 instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PaymentP201705 findById(PaymentP201705Id id) {
		log.debug("getting PaymentP201705 instance with id: " + id);
		try {
			PaymentP201705 instance = (PaymentP201705) getSession().get("PaymentP201705", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<PaymentP201705> findByExample(PaymentP201705 instance) {
		log.debug("finding PaymentP201705 instance by example");
		try {
			List<PaymentP201705> results = (List<PaymentP201705>) getSession().createCriteria("PaymentP201705")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PaymentP201705 instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PaymentP201705 as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PaymentP201705 instances");
		try {
			String queryString = "from PaymentP201705";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PaymentP201705 merge(PaymentP201705 detachedInstance) {
		log.debug("merging PaymentP201705 instance");
		try {
			PaymentP201705 result = (PaymentP201705) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PaymentP201705 instance) {
		log.debug("attaching dirty PaymentP201705 instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PaymentP201705 instance) {
		log.debug("attaching clean PaymentP201705 instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}