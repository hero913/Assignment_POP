package Assignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class UserDelete extends Application {

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		 GridPane pane=new GridPane();
     
		 
		Scene scene=new Scene(pane);
		 primaryStage.setScene(scene);
		 pane.setHgap(8);
		 pane.setVgap(8);
		 
		 
		
		primaryStage.setTitle("Hotel Management System");
		primaryStage.setWidth(550);
		primaryStage.setHeight(600);
	    primaryStage.setAlwaysOnTop(false);
	    
	    

        Label lblTitle,lblID,lblNAME,lblADDRESS,lblEMAIL,lblLOGINID,lblPASSWORD,lblMessage;
        TextField txtUser,txtID,txtNAME,txtADDRESS,txtEMAIL,txtLOGINID,txtPASSWORD;
        PasswordField txtPassword;
        Button btnLogin,btnClose,btnSearch;
        
        lblTitle=new Label("User Delete Form");
        lblTitle.setStyle("-fx-font-size:16");
        //face,size,and style?
        Font font1=new Font("Courier New",30);
        lblTitle.setFont(font1);
        
        lblID=new Label("ID");
        lblID.setStyle("-fx-font-size:14" );
        lblNAME=new Label("NAME");
        lblNAME.setStyle("-fx-font-size:14" );
        lblADDRESS=new Label("ADDRESS");
        lblADDRESS.setStyle("-fx-font-size:14" );
        lblEMAIL=new Label("EMAIL");
        lblEMAIL.setStyle("-fx-font-size:14" );
        lblLOGINID=new Label("LOGINID");
        lblLOGINID.setStyle("-fx-font-size:14" );
        lblPASSWORD=new Label("PASSWORD");
        lblPASSWORD.setStyle("-fx-font-size:14");
        lblMessage=new Label("Error Message");
        
        
        txtUser=new TextField();
        txtID=new TextField();
        txtNAME=new TextField();
        txtADDRESS=new TextField();
        txtID=new TextField();
        txtEMAIL=new TextField();
        txtLOGINID=new PasswordField();
        txtPASSWORD=new TextField();
        
        btnLogin=new Button("Login");
        btnSearch=new Button("Search");
       
        btnClose=new Button("Close");
        btnClose.setOnAction(e -> primaryStage.close());
        
       pane.setLayoutX(50);

        
        btnLogin.setStyle("-fx-background-color: red; -fx-text-fill: white;");

        btnClose.setStyle("-fx-background-color: red; -fx-text-fill: white;");
        btnSearch.setStyle("-fx-background-color: red; -fx-text-fill: white;");
       
        
        pane.add(lblTitle,1 ,0);
		pane.add(lblID, 1, 3);
		pane.add(txtID, 1, 4);
		pane.add(lblNAME, 1, 5);
        pane.add(txtNAME, 1, 6);
        pane.add(lblADDRESS, 1, 7);
		pane.add(txtADDRESS, 1, 8);
		pane.add(lblEMAIL, 1, 9);
        pane.add(txtEMAIL, 1, 10);
        pane.add(lblLOGINID, 1, 11);
		pane.add(txtLOGINID, 1, 12);
		pane.add(lblPASSWORD, 1, 13);
        pane.add(txtPASSWORD, 1, 14);
        pane.add(btnLogin, 1, 15);
		pane.add(btnClose, 2, 15);
		pane.add(btnSearch, 2, 4);
		
       
        primaryStage.show();
        
}

public static void main(String[]args) {
launch(args);
}
	}