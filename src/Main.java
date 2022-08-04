import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	static AnchorPane root;
	
	static List<AnchorPane> anchor1 = new ArrayList<AnchorPane>();
	private static int id_cur=0;
	
    @Override
    public void start(Stage primaryStage) {
      
    	try {
   		 root=(AnchorPane)FXMLLoader.load(getClass().getResource("Anchorpane.fxml"));
   		
       	 //primaryStage.setTitle("Hotel Neptune JavaFX");
       	 anchor1.add((AnchorPane)FXMLLoader.load(getClass().getResource("HotelNeptune.fxml")));
       	 anchor1.add((AnchorPane)FXMLLoader.load(getClass().getResource("Admin.fxml")));
       	 //HotelNeptune.fxml
       	 //Parent root = FXMLLoader.load(getClass().getResource("Chambre.fxml"));
       	 root.getChildren().add(anchor1.get(0));
			 Scene scene = new Scene(root, 600 ,465); 
			 
			 
			 primaryStage.setScene(scene);
			 primaryStage.show();
           
       } catch(Exception e) {
           e.printStackTrace();
       }
   }
  /* private void init_app()
   {
   	for(int i=0;i<anchor1.size();i++)
   	{
   		
   	}
   }*/
   
   public static void main(String[] args) {
       launch(args);
   }
   public static AnchorPane get_pane(int id)
   {
	return anchor1.get(id);
   }

	public static void set_pane(int id) {
		root.getChildren().remove(anchor1.get(id_cur));
		root.getChildren().add(anchor1.get(id));
		id_cur =id;
		//System.out.println("id"+id);
		
	}
}