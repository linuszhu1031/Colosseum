
public abstract class Hero {
	String name; 
	int healthPoints;
	int attackPoints;
	int speed; 
	int defense; 
	double dodge;
	
	public Hero() {
		
	}
	
	public Hero(String name, int hp, int ap, int speed, int defense, double dodge) {
        this.name = name;
        this.healthPoints = hp; 
        this.attackPoints = ap; 
        this.speed = speed; 
        this.defense = defense; 
        this.dodge = dodge;
    }
	
	void attack(Hero opponent) {
	}
	
	
}
