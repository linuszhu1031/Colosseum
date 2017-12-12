public class Warrior extends Hero{
    public Warrior(String name) {
        super(name, 100, 13, 7, 5, 0.1);
    }
 public final void attack(final Hero opponent) {
        double specProb = Math.random();
        double dodgeProb = 1 - opponent.dodge;
        double selfcare = Math.random();
        /*passive*/
    if (selfcare <= 0.01) {
        System.out.println(this.name + " healed himslef and recovered own health!");
        this.healthPoints *= 2;
    } else    
    if (specProb >= 0.9) {
        System.out.println(this.name + " hit with the Power Strike!");
        opponent.healthPoints -= (3 * this.attackPoints) - opponent.defense;
    } else 
        if(Math.random() >=dodgeProb) {
        	System.out.println(opponent.name + " dodged " + this.name + "'s attack!");
    } else {
          System.out.println(this.name + " attacks opponent with basic attack!");
            opponent.healthPoints -= this.attackPoints - opponent.defense;
      }
 }
}
