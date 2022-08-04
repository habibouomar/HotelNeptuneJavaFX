import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

	  @FXML
	    private Button id_chambres;

	    @FXML
	    private Button id_contact;

	    @FXML
	    private Button id_login;

	    @FXML
	    private Button id_quisommesnous;

	    @FXML
	    private Button id_signup;
	    
	    
	    @FXML
		public void clickQuiSommesNous(ActionEvent e) {
			
			Main.set_pane(1);
		}
	    
		@FXML
		public void clickContact(ActionEvent e) {
			
			Main.set_pane(2);
		}
		
		@FXML
		public void clickChambres(ActionEvent e) {
			
			Main.set_pane(0);
		}
		
		@FXML
		public void clickLogin(ActionEvent e) {
			
			Main.set_pane(0);
		}
		
		@FXML
		public void clickSignUp(ActionEvent e) {
			
			Main.set_pane(0);
		}
		
		
}
