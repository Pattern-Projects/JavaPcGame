package pkg;

public class Friendly extends Character {

	@Override
	void talk() {
		output("Let me help");
	}
	
	@ Override
	void die () {
		output("Mr." + Player.getInstance().name + " I don't feel so good");
		output(this.name + " died!");
		
	}
	
	void healPlayer() {
		Player.getInstance().takeHeal(this.getDamage());
	
	}

	void attackEnemy(Enemy enemy) {
		enemy.takeDamage(this.getDamage());
	}
		
	public Friendly(String name, int level,float health,float damage,float armor, GameController controller ) {
	super(name,level,health,damage,armor, controller); 
	}

}
	
	
	
	
	
	
	
	