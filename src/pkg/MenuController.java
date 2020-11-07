package pkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author Pattern-Projects
 */
public class MenuController implements Initializable {
    
    private Main application;

    @FXML
    private void startGame(ActionEvent event) {
        //Start Game
        System.out.println("Start Game");
        application.game();
    }
    
    public void setApp(Main application){
        this.application = application;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
