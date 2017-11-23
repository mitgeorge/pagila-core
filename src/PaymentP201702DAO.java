
// default package

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * PaymentP201702 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see .PaymentP201702
 * @author MyEclipse Persistence Tools
 */
public class PaymentP201702DAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(PaymentP201702DAO.class);
	// property constants

	public void save(PaymentP201702 transientInstance) {
		log.debug("saving PaymentP201702 instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PaymentP201702 persistentInstance) {
		log.debug("deleting PaymentP201702 instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PaymentP201702 findById(PaymentP201702Id id) {
		log.debug("getting PaymentP201702 instance with id: " + id);
		try {
			PaymentP201702 instance = (PaymentP201702) getSession().get("PaymentP201702", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<PaymentP201702> findByExample(PaymentP201702 instance) {
		log.debug("finding PaymentP201702 instance by example");
		try {
			List<PaymentP201702> results = (List<PaymentP201702>) getSession().createCriteria("PaymentP201702")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PaymentP201702 instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PaymentP201702 as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PaymentP201702 instances");
		try {
			String queryString = "from PaymentP201702";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PaymentP201702 merge(PaymentP201702 detachedInstance) {
		log.debug("merging PaymentP201702 instance");
		try {
			PaymentP201702 result = (PaymentP201702) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PaymentP201702 instance) {
		log.debug("attaching dirty PaymentP201702 instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PaymentP201702 instance) {
		log.debug("attaching clean PaymentP201702 instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}