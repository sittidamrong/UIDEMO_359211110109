package sample;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    private loginModel loginModel = new loginModel();


    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private Label dtnlogin;

    @FXML
    private Label loginStatus;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (this.loginModel.isDatabaseConnection()){
            this.dbStatus.setText("connected to db");
        }else{
            this.dbStatus.setText("Not  connect to db");
        }

    }///initialize
    @FXML
    private Label loginStatus;



}
}//class
