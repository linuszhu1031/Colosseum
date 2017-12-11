public class Lancer extends Hero{
	public Lancer(String name) {
		super(name, 100, 20, 5, 8, .08);	
	}
	
	public void attack (final Hero opponent) {
        double specProb = Math.random();
        double dodgeProb = 1 - opponent.dodge;
        double instantHeal = Math.random();
        
        if (instantHeal <= .01) {
        	System.out.println(this.name + " autoheals to full!");
        	this.healthPoints = 100; 
        	opponent.healthPoints -= this.attackPoints; 
        } else
        if (specProb >= 0.9){
           System.out.println(this.name + " hits you harder than he usually feels like doing!");
           opponent.healthPoints -= (3 * this.attackPoints) - opponent.defense;
        } else 
            if (Math.random() >= dodgeProb){
                System.out.println(opponent.name + " dodged!"); 
        } else {
            System.out.println(this.name + " attacks!"); 
            opponent.healthPoints -= this.attackPoints - opponent.defense; 
        }
        
        
                         
     }
}
