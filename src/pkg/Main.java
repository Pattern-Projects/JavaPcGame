package pkg;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import pkg.constants.GlobalConstants;

/**
 *
 * @author Pattern-Projects
 */
public class Main extends Application {
    private Stage stage;
    GameController game;
    
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setTitle(GlobalConstants.GAME_NAME);
        //Initialize Scene
        Parent root = FXMLLoader.load(getClass().getResource("views/Menu.fxml"));
        Scene scene = new Scene(root);

        //Set Scene
        stage.setScene(scene);
        stage.show();
        menu();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    void menu() {
        try {
            MenuController menu = (MenuController) replaceSceneContent("views/Menu.fxml");
            menu.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void game() {
        try {
            game = (GameController) replaceSceneContent("views/Game.fxml");
            game.setApp(this);
//            stage.setFullScreen(true);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Main.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        } 
        stage.getScene().setRoot(page);
        return (Initializable) loader.getController();
    }

}
