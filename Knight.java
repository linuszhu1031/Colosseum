public class Knight extends Hero {
	public Knight(String name) {
		super(name, 100, 18, 3, 10, .05);	
	}
	
	public void attack(final Hero opponent) {
        double specProb = Math.random();
        double dodgeProb = 1 - opponent.dodge;
        double juicing = Math.random();
        
        if (juicing <= .01) {
        	System.out.println(this.name + " takes a bunch of steroids!");
        	this.defense = 22; 
        	opponent.healthPoints -= this.attackPoints; 
        } else
        if (specProb >= 0.9){
           System.out.println(this.name + " uses charge!");
           opponent.healthPoints -= (3 * this.attackPoints) - opponent.defense;
        } else 
            if (Math.random() >= dodgeProb) {
                System.out.println(opponent.name + " dodged!"); 
        } else {
            System.out.println(this.name + " attacks!"); 
	            opponent.healthPoints -= this.attackPoints - opponent.defense; 
	    }
	      
                         
     }
}
