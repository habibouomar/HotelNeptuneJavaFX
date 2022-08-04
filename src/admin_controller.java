import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mysql.cj.protocol.Resultset;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class admin_controller implements Initializable {
	 	@FXML
	    private Button Ajouter;

	    @FXML
	    private Button chambre;

	    @FXML
	    private Button client;

	    @FXML
	    private Button home;

	    @FXML
	    private Button mod;

	    @FXML
	    private Button paiement;

	    @FXML
	    private Button recherche;

	    @FXML
	    private Button reserve;

	    @FXML
	    private Button supp;

	    @FXML
	    private TextField textrecherche;
	    @FXML
	    private TextField textfield;
	    
	    /*public void button_client(ActionEvent e) {
	    	Main.set_pane(1);
	    }*/
	    public void clickhome(ActionEvent e) {
	    	Main.set_pane(0);
	    }
	    @FXML
	    public void ClickClient(ActionEvent event) throws SQLException {
	    	ConnectionClass connectnow = new ConnectionClass();
	    	Connection connectiondb = connectnow.getConnection();
	    	
	    	String sql ="SELECT prenom FROM client ";
	    	Statement statement = connectiondb.createStatement();
	    	ResultSet resultSet = statement.executeQuery(sql);
	    	//ResultSetMetaData resultmetadata = resultSet.getMetaData();
	    	 // int count = resultmetadata.getColumnCount();
	    	/*for(int i=1; i<=count ; i++)
	    	{
	    		textfield.setText(resultmetadata.getColumnClassName(i));
	    	} */
	    	while(resultSet.next()) {
	    		
				textfield.setText("prenom");
	    		
	    	}
	    	
	    }
	    	/*@Override
	    	public  initialize(URL fxmlFileLocation,ResourceBundle resources)
	    	{
	    		
	    	}*/
	    

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
	    
	
	
	
	
}
