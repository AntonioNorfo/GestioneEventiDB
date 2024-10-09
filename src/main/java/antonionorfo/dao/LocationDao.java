package antonionorfo.dao;

import antonionorfo.entities.Location;
import jakarta.persistence.EntityManager;

import java.util.UUID;

public class LocationDao {

    private final EntityManager em;

    public LocationDao(EntityManager em) {
        this.em = em;
    }

    public void save(Location location) {
        em.getTransaction().begin();
        em.persist(location);
        em.getTransaction().commit();
    }

    public Location findById(UUID id) {
        return em.find(Location.class, id);
    }

    public void deleteById(UUID id) {
        em.getTransaction().begin();
        Location location = findById(id);
        if (location != null) {
            em.remove(location);
        }
        em.getTransaction().commit();
    }
}
