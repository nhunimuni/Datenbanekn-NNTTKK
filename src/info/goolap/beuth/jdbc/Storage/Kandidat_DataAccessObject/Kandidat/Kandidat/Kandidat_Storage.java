package info.goolap.beuth.jdbc.Storage.Kandidat_DataAccessObject.Kandidat.Kandidat;

/**
 * Created by nhunimuni on 22.06.17.
 */
public class Kandidat_Storage {

    private String name, staat;

    public Kandidat_Storage(String name, String staat) {
        this.name = name;
        this.staat = staat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStaat() {
        return staat;
    }

    public void setStaat(String staat) {
        this.staat = staat;
    }
}
