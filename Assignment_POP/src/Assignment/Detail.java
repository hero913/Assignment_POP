package Assignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Detail extends Application {
	 @Override
	    public void start(Stage primaryStage) {
		 	//Declare
		 Button btnClose;
		 
	        // Create TableView
	        TableView<Object> table = new TableView<>();

	        // Define and add columns
	        table.getColumns().addAll(
	            new TableColumn<>("UID"),
	            new TableColumn<>("NAME"),
	            new TableColumn<>("ADDRESS"),
	            new TableColumn<>("EMAIL"),
	            new TableColumn<>("LOGIN ID"),
	            new TableColumn<>("PASSWORD")
	        );

	        btnClose = new Button("Close");
	      
	       
	        VBox layout = new VBox(10, table, btnClose);
	        Scene scene = new Scene(layout, 600, 300);

	        // Set Stage
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	    launch(args);
	    }
	}