package antonionorfo.dao;

import antonionorfo.entities.Persona;
import jakarta.persistence.EntityManager;

import java.util.UUID;

public class PersonaDao {

    private final EntityManager em;

    public PersonaDao(EntityManager em) {
        this.em = em;
    }

    public void save(Persona persona) {
        em.getTransaction().begin();
        em.persist(persona);
        em.getTransaction().commit();
    }

    public Persona findById(UUID id) {
        return em.find(Persona.class, id);
    }

    public void deleteById(UUID id) {
        em.getTransaction().begin();
        Persona persona = findById(id);
        if (persona != null) {
            em.remove(persona);
        }
        em.getTransaction().commit();
    }
}
