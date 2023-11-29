import java.util.Random;
import java.util.Scanner;

/**
 * The 'Battlephase' class represents the battle phase of the game where the player's active creature battles against an enemy.
 */
public class Battlephase {
    private int enemyHP;
    private int actions;
    
    Scanner scanner = new Scanner(System.in);
    CreatureList creatureList = new CreatureList();
    private Creatures enemy; 
    
    /**
     * Constructs a new Battlephase object with default settings: enemy HP, actions, and an enemy creature.
     */

     public Battlephase() {
        //Area area = new Area();
        //int posArea = area.getintArea();
        enemyHP = 50;
        actions = 3;
        enemy = creatureList.getRandomEnemyCreatures1();
    }

    public void battle1(){
        enemy = creatureList.getRandomEnemyCreatures1();
    }
    public void battle2(){
        enemy = creatureList.getRandomEnemyCreatures2();
    }
    public void battle3(){
        enemy = creatureList.getRandomEnemyCreatures3();
    }

    /**
     * Displays information about a creature, including its name, type, and evolution level.
     *
     * @param creature The creature to display information for.
     */
    public String enemyName(Creatures creature)
    {
        return creature.getName();
    }
    public int enemyEL(Creatures creature)
    {
        return creature.getEvoLevel();
    }
    public String enemyType(Creatures creature)
    {
        return creature.getType();
    }
    public void updateHealth(){
        enemyHP = 50;
    }

    public int getHealth(){
        return enemyHP;
    }

    public String displaybattleinfo(Inventory inventory)
    {
        return "Enemy Creature"+
                "\nHealth:" + getHealth() +
                "\nName:"+ enemyName(enemy) +
                "\nEL:"+   enemyEL(enemy) +
                "\nType:"+ enemyType(enemy) +
                "\n"+
                "\nActive Creature"+
                "\nName:"+  enemyName(inventory.getActiveCreature()) +
                "\nEL:"+    enemyEL(inventory.getActiveCreature()) +
                "\nType:"+  enemyType(inventory.getActiveCreature()) +
                "\nMoves:"+ enemyName(inventory.getActiveCreature()) ;
    }

	/**
     * Performs an attack action during a battle.
     *
     * @param inventory The player's inventory.
     * @return The damage dealt to the enemy.
     */   

    public int attack(Inventory inventory) {
        if (actions > 0) {
            int damage = damageCalculator(inventory);
            enemyHP = enemyHP - damage;
            return damage;
        }
        return 0;
    }

    //  Swap Method
    /**
     * Allows the player to swap their active creature during a battle.
     *
     * @param inventory The player's inventory.
     */
    public void swap (Inventory inventory) {           //  NOTE: dont forget to incre decre actions
        if (actions > 0) {
            //inventory.printInventory(); 
            //inventory.ActiveCreatureChange(int i);
        }
    }

    //  Catch Method
    /**
     * Attempts to catch the enemy creature during a battle.
     *
     * @param inventory The player's inventory.
     * @return `true` if the catch attempt is successful, `false` otherwise.
     */
    public boolean catchChanceEnemy(Inventory inventory){
        int catchChance = 40 + 50 - enemyHP;
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        if(randomNumber <= catchChance){
            //System.out.println("You successfully caught the enemy!");
            //inventory.addCreature(enemy);
            return true;
        } else {
            //System.out.println("Failed to catch the enemy.");
            return false;    
        }
        
    }

    public void addenemycreature(Inventory inventory)
    {
        inventory.addCreature(enemy);
    }

    // Run away Method 
    /**
     * Checks if the player can run away from the battle.
     *
     * @return `true` if the player can run away, `false` otherwise.
     */
    public boolean RunAway () {     //  run away method 
        return enemyHP > 0 && actions == 0;
    }


    //  Damage Calculator 
    /**
     * Calculates the damage dealt by the active creature during an attack.
     *
     * @param inventory The player's inventory.
     * @return The calculated damage value.
     */
    public int damageCalculator (Inventory inventory) {
        Random random = new Random();
        int damage = random.nextInt(10) + 1 * inventory.getActiveCreature().getEvoLevel();
        
        if (stronger(inventory.getActiveCreature(), enemy)) {
            damage = (int)(damage * 1.5);
        }

        return damage;
    }


    /**
     * Determines if one creature is stronger than another based on their types.
     *
     * @param creature1 The first creature.
     * @param creature2 The second creature.
     * @return `true` if the first creature is stronger than the second, `false` otherwise.
     */
    public boolean stronger(Creatures creature1, Creatures creature2) {
        String type1 = creature1.getType();
        String type2 = creature2.getType();

        if (type1.equals("fire") && type2.equals("grass")) {
            return true; 
        } 
        else if (type1.equals("grass") && type2.equals("water")) {
            return true;
        } 
        else if (type1.equals("water") && type2.equals("fire")) {
            return true; 
        }
        else {
            return false;
        }
    }

    public void returnactions(int i)
    {
        actions = i;
    }
    public int getactions()
    {
        return actions;
    }

}
