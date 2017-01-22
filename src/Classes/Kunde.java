package Classes;

import javax.persistence.*;
import java.io.Serializable;
import Classes.Bestellung;
import java.util.*;

@Entity
public class Kunde implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "kundenNummer")
    private Long kundenNummer;
    @Column(name = "vorname")
    private String vorname;
    @Column(name = "nachname")
    private String nachname;
    @Column(name = "geburtsdatum")
    private int geburtsdatum;

    //Ein Kunde kann mehrere Bestellungen haben:
    @OneToMany(mappedBy="kunde")
    public Set<Bestellung> bestellungen;

    public Kunde(String vorname, String nachname, int geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }

    public Kunde() {
    }

    public Long getKundenNummer() {
        return kundenNummer;
    }

    public void setId(Long id) {
        kundenNummer = kundenNummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String name) {
        this.vorname = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String email) {
        this.nachname = email;
    }

    public int getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(int geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "Kunden Nummer=" + kundenNummer +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                '}';
    }
}
