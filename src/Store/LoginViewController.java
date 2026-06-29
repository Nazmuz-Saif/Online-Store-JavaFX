package Store;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class LoginViewController
{
    @FXML
    private TextField adminIdField;

    @FXML
    private TextField customerIdField;

    @FXML
    private Button adminLoginButton;

    @FXML
    private Button customerLoginButton;
    
    @FXML
    private Button SignUp;

    @FXML
    private void adminLogin(javafx.event.ActionEvent event)
    {
    	String Id = adminIdField.getText().trim();
    	if(Id.equals("Oytijjho") || Id.equals("Rifat") || Id.equals("Siam")) {
    		try 
    		{
    			Parent adminRoot = FXMLLoader.load(getClass().getResource("/View/AdminDashboard.fxml"));
    			Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    			stage.setScene(new Scene(adminRoot));
    		} 
    		catch (Exception e) 
    		{
    			e.printStackTrace();
    		}
    	}
    	else {
    		new Alert(Alert.AlertType.INFORMATION, "Wrong User Name").showAndWait();
    	}
    }
    
    public static String [] IdInfo = new String[101];
    
    @FXML
    private void customerLogin(javafx.event.ActionEvent event) 
    {
    	String Id = customerIdField.getText().trim();
    	int flag = 1;
    	for(int i = 0; i<IdInfo.length; i++) {
    		if(Id.equals(IdInfo[i])){
    			try 
    	        {
    	            Parent customerRoot = FXMLLoader.load(getClass().getResource("/View/CustomerDashBoard.fxml"));
    	            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	            stage.setScene(new Scene(customerRoot));
    	        } 
    	        catch (Exception e) 
    	        {
    	            e.printStackTrace();
    	        }
    			flag = 0;
    			break;
    		}
    	}
    	if(flag == 1) {
    		new Alert(Alert.AlertType.INFORMATION, "Wrong User Name").showAndWait();
    	}
    	
        
    }
    @FXML
    private void SignUp(javafx.event.ActionEvent event)
    {
    	
    	try 
    	{
    		Parent adminRoot = FXMLLoader.load(getClass().getResource("/View/SignUpDashBoard.fxml"));
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		stage.setScene(new Scene(adminRoot));
    	} 
    	catch (Exception e) 
    	{
    		e.printStackTrace();
    	}
    }
    	

}