import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class QuiSommesNous_Controller implements Initializable{
	
    @FXML
    private Button id_Back_Home;
	
	@FXML
	public void click(ActionEvent e) {
		Main.set_pane(0);
	}

	@Override
	public void initialize(URL fxmlFileLocation, ResourceBundle ressource) {
		
	}
	
}
