import java.util.Scanner;

/**
 * The main class that serves as the starting point of the game.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreatureList creatureList = new CreatureList();
        Inventory inventory = new Inventory(creatureList);
        
        System.out.println ("[1] " + creatureList.getCreatureName(0));  
        System.out.println ("[2] " + creatureList.getCreatureName(1));
        System.out.println ("[3] " + creatureList.getCreatureName(2));
        System.out.println ("[4] " + creatureList.getCreatureName(3));  
        System.out.println ("[5] " + creatureList.getCreatureName(4));
        System.out.println ("[6] " + creatureList.getCreatureName(5));
        System.out.println ("[7] " + creatureList.getCreatureName(6));  
        System.out.println ("[8] " + creatureList.getCreatureName(7));
        System.out.println ("[9] " + creatureList.getCreatureName(8));

        System.out.print ("INPUT: ");
        
        boolean valid = false;
        int input = 0;
        while (!valid) {
            input = scanner.nextInt();
            
            if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 6 || input == 7 || input == 8 || input == 9 ) {
                valid = true;
            }
            else {
                System.out.println ("Invalid Input");
                System.out.print ("INPUT: ");
            }
    
        }

        //  switch statement to add chosen Creature
        switch (input) {
            case 1:
                inventory.addCreature(creatureList.getCreaturefromList(0));
                break;
            case 2:
                inventory.addCreature(creatureList.getCreaturefromList(1));
                break;
            case 3:
                inventory.addCreature(creatureList.getCreaturefromList(2));
                break;
            case 4:
                inventory.addCreature(creatureList.getCreaturefromList(3));
                break;
            case 5:
                inventory.addCreature(creatureList.getCreaturefromList(4));
                break;    
            case 6:
                inventory.addCreature(creatureList.getCreaturefromList(5));
                break;
            case 7:
                inventory.addCreature(creatureList.getCreaturefromList(6));
                break;
            case 8:
                inventory.addCreature(creatureList.getCreaturefromList(7));
                break;
            case 9:
                inventory.addCreature(creatureList.getCreaturefromList(8));
                break;                
        }
        
        //  This piece of code, we set active creaturea and print it out and set chosen Creature as 'Active Creature'

        inventory.setActiveCreature(0); 

        System.out.println ("ACTIVE CREATURE IS " + inventory.getActiveCreature().getName());   
        
        int choice;
         /**
         * Starts the game and provides the user with a menu to interact with.
         */
        //  next step: display menu screen 
        do {
            System.out.println ("MENU SCREEN");
            System.out.println ("[1] View Inventory");
            System.out.println ("[2] Explore an Area");
            System.out.println ("[3] Evolve Creature");
            System.out.println ("[4] Exit");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // viewInventory();
                    System.out.println ("\t\t\t\t\t Inventory ");
                    inventory.printInventory();         //  display Creatures in inventory method
                    inventory.ActiveCreatureChange();   //  active creature change method 
                    break;
                case 2:
                    Area area = new Area(); 
                    char activeCreatureSymbol = 'A';
                    char enemyCreatureSymbol = 'E';
                    area.printArea(creatureList, activeCreatureSymbol, inventory, enemyCreatureSymbol);
                    break;
                case 3:
                    //evolveCreature();
                    inventory.evolve();
                    break;
                case 4:
                    System.out.println("Exiting the game. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
                        
           
        } while (true);

        
    }
    
 }
