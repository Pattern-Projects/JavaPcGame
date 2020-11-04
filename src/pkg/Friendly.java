package pkg;

public class Friendly extends Character {

	@Override
	void talk() {
		System.out.println("Let me help");
	}
	
	@ Override
	void die () {
		System.out.println("I feel bed");
		
	}
	
	public Friendly(String name, int level,float health,float damage,float armor ) {
	super(name,level,health,damage,armor); 
	}
}
	
	
	
	
	
	
	
	