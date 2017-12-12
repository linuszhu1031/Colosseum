public class Archer extends Hero{
    public Archer(String name) {
        super(name, 100, 20, 9, 2, 0.2);
    }
 public final void attack(final Hero opponent) {
        double specProb = Math.random();
        double dodgeProb = 1 - opponent.dodge;
        double focusing = Math.random();
        /*passive*/
    if (focusing <= 0.01) {
        System.out.println(this.name + " focused and recovered own health!");
        this.healthPoints *=2;
    } else    
    if (specProb >= 0.9) {
        System.out.println(this.name + " hit with the Fire Arrow!");
        opponent.healthPoints -= (3 * this.attackPoints) - opponent.defense;
    } else 
        if(Math.random() >=dodgeProb) {
        System.out.println(opponent.name + " dodged " + this.name + "'s attack!");
    } else {
          System.out.println(this.name + " attacks opponent with basic shot.");
            opponent.healthPoints -= this.attackPoints - opponent.defense;
    }
        
 }
}