package pkg;

public class Enemy extends Character {
	private int money;
	
	@Override
	void talk() {
		System.out.println("I will kill you");
	}
	
	@Override
	void die() {
		Player.getInstance().addMoney(money);
		Player.getInstance().addLevel(1);
		System.out.println("My brothers will revenge me");
		
	}
	void attackPlayer() {
		Player.getInstance().takeDamage(this.getDamage());
	}
	void attackFriendly(Friendly friendly) {
		friendly.getDamage(this.getDamage());
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
