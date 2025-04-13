package Assignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class UserDashboardWindow extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setResizable(false);
		Pane pane = new Pane();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("User Dashboard Window");
		primaryStage.setWidth(330);
		primaryStage.setHeight(370);
		primaryStage.setAlwaysOnTop(true);
        
		Label lblTitle, lblMessage;
		
		Button btnNew_User, btnEdit_User, btnDelete_User, btnAll_Users;
		
		lblTitle = new Label("User Dashboard Window");
		lblTitle.relocate(20, 0);
		pane.getChildren().add(lblTitle);
		
		//Face, Size, and Style for Title 
		Font font1 = new Font("Arial",25);
		lblTitle.setFont(font1);
		
		
		//1.New User
		btnNew_User = new Button("New User");
		btnNew_User.relocate(30,60);
		pane.getChildren().add(btnNew_User);
		
		//Face, Size, and Style for New User
		Font font2 = new Font("Arial",15);
		btnNew_User.setFont(font2);
		
		
		//2.Edit User
		btnEdit_User = new Button("Edit User");
		btnEdit_User.relocate(30, 110);
		pane.getChildren().add(btnEdit_User);
		
		//Face, Size, and Style for Edit User
		Font font3 = new Font("Arial",15);
		btnEdit_User.setFont(font3);
		
		
		//3.Delete User
		btnDelete_User = new Button("Delete User");
		btnDelete_User.relocate(30, 160);
		pane.getChildren().add(btnDelete_User);
		
		//Face, Size, and Style for Delete User
		Font font4 = new Font("Arial",15);
		btnDelete_User.setFont(font4);
		
		
		//4.All Users
		btnAll_Users = new Button("All Users");
		btnAll_Users.relocate(30, 210);
		pane.getChildren().add(btnAll_Users);
		
		//Face, Size, and Style for All Users
		Font font5 = new Font("Arial",15);
		btnAll_Users.setFont(font5);
		
		lblMessage = new Label("Error Message");
		
		lblMessage.relocate(30, 270);
		pane.getChildren().add(lblMessage);
		Font font6 = new Font("COPPERPLATE GOTHIC LIGHT",15);
		lblMessage.setFont(font6);
		
		
		
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args); //call start method
	}
}
