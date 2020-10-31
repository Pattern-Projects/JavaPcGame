package pkg;

public class Player extends Character{
	
	String story;
	
	public Player(String name, String story) {
		super(name, 1, 100, 10, 0);
		this.story = story;
	}
	
	@Override
	void talk() {
		System.out.println(story);
	}

	@Override
	void die() {
		System.out.println("You Died!");
	}
	
}
