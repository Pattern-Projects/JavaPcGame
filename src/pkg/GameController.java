package pkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Pattern-Projects
 */
public class GameController implements Initializable {
    
    private Main application;    
    
    @FXML
    private TextArea result;
    
    @FXML
    private TextField choice;
    
    @FXML
    private void next(ActionEvent event) {
        //Next Action
    	if (!choice.getText().isEmpty()) {
    		result.appendText(choice.getText()+"\n");
    		choice.setText("");
    	}
    }

    public void setApp(Main application){
        this.application = application;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
    //TODO: Connect existing project to UI
}
