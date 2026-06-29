package Store;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class SignUpController
{

    

	@FXML
    private Button BackButton;
    
    @FXML
    private Button AddButton;
    
    @FXML
    private TextField IdField;

    @FXML
    private void BackLogin(javafx.event.ActionEvent event)
    {
        try 
        {
            Parent adminRoot = FXMLLoader.load(getClass().getResource("/View/LoginView.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(adminRoot));
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    int count = 0;
    
    @FXML
    private void SignUp(javafx.event.ActionEvent event)
    {
    	String Id = IdField.getText().trim();
    	Store.LoginViewController.IdInfo [count] = Id;
    	count++;
    	new Alert(Alert.AlertType.INFORMATION, "Add Successful").showAndWait();
    }
}