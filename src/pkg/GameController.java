package pkg;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Pattern-Projects
 */
public class GameController implements Initializable {
    
	private Main application;
    private int step = 0;
    private String name;
    
	Enemy A = new Enemy(20, 1000, 70, 34, 2346, this);
	Friendly B = new Friendly("Lotrak", 3,30,20,0, this);
	
    @FXML
    private ScrollPane resultScroll;
    
    @FXML
    private TextArea result;
    
    @FXML
    private TextField choice;
    
    @FXML
    private void nextButton(ActionEvent event) {
        //Next Action
    	if (!choice.getText().isEmpty()) {
    		
    		String in = choice.getText();
    		choice.setText("");
    		output(in);
    		next(in);
    	}
    }

    public void setApp(Main application){
        this.application = application;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	Player.initialize("Me", "My story", this); //Initializes Player
		output("Enter your name:");

    }    
    
    private void next(String in) {
    	switch (step) {
    		case 0:
    			Player.getInstance().setName(in);
	        	step++;
	    		output("Enter your story:");
	    		break;
    		case 1:
    			Player.getInstance().setStory(in);
    			startGame();
	        	step++;
	    		break;
	    	default:
	    		gameStep(in);
    	}
    }
    
	private void startGame() {
		output("\n An ally with level 3\nAn oponent wiht level 20\n");
		stats();
	}
	
	public void stats() {
		output("You have: " + 
				Player.getInstance().getHealth() + " Health " +
				Player.getInstance().getArmor() + " Armor " +
				Player.getInstance().getDamage() + " Damage ");
			
		if(Player.getInstance().isAlive()) {	
				output("What do you choose to do:\n" + "1 - Attack Enemy with: " + Player.getInstance().getDamage() + "\n=> ");
			}
		}
	
	private void gameStep(String in) {
			if(in == "1")
				Player.getInstance().attackEnemy(A);
			if(B.getHealth()>=0)
				A.attackFriendly(B);
			else
				A.attackPlayer();
	}
	
	public void lostGame() {
		output("You Died!");
		System.out.print("Game Over!");
		System.exit(0);
	}
	
	public void output(String output) {
		result.appendText(output+"\n");
	}
}
