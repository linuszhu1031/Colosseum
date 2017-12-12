public class Assassin extends Hero {
	public Assassin(String name) {
		super(name, 100, 25, 10, 0, 0.2); 
	}
	
	public void attack (final Hero opponent) {
        double specProb = Math.random();
        double dodgeProb = 1 - opponent.dodge;
        double instantKill = Math.random();
        
        //assassin v assassin special interaction
        if (opponent instanceof Assassin) {
        	if (Math.random() > .5) {
        		instantKill = .01; 
        	}
        }
        
        if (instantKill <= .01) {
        	System.out.println(this.name + " instantly kills" + opponent.name);
        	opponent.healthPoints = 0; 
        } else
        if (specProb >= 0.9){
           System.out.println(this.name +" uses Poison Knife!");
           opponent.healthPoints -= (3 * this.attackPoints) - opponent.defense;
        } else 
            if (Math.random() >= dodgeProb){
                System.out.println(opponent.name + " dodged " + this.name + "'s attack!"); 
        } else {
            System.out.println(this.name + " attacks!"); 
            opponent.healthPoints -= this.attackPoints - opponent.defense; 
        }
        
                         
     }
}