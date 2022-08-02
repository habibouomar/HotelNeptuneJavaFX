import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
    @Override
    public void start(Stage primaryStage) {
      
    	try {
    		
        	 primaryStage.setTitle("Hotel Neptune JavaFX");
        	 Parent root = FXMLLoader.load(getClass().getResource("HotelNeptune.fxml"));
			 Scene scene = new Scene(root, 600, 700); 
			 primaryStage.setScene(scene);
			 primaryStage.show();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}