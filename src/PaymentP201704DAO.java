
// default package

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * PaymentP201704 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see .PaymentP201704
 * @author MyEclipse Persistence Tools
 */
public class PaymentP201704DAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(PaymentP201704DAO.class);
	// property constants

	public void save(PaymentP201704 transientInstance) {
		log.debug("saving PaymentP201704 instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PaymentP201704 persistentInstance) {
		log.debug("deleting PaymentP201704 instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PaymentP201704 findById(PaymentP201704Id id) {
		log.debug("getting PaymentP201704 instance with id: " + id);
		try {
			PaymentP201704 instance = (PaymentP201704) getSession().get("PaymentP201704", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<PaymentP201704> findByExample(PaymentP201704 instance) {
		log.debug("finding PaymentP201704 instance by example");
		try {
			List<PaymentP201704> results = (List<PaymentP201704>) getSession().createCriteria("PaymentP201704")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PaymentP201704 instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PaymentP201704 as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PaymentP201704 instances");
		try {
			String queryString = "from PaymentP201704";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PaymentP201704 merge(PaymentP201704 detachedInstance) {
		log.debug("merging PaymentP201704 instance");
		try {
			PaymentP201704 result = (PaymentP201704) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PaymentP201704 instance) {
		log.debug("attaching dirty PaymentP201704 instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PaymentP201704 instance) {
		log.debug("attaching clean PaymentP201704 instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}