package Assignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Load Image from resources folder
        Image image = new Image(getClass().getResourceAsStream("pcps.png"));

        // Create ImageView
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200); // Resize width
        imageView.setPreserveRatio(true); // Maintain aspect ratio

        // Create a layout
        StackPane root = new StackPane(imageView);

        // Set the scene
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("JavaFX Image Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
