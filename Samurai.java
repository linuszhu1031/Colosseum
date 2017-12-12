public class Samurai extends Hero {

    public Samurai(String name) {
        super(name, 100, 20, 4, 6, 0.15);
    }

    public void attack(final Hero opponent) {
        
        double specProb = Math.random();
        double dodgeProb = 1 - opponent.dodge; 
        double meditate = Math.random();
        
        if (meditate <= 0.01) {
            System.out.println(this.name + " meditated and has more health!");
            this.healthPoints *= 2;
        } else
        if (specProb >= 0.9){
           System.out.println(this.name + " uses Iajutsu!");
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