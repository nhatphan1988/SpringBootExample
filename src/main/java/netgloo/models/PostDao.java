package netgloo.models;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by apple on 8/28/16.
 */
@Repository
@Transactional
public class PostDao {

    // ------------------------
    // PUBLIC METHODS
    // ------------------------

    /**
     * Save the user in the database.
     */
    public void create(Post post) {
        entityManager.persist(post);
        return;
    }

    // ------------------------
    // PRIVATE FIELDS
    // ------------------------

    // An EntityManager will be automatically injected from entityManagerFactory
    // setup on DatabaseConfig class.
    @PersistenceContext
    private EntityManager entityManager;
}
