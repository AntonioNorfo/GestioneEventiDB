package antonionorfo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table
public class Persona {
    @Id
    @GeneratedValue
    @Column(name = "id_persona")
    private UUID id_persona;
    @Column(name = "nome_persona", nullable = false)
    private String nome;
    @Column(name = "cognome_persona", nullable = false)
    private String cognome;
    @Column(name = "email_persona")
    private String email;
    @Column(name = "data_di_nascita")
    private LocalDate dataDiNascita;
    @Enumerated(EnumType.STRING)
    @Column(name = "sesso")
    private Sesso sesso;
    @Column(name = "lista_partecipazioni")
    private String listaPartecipazioni;

    @OneToMany(mappedBy = "nome_persona")
    private List<Partecipazione> partecipazioni;

    public UUID getId_persona() {
        return id_persona;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public String getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public void setListaPartecipazioni(String listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id_persona=" + id_persona +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", sesso=" + sesso +
                ", listaPartecipazioni='" + listaPartecipazioni + '\'' +
                ", partecipazioni=" + partecipazioni +
                '}';
    }
}
