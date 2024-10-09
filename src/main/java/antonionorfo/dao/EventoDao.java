package antonionorfo.dao;

import antonionorfo.entities.Evento;
import jakarta.persistence.EntityManager;

public class EventoDao {

    private final EntityManager em;

    public EventoDao(EntityManager em) {
        this.em = em;
    }

    public void save(Evento evento) {
        em.getTransaction().begin();
        em.persist(evento); // .add
        em.getTransaction().commit();
    }

    public Evento findById(long id) {
        return em.find(Evento.class, id);
    }

    public void deleteById(long id) {
        em.getTransaction().begin();
        Evento evento = findById(id);
        if (evento != null) {
            em.remove(evento);
        }
        em.getTransaction().commit();
    }
}
