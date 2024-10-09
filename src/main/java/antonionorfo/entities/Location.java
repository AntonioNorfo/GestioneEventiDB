package antonionorfo.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table
public class Location {
    @Id
    @Column(name = "id_location")
    private UUID id_location;
    @Column(name = "nome_location", nullable = false)
    private String nome;
    @Column(name = "citta_location", nullable = false)
    private String citta;

    @OneToMany(mappedBy = "location")
    private List<Evento> eventi;

    public UUID getId_location() {
        return id_location;
    }

    public void setId_location(UUID id_location) {
        this.id_location = id_location;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public List<Evento> getEventi() {
        return eventi;
    }

    public void setEventi(List<Evento> eventi) {
        this.eventi = eventi;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id_location=" + id_location +
                ", nome='" + nome + '\'' +
                ", citta='" + citta + '\'' +
                ", eventi=" + eventi +
                '}';
    }
}
