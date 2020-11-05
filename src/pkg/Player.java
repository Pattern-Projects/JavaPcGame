package pkg;

public class Player extends Character{
	
	//Singleton START
	private static Player single_instance  = null;
	public static Player initialize(String name, String story) 
    { 
        if (single_instance == null) 
            single_instance = new Player(name, story); 
  
        return single_instance; 
    } 
	public static Player getInstance() 
    { 
        return single_instance; 
    } 
	//Singleton END
	
	String story;
	private int money;
	
	
	private Player(String name, String story) {
		super(name, 1, 100, 10, 0);
		this.story = story;
	}
	
	@Override
	void talk() {
		System.out.println(story);
	}

	@Override
	void die() {
		GameLogic.getInstance().lostGame();
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	void attackEnemy(Enemy enemy) {
		enemy.takeDamage(this.getDamage());
	}
	
}
