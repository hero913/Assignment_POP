package Assignment;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class UserLoginWindow extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 300); // Set scene dimensions
        primaryStage.setScene(scene);
        primaryStage.setTitle("User Login Window");
        primaryStage.setAlwaysOnTop(true);

        // Load the image
        Image image = new Image(getClass().getResourceAsStream("lib.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(400); // Set desired width
        imageView.setFitHeight(300);
       // imageView.setPreserveRatio(true);
        imageView.relocate(0, 0); // Position the image

        Label lblTitle = new Label("User Login Window");
        lblTitle.setFont(new Font("Times New Roman", 35));
        lblTitle.relocate(50, 30);

        Label lblUser = new Label("User:");
        lblUser.setFont(new Font("Times New Roman", 18));
        lblUser.relocate(30, 120);

        TextField txtUser = new TextField();
        txtUser.relocate(120, 115);

        Label lblPassword = new Label("Password:");
        lblPassword.setFont(new Font("Times New Roman", 18));
        lblPassword.relocate(30, 170);

        PasswordField txtPassword = new PasswordField();
        txtPassword.relocate(120, 165);

        Button btnLogin = new Button("Login");
        btnLogin.relocate(125, 240);

        Button btnClose = new Button("Close");
        btnClose.relocate(225, 240);
        
        //Label lblMessage = new Label();

        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
			public void handle(ActionEvent arg0) {
        		
        
           // if (txtUser.getText().isEmpty() || txtPassword.getText().isEmpty()) {
                //lblMessage.setText("Username and Password cannot be empty!");
                //lblMessage.setTextFill(Paint.valueOf("red"));
                //lblMessage.setVisible(true);
            //} else {
                //lblMessage.setText("Login successful!");
                //lblMessage.setTextFill(Paint.valueOf("green"));
                //lblMessage.setVisible(true);
        
        // Open User Dashboard Window
        UserDashboardWindow dashboard = new UserDashboardWindow();
        Stage dashboardStage = new Stage();
        try {
            dashboard.start(dashboardStage);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            }
			
        	} );		
		
        
        lblTitle.setStyle("-fx-font-weight: bold; -fx-text-fill: White;"); // Bold & White text
        lblUser.setStyle("-fx-font-weight: bold; -fx-text-fill: white;");   // Bold & White text
        lblPassword.setStyle("-fx-font-weight: bold; -fx-text-fill: white;"); // Bold & White text
        
        
        
        pane.getChildren().addAll(imageView, lblTitle, lblUser, txtUser, lblPassword, txtPassword, btnLogin, btnClose);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
