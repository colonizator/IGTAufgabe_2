package Classes;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Mike on 21.01.2017.
 */

@Entity
@Table(name="bestellung")
public class Bestellung implements Serializable {

    @Column(name = "kundenNummer")
    private Long kundenNummer;

    @Id
    @GeneratedValue
    @Column(name = "bestellungsNummer")
    private int bestellungsNummer;

    @Column(name = "bestellungsDatum")
    private int bestellungsDatum;

    // Ein Kunde kann mehrere Bestellungen machen.
    @ManyToOne
    @JoinColumn(name = "kundenNummer", referencedColumnName = "kundenNummer", insertable = false, updatable = false)
    private Kunde kunde;

    public Bestellung(Long kundenNummer, int bestellungsDatum, Kunde kunde) {
        this.kundenNummer = kundenNummer;
        this.bestellungsDatum = bestellungsDatum;
        this.kunde = kunde;
    }

    public Bestellung(int bestellungsDatum) {
        this.bestellungsDatum = bestellungsDatum;
    }

    public Bestellung() {
    }

    public Long getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(Long kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public int getBestellungsNummer() {
        return bestellungsNummer;
    }

    public void setBestellungsNummer(int bestellungsNummer) {
        this.bestellungsNummer = bestellungsNummer;
    }

    public int getBestellungsDatum() {
        return bestellungsDatum;
    }

    public void setBestellungsDatum(int bestellungsDatum) {
        this.bestellungsDatum = bestellungsDatum;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "kundenNummer=" + kundenNummer +
                ", bestellungsNummer=" + bestellungsNummer +
                ", bestellungsDatum=" + bestellungsDatum +
                ", kunde=" + kunde +
                '}';
    }
}
