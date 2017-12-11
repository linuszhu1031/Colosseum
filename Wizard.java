public class Wizard extends Hero{
    public Wizard(String name) {
        super(name, 100, 20, 2, 3, 0.1);
    }
 public final void attack(final Hero opponent) {
        double specProb = Math.random();
        double dodgeProb = 1 - opponent.dodge;
        double heal = Math.random();
        /*passive*/
    if (heal <= 0.01) {
        System.out.println(this.name + " healed himself and recovered own health!");
        this.healthPoints *= 2;
    } else    
    if (specProb >= 0.9) {
        System.out.println(this.name + " hit with the Thunder Storm!");
        opponent.healthPoints -= (3 * this.attackPoints) - opponent.defense;
    } else 
        if(Math.random() >=dodgeProb) {
        System.out.println(opponent.name + " dodged your attack!");
    } else {
          System.out.println(this.name + " attacks opponent with basic attack!");
            opponent.healthPoints -= this.attackPoints - opponent.defense;
      }
 }
        
}
