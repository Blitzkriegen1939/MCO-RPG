import java.util.Random;

/**
 * The 'Area' class represents an area in the game arena.
 * It allows the player to explore different areas such as AREA 1, AREA 2, AREA 3
 */
public class Area 
{
    private Random random = new Random();
    int intArea;
    int row;
    int col;
    int maprow;
    int mapcol; 

   
    public boolean encounterCreature() 
    { // 40% chance
      return random.nextDouble() <= 0.4;
    }

    public void returnintArea(int i) {
      intArea = i;

  }
    public int getintArea()
    {
      return intArea;
    }

    public void returnrow(int i)
    {
      row = i;
    }

    public void returncol(int i)
    {
      col = i;
    }

    public void returnmaprow(int i)
    {
      maprow = i;
    }   
    public void returnmapcol(int i)
    {
      mapcol = i;
    } 

        public int getrow()
    {
      return row;
    }
        public int getcol()
    {
      return col;
    }
        public int getmaprow()
    {
      return maprow;
    }
        public int getmapcol()
    {
      return mapcol;
    }
}
  


          
