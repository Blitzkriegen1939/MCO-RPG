import java.util.ArrayList;
import java.util.Random;;
/**
 * The 'CreatureList' class represents a list of available creatures in the game.
 */
public class CreatureList {
    private ArrayList<Creatures> creatureList = new ArrayList<>();
    private char enemyCreatureSymbol;

     /**
     * Constructs a 'CreatureList' object and initializes it with a predefined list of creatures.
     */

    public CreatureList () {
        creatureList.add (new Creatures("Strawander", "Fire", "A", 1, 0));
        creatureList.add (new Creatures("Chocowool", "Fire", "B", 1, 1));
        creatureList.add (new Creatures("Parfwit", "Fire", "C", 1, 2));
        creatureList.add (new Creatures("Brownisaur", "Grass", "D", 1, 3));
        creatureList.add (new Creatures("Frubat", "Grass", "E", 1,4 ));
        creatureList.add (new Creatures("Malts", "Grass", "F", 1, 5));
        creatureList.add (new Creatures("Squirpie", "Water", "G", 1, 6));
        creatureList.add (new Creatures("Chocolite", "Water", "H", 1, 7));
        creatureList.add (new Creatures("Oshacone", "Water", "I", 1, 8));

        creatureList.add (new Creatures("Strawleon", "Fire", "A", 2, 9));
        creatureList.add (new Creatures("Chocofluff", "Fire", "B", 2, 10));
        creatureList.add (new Creatures("Parfure", "Fire", "C", 2, 11));
        creatureList.add (new Creatures("Chocosaur", "Grass", "D", 2, 12));
        creatureList.add (new Creatures("Golberry", "Grass", "E", 2, 13));
        creatureList.add (new Creatures("Kirlicake", "Grass", "F", 2, 14));
        creatureList.add (new Creatures("Tartortle", "Water", "G", 2, 15));
        creatureList.add (new Creatures("Chocolish", "Water", "H", 2, 16));
        creatureList.add (new Creatures("Dewice", "Water", "I", 2, 17));

        creatureList.add (new Creatures("Strawizard", "Fire", "A", 3, 18));
        creatureList.add (new Creatures("Candaros", "Fire", "B", 3, 19));
        creatureList.add (new Creatures("Parfelure", "Fire", "C", 3, 20));
        creatureList.add (new Creatures("Fudgasaur", "Grass", "D", 3, 21));
        creatureList.add (new Creatures("Croberry", "Grass", "E", 3, 22));
        creatureList.add (new Creatures("Velvevoir", "Grass", "F", 3, 23));
        creatureList.add (new Creatures("Piestoise", "Water", "G", 3, 24));
        creatureList.add (new Creatures("Icesundae", "Water", "H", 3, 25));
        creatureList.add (new Creatures("Samurcone", "Water", "I", 3, 26));
    }

    /**
     * Gets a creature from the list based on its index.
     *
     * @param index The index of the creature to get. 
     * @return The specific creature at the specified index.
     */

    public Creatures getCreaturefromList(int index) {       //  getter for creatures based on their index
        return creatureList.get(index);
    }

     /**
     * Gets the name of a creature in the list based on its index.
     *
     * @param index The index of the creature to get.
     * @return The name of the creature.
     */

    public String getCreatureName (int index) {
        Creatures temp = getCreaturefromList(index);
        return temp.getName();  //  get name properly to fix in main printing starters 
    }

    /**
     * Gets a random enemy creature from the list that has an evolution level of 1.
     *
     * @return A random enemy creature with evolution level 1.
     */

    public Creatures getRandomEnemyCreatures(int posArea) {
        
        int max = 1;

        ArrayList<Creatures> creatures = new ArrayList<>(); 

        switch(posArea){
            case 1:
                max = 8;
                break;
            case 2:
                max = 17;
                break;
            case 3:
                max = 26;
                break;
        }

        getCreaturefromList(max);
        
        if(posArea == 1){
        // Filter the creatures to find those with evolution level 1
        for (Creatures creature : creatureList) {
            if (creature.getEvoLevel() == 1) {
                creatures.add(creature);
            }
        }
        }
        else if(posArea == 2){
        for (Creatures creature : creatureList) {
            if (creature.getEvoLevel() == 1 || creature.getEvoLevel() == 2) {
                creatures.add(creature);
            }
        }
        }
        else {
        for (Creatures creature : creatureList) {
            if (creature.getEvoLevel() == 1 || creature.getEvoLevel() == 2 || creature.getEvoLevel() == 3) {
                creatures.add(creature);
            }
        }
         }



        Random random = new Random();
        int randomIndex = random.nextInt(max);
        System.out.println(posArea);
        return creatures.get(randomIndex);
    }

    /**
     * Sets the symbol for the enemy creature.
     *
     * @param symbol The symbol to represent the enemy creature on the game board.
     */
    public void setEnemyCreatureSymbol(char symbol) { // idk if needed toh lolll 
        this.enemyCreatureSymbol = symbol;
    }

     /**
     * Gets the symbol for the enemy creature.
     *
     * @return The symbol representing the enemy creature.
     */
    
    public char getEnemyCreatureSymbol() {
        return enemyCreatureSymbol;
    }

    /*
     * Evolves creatures
     */
    public Creatures evolveCreatures(int balls) {
        /*
         * Find the index of the creature using the creaturelist
         * 
         * Compare creature 1 to the creature list until they match until they get the matching number
         * Add 9 
         * 
         * Creature1, what number is it in the creaturelist is it number(7,4,2,1, etc)
         * 
         * return evolveindex is the creature we get out of it
         * 
         * once we get this number you plus 9 then evolveindeix == i + 9
         */

        int evolveIndex = 0;
/* 
        ArrayList<Creatures> evolve = new ArrayList<>();

        for(int i = 0; i < creatureList.size(); i++)
        {
            creatureList.get(evolveIndex)
            {
                evolveIndex = i;
                break;
            }
        }
*/

        evolveIndex = evolveIndex + balls + 9;

        return creatureList.get(evolveIndex);
        
    }
    
  
}