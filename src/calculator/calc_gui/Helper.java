package calc_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller class called Helper for helper.fxml
 */
public class Helper implements Initializable {

    @FXML
    private AnchorPane children_pane;

    @FXML
    public void Button_unclick(ActionEvent actionEvent) throws Exception{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        children_pane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
