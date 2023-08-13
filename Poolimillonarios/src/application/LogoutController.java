package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LogoutController {

	private Stage stage;
	@FXML
	private AnchorPane sceneMain;

	private Parent root;
	private Scene scene;

	public void goConf(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Configuraciones.fxml"));
		root = loader.load();
		stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	public void logout(ActionEvent event) {

		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You're about to logout!");
		alert.setContentText("Do you want to save before exiting?: ");

		if (alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) sceneMain.getScene().getWindow();// Para escoger el stage en el cual se trabaja actualmente
			System.out.println("You Successfully Logged out!");
			stage.close();
		}

	}

}
