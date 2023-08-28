import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

@Controller
public class MainController {

    @FXML
    private Button secureButton;

    @GetMapping("/secure-action")
    public void secureAction(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Secure Action");
        alert.setHeaderText(null);
        alert.setContentText("This is a secure action!");
        alert.showAndWait();
    }
}
