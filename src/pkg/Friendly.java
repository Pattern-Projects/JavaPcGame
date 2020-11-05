package pkg;

public class Friendly extends Character {

	@Override
	void talk() {
		System.out.println("Let me help");
	}
	
	@ Override
	void die () {
		System.out.println("Mr." + Player.getInstance().name + " I don't feel so good");
		System.out.println(this.name + " died!");
		
	}
	
	void healPlayer() {
		Player.getInstance().takeHeal(this.getDamage());
	
	}

	void attackEnemy(Enemy enemy) {
		enemy.takeDamage(this.getDamage());
	}
	
	
	
	
	public Friendly(String name, int level,float health,float damage,float armor ) {
	super(name,level,health,damage,armor); 
	}
}
	
	
	
	
	
	
	
	