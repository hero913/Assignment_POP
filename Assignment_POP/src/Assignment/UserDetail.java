package Assignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class UserDetail extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setResizable(false);
		GridPane pane = new GridPane();
		pane.setHgap(20);
		pane.setVgap(20);
		
		primaryStage.setTitle("User Detail");
		primaryStage.setWidth(377);
		primaryStage.setHeight(330);
		primaryStage.setAlwaysOnTop(true);
        
		Label lblUID, lblNAME, lblADDRESS, lblEMAIL,lblLOGIN, lblPASSWORD;
		
		Button btnClose;
		
		
		lblUID = new Label("UID");
		lblNAME = new Label("NAME");
		lblADDRESS = new Label("ADDRESS");
		lblEMAIL = new Label("EMAIL");
		lblLOGIN = new Label("LOGIN");
		lblPASSWORD = new Label("PASSWORD");
		
		btnClose = new Button("Close");
		
		pane.add(lblUID, 0, 1);
		pane.add(new Label(), 1, 1);
		pane.add(lblNAME,0, 3);
		pane.add(new Label(), 1, 3);
		pane.add(lblADDRESS, 0, 0);
		pane.add(new Label(), 1, 1);
		pane.add(lblEMAIL, 1, 0);
		pane.add(new Label(), 0, 4);
		pane.add(lblLOGIN, 0, 0);
		pane.add(new Label(), 1, 2);
		pane.add(lblPASSWORD, 0, 0);
		pane.add(new Label(), 0, 4);
		pane.add(btnClose, 1, 5);
		pane.add(new Label(), 1, 6);
		
		/*
		flowPane.getChildren().add(lblUser);
		flowPane.getChildren().add(txtUser);
		flowPane.getChildren().add(lblPassword);
		flowPane.getChildren().add(txtPassword);
		flowPane.getChildren().add(btnLogin);
		flowPane.getChildren().add(btnClose);
		flowPane.getChildren().add(lblMessage);
		*/
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args); //call start method
	}
}
