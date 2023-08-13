package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TerminoController {
	private Parent root;
	private Scene scene;
	private Stage stage;

	@FXML
	TextField anioText;
	@FXML
	TextField termText;

	public void back(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Configuraciones.fxml"));
		root = loader.load();

		stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void goAddTerm(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AddTerm.fxml"));
		root = loader.load();

		stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	public void sendTermino(ActionEvent event) {
		String anio = anioText.getText();
		String term = termText.getText();
		int anioNum = Integer.parseInt(anio);
		int termNum = Integer.parseInt(term);

		Configuracion conf = new Configuracion();
		conf.addTermino(anioNum, termNum);

	}

}
