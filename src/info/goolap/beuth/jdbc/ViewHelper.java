package database;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Die Klasse ViewHelper besitzt statische Methoden für das Anzeigen von GUI-Elementen
 * in einen zusaetzlichen Fenster.
 *
 * @author beuth
 */
public class ViewHelper {

    /**
     * Oeffnet ein Fenster in dem die Fehlermeldung angezeigt wird.
     *
     * @param list
     */
    public static void showError(HashMap<String, Integer> list, String q, String xName, String yName, String seriesName) {
        URL location = new ViewHelper().getClass().getResource("chartView.fxml");
        Initializable controller = new ChartViewController(list, q, xName, yName, seriesName);
        showView(controller, location);
    }

    /**
     * Laedt eine neue Scene in einer Stage mit dem übergebenen Controller und
     * dem übergebenen FXML-Dokument
     *
     * @param controller Der für die GUI zu verwendende Controller
     * @param location   Die URL der FXML-Datei mit der GUI-Beschreibung
     */
    public static void showView(Initializable controller, URL location) {
        Stage editStage = new Stage(StageStyle.UTILITY);
        editStage.setTitle("");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        fxmlLoader.setController(controller);
        try {
            Pane myPane = (Pane) fxmlLoader.load();
            Scene myScene = new Scene(myPane);
            editStage.setScene(myScene);
            editStage.show();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
