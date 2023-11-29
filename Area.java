import java.util.Random;
import java.util.Scanner;
/**
 * The 'Area' class represents an area in the game arena.
 * It allows the player to explore different areas such as AREA 1, AREA 2, AREA 3
 */
public class Area 
{
    private Random random = new Random();
    int intArea; 
    CreatureList creatureList = new CreatureList();
    Battlephase battlephase = new Battlephase(intArea); 
   
    public boolean encounterCreature() 
    { // 40% chance
      return random.nextDouble() <= 0.4;
    }
/**
 * Print the details and actions available in a specific game area.
 *
 * @param Creatures          The list of available creatures in the game.
 * @param activeCreatureSymbol The symbol representing the active creature.
 * @param inventory           The player's inventory.
 * @param enemyCreatureSymbol The symbol representing enemy creatures.
 */
    public void printArea(CreatureList Creatures, char activeCreatureSymbol, Inventory inventory, char enemyCreatureSymbol)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ARENA!");
        System.out.println("[1] AREA 1");
        System.out.println("[2] AREA 2");
        System.out.println("[3] AREA 3");
        System.out.print("Choose an Area: ");

        int intArea = scanner.nextInt(); 

        this.intArea = intArea; 
      
        switch(intArea) 
        {
        
          case 1: // Area 1
              //area

              if(inventory.getActiveCreature().getEvoLevel() == 1)
              { // only accepts evo lvl 1 for arena 1
                char[][] grid = new char[1][5];
                System.out.println ("ACTIVE CREATURE IS " + inventory.getActiveCreature().getName()); 
                inventory.setActiveCreatureSymbol(activeCreatureSymbol);

                // Place the active creature at (0, 0) in the grid
                grid[0][0] = activeCreatureSymbol;
                int curPos = 0;

                  while (true) 
                  {
                    // Display the board
                    System.out.print("|");
                    for (int i = 0; i < 5; i++) 
                    {
                        System.out.print(grid[0][i] + "|");
                    }
                    System.out.println("");
    
                    // Ask the player for movement input
                    System.out.print("Enter 'L' to move left, 'R' to move right, or 'Q' to quit: ");
                    String move = scanner.next().toUpperCase();
                    
                    if (move.equals("L")) 
                    {
                        // Move the active creature left
                        if (curPos > 0) 
                        {
                            grid[0][curPos] = ' '; // Clear the current position
                            curPos--;
                            grid[0][curPos] = activeCreatureSymbol; // Set the new position
                            if(encounterCreature())
                            {
                              System.out.println("its true 40 left check");
                              Battlephase battlephase = new Battlephase(intArea);
                              battlephase.printBattlePhase(inventory);

                            }
                            
                        } 
                        else 
                        {
                            System.out.println("Cannot move left. You are at the leftmost position.");
                        }
                    } 
                    else if (move.equals("R")) 
                    {
                        // Move the active creature right
                        if (curPos < 5 - 1) 
                        {
                            grid[0][curPos] = ' '; // Clear the current position
                            curPos++;
                            grid[0][curPos] = activeCreatureSymbol; // Set the new position
                            if(encounterCreature())
                            {
                              System.out.println("its true 40 right check");
                              Battlephase battlephase = new Battlephase(intArea);
                              battlephase.printBattlePhase(inventory);

                            }
                        } 
                        else 
                        {
                            System.out.println("Cannot move right. You are at the rightmost position.");
                        }
                    } 
                    else if (move.equals("Q")) 
                    {
                        // Quit the area 
                      break;
                    } 
                  else 
                  {
                      System.out.println("Invalid input. Please enter 'L', 'R', or 'Q'.");
                  }
                }
              } 
            
            else 
              {
              System.out.println("Evolution level 1 Only!");
              }   
              break;
          case 2: // Area 2
              if(inventory.getActiveCreature().getEvoLevel() == 1 || inventory.getActiveCreature().getEvoLevel() == 2) 
              
              { // Accepts evo lvl 1 and 2 for arena 2
              
              char[][] grid = new char[3][3];
              System.out.println ("ACTIVE CREATURE IS " + inventory.getActiveCreature().getName()); 
              inventory.setActiveCreatureSymbol(activeCreatureSymbol);

              // Place the active creature at (0, 0) in the grid
              // grid[0][0] = activeCreatureSymbol;
              // int curPos = 0;

              // Place the active creature at (1, 1) in the grid (center)
              int curRow = 0;
              int curCol = 0;
              grid[curRow][curCol] = activeCreatureSymbol;

                while (true) 
                {     
                  // Display the board
                  for(int i = 0; i < 3; i++) 
                  {
                    System.out.print("|");

                    for (int j = 0; j < 3; j++) 
                    {
                        System.out.print(grid[i][j] + "|");
                    }
                    System.out.println(); // Move to the next line after each row
                  }

                    // Ask the player for movement input
                    System.out.print("Enter 'L' to move left, 'R' to move right, 'U' to move up, 'D' to move down or 'Q' to quit: ");
                    String move = scanner.next().toUpperCase();

                    if (move.equals("L"))  // Move Left 
                    {
                        // Move the active creature left
                        if (curCol > 0) 
                        {
                            grid[curRow][curCol] = ' '; // Clear the current position
                            curCol--;
                            grid[curRow][curCol] = activeCreatureSymbol; // Set the new position
                            if(encounterCreature())
                            {
                              System.out.println("its true 40 left check");
                              Battlephase battlephase = new Battlephase(intArea);
                              battlephase.printBattlePhase(inventory);

                            }
                            
                        } 
                        else 
                        {
                            System.out.println("Cannot move left. You are at the leftmost position.");
                        }
                    } 

                    else if (move.equals("R")) // Move Right
                    {
                        // Move the active creature right
                        if (curCol < 2) 
                        {
                            grid[curRow][curCol] = ' '; // Clear the current position
                            curCol++;
                            grid[curRow][curCol] = activeCreatureSymbol; // Set the new position
                            if(encounterCreature())
                            {
                              System.out.println("its true 40 right check");
                              Battlephase battlephase = new Battlephase(intArea);
                              battlephase.printBattlePhase(inventory);

                            }
                        } 
                        else 
                        {
                            System.out.println("Cannot move right. You are at the rightmost position.");
                        }
                    }
                    else if(move.equals("U"))
                    {
                      if(curRow > 0) 
                      {
                        grid[curRow][curCol] = ' '; //Clear current position
                        curRow--;
                        grid[curRow][curCol] = activeCreatureSymbol; // Set New Position
                        if (encounterCreature()) 
                        {
                          System.out.println("It's true 40 down check");
                          Battlephase battlephase = new Battlephase(intArea);
                          battlephase.printBattlePhase(inventory);
                        }

                        else 
                        {
                          System.out.println("Can't move up any further");
                        }
                      }
                    } 
                    else if(move.equals("D")) 
                    {
                      if(curRow < 2) 
                      {
                        grid[curRow][curCol] = ' '; //Clear current position
                        curRow++;
                        grid[curRow][curCol] = activeCreatureSymbol; // Set New Position
                        if (encounterCreature()) 
                        {
                          System.out.println("It's true 40 down check");
                          Battlephase battlephase = new Battlephase(intArea);
                          battlephase.printBattlePhase(inventory);
                        }

                        else 
                        {
                          System.out.println("Can't move down any further");
                        }
                      }
                    }
                    else if (move.equals("Q")) 
                    {
                      // Quit the area 
                      break;
                    } 



                }

              } 

              else 
              {
              System.out.println("Evolution level 1 and 2 Creatures Only!");
              }  
              break;
          case 3: // Area 3
              if(inventory.getActiveCreature().getEvoLevel() == 1 || inventory.getActiveCreature().getEvoLevel() == 2 || inventory.getActiveCreature().getEvoLevel() == 3) 
              
              { // Accepts evo lvl 1 and 2 for arena 2
              
              char[][] grid = new char[4][4];
              System.out.println ("ACTIVE CREATURE IS " + inventory.getActiveCreature().getName()); 
              inventory.setActiveCreatureSymbol(activeCreatureSymbol);

              // Place the active creature at (0, 0) in the grid
              // grid[0][0] = activeCreatureSymbol;
              // int curPos = 0;

              // Place the active creature at (1, 1) in the grid (center)
              int curRow = 0;
              int curCol = 0;
              grid[curRow][curCol] = activeCreatureSymbol;

                while (true) 
                {     
                  // Display the board
                  for(int i = 0; i < 4; i++) 
                  {
                    System.out.print("|");

                    for (int j = 0; j < 4; j++) 
                    {
                        System.out.print(grid[i][j] + "|");
                    }
                    System.out.println(); // Move to the next line after each row
                  }
                  
                    // Ask the player for movement input
                    System.out.print("Enter 'L' to move left, 'R' to move right, 'U' to move up, 'D' to move down or 'Q' to quit: ");
                    String move = scanner.next().toUpperCase();

                    if (move.equals("L"))  // Move Left 
                    {
                        // Move the active creature left
                        if (curCol > 0) 
                        {
                            grid[curRow][curCol] = ' '; // Clear the current position
                            curCol--;
                            grid[curRow][curCol] = activeCreatureSymbol; // Set the new position
                            if(encounterCreature())
                            {
                              System.out.println("its true 40 left check");
                              Battlephase battlephase = new Battlephase(intArea);
                              battlephase.printBattlePhase(inventory);

                            }
                            
                        } 
                        else 
                        {
                            System.out.println("Cannot move left. You are at the leftmost position.");
                        }
                    } 

                    else if (move.equals("R")) // Move Right
                    {
                        // Move the active creature right
                        if (curCol < 2) 
                        {
                            grid[curRow][curCol] = ' '; // Clear the current position
                            curCol++;
                            grid[curRow][curCol] = activeCreatureSymbol; // Set the new position
                            if(encounterCreature())
                            {
                              System.out.println("its true 40 right check");
                              Battlephase battlephase = new Battlephase(intArea);
                              battlephase.printBattlePhase(inventory);

                            }
                        } 
                        else 
                        {
                            System.out.println("Cannot move right. You are at the rightmost position.");
                        }
                    }
                    else if(move.equals("U"))
                    {
                      if(curRow > 0) 
                      {
                        grid[curRow][curCol] = ' '; //Clear current position
                        curRow--;
                        grid[curRow][curCol] = activeCreatureSymbol; // Set New Position
                        if (encounterCreature()) 
                        {
                          System.out.println("It's true 40 down check");
                          Battlephase battlephase = new Battlephase(intArea);
                          battlephase.printBattlePhase(inventory);
                        }

                        else 
                        {
                          System.out.println("Can't move up any further");
                        }
                      }
                    } 
                    else if(move.equals("D")) 
                    {
                      if(curRow < 2) 
                      {
                        grid[curRow][curCol] = ' '; //Clear current position
                        curRow++;
                        grid[curRow][curCol] = activeCreatureSymbol; // Set New Position
                        if (encounterCreature()) 
                        {
                          System.out.println("It's true 40 down check");
                          Battlephase battlephase = new Battlephase(intArea);
                          battlephase.printBattlePhase(inventory);
                        }

                        else 
                        {
                          System.out.println("Can't move down any further");
                        }
                      }
                    }
                    else if (move.equals("Q")) 
                    {
                      // Quit the area 
                      break;
                    } 



                }

              } 

              else 
              {
              System.out.println("Evolution level 1 and 2 Creatures Only!");
              }  
              break;
          default:
              System.out.println("Error input!");
              break;
        }
     }
  
}
  


          
