package Classes;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by Mike on 21.01.2017.
 */

@Entity
@Table(name="ware")
public class Ware implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="wareNummer")
    private int wareNummer;

    @Column(name="bezeichnung")
    private String bezeichnung;

    @Column(name="preis")
    private int preis;

    public Ware(String bezeichnung, int preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public Ware() {
    }

    public int getWareNummer() {
        return wareNummer;
    }

    public void setWareNummer(int ware_Nummer) {
        this.wareNummer = ware_Nummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Ware{" +
                "Ware Nummer=" + wareNummer +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", preis=" + preis +
                '}';
    }
}
