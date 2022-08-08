import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class Main extends Application {
	
	static AnchorPane root;
	
	static List<AnchorPane> anchor1 = new ArrayList<AnchorPane>();
	
	private static int idx_cur = 0;
	
    @Override
    public void start(Stage primaryStage) {
      
    	try {		
   		 root=(AnchorPane)FXMLLoader.load(getClass().getResource("Anchorpane.fxml"));
   		
   		 primaryStage.setTitle("Hotel Neptune JavaFX");
   		
   		 anchor1.add((AnchorPane)FXMLLoader.load(getClass().getResource("HotelNeptune.fxml")));
    	 anchor1.add((AnchorPane)FXMLLoader.load(getClass().getResource("QuiSommesNous.fxml")));
    	 anchor1.add((AnchorPane)FXMLLoader.load(getClass().getResource("Contact.fxml")));
       	 anchor1.add((AnchorPane)FXMLLoader.load(getClass().getResource("Admin.fxml")));
       	 
       	 root.getChildren().add(anchor1.get(0));
			 Scene scene = new Scene(root, 630 ,600); 
			 primaryStage.setScene(scene);
			 primaryStage.show();
           
       } catch(Exception e) {
           e.printStackTrace();
       }
   }

 public static AnchorPane get_pane(int idx) {
    	
    	return anchor1.get(idx);
    }

    public static void set_pane(int idx) {
        root.getChildren().remove(anchor1.get(idx_cur));
        root.getChildren().add(anchor1.get(idx));
        idx_cur =idx;

    }
}