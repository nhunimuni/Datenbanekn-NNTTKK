package sample;

import database.DB_Con;
import database.SQL_States;
import database.ViewHelper;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Button aufg1;
    public Button aufg2;
    public Button aufg3;
    public Button aufg4;
    public Button aufg5;
    public Button aufg6;
    public Button aufg7;
    public Button aufg8;
    public Button aufg9;

    DB_Con db_con;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        db_con = new DB_Con();
        try {
            db_con.openDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        aufg1.setOnAction(event -> exeAufg1());
        aufg2.setOnAction(event -> exeAufg2());
        aufg3.setOnAction(event -> exeAufg3());
        aufg4.setOnAction(event -> exeAufg4());
        aufg5.setOnAction(event -> exeAufg5());
        aufg6.setOnAction(event -> exeAufg6());
        aufg7.setOnAction(event -> exeAufg7());
        aufg8.setOnAction(event -> exeAufg8());
        aufg9.setOnAction(event -> exeAufg9());
    }

    private void exeAufg9() {

    }

    private void exeAufg8() {
        db_con.print(SQL_States.CLICKS_PER_MONTHS);
        ViewHelper.showError(db_con.getList(),
                "Welche Teilnehmerinnen wurden vor der Verleihung am meisten gesucht?",
                "Month",
                "Clicks",
                "Clicks per Month");
    }

    private void exeAufg7() {

    }

    private void exeAufg6() {
    }

    private void exeAufg5() {

    }

    private void exeAufg4() {

    }

    private void exeAufg3() {

    }

    private void exeAufg2() {
        db_con.print(SQL_States.CLICKS_PER_MONTHS);
        ViewHelper.showError(db_con.getList(),
                "Wie häufig wurde nach dem „Miss USA“ Wettbewerb gesucht zwischen März und Ende Mai?",
                "Month",
                "Clicks",
                "Clicks per Month");
    }

    private void exeAufg1() {
        System.out.println("test1");
    }
}
