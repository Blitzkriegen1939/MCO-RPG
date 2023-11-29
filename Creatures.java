/**
 * The 'Creatures' class represents individual creatures in the game.
 */
public class Creatures {
    private String name;
    private String type;
    private String family;
    private int evolutionLevel;
    private int creatureNumber;

    /**
     * Constructs a 'Creatures' object with specified attributes.
     *
     * @param name     The name of the creature.
     * @param type     The type of the creature (e.g., Fire, Grass, Water).
     * @param family   The family of the creature (A,B,C,D,E,F,G,H,I).
     * @param evolutionLevel The evolution level of the creature (1,2,3).
     */
    public Creatures(String name, String type, String family, int evolutionLevel, int creatureNumber){
        this.name = name;
        this.type = type;
        this.family = family;
        this.evolutionLevel = evolutionLevel;
        this.creatureNumber = creatureNumber;

    }


     /**
     * Gets name of the creature
     *
     * @return The name of the creature.
     */

    public String getName() {
        return name;
    }

    /**
     * Gets the type of the creature.
     *
     * @return The type of the creature (e.g., Fire, Grass, Water).
     */

    public String getType() {
        return type;
    }
    
    /**
     * Gets the family of the creature.
     *
     * @return The family of the creature.
     */
    public String getFamily() {
        return family;
    }

    /**
     * Gets the evolution level of the creature.
     *
     * @return The evolution level of the creature.
     */
    
    public int getEvoLevel() {
        return evolutionLevel;
    }

    public int getCreatureNumber() {
        return creatureNumber;
    }
}