import java.util.Scanner;

public class Game {
    static Scanner reader = new Scanner(System.in); 
    
    public static void main(String[] args) {
    	System.out.println("Welcome to the game!");
    	System.out.println("Player 1 create your character.");
        Hero Player1 = menu1(); 
    	System.out.println("Player 2 create your character.");
        Hero Player2 = menu1(); 
        Hero winner = battle(Player1, Player2);
        System.out.println("The winner is: " + winner.name);
        
    }
    
    public static Hero menu1() {
        System.out.println("Please select the class of character you want to play:" + "\n"
        + "1. Warrior" + "\n" 
        + "2. Archer" + "\n"
        + "3. Wizard" + "\n"
        + "4. Lancer" + "\n"
        + "5. Assassin" + "\n"
        + "6. Knight" + "\n"
        + "7. Pirate" + "\n"
        + "8. Gunslinger" + "\n"
        + "9. Samurai"
        ); 
        
        String menuInput = reader.nextLine(); 

        if (menuInput.equals("1")){
            System.out.println("You selected Warrior! Please enter a name for your character: ");
            String name = reader.nextLine(); 
            Warrior Player1 = new Warrior(name); 
            return Player1;
        } else 
            if (menuInput.equals("2")) {
                System.out.println("You selected Archer! Please enter a name for your character: ");
                String name = reader.nextLine();
                Archer Player1 = new Archer(name); 
                return Player1;
        } else 
            if (menuInput.equals("3")) {
                System.out.println("You selected Wizard! Please enter a name for your character: ");
                String name = reader.nextLine();
                Wizard Player1 = new Wizard(name);
                return Player1;
        } else 
            if (menuInput.equals("4")) {
                System.out.println("You selected Lancer! Please enter a name for your character: ");
                String name = reader.nextLine();
                Lancer Player1 = new Lancer(name);
                return Player1;
        } else 
            if (menuInput.equals("5")) {
                System.out.println("You selected Assassin! Please enter a name for your character: ");
                String name = reader.nextLine();
                Assassin Player1 = new Assassin(name);
                return Player1;
        } else 
            if (menuInput.equals("6")) {
                System.out.println("You selected Knight! Please enter a name for your character: ");
                String name = reader.nextLine();
                Knight Player1 = new Knight(name);
                return Player1;
        } else 
            if (menuInput.equals("7")) {
                System.out.println("You selected Pirate! Please enter a name for your character: ");
                String name = reader.nextLine();
                Pirate Player1 = new Pirate(name);
                return Player1;
        } else 
            if (menuInput.equals("8")) {
                System.out.println("You selected Gunslinger! Please enter a name for your character: ");
                String name = reader.nextLine();
                Gunslinger Player1 = new Gunslinger(name);
                return Player1;
        } else 
            if (menuInput.equals("9")) {
                System.out.println("You selected Samurai! Please enter a name for your character: ");
                String name = reader.nextLine();
                Samurai Player1 = new Samurai(name);
                return Player1;
        } else {
            System.out.println("You have entered an invalid input. Please try again.");
            menu1();
        }
        return null; 
         
    }
    public static boolean gameEnd(Hero Player1, Hero Player2) {
    	if ((Player1.healthPoints <= 0) || (Player2.healthPoints <= 0)) {
    		return true; 
    	} else {
    		return false; 
    	}
    }
    
    public static Hero battle(Hero Player1, Hero Player2) {
    	boolean checkWinner = gameEnd(Player1, Player2);
    	while (!checkWinner) {
	    	if (Player1.speed > Player2.speed) {
	    		Player1.attack(Player2);
	    		System.out.println(Player1.name + "'s health is: " + Player1.healthPoints);
	    		System.out.println(Player2.name + "'s health is: " + Player2.healthPoints + "\n");
	    		checkWinner = gameEnd(Player1, Player2);
	    		Player2.attack(Player1);
	    		System.out.println(Player1.name + "'s health is: " + Player1.healthPoints);
	    		System.out.println(Player2.name + "'s health is: " + Player2.healthPoints + "\n");
	    		checkWinner = gameEnd(Player1, Player2);
	        } else {
	        	Player2.attack(Player1);
	        	System.out.println(Player1.name + "'s health is: " + Player1.healthPoints);
	    		System.out.println(Player2.name + "'s health is: " + Player2.healthPoints + "\n");
	        	checkWinner = gameEnd(Player1, Player2);
	        	Player1.attack(Player2);
	        	System.out.println(Player1.name + "'s health is: " + Player1.healthPoints);
	    		System.out.println(Player2.name + "'s health is: " + Player2.healthPoints + "\n");
	        	checkWinner = gameEnd(Player1, Player2);
	        }
    	}
    	
    	if (Player1.healthPoints <= 0) {
    		return Player2; 
    	} else {
    		return Player1;
    	}
    }
}
