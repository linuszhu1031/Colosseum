public class Gunslinger extends Hero {

    public Gunslinger(String name) {
        super(name, 100, 22, 6, 2, 0.1);
    }
    
    public void attack(final Hero opponent) {
        
        double specProb = Math.random();
        double dodgeProb = 1 - opponent.dodge; 
        double aimLock = Math.random();
        
        if (aimLock <= 0.01) {
            System.out.println(this.name + " will always headshot and do double damage!");
            this.attackPoints *= 2;
        }
        if (specProb >= 0.9){
           System.out.println(this.name + " uses Pistol Shot!");
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
