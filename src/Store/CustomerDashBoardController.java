package Store;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class CustomerDashBoardController
{

    @FXML
    private Button BackButton;

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
}