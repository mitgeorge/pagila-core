
// default package

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * FilmActor entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see .FilmActor
 * @author MyEclipse Persistence Tools
 */
public class FilmActorDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(FilmActorDAO.class);
	// property constants

	public void save(FilmActor transientInstance) {
		log.debug("saving FilmActor instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FilmActor persistentInstance) {
		log.debug("deleting FilmActor instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FilmActor findById(FilmActorId id) {
		log.debug("getting FilmActor instance with id: " + id);
		try {
			FilmActor instance = (FilmActor) getSession().get("FilmActor", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<FilmActor> findByExample(FilmActor instance) {
		log.debug("finding FilmActor instance by example");
		try {
			List<FilmActor> results = (List<FilmActor>) getSession().createCriteria("FilmActor").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding FilmActor instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from FilmActor as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FilmActor instances");
		try {
			String queryString = "from FilmActor";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FilmActor merge(FilmActor detachedInstance) {
		log.debug("merging FilmActor instance");
		try {
			FilmActor result = (FilmActor) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FilmActor instance) {
		log.debug("attaching dirty FilmActor instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FilmActor instance) {
		log.debug("attaching clean FilmActor instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}