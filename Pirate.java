public class Pirate extends Hero {

    public Pirate(String name) {
        super(name, 100, 17, 7, 3, 0.1);
    }
    
    public void attack(final Hero opponent) {
        
        double specProb = Math.random();
        double dodgeProb = 1 - opponent.dodge; 
        double stealGold = Math.random();
        
        if (stealGold <= 0.01) {
            System.out.println(this.name + " stole all of " + opponent.name + "'s gold!");
        }
        if (specProb >= 0.9){
           System.out.println(this.name + " uses Blunderbuss!");
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