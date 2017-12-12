import java.util.Scanner;

public class Game {
	//create reader for user input
    static Scanner reader = new Scanner(System.in); 
    
    public static void main(String[] args) {
    	//instantiate objects
    	Hero Player1 = new Hero();
        Hero Player2 = new Hero();
        //Game Setup
    	System.out.println("Welcome to the game!");
    	System.out.println("Player 1 create your character."); 
    	Player1 = makePlayer(Player1);
    	System.out.println("Player 2 create your character.");
        Player2 = makePlayer(Player2);
        //Actual Game Algorithm
        Hero winner = battle(Player1, Player2);
        System.out.println("The winner is: " + winner.name);
        
    }
    
    public static Hero makePlayer(Hero Player) {
        Player = menu(Player);
        return Player;
    }

    public static Hero menu(Hero newPlayer) {
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
            Warrior Player = new Warrior(name); 
            return Player;
        } else 
            if (menuInput.equals("2")) {
                System.out.println("You selected Archer! Please enter a name for your character: ");
                String name = reader.nextLine();
                Archer Player = new Archer(name); 
                return Player;
        } else 
            if (menuInput.equals("3")) {
                System.out.println("You selected Wizard! Please enter a name for your character: ");
                String name = reader.nextLine();
                Wizard Player = new Wizard(name);
                return Player;
        } else 
            if (menuInput.equals("4")) {
                System.out.println("You selected Lancer! Please enter a name for your character: ");
                String name = reader.nextLine();
                Lancer Player = new Lancer(name);
                return Player;
        } else 
            if (menuInput.equals("5")) {
                System.out.println("You selected Assassin! Please enter a name for your character: ");
                String name = reader.nextLine();
                Assassin Player = new Assassin(name);
                return Player;
        } else 
            if (menuInput.equals("6")) {
                System.out.println("You selected Knight! Please enter a name for your character: ");
                String name = reader.nextLine();
                Knight Player = new Knight(name);
                return Player;
        } else 
            if (menuInput.equals("7")) {
                System.out.println("You selected Pirate! Please enter a name for your character: ");
                String name = reader.nextLine();
                Pirate Player = new Pirate(name);
                return Player;
        } else 
            if (menuInput.equals("8")) {
                System.out.println("You selected Gunslinger! Please enter a name for your character: ");
                String name = reader.nextLine();
                Gunslinger Player = new Gunslinger(name);
                return Player;
        } else 
            if (menuInput.equals("9")) {
                System.out.println("You selected Samurai! Please enter a name for your character: ");
                String name = reader.nextLine();
                Samurai Player = new Samurai(name);
                return Player;
        } else {
            System.out.println("You have entered an invalid input. Please try again.");  
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
    	while (!gameEnd(Player1, Player2)) {
	    	if (Player1.speed > Player2.speed) {
	    		Player1.attack(Player2);
	    		System.out.println(Player1.name + "'s health is: " + Player1.healthPoints);
	    		System.out.println(Player2.name + "'s health is: " + Player2.healthPoints + "\n");
	    		if (gameEnd(Player1, Player2)) {
	    			break;
	    		}
	    		Player2.attack(Player1);
	    		System.out.println(Player1.name + "'s health is: " + Player1.healthPoints);
	    		System.out.println(Player2.name + "'s health is: " + Player2.healthPoints + "\n");
	        } else {
	        	Player2.attack(Player1);
	        	System.out.println(Player1.name + "'s health is: " + Player1.healthPoints);
	    		System.out.println(Player2.name + "'s health is: " + Player2.healthPoints + "\n");
	    		if (gameEnd(Player1, Player2)) {
	    			break;
	    		}
	        	Player1.attack(Player2);
	        	System.out.println(Player1.name + "'s health is: " + Player1.healthPoints);
	    		System.out.println(Player2.name + "'s health is: " + Player2.healthPoints + "\n");
	        }
    	}
    	
    	if (Player1.healthPoints <= 0) {
    		return Player2; 
    	} else {
    		return Player1;
    	}
    }
}
