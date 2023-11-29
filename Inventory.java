import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * The 'Inventory' class represents the player's inventory of creatures and the active creature.
 */

public class Inventory {
    private ArrayList<Creatures> ownedCreatures = new ArrayList<>(); 
    private Creatures activeCreature;       
    private CreatureList creatureList;
    public Object getActiveCreature;
    public int c1;
    public int c2;
    public int c1l;
    public int c2l;

    /**
     * Gets the list of owned creatures in the inventory.
     *
     * @return The list of owned creatures.
     */
    public ArrayList<Creatures> getOwnedCreature() {    //  setter for Arraylist 'ownedCreatures'
        return ownedCreatures;                          
    }
    /**
     * Gets the number of creatures in the inventory.
     *
     * @return The number of creatures in the inventory.
     */
    public int getArrayListSize() {
        return ownedCreatures.size();
    }
     /**
     * Adds a creature to the inventory.
     *
     * @param creature The creature to add to the inventory.
     */
    public void addCreature (Creatures creature) {      //  method for adding a creature in the arraylist 'ownedCreatures'
        ownedCreatures.add(creature);                   //  arraylist add command 
    }

    /**
     * Removes a creature from the inventory.
     *
     * @param creature The creature to remove from the inventory.
     */
    public void removeCreature (Creatures creature) {   //  method for removing a creature in the arraylist 'ownedCreatures'
        ownedCreatures.remove(creature);                //  arraylist remove command
    }
     /**
     * Sets the active creature in the inventory.
     *
     * @param index The index of the creature to set as the active creature.
     */
    public void setActiveCreature (int index) {      //  setter for activeCreature
        this.activeCreature = ownedCreatures.get(index);
    }
     /**
     * Gets the active creature in the inventory.
     *
     * @return The active creature.
     */

    public Creatures getActiveCreature() {      //  getter for activeCreature
        return activeCreature;
    }

    /**
     * Constructs an `Inventory` object with the specified `CreatureList`.
     *
     * @param creatureList The `CreatureList` containing available creatures.
     */

    public Inventory(CreatureList creatureList) {       //  setter for inventory 
            this.creatureList = creatureList;
        }
    
    /**
     * Gets the owned creature at the specified index.
     *
     * @param index The index of the owned creature to retrieve.
     * @return The owned creature at the specified index.
     */
    public Creatures getOwnedCreature (int index) {
        return ownedCreatures.get(index);
    }
    
     /**
     * Prints the name of the owned creature at the specified position in the inventory.
     *
     * @param pos The position of the creature in the inventory.
     

    void printCreatureName (int pos) {
        if (pos >= 0 && pos < ownedCreatures.size()) {
            Creatures creature = ownedCreatures.get(pos);
            System.out.println ("Owned Creature Name at Index " + pos + ": " + creature.getName());
        }
        else {
            System.out.println ("Invalid index or no creature at the specific index.");
        }
    }*/

    /**
     * Prints the details of creatures in the inventory.
     *
    public void printInventory () {
        int i;

        for (i = 0; i < ownedCreatures.size(); i++) { 
            Creatures owned = ownedCreatures.get(i);
            int temp = i;
            System.out.println ("       +-------------+");
            System.out.println ("~~~~~~~| Creature  " + (temp + 1) + " |~~~~~~~");
            System.out.println ("       +-------------+");
            System.out.println ("Name: " + owned.getName());
            System.out.println ("Type: " + owned.getType());
            System.out.println ("Family: " + owned.getFamily());
            System.out.println ("Level: " + owned.getEvoLevel());
            System.out.println ("+-------------+-------------+");
        }
        System.out.println();
    }*/

    /**
     * Allows the player to change the active creature in the inventory.
     */
    void ActiveCreatureChange (int i) {
        setActiveCreature(i);
    }



    /**
     * Sets the symbol for the active creature.
     *
     * @param symbol The symbol to represent the active creature on the game board.
     
    public void setActiveCreatureSymbol(char symbol) {
        this.activeCreatureSymbol = symbol;
    }

    /**
     * Gets the symbol for the active creature.
     *
     * @return The symbol representing the active creature.
     
    public char getActiveCreatureSymbol() {
        return activeCreatureSymbol;
    }*/

    public void Creature1(int i){
        c1 = i;
    }

    public void Creature2(int i){
        c2 = i;
    }
    public void Creature1Location(int i){
        c1l = i;
    }

    public void Creature2Location(int i){
        c2l = i;
    }

    public int getCreature1(){
        return c1;
    }

    public int getCreature2(){
        return c2;
    }
    public int getCreature1Location(){
        return c1l;
    }

    public int getCreature2Location(){
        return c2l;
    }

    


    public void evolve(){
        int index1 = c1l ;
        int index2 = c2l ;

            Creatures creature1 = ownedCreatures.get(index1);
            Creatures creature2 = ownedCreatures.get(index2);

                    int balls = creature1.getCreatureNumber();
                    Creatures evolvedCreature = creatureList.evolveCreatures(balls);

                    // Remove the original creatures from the inventory
                    ownedCreatures.remove(creature1);
                    ownedCreatures.remove(creature2);

                    // Add the evolved creature to the inventory
                    addCreature(evolvedCreature);

                    // Sort the inventory after evolution based on creature names
                    Collections.sort(ownedCreatures, Comparator.comparing(Creatures::getName));
                    
                    
                    setActiveCreature(getArrayListSize()-1);
                    //System.out.println("Evolution successful! " + evolvedCreature.getName() + " has been added to your inventory.");
    }

        /**
     * Checks if the given index is valid for the inventory.
     *
     * @param index The index to check.
     * @return True if the index is valid, false otherwise.
     */

    public String creatureinfo(int i){
        return  "\nName:"+ getName(i)+
                "\n Type:"+ getType(i)+
                "\n Family:"+ getFamily(i)+
                "\n EL" + getEvoLevel(i);
    }
    
    public String getName (int i)
    {
        Creatures owned = ownedCreatures.get(i);
        return owned.getName();
    }
    public String getType (int i)
    {
        Creatures owned = ownedCreatures.get(i);
        return owned.getType();
    }

    public String getFamily(int i)
    {
        Creatures owned = ownedCreatures.get(i);
        return owned.getFamily();
    }

    public int getEvoLevel (int i)
    {
        Creatures owned = ownedCreatures.get(i);
        return owned.getEvoLevel();
    }
    public int creatureNumber (int i)
    {
        Creatures owned = ownedCreatures.get(i);
        return owned.getCreatureNumber();
    }

}

//  setters and getters (public) are used so that declared variables can be private 