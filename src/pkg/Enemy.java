package pkg;

public class Enemy extends Character {
	private int money;
	
	@Override
	void talk() {
		System.out.println("I will kill you");
	}
	
	@Override
	void die() {
		// TODO Auto-generated methodk stub
		
	}
	
	int dropMoney() {
		return money;
	}	
	
	public Enemy(String name, int level, float health, float damage, float armor, int money) {
		super(name, level, health, damage, armor);
		this.money=money;
	}
	
	public Enemy(int level, float health, float damage, float armor, int money) {
		super( "Unnamed", level, health, damage, armor);
		this.money=money;		
	}
		

}
