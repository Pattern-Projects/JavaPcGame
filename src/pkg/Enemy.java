package pkg;

public class Enemy extends Character {
	private int money;
	
	@Override
	void talk() {
		output("I will kill you");
	}
	
	@Override
	void die() {
		Player.getInstance().addMoney(money);
		Player.getInstance().addLevel(1);
		output("My brothers will revenge me");		
	}

	void attackPlayer() {
		Player.getInstance().takeDamage(this.getDamage());
		output("Enemy " + this.name + " attacked Player with " + this.getDamage() + "Damage");
	}
	void attackFriendly(Friendly friendly) {
		friendly.takeDamage(this.getDamage());
		output("Enemy " + this.name + " attacked " + friendly.name + " with " + this.getDamage() + " Damage");
	}
	
	public Enemy(String name, int level, float health, float damage, float armor, int money, GameController controller) {
		super(name, level, health, damage, armor, controller);
		this.money=money;
	}
	
	public Enemy(int level, float health, float damage, float armor, int money, GameController controller) {
		super( "Unnamed", level, health, damage, armor, controller);
		this.money=money;		
	}
		
}
