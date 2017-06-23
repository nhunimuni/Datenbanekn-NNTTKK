package info.goolap.beuth.jdbc.Storage.Teilnahme_DataAccessObject;
import java.util.HashMap;

/**
 * Created by nhunimuni on 22.06.17.
 */
public class Teilnahme_Storage {

    private String teilnehmerin;
    private int platzierung;
    private HashMap<String, Integer> liste;


    public Teilnahme_Storage(String teilnehmerin, int platzierung, HashMap<String, Integer> liste) {
        this.teilnehmerin = teilnehmerin;
        this.platzierung = platzierung;
        this.liste = liste;
    }

    public String getTeilnehmerin() {
        return teilnehmerin;
    }

    public void setTeilnehmerin(String teilnehmerin) {
        this.teilnehmerin = teilnehmerin;
    }

    public int getPlatzierung() {
        return platzierung;
    }

    public void setPlatzierung(int platzierung) {
        this.platzierung = platzierung;
    }

    public HashMap<String, Integer> getListe() {
        return liste;
    }

    public void setListe(HashMap<String, Integer> liste) {
        this.liste = liste;
    }
}
