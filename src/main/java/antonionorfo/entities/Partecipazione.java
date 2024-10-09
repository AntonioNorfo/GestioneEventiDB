package antonionorfo.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table
public class Partecipazione {
    @Id
    @GeneratedValue
    @Column(name = "id_partecipazione")
    private UUID id_partecipazione;

    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona nome_persona;

    @ManyToOne
    @JoinColumn(name = "id_evento", nullable = false)
    private Evento nome_evento;

    @Enumerated(EnumType.STRING)
    @Column(name = "stato_partecipazione")
    private Stato stato;

    public UUID getId_partecipazione() {
        return id_partecipazione;
    }

    public void setId_partecipazione(UUID id_partecipazione) {
        this.id_partecipazione = id_partecipazione;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Evento getNome_evento() {
        return nome_evento;
    }

    public void setNome_evento(Evento nome_evento) {
        this.nome_evento = nome_evento;
    }

    public Persona getNome_persona() {
        return nome_persona;
    }

    public void setNome_persona(Persona nome_persona) {
        this.nome_persona = nome_persona;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id_partecipazione=" + id_partecipazione +
                ", nome_persona=" + nome_persona +
                ", nome_evento=" + nome_evento +
                ", stato=" + stato +
                '}';
    }
}
