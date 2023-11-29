import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.tools.Tool;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class gui extends JFrame 
{
    private JTextArea outputTextArea;
    private JPanel buttonPanel;
    private ArrayList<Creatures> ownedCreatures = new ArrayList<>(); 
    
//    GameActions actions = new GameActions(player,garden);
    CreatureList creatureList = new CreatureList();
    Inventory inventory = new Inventory(creatureList);
    Area area = new Area();
    Battlephase battlephase = new Battlephase();
    JPanel panelWest = new JPanel();
    JPanel panelCenter = new JPanel();
    JPanel panelCenterNorth = new JPanel();
    JTextArea display = new JTextArea(11,1);
    JLabel[][] display1 = new JLabel[5][5];
    JPanel panelSouth = new JPanel();
    JButton[][] starterCreature = new JButton[4][4];
    JButton[] options = new JButton[5];
    final int[] chosenTileRow = {0};
    final int[] chosenTileCol = {0};
    ImageIcon iconLogo1 = new ImageIcon("FamilyA_1.png");
    ImageIcon iconLogo2 = new ImageIcon("FamilyA_2.png");
    ImageIcon iconLogo3 = new ImageIcon("FamilyA_3.png");

    ImageIcon iconLogo4 = new ImageIcon("FamilyB_1.png");
    ImageIcon iconLogo5 = new ImageIcon("FamilyB_2.png");
    ImageIcon iconLogo6 = new ImageIcon("FamilyB_3.png");

    ImageIcon iconLogo7 = new ImageIcon("FamilyC_1.png");
    ImageIcon iconLogo8 = new ImageIcon("FamilyC_2.png");
    ImageIcon iconLogo9 = new ImageIcon("FamilyC_3.png");

    ImageIcon iconLogo10 = new ImageIcon("FamilyD_1.png");
    ImageIcon iconLogo11 = new ImageIcon("FamilyD_2.png");
    ImageIcon iconLogo12 = new ImageIcon("FamilyD_3.png");

    ImageIcon iconLogo13 = new ImageIcon("FamilyE_1.png");
    ImageIcon iconLogo14 = new ImageIcon("FamilyE_2.png");
    ImageIcon iconLogo15 = new ImageIcon("FamilyE_3.png");

    ImageIcon iconLogo16 = new ImageIcon("FamilyF_1.png");
    ImageIcon iconLogo17 = new ImageIcon("FamilyF_2.png");
    ImageIcon iconLogo18 = new ImageIcon("FamilyF_3.png");

    ImageIcon iconLogo19 = new ImageIcon("FamilyG_1.png");
    ImageIcon iconLogo20 = new ImageIcon("FamilyG_2.png");
    ImageIcon iconLogo21 = new ImageIcon("FamilyG_3.png");

    ImageIcon iconLogo22 = new ImageIcon("FamilyH_1.png");
    ImageIcon iconLogo23 = new ImageIcon("FamilyH_2.png");
    ImageIcon iconLogo24 = new ImageIcon("FamilyH_3.png");

    ImageIcon iconLogo25 = new ImageIcon("FamilyI_1.png");
    ImageIcon iconLogo26 = new ImageIcon("FamilyI_2.png");
    ImageIcon iconLogo27 = new ImageIcon("FamilyI_3.png");

    public gui() 
    {
        super("Creature game");
        setLayout(new BorderLayout());

        //actual game
        init();

        //settings for the frame
        setSize(1000,700);
        setLocationRelativeTo(null);//to make it appear in the center
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void init() 
    {
        //gui layout
        panelWest.setLayout(new GridBagLayout());
        add(panelWest, BorderLayout.WEST);
        panelCenter.add(panelCenterNorth,BorderLayout.NORTH);
        panelCenter.setBorder(BorderFactory.createTitledBorder("Choose your Creature"));
        add(panelCenter,BorderLayout.CENTER);//panel in the center north
        panelWest.add(display);
        panelWest.setBorder(new EmptyBorder(10, 10, 10, 10));

        createStarter(3,3);

        setStarterCreature();

    }

    public void setStarterCreature() 
    {
        
        starterCreature[0][0].setText("[1] Strawander");
        starterCreature[0][1].setText("[2] Chocowool");
        starterCreature[0][2].setText("[3] Parfwit");
        starterCreature[1][0].setText("[4] Brownisaur");
        starterCreature[1][1].setText("[5] Frubat");
        starterCreature[1][2].setText("[6] Malts");
        starterCreature[2][0].setText("[7] Squirpie");
        starterCreature[2][1].setText("[8] Chocolite");
        starterCreature[2][2].setText("[9] Oshacone");
        
        //add button functionality
        starterCreature[0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                inventory.addCreature(creatureList.getCreaturefromList(0));
                inventory.setActiveCreature(0); 

                reset(4);
                setMainOptions();
            }
        });
        starterCreature[0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventory.addCreature(creatureList.getCreaturefromList(1));
                inventory.setActiveCreature(0); 

                reset(4);
                setMainOptions();
            }
        });
        starterCreature[0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventory.addCreature(creatureList.getCreaturefromList(2));
                inventory.setActiveCreature(0); 

                reset(4);
                setMainOptions();
            }
        });
        starterCreature[1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventory.addCreature(creatureList.getCreaturefromList(3));
                inventory.setActiveCreature(0); 

                reset(4);
                setMainOptions();
            }
        });
        starterCreature[1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventory.addCreature(creatureList.getCreaturefromList(4));
                inventory.setActiveCreature(0); 

                reset(4);
                setMainOptions();
            }
        });
        starterCreature[1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventory.addCreature(creatureList.getCreaturefromList(5));
                inventory.setActiveCreature(0); 

                reset(4);
                setMainOptions();
            }
        });
        starterCreature[2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventory.addCreature(creatureList.getCreaturefromList(6));
                inventory.setActiveCreature(0); 

                reset(4);
                setMainOptions();
            }
        });
        starterCreature[2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventory.addCreature(creatureList.getCreaturefromList(7));
                inventory.setActiveCreature(0); 

                reset(4);
                setMainOptions();
            }
        });
        starterCreature[2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventory.addCreature(creatureList.getCreaturefromList(8));
                inventory.setActiveCreature(0); 

                reset(4);
                setMainOptions();
            }
        });
        
    }

    public void openInventory(int cnum1, int cnum2, int cnum3, int cnum4, int cnum5,int cnum6, int cnum7, int cnum8,int cnum9, int type){
        
        int check = inventory.getArrayListSize() - 1;

        if(check >= cnum1)
        starterCreature[0][0].setText("[1] " + inventory.creatureinfo(cnum1));
        else
        starterCreature[0][0].setText("[1] Empty" );

        if(check >= cnum2)
        starterCreature[0][1].setText("[2] " + inventory.getName(cnum2));
        else
        starterCreature[0][1].setText("[2] Empty" );

        if(check >= cnum3)
        starterCreature[0][2].setText("[3] " + inventory.getName(cnum3));
        else
        starterCreature[0][2].setText("[3] Empty" );

        if(check >= cnum4)
        starterCreature[1][0].setText("[4] " + inventory.getName(cnum4));
        else
        starterCreature[1][0].setText("[4] Empty" );

        if(check >= cnum5)
        starterCreature[1][1].setText("[5] " + inventory.getName(cnum5));
        else
        starterCreature[1][1].setText("[5] Empty" );

        if(check >= cnum6)
        starterCreature[1][2].setText("[6] " + inventory.getName(cnum6));
        else
        starterCreature[1][2].setText("[6] Empty" );

        if(check >= cnum7)
        starterCreature[2][0].setText("[7] " + inventory.getName(cnum7));
        else
        starterCreature[2][0].setText("[7] Empty" );

        if(check >= cnum8)
        starterCreature[2][1].setText("[8] " + inventory.getName(cnum8));
        else
        starterCreature[2][1].setText("[8] Empty" );

        if(check >= cnum9)
        starterCreature[2][2].setText("[9] " + inventory.getName(cnum9));
        else
        starterCreature[2][2].setText("[9] Empty" );

        starterCreature[3][0].setText("Back");
        starterCreature[3][1].setText("Exit");
        starterCreature[3][2].setText("Next");

        starterCreature[0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0)
                {
                inventory.setActiveCreature(cnum1); 
                reset(4);
                setMainOptions();
                }
                else if (type == 1)
                {
                    if(check >= cnum1)
                    {
                        inventory.Creature1(inventory.creatureNumber(cnum1));
                        inventory.Creature1Location(cnum1);
                        reset(4);
                        setEvolveActions();
                    }

                }
                else if (type == 2)
                {
                    if(check >= cnum1)
                    {
                        inventory.Creature2(inventory.creatureNumber(cnum1));
                        inventory.Creature2Location(cnum1);
                        reset(4);
                        setEvolveActions();
                    }
                }
                else if (type == 3)
                {
                    if(check >= cnum1)
                    {
                        int row = area.getrow();
                        int col = area.getcol();
                        int maprow = area.getmaprow();
                        int mapcol = area.getmapcol();
                        int actions = battlephase.getactions();
                        inventory.ActiveCreatureChange(cnum1);
                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, actions);
                    }
                }
            }
        });
        starterCreature[0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0)
                {
                inventory.setActiveCreature(cnum2); 
                reset(4);
                setMainOptions();
                }
                else if (type == 1)
                {
                    if(check >= cnum2)
                    {
                        inventory.Creature1(inventory.creatureNumber(cnum2));
                        inventory.Creature1Location(cnum2);
                        reset(4);
                        setEvolveActions();
                    }

                }
                else if (type == 2)
                {
                    if(check >= cnum2)
                    {
                        inventory.Creature2(inventory.creatureNumber(cnum2));
                        inventory.Creature2Location(cnum2);
                        reset(4);
                        setEvolveActions();
                    }
                }
                else if (type == 3)
                {
                    if(check >= cnum2)
                    {
                        int row = area.getrow();
                        int col = area.getcol();
                        int maprow = area.getmaprow();
                        int mapcol = area.getmapcol();
                        int actions = battlephase.getactions();
                        inventory.ActiveCreatureChange(cnum2);
                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, actions);
                    }
                }
            }
        });
        starterCreature[0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0)
                {
                inventory.setActiveCreature(cnum3); 
                reset(4);
                setMainOptions();
                }
                else if (type == 1)
                {
                    if(check >= cnum3)
                    {
                        inventory.Creature1(inventory.creatureNumber(cnum3));
                        inventory.Creature1Location(cnum3);
                        reset(4);
                        setEvolveActions();
                    }

                }
                else if (type == 2)
                {
                    if(check >= cnum3)
                    {
                        inventory.Creature2(inventory.creatureNumber(cnum3));
                        inventory.Creature2Location(cnum3);
                        reset(4);
                        setEvolveActions();
                    }
                }
                else if (type == 3)
                {
                    if(check >= cnum3)
                    {
                        int row = area.getrow();
                        int col = area.getcol();
                        int maprow = area.getmaprow();
                        int mapcol = area.getmapcol();
                        int actions = battlephase.getactions();
                        inventory.ActiveCreatureChange(cnum3);
                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, actions);
                    }
                }
            }
        });
        starterCreature[1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0)
                {
                inventory.setActiveCreature(cnum4); 
                reset(4);
                setMainOptions();
                }
                else if (type == 1)
                {
                    if(check >= cnum4)
                    {
                        inventory.Creature1(inventory.creatureNumber(cnum4));
                        inventory.Creature1Location(cnum4);
                        reset(4);
                        setEvolveActions();
                    }

                }
                else if (type == 2)
                {
                    if(check >= cnum4)
                    {
                        inventory.Creature2(inventory.creatureNumber(cnum4));
                        inventory.Creature2Location(cnum4);
                        reset(4);
                        setEvolveActions();
                    }
                }
                else if (type == 3)
                {
                    if(check >= cnum4)
                    {
                        int row = area.getrow();
                        int col = area.getcol();
                        int maprow = area.getmaprow();
                        int mapcol = area.getmapcol();
                        int actions = battlephase.getactions();
                        inventory.ActiveCreatureChange(cnum4);
                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, actions);
                    }
                }
            }
        });
        starterCreature[1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0)
                {
                inventory.setActiveCreature(cnum5); 
                reset(4);
                setMainOptions();
                }
                else if (type == 1)
                {
                    if(check >= cnum5)
                    {
                        inventory.Creature1(inventory.creatureNumber(cnum5));
                        inventory.Creature1Location(cnum5);
                        reset(4);
                        setEvolveActions();
                    }

                }
                else if (type == 2)
                {
                    if(check >= cnum5)
                    {
                        inventory.Creature2(inventory.creatureNumber(cnum5));
                        inventory.Creature2Location(cnum5);
                        reset(4);
                        setEvolveActions();
                    }
                }
                else if (type == 3)
                {
                    if(check >= cnum5)
                    {
                        int row = area.getrow();
                        int col = area.getcol();
                        int maprow = area.getmaprow();
                        int mapcol = area.getmapcol();
                        int actions = battlephase.getactions();
                        inventory.ActiveCreatureChange(cnum5);
                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, actions);
                    }
                }
            }
        });
        starterCreature[1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0)
                {
                inventory.setActiveCreature(cnum6); 
                reset(4);
                setMainOptions();
                }
                else if (type == 1)
                {
                    if(check >= cnum6)
                    {
                        inventory.Creature1(inventory.creatureNumber(cnum6));
                        inventory.Creature1Location(cnum6);
                        reset(4);
                        setEvolveActions();
                    }

                }
                else if (type == 2)
                {
                    if(check >= cnum6)
                    {
                        inventory.Creature2(inventory.creatureNumber(cnum6));
                        inventory.Creature2Location(cnum6);
                        reset(4);
                        setEvolveActions();
                    }
                }
                else if (type == 3)
                {
                    if(check >= cnum6)
                    {
                        int row = area.getrow();
                        int col = area.getcol();
                        int maprow = area.getmaprow();
                        int mapcol = area.getmapcol();
                        int actions = battlephase.getactions();
                        inventory.ActiveCreatureChange(cnum6);
                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, actions);
                    }
                }
            }
        });
        starterCreature[2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0)
                {
                inventory.setActiveCreature(cnum7); 
                reset(4);
                setMainOptions();
                }
                else if (type == 1)
                {
                    if(check >= cnum7)
                    {
                        inventory.Creature1(inventory.creatureNumber(cnum7));
                        inventory.Creature1Location(cnum7);
                        reset(4);
                        setEvolveActions();
                    }

                }
                else if (type == 2)
                {
                    if(check >= cnum7)
                    {
                        inventory.Creature2(inventory.creatureNumber(cnum7));
                        inventory.Creature2Location(cnum7);
                        reset(4);
                        setEvolveActions();
                    }
                }
                else if (type == 3)
                {
                    if(check >= cnum7)
                    {
                        int row = area.getrow();
                        int col = area.getcol();
                        int maprow = area.getmaprow();
                        int mapcol = area.getmapcol();
                        int actions = battlephase.getactions();
                        inventory.ActiveCreatureChange(cnum7);
                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, actions);
                    }
                }
            }
        });
        starterCreature[2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0)
                {
                inventory.setActiveCreature(cnum8); 
                reset(4);
                setMainOptions();
                }
                else if (type == 1)
                {
                    if(check >= cnum8)
                    {
                        inventory.Creature1(inventory.creatureNumber(cnum8));
                        inventory.Creature1Location(cnum8);
                        reset(4);
                        setEvolveActions();
                    }

                }
                else if (type == 2)
                {
                    if(check >= cnum8)
                    {
                        inventory.Creature2(inventory.creatureNumber(cnum8));
                        inventory.Creature2Location(cnum8);
                        reset(4);
                        setEvolveActions();
                    }
                }
                else if (type == 3)
                {
                    if(check >= cnum8)
                    {
                        int row = area.getrow();
                        int col = area.getcol();
                        int maprow = area.getmaprow();
                        int mapcol = area.getmapcol();
                        int actions = battlephase.getactions();
                        inventory.ActiveCreatureChange(cnum8);
                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, actions);
                    }
                }
            }
        });
        starterCreature[2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0)
                {
                inventory.setActiveCreature(cnum9); 
                reset(4);
                setMainOptions();
                }
                else if (type == 1)
                {
                    if(check >= cnum9)
                    {
                        inventory.Creature1(inventory.creatureNumber(cnum9));
                        inventory.Creature1Location(cnum9);
                        reset(4);
                        setEvolveActions();
                    }

                }
                else if (type == 2)
                {
                    if(check >= cnum9)
                    {
                        inventory.Creature2(inventory.creatureNumber(cnum9));
                        inventory.Creature2Location(cnum9);
                        reset(4);
                        setEvolveActions();
                    }
                }
                else if (type == 3)
                {
                    if(check >= cnum9)
                    {
                        int row = area.getrow();
                        int col = area.getcol();
                        int maprow = area.getmaprow();
                        int mapcol = area.getmapcol();
                        int actions = battlephase.getactions();
                        inventory.ActiveCreatureChange(cnum9);
                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, actions);
                    }
                }
            }
        });

        starterCreature[3][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                createStarter(4,3);
                if (cnum1 != 0)
                openInventory(cnum1 - 9,cnum2 - 9,cnum3 - 9,cnum4 - 9,cnum5 - 9, cnum6 - 9, cnum7 - 9, cnum8 - 9, cnum9 - 9, type - 9);
                else
                openInventory(cnum1, cnum2, cnum3, cnum4, cnum5, cnum6, cnum7, cnum8, cnum9, type);
            }
        });
        starterCreature[3][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset(4);
                setMainOptions();
            }
        });
        starterCreature[3][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                createStarter(4,3); 
                openInventory(cnum1 + 9 ,cnum2 + 9 ,cnum3 + 9,cnum4 + 9,cnum5 + 9, cnum6 + 9, cnum7 + 9, cnum8 + 9, cnum9 + 9, type + 9);
            }
        });
    }

    public void setArea(int row, int col, int maprow, int mapcol) {
        
        createArea(row, col, maprow, mapcol);

        //System.out.println(row + col + maprow + mapcol);

        options[0].setText("[1] Up");
        options[1].setText("[2] Left");
        options[2].setText("[3] Right");
        options[3].setText("[4] Down");
        options[4].setText("[5] Exit");
        

        //add button functionality
        options[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteNorthCenter();
    
                reset(5);
                if(row == 0){
                    setArea(row,col,maprow,mapcol);
                }
                else
                {
                    if(area.encounterCreature())
                    {
                        battlephase.updateHealth();
                        if(mapcol == 5){
                            battlephase.battle1();
                        }
                        else if(mapcol == 3){
                            battlephase.battle2();
                        }
                        else {
                            battlephase.battle3();
                        }

                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, 2);
                    }
                    else
                    setArea(row-1,col,maprow,mapcol);
                }
            }
        });
        options[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteNorthCenter();
                reset(5);
                if(col == 0){
                    setArea(row,col,maprow,mapcol);
                }
                else
                {
                    if(area.encounterCreature())
                    {
                        battlephase.updateHealth();
                        if(mapcol == 5){
                            battlephase.battle1();
                        }
                        else if(mapcol == 3){
                            battlephase.battle2();
                        }
                        else {
                            battlephase.battle3();
                        }

                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, 2);
                    }
                    else
                    setArea(row,col-1,maprow,mapcol);
                }
            }
        });
        options[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteNorthCenter();
                reset(5);
                if(col == mapcol - 1){
                    setArea(row,col,maprow,mapcol);
                }
                else
                {
                    if(area.encounterCreature())
                    {
                        battlephase.updateHealth();
                        if(mapcol == 5){
                            battlephase.battle1();
                        }
                        else if(mapcol == 3){
                            battlephase.battle2();
                        }
                        else {
                            battlephase.battle3();
                        }

                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, 2);
                    }
                    else
                    setArea(row,col+1,maprow,mapcol);
                }
            }
        });
        options[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteNorthCenter();
                reset(5);
                if(row == maprow - 1){
                    setArea(row,col,maprow,mapcol);
                }
                else
                {
                    if(area.encounterCreature())
                    {
                        battlephase.updateHealth();
                        if(mapcol == 5){
                            battlephase.battle1();
                        }
                        else if(mapcol == 3){
                            battlephase.battle2();
                        }
                        else {
                            battlephase.battle3();
                        }
                        
                        reset(4);
                        setBattlephase(row, col, maprow, mapcol, 2);
                    }
                    else
                    setArea(row+1,col,maprow,mapcol);
                }
            }
        });
        options[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteNorthCenter();
                reset(4);
                setMainOptions();
            }
        });

    }

    public void selectArea() {
        
        options[0].setText("[1] Area 1");
        options[1].setText("[2] Area 2");
        options[2].setText("[3] Area 3");

        //add button functionality
        options[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCenter.setBorder(BorderFactory.createTitledBorder("Area 1"));
                reset(5);
                area.returnintArea(1);
                //give Area.java its intArea for battlephase
                setArea(0,0,1,5); //playerlocation is 0,0, false"for battle if"
                //setArea(row(0),col(0),maprow(1),mapcol(5));
                
            }
        });
        options[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCenter.setBorder(BorderFactory.createTitledBorder("Area 2"));
                reset(5);
                area.returnintArea(2);
                setArea(1,1,3,3);
                //setArea(row(0),col(0),maprow(3),mapcol(3));
            }
        });
        options[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCenter.setBorder(BorderFactory.createTitledBorder("Area 3"));
                reset(5);
                area.returnintArea(3);
                setArea(1,1,4,4);
                //setArea(row(0),col(0),maprow(4),mapcol(4));
            }
        });
    }

    public void setMainOptions() 
    {
        panelCenter.setBorder(BorderFactory.createTitledBorder("Creature Game"));

        options[0].setText("[1] View Inventory");
        options[1].setText("[2] Explore Area");
        options[2].setText("[3] Evolve Creature");
        options[3].setText("[4] Exit");

        options[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createStarter(4,3);
                openInventory(0,1,2,3,4,5,6,7,8,1);
            }
        });
        options[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset(3);
                selectArea();
            }
        });
        options[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset(4);
                setEvolveActions();
            }
        });
        options[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //end it all
            }
        });

    }

    public void setBattlephase(int row, int col, int maprow, int mapcol, int actions) 
    {
        int enemyHP = battlephase.getHealth();

        //game instructions 
        display.setText(battlephase.displaybattleinfo(inventory));
        display.setHighlighter(null);
        display.setEditable(false);
        display.setFocusable(false);
        display.setVisible(true);
        panelWest.add(display);
        panelWest.setBorder(new EmptyBorder(10, 10, 10, 10));

        options[0].setText("[1] Attack");
        options[1].setText("[2] Swap");
        options[2].setText("[3] Catch");
        options[3].setText("[4] Run");

        // Images could probably be here

        options[0].addActionListener(new ActionListener() {            
            @Override
            public void actionPerformed(ActionEvent e) {

                //attack action
                battlephase.attack(inventory);
                
                if(actions != 0){
                deleteWest();
                reset(4);
                setBattlephase(row,col,maprow,mapcol,actions-1);
                }
                else if (actions==0)
                {
                deleteWest();
                reset(5);
                setArea(row, col, maprow, mapcol);
                }
                
            }
        });
        options[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                // swap action
                area.returnrow(row);
                area.returncol(col);
                area.returnmaprow(maprow);
                area.returnmapcol(mapcol);
                battlephase.returnactions(actions);
                createStarter(4,3);
                openInventory(0 ,1 ,2 ,3 ,4, 5, 6, 7, 8, 3);

                if(actions == 0){
                deleteWest();
                reset(4);
                setBattlephase(row,col,maprow,mapcol,actions-1);
                }
                else if (actions==0)
                {
                deleteWest();
                reset(5);
                setArea(row, col, maprow, mapcol);
                }
            }
        });
        options[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //catch action
                if(battlephase.catchChanceEnemy(inventory)){
                    deleteWest();
                    battlephase.addenemycreature(inventory);
                    reset(5);
                    setArea(row, col, maprow, mapcol);
                }
                else if(actions != 0){
                deleteWest();
                reset(4);
                setBattlephase(row,col,maprow,mapcol,actions-1);
                }
                else if (actions== 0 || enemyHP == 0)
                {
                deleteWest();
                reset(5);
                setArea(row, col, maprow, mapcol);
                }
            }
        });
        options[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteWest();
                deleteNorthCenter();
                reset(5);
                setArea(row, col, maprow, mapcol);
            }
        });

    }

    public void setEvolveActions()
    {
        int c1 = inventory.getCreature1();
        int c2 = inventory.getCreature2();
        int c1l = inventory.getCreature1Location();
        int c2l = inventory.getCreature2Location();

        options[0].setText("[1] Creature 1");
        options[1].setText("[2] Creature 2");
        options[2].setText("[3] Go"); // Push the button to evolve them
        options[3].setText("[4] Abort");

        options[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createStarter(4,3);
                //reset(0);
                openInventory(0,1,2,3,4,5,6,7,8,1);
            }
        });
        options[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createStarter(4,3);
                //reset(0);
                openInventory(0,1,2,3,4,5,6,7,8,2);
            }
        });
        options[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (c1 == c2 && c1l != c2l)
                {
                    inventory.evolve();
                    deleteNorthCenter();
                    reset(4);
                    setMainOptions();
                }


            }
        });
        options[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset(4);
                setMainOptions();
            }
        });

    }

    public void createArea(int row, int col, int maprow, int mapcol) {
        int mRow = maprow;
        int mCol = mapcol;

        panelCenterNorth.setLayout(new GridLayout(mRow,mCol,40,40));
        
        for (int i = 0; i < mRow ;i++) {
            for (int j = 0; j < mCol ;j++) {

                display1[i][j] = new JLabel();
                
                if(i==row && j == col){
                    display1[i][j].setText("P");

                }
                else
                display1[i][j].setText("X");
                
                panelCenterNorth.add(display1[i][j]);
            }
        }

    }

    public void createoptions(int num){
        panelSouth.setLayout(new GridLayout(num,1,1,1));
        for (int i =0;i<num;i++) {
            options[i] = new JButton();
            panelSouth.add(options[i]);
        }
        add(panelSouth,BorderLayout.SOUTH);// this is for the button near the south side
        panelSouth.setPreferredSize(new Dimension(40,480));
    }

    public void createStarter(int num, int num1){
        panelSouth.removeAll();
        panelSouth.revalidate();
        panelSouth.repaint();
        panelSouth.setLayout(new GridLayout(num,num1,1,1));
        for (int i = 0;i<num;i++) {
            for (int j = 0; j < num1; j++){
            starterCreature[i][j] = new JButton();
            panelSouth.add(starterCreature[i][j]);
            }
        }
        add(panelSouth,BorderLayout.SOUTH);// this is for the button near the south side
        panelSouth.setPreferredSize(new Dimension(40,480));
    }

    public void createBattletext(){
        panelCenterNorth.setLayout(new GridLayout(5,10,40,40));
        for (int i =0;i<5;i++) {
            for (int j = 0;j<10;j++) {
                display1[i][j] = new JLabel();
                
                panelCenterNorth.add(display1[i][j]);
            }
        }
    }

    public void deleteNorthCenter(){
        panelCenterNorth.removeAll();
        panelCenterNorth.revalidate();
        panelCenterNorth.repaint();
    }

    public void deleteWest(){
        panelWest.removeAll();
        panelWest.revalidate();
        panelWest.repaint();
    }

    public void reset(int num){
        chosenTileCol[0]=0;
        chosenTileRow[0]=0;
        panelSouth.removeAll();
        panelSouth.revalidate();
        panelSouth.repaint();
        createoptions(num);
    }

}
