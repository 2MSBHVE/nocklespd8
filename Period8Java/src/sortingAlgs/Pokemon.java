package sortingAlgs;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String name, int level) {
		this.name = name;
		this.level = level;
		this.hp = 100;
		this.poisoned = false;
	}
	
	public void iChooseYou() {
		System.out.println(name + name);
//		System.out.println(name);
	}
	
	public void setHP(int newHP){
		hp = newHP;
	}

	public void setPoisoned(boolean b) {
		poisoned = b;
	}
	
	public void lapse(){
		if (poisoned) {
			hp -= 15;
		}
	}
	
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit");
		}else{
			System.out.println("The attack missed");
		}
	}
	
	
	
	public int getLevel() {
		return level;
	}
	
	public int getHP() {
		return hp;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isPoisoned() {
		return poisoned;
	}

}
