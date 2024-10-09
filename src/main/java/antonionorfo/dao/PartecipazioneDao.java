package antonionorfo.dao;

import antonionorfo.entities.Partecipazione;
import jakarta.persistence.EntityManager;

import java.util.UUID;

public class PartecipazioneDao {

    private final EntityManager em;

    public PartecipazioneDao(EntityManager em) {
        this.em = em;
    }

    public void save(Partecipazione partecipazione) {
        em.getTransaction().begin();
        em.persist(partecipazione);
        em.getTransaction().commit();
    }

    public Partecipazione findById(UUID id) {
        return em.find(Partecipazione.class, id);
    }

    public void deleteById(UUID id) {
        em.getTransaction().begin();
        Partecipazione partecipazione = findById(id);
        if (partecipazione != null) {
            em.remove(partecipazione);
        }
        em.getTransaction().commit();
    }
}
