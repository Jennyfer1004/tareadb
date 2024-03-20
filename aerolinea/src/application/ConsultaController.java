package application;

import java.sql.SQLException;
import java.util.LinkedList;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

public class ConsultaController {
	@FXML
	private Button consultarBtn;
	@FXML
	public TextField CodigoTxt;
	@FXML
	private TextField nombreTextfiled;
	@FXML
	private TextField ValorTextfield;

	// Event Listener on Button[#consultarBtn].onMouseClicked
	@FXML
	public void consultarController(MouseEvent event) throws SQLException {
		DataBase db = new DataBase();
		LinkedList<String> data = db.getAdminInfo(CodigoTxt.getText());
		nombreTextfiled.setText(data.get(1));
		ValorTextfield.setText(data.get(2));
		
		
	}
}
