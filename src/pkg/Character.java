package pkg;
public abstract class Character {
	//ADHFAJFH
	//paul
	public String name;
	private int level;
	private	float health;
	private float damage;
	private float armor;
	
	public Character(String name, int level, float health, float damage, float armor){
		this.name = name;
		this.level = level;
		this.health = health;
		this.damage = damage;
		this.armor = armor;
	}
	
	int getLevel() { return level;}
	float getHealth() { return health;}
	float getDamage() { return damage;}
	float getArmor() { return armor;}
	
	void addLevel(int level) {
		this.level += level;
	}
	
	void takeDamage(float damage) {
		this.health -= damage - damage*armor/(armor+300);
	}
	void takeHeal(float damage) {
		this.health += damage;
	}
	
	abstract void talk();
	//NPC: Let me help
	//Player small story: Hello I'm ... and i have traveled far and wide
	//Enemy: I will kill you
	
	abstract void die();
	//NPC: go without me
	//Enemy: my brothers will revenge me
	//Player: GAME ENDS
	
	
	
	
}
