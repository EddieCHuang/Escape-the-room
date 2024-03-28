import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane;


class Main {
  public static void main(String[] args) {

  Scanner scan = new Scanner (System.in);
  
  // inventory items
  String inventory [] = new String [5];
  int count [] = new int [5];
    inventory[0] = "battery";
    count[0] = 0;
    inventory[1] = "red key";
    count[1] = 0;
    inventory[2] = "green key";
    count[2] = 0;
    inventory[3] = "screwdriver";
    count[3] = 0;
    inventory[4] = "statue";
    count[4] = 0;

    
  // control
  String control = "Look"; 

  // room number, important variable.
  int x = 1; // change back to one
  int d1 = 0; // door open or close
  int p = 0; // power for elevator.
  int panel = 0; // panel open or close
  int safe = 0; // safe, hiden or not.
  int door2 = 0; // tell user that the door is unlock.
  int g = 0; // help to show map
  int b = 0; // help display map
  String player = "po"; // player
  int xd = 2; // initial pos
  int yd = 1; // initial pos
  int pos = 1; // no or yes for possiably movement
  int gain = 0; // if taken before.
  int gain1 = 0; // if taken before.
  int gain2 = 0; // if taken before.
  int gain3 = 0; // if taken before.
  int gain4 = 0; // if taken before.
  int show = 0; // show the locks
  
  int loc = 0; // postion change this back to zero
    
  int run = 0; // let the program run.
  int run1 = 0; // let the program run
  int run2 = 0; // let the program run
  int run3 = 0; // let the program run
  int loc7 = 0;
  int loc1 = 0;
  int loc2 = 0;
  int loc3 = 0;
  int loc4 = 0; // change back to 0
  int loc5 = 0;
  int run4 = 0;
  int run5 = 1; // postion going back from 5 to 1
  // loc 7 = postion of player when going from room 2 to room 5
  int gain5 = 0;
  int gain6 = 0;
  int color = 135;
  int color1 = 206;
  int color2 = 235;
  String colorwant;
  int z = 23; // control of map for GUI


    
    
  // variable for lock 1, with three number
  int apple, bread, juice;
  apple = (int)(Math.random()*9);
  bread = (int)(Math.random()*9);
  juice = (int)(Math.random()*9);
  int lockonep1, lockonep2, lockonep3;
    
  // Variale for lock 2, with four number
  int locktwop1, locktwop2, locktwop3, locktwop4;
    
  // variable for the letter lock one .
  char letterlockp1, letterlockp2, letterlockp3, letterlockp4, letterlockp5;

  // variable for the riddle lock
  char riddlep1, riddlep2, riddlep3, riddlep4;

  // variable for the color lock
  char colorp1, colorp2, colorp3;
  
  



    

System.out.println("Enter command, no caps");
System.out.println("If you need help, type help");
System.out.println("To access inventory, type inv");
System.out.println("");
    






    



// hiden map

  String map [][] = new String[10][10];
  map [0][0] = "wl";
  map [0][1] = "wl";
  map [0][2] = "wl";
  map [0][3] = "wl";
  map [0][4] = "dr";
  map [0][5] = "dr";
  map [0][6] = "wl";
  map [0][7] = "wl";
  map [0][8] = "wl";
  map [0][9] = "wl";
  map [1][0] = "wl";
  map [1][1] = "bd";
  map [1][2] = "  ";
  map [1][3] = "  ";
  map [1][4] = "  ";
  map [1][5] = "  ";
  map [1][6] = "  ";
  map [1][7] = "  ";
  map [1][8] = "ck";
  map [1][9] = "wl";
  map [2][0] = "wl";
  map [2][1] = "bd";
  map [2][2] = "  ";
  map [2][3] = "  ";
  map [2][4] = "  ";
  map [2][5] = "  ";
  map [2][6] = "  ";
  map [2][7] = "  ";
  map [2][8] = "  ";
  map [2][9] = "wl";
  map [3][0] = "wl";
  map [3][1] = "  ";
  map [3][2] = "  ";
  map [3][3] = "  ";
  map [3][4] = "  ";
  map [3][5] = "  ";
  map [3][6] = "  ";
  map [3][7] = "  ";
  map [3][8] = "  ";
  map [3][9] = "wl";
  map [4][0] = "wl";
  map [4][1] = "  ";
  map [4][2] = "  ";
  map [4][3] = "  ";
  map [4][4] = "  ";
  map [4][5] = "  ";
  map [4][6] = "  ";
  map [4][7] = "  ";
  map [4][8] = "  ";
  map [4][9] = "wl";
  map [5][0] = "wl";
  map [5][1] = "  ";
  map [5][2] = "  ";
  map [5][3] = "rd";
  map [5][4] = "dk";
  map [5][5] = "dk";
  map [5][6] = "dk";
  map [5][7] = "  ";
  map [5][8] = "  ";
  map [5][9] = "wl";
  map [6][0] = "wl";
  map [6][1] = "  ";
  map [6][2] = "  ";
  map [6][3] = "dk";
  map [6][4] = "dk";
  map [6][5] = "dk";
  map [6][6] = "dk";
  map [6][7] = "  ";
  map [6][8] = "  ";
  map [6][9] = "wl";
  map [7][0] = "wl";
  map [7][1] = "  ";
  map [7][2] = "  ";
  map [7][3] = "  ";
  map [7][4] = "  ";
  map [7][5] = "  ";
  map [7][6] = "  ";
  map [7][7] = "  ";
  map [7][8] = "  ";
  map [7][9] = "wl";
  map [8][0] = "wl";
  map [8][1] = "bk";
  map [8][2] = "bk";
  map [8][3] = "  ";
  map [8][4] = "  ";
  map [8][5] = "  ";
  map [8][6] = "  ";
  map [8][7] = "  ";
  map [8][8] = "  ";
  map [8][9] = "wl";
  map [9][0] = "wl";
  map [9][1] = "wl";
  map [9][2] = "wl";
  map [9][3] = "wl";
  map [9][4] = "wl";
  map [9][5] = "wl";
  map [9][6] = "wl";
  map [9][7] = "wl";
  map [9][8] = "wl";
  map [9][9] = "wl";

    JFrame theGUI = new JFrame();
    theGUI.setTitle("Maze");
    theGUI.setSize(400, 400);
    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel1 = new JPanel();
    panel1.setBackground(Color.black);
    JPanel panel2 = new JPanel();
    panel2.setBackground(Color.black);
    JPanel panel3 = new JPanel ();
    panel3.setBackground(Color.black);
    JPanel panel4 = new JPanel ();
    panel4.setBackground(Color.black);
    JPanel panel5 = new JPanel ();
    panel5.setBackground(new Color(93, 41, 6));
    JPanel panel6 = new JPanel ();
    panel6.setBackground(new Color(93, 41, 6));
    JPanel panel7 = new JPanel ();
    panel7.setBackground(Color.black);
    JPanel panel8 = new JPanel ();
    panel8.setBackground(Color.black);
    JPanel panel9 = new JPanel ();
    panel9.setBackground(Color.black);
    JPanel panel10 = new JPanel ();
    panel10.setBackground(Color.black);
    JPanel panel11 = new JPanel();
    panel11.setBackground(Color.black);
    JPanel panel12 = new JPanel();
    panel12.setBackground(Color.red);
    JPanel panel13 = new JPanel ();
    panel13.setBackground(Color.white);
    JPanel panel14 = new JPanel ();
    panel14.setBackground(Color.white);
    JPanel panel15 = new JPanel ();
    panel15.setBackground(Color.white);
    JPanel panel16 = new JPanel ();
    panel16.setBackground(Color.white);
    JPanel panel17 = new JPanel ();
    panel17.setBackground(Color.white);
    JPanel panel18 = new JPanel ();
    panel18.setBackground(Color.white);
    JPanel panel19 = new JPanel ();
    panel19.setBackground(new Color(255,215,0));
    JPanel panel20 = new JPanel ();
    panel20.setBackground(Color.black);
    JPanel panel21 = new JPanel();
    panel21.setBackground(Color.black);
    JPanel panel22 = new JPanel();
    panel22.setBackground(Color.red);
    JPanel panel23 = new JPanel ();
    panel23.setBackground(Color.white);
    JPanel panel24 = new JPanel ();
    panel24.setBackground(Color.white);
    JPanel panel25 = new JPanel ();
    panel25.setBackground(Color.white);
    JPanel panel26 = new JPanel ();
    panel26.setBackground(Color.white);
    JPanel panel27 = new JPanel ();
    panel27.setBackground(Color.white);
    JPanel panel28 = new JPanel ();
    panel28.setBackground(Color.white);
    JPanel panel29 = new JPanel ();
    panel29.setBackground(Color.white);
    JPanel panel30 = new JPanel ();
    panel30.setBackground(Color.black);
    JPanel panel31 = new JPanel();
    panel31.setBackground(Color.black);
    JPanel panel32 = new JPanel();
    panel32.setBackground(Color.white);
    JPanel panel33 = new JPanel ();
    panel33.setBackground(Color.white);
    JPanel panel34 = new JPanel ();
    panel34.setBackground(Color.white);
    JPanel panel35 = new JPanel ();
    panel35.setBackground(Color.white);
    JPanel panel36 = new JPanel ();
    panel36.setBackground(Color.white);
    JPanel panel37 = new JPanel ();
    panel37.setBackground(Color.white);
    JPanel panel38 = new JPanel ();
    panel38.setBackground(Color.white);
    JPanel panel39 = new JPanel ();
    panel39.setBackground(Color.white);
    JPanel panel40 = new JPanel ();
    panel40.setBackground(Color.black);
    JPanel panel41 = new JPanel();
    panel41.setBackground(Color.black);
    JPanel panel42 = new JPanel();
    panel42.setBackground(Color.white);
    JPanel panel43 = new JPanel ();
    panel43.setBackground(Color.white);
    JPanel panel44 = new JPanel ();
    panel44.setBackground(Color.white);
    JPanel panel45 = new JPanel ();
    panel45.setBackground(Color.white);
    JPanel panel46 = new JPanel ();
    panel46.setBackground(Color.white);
    JPanel panel47 = new JPanel ();
    panel47.setBackground(Color.white);
    JPanel panel48 = new JPanel ();
    panel48.setBackground(Color.white);
    JPanel panel49 = new JPanel ();
    panel49.setBackground(Color.white);
    JPanel panel50 = new JPanel ();
    panel50.setBackground(Color.black);
    JPanel panel51 = new JPanel();
    panel51.setBackground(Color.black);
    JPanel panel52 = new JPanel();
    panel52.setBackground(Color.white);
    JPanel panel53 = new JPanel ();
    panel53.setBackground(Color.white);
    JPanel panel54 = new JPanel ();
    panel54.setBackground(new Color(163, 163, 163));
    JPanel panel55 = new JPanel ();
    panel55.setBackground(new Color(130, 73, 11));
    JPanel panel56 = new JPanel ();
    panel56.setBackground(new Color(130, 73, 11));
    JPanel panel57 = new JPanel ();
    panel57.setBackground(new Color(130, 73, 11));
    JPanel panel58 = new JPanel ();
    panel58.setBackground(Color.white);
    JPanel panel59 = new JPanel ();
    panel59.setBackground(Color.white);
    JPanel panel60 = new JPanel ();
    panel60.setBackground(Color.black);
    JPanel panel61 = new JPanel();
    panel61.setBackground(Color.black);
    JPanel panel62 = new JPanel();
    panel62.setBackground(Color.white);
    JPanel panel63 = new JPanel ();
    panel63.setBackground(Color.white);
    JPanel panel64 = new JPanel ();
    panel64.setBackground(new Color(130, 73, 11));
    JPanel panel65 = new JPanel ();
    panel65.setBackground(new Color(130, 73, 11));
    JPanel panel66 = new JPanel ();
    panel66.setBackground(new Color(130, 73, 11));
    JPanel panel67 = new JPanel ();
    panel67.setBackground(new Color(130, 73, 11));
    JPanel panel68 = new JPanel ();
    panel68.setBackground(Color.white);
    JPanel panel69 = new JPanel ();
    panel69.setBackground(Color.white);
    JPanel panel70 = new JPanel ();
    panel70.setBackground(Color.black);
    JPanel panel71 = new JPanel();
    panel71.setBackground(Color.black);
    JPanel panel72 = new JPanel();
    panel72.setBackground(Color.white);
    JPanel panel73 = new JPanel ();
    panel73.setBackground(Color.white);
    JPanel panel74 = new JPanel ();
    panel74.setBackground(Color.white);
    JPanel panel75 = new JPanel ();
    panel75.setBackground(Color.white);
    JPanel panel76 = new JPanel ();
    panel76.setBackground(Color.white);
    JPanel panel77 = new JPanel ();
    panel77.setBackground(Color.white);
    JPanel panel78 = new JPanel ();
    panel78.setBackground(Color.white);
    JPanel panel79 = new JPanel ();
    panel79.setBackground(Color.white);
    JPanel panel80 = new JPanel ();
    panel80.setBackground(Color.black);
    JPanel panel81 = new JPanel();
    panel81.setBackground(Color.black);
    JPanel panel82 = new JPanel();
    panel82.setBackground(new Color(130, 73, 11));
    JPanel panel83 = new JPanel ();
    panel83.setBackground(new Color(130, 73, 11));
    JPanel panel84 = new JPanel ();
    panel84.setBackground(Color.white);
    JPanel panel85 = new JPanel ();
    panel85.setBackground(Color.white);
    JPanel panel86 = new JPanel ();
    panel86.setBackground(Color.white);
    JPanel panel87 = new JPanel ();
    panel87.setBackground(Color.white);
    JPanel panel88 = new JPanel ();
    panel88.setBackground(Color.white);
    JPanel panel89 = new JPanel ();
    panel89.setBackground(Color.white);
    JPanel panel90 = new JPanel ();
    panel90.setBackground(Color.black);
    JPanel panel91 = new JPanel();
    panel91.setBackground(Color.black);
    JPanel panel92 = new JPanel();
    panel92.setBackground(Color.black);
    JPanel panel93 = new JPanel ();
    panel93.setBackground(Color.black);
    JPanel panel94 = new JPanel ();
    panel94.setBackground(Color.black);
    JPanel panel95 = new JPanel ();
    panel95.setBackground(Color.black);
    JPanel panel96 = new JPanel ();
    panel96.setBackground(Color.black);
    JPanel panel97 = new JPanel ();
    panel97.setBackground(Color.black);
    JPanel panel98 = new JPanel ();
    panel98.setBackground(Color.black);
    JPanel panel99 = new JPanel ();
    panel99.setBackground(Color.black);
    JPanel panel100 = new JPanel ();
    panel100.setBackground(Color.black);

    
    Container pane = theGUI.getContentPane();
    pane.setLayout(new GridLayout(10, 10));
    pane.add(panel1);
    pane.add(panel2); 
    pane.add(panel3);
    pane.add(panel4);
    pane.add(panel5); 
    pane.add(panel6);
    pane.add(panel7);
    pane.add(panel8); 
    pane.add(panel9);
    pane.add(panel10);
    pane.add(panel11);
    pane.add(panel12); 
    pane.add(panel13);
    pane.add(panel14);
    pane.add(panel15); 
    pane.add(panel16);
    pane.add(panel17);
    pane.add(panel18); 
    pane.add(panel19);
    pane.add(panel20);
    pane.add(panel21);
    pane.add(panel22); 
    pane.add(panel23);
    pane.add(panel24);
    pane.add(panel25); 
    pane.add(panel26);
    pane.add(panel27);
    pane.add(panel28); 
    pane.add(panel29);
    pane.add(panel30);
    pane.add(panel31);
    pane.add(panel32); 
    pane.add(panel33);
    pane.add(panel34);
    pane.add(panel35); 
    pane.add(panel36);
    pane.add(panel37);
    pane.add(panel38); 
    pane.add(panel39);
    pane.add(panel40);
    pane.add(panel41);
    pane.add(panel42); 
    pane.add(panel43);
    pane.add(panel44);
    pane.add(panel45); 
    pane.add(panel46);
    pane.add(panel47);
    pane.add(panel48); 
    pane.add(panel49);
    pane.add(panel50);
    pane.add(panel51);
    pane.add(panel52); 
    pane.add(panel53);
    pane.add(panel54);
    pane.add(panel55); 
    pane.add(panel56);
    pane.add(panel57);
    pane.add(panel58); 
    pane.add(panel59);
    pane.add(panel60);
    pane.add(panel61);
    pane.add(panel62); 
    pane.add(panel63);
    pane.add(panel64);
    pane.add(panel65); 
    pane.add(panel66);
    pane.add(panel67);
    pane.add(panel68); 
    pane.add(panel69);
    pane.add(panel70);
    pane.add(panel71);
    pane.add(panel72); 
    pane.add(panel73);
    pane.add(panel74);
    pane.add(panel75); 
    pane.add(panel76);
    pane.add(panel77);
    pane.add(panel78); 
    pane.add(panel79);
    pane.add(panel80);
    pane.add(panel81);
    pane.add(panel82); 
    pane.add(panel83);
    pane.add(panel84);
    pane.add(panel85); 
    pane.add(panel86);
    pane.add(panel87);
    pane.add(panel88); 
    pane.add(panel89);
    pane.add(panel90);
    pane.add(panel91);
    pane.add(panel92); 
    pane.add(panel93);
    pane.add(panel94);
    pane.add(panel95); 
    pane.add(panel96);
    pane.add(panel97);
    pane.add(panel98); 
    pane.add(panel99);
    pane.add(panel100);
    theGUI.setVisible(true);



  System.out.println("Enter your player colors. If not Enter no");
  colorwant = scan.nextLine();
    

    if (colorwant.equals("no"))
    {
    panel23.setBackground(new Color(color, color1, color2));  
    }
    else
    {
    System.out.println("Enter the first rgb, red code");
    color = scan.nextInt();
    System.out.println("Enter the second rgb, green code");
    color1 = scan.nextInt();
    System.out.println("Enter the third rgb, red code");
    color2 = scan.nextInt();
    panel23.setBackground(new Color(color, color1, color2));  
    }

    





  map[2][2] = player;


  
  JOptionPane.showMessageDialog(null, "Red is bed, dark gray is radio");
  JOptionPane.showMessageDialog(null, "Yellow is clock");
  JOptionPane.showMessageDialog(null, "Brown is desk");
  JOptionPane.showMessageDialog(null, "Bottom left is bookshelf");

  if (x == 1)
  {
  if (control.equals("Map key"))
  {
  JOptionPane.showMessageDialog(null, "Red is bed, dark gray is radio");
  JOptionPane.showMessageDialog(null, "Yellow is clock");
  JOptionPane.showMessageDialog(null, "Brown is desk");
  JOptionPane.showMessageDialog(null, "Bottom left is bookshelf");  
  }
  }

  // work on this.
  if (x == 2)
  {
  if (control.equals("Map key"))
  {
  JOptionPane.showMessageDialog(null, "Red is bed, dark gray is radio");
  JOptionPane.showMessageDialog(null, "Yellow is clock");
  JOptionPane.showMessageDialog(null, "Brown is desk");
  JOptionPane.showMessageDialog(null, "Bottom left is bookshelf");  
  }
  }

  if (x == 4)
  {
  if (control.equals("Map key"))
  {
  JOptionPane.showMessageDialog(null, "Red is bed, dark gray is radio");
  JOptionPane.showMessageDialog(null, "Yellow is clock");
  JOptionPane.showMessageDialog(null, "Brown is desk");
  JOptionPane.showMessageDialog(null, "Bottom left is bookshelf");  
  }
  }

  if (x == 1)
  {
  if (control.equals("Map key"))
  {
  JOptionPane.showMessageDialog(null, "Red is bed, dark gray is radio");
  JOptionPane.showMessageDialog(null, "Yellow is clock");
  JOptionPane.showMessageDialog(null, "Brown is desk");
  JOptionPane.showMessageDialog(null, "Bottom left is bookshelf");  
  }
  }


    




System.out.println("Your in a blue room, with a desk, a bed, a door, bookshelf, radio, and a clock. ");


















    
   
  while (true)
  {

// Inventory 

  if (control.equals("inv"))
  {

    for(int i = 0; i < inventory.length; i++)
    {
      if(count[i] > 0)
      {
        System.out.println(inventory[i] + ": " + count[i]);
      }

    }

    
  }

  if (control.equals("help"))
  {
  System.out.println("type inv for inventory");
  System.out.println("type look at, to look at something");
  System.out.println("type go, to go somewhere");
  System.out.println("type use, to use something");
  }





    // map variables

  if (control.equals("map key"))
  {
  System.out.println("");
  System.out.println("bd is the bed. wl is the wall.");
  System.out.println("tb is the table. rd is the radio.");
  System.out.println("bk is the book shelf. dr is the door");
  System.out.println("ck is the clock.");
  }
    

  System.out.println(z);
    

  pos = 1;
    


    
  System.out.println("Enter controls");
  control = scan.nextLine(); 






    
  if (x == 1)
  {

    // map
  
    if (run5 == 0)
    {
  map [0][0] = "wl";
  map [0][1] = "wl";
  map [0][2] = "wl";
  map [0][3] = "wl";
  map [0][4] = "dr";
  map [0][5] = "dr";
  map [0][6] = "wl";
  map [0][7] = "wl";
  map [0][8] = "wl";
  map [0][9] = "wl";
  map [1][0] = "wl";
  map [1][1] = "bd";
  map [1][2] = "  ";
  map [1][3] = "  ";
  map [1][4] = "  ";
  map [1][5] = "  ";
  map [1][6] = "  ";
  map [1][7] = "  ";
  map [1][8] = "ck";
  map [1][9] = "wl";
  map [2][0] = "wl";
  map [2][1] = "bd";
  map [2][2] = "  ";
  map [2][3] = "  ";
  map [2][4] = "  ";
  map [2][5] = "  ";
  map [2][6] = "  ";
  map [2][7] = "  ";
  map [2][8] = "  ";
  map [2][9] = "wl";
  map [3][0] = "wl";
  map [3][1] = "  ";
  map [3][2] = "  ";
  map [3][3] = "  ";
  map [3][4] = "  ";
  map [3][5] = "  ";
  map [3][6] = "  ";
  map [3][7] = "  ";
  map [3][8] = "  ";
  map [3][9] = "wl";
  map [4][0] = "wl";
  map [4][1] = "  ";
  map [4][2] = "  ";
  map [4][3] = "  ";
  map [4][4] = "  ";
  map [4][5] = "  ";
  map [4][6] = "  ";
  map [4][7] = "  ";
  map [4][8] = "  ";
  map [4][9] = "wl";
  map [5][0] = "wl";
  map [5][1] = "  ";
  map [5][2] = "  ";
  map [5][3] = "rd";
  map [5][4] = "dk";
  map [5][5] = "dk";
  map [5][6] = "dk";
  map [5][7] = "  ";
  map [5][8] = "  ";
  map [5][9] = "wl";
  map [6][0] = "wl";
  map [6][1] = "  ";
  map [6][2] = "  ";
  map [6][3] = "dk";
  map [6][4] = "dk";
  map [6][5] = "dk";
  map [6][6] = "dk";
  map [6][7] = "  ";
  map [6][8] = "  ";
  map [6][9] = "wl";
  map [7][0] = "wl";
  map [7][1] = "  ";
  map [7][2] = "  ";
  map [7][3] = "  ";
  map [7][4] = "  ";
  map [7][5] = "  ";
  map [7][6] = "  ";
  map [7][7] = "  ";
  map [7][8] = "  ";
  map [7][9] = "wl";
  map [8][0] = "wl";
  map [8][1] = "bk";
  map [8][2] = "bk";
  map [8][3] = "  ";
  map [8][4] = "  ";
  map [8][5] = "  ";
  map [8][6] = "  ";
  map [8][7] = "  ";
  map [8][8] = "  ";
  map [8][9] = "wl";
  map [9][0] = "wl";
  map [9][1] = "wl";
  map [9][2] = "wl";
  map [9][3] = "wl";
  map [9][4] = "wl";
  map [9][5] = "wl";
  map [9][6] = "wl";
  map [9][7] = "wl";
  map [9][8] = "wl";
  map [9][9] = "wl";

    panel1.setBackground(Color.black);
    panel2.setBackground(Color.black);
    panel3.setBackground(Color.black);
    panel4.setBackground(Color.black);
    panel5.setBackground(new Color(93, 41, 6));
    panel6.setBackground(new Color(93, 41, 6));
    panel7.setBackground(Color.black);
    panel8.setBackground(Color.black);
    panel9.setBackground(Color.black);  
    panel10.setBackground(Color.black);
    panel11.setBackground(Color.black);
    panel12.setBackground(Color.red);  
    panel13.setBackground(Color.white);  
    panel14.setBackground(Color.white);  
    panel15.setBackground(Color.white);  
    panel16.setBackground(Color.white); 
    panel17.setBackground(Color.white);  
    panel18.setBackground(Color.white);  
    panel19.setBackground(new Color(255,215,0));  
    panel20.setBackground(Color.black);
    panel21.setBackground(Color.black);
    panel22.setBackground(Color.red);  
    panel23.setBackground(Color.white);  
    panel24.setBackground(Color.white);  
    panel25.setBackground(Color.white);  
    panel26.setBackground(Color.white);  
    panel27.setBackground(Color.white);  
    panel28.setBackground(Color.white);  
    panel29.setBackground(Color.white);  
    panel30.setBackground(Color.black);
    panel31.setBackground(Color.black);
    panel32.setBackground(Color.white);  
    panel33.setBackground(Color.white);
    panel34.setBackground(Color.white);
    panel35.setBackground(Color.white);
    panel36.setBackground(Color.white);
    panel37.setBackground(Color.white);
    panel38.setBackground(Color.white);
    panel39.setBackground(Color.white);
    panel40.setBackground(Color.black);
    panel41.setBackground(Color.black);
    panel42.setBackground(Color.white);
    panel43.setBackground(Color.white);
    panel44.setBackground(Color.white);
    panel45.setBackground(Color.white);
    panel46.setBackground(Color.white);
    panel47.setBackground(Color.white);
    panel48.setBackground(Color.white);
    panel49.setBackground(Color.white);
    panel50.setBackground(Color.black);
    panel51.setBackground(Color.black);
    panel52.setBackground(Color.white);
    panel53.setBackground(Color.white);
    panel54.setBackground(new Color(163, 163, 163));
    panel55.setBackground(new Color(130, 73, 11));
    panel56.setBackground(new Color(130, 73, 11));
    panel57.setBackground(new Color(130, 73, 11));
    panel58.setBackground(Color.white);
    panel59.setBackground(Color.white);
    panel60.setBackground(Color.black);
    panel61.setBackground(Color.black);
    panel62.setBackground(Color.white);
    panel63.setBackground(Color.white);
    panel64.setBackground(new Color(130, 73, 11));
    panel65.setBackground(new Color(130, 73, 11));
    panel66.setBackground(new Color(130, 73, 11));
    panel67.setBackground(new Color(130, 73, 11));
    panel68.setBackground(Color.white);
    panel69.setBackground(Color.white);
    panel70.setBackground(Color.black);
    panel71.setBackground(Color.black);
    panel72.setBackground(Color.white);
    panel73.setBackground(Color.white);
    panel74.setBackground(Color.white);
    panel75.setBackground(Color.white);
    panel76.setBackground(Color.white);
    panel77.setBackground(Color.white);
    panel78.setBackground(Color.white);
    panel79.setBackground(Color.white);
    panel80.setBackground(Color.black);
    panel81.setBackground(Color.black);
    panel82.setBackground(new Color(130, 73, 11));
    panel83.setBackground(new Color(130, 73, 11));
    panel84.setBackground(Color.white);
    panel85.setBackground(Color.white);
    panel86.setBackground(Color.white);
    panel87.setBackground(Color.white);
    panel88.setBackground(Color.white);
    panel89.setBackground(Color.white);
    panel90.setBackground(Color.black);
    panel91.setBackground(Color.black);
    panel92.setBackground(Color.black);
    panel93.setBackground(Color.black);
    panel94.setBackground(Color.black);
    panel95.setBackground(Color.black);
    panel96.setBackground(Color.black);
    panel97.setBackground(Color.black);
    panel98.setBackground(Color.black);
    panel99.setBackground(Color.black);
    panel100.setBackground(Color.black);

      
    }

    if (loc5 == 1)
    {
    yd = 1;
    xd = 5;  
    map[yd][xd] = player;
    run5 = 1;
    loc5 = 0;


    }
    


    
    // movement

    if (z == 13)
    {

    if (control.equalsIgnoreCase("left"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("right"))
    {
    z = 14;      
    panel13.setBackground(Color.white);  
    panel14.setBackground(new Color(color, color1, color2));
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel13.setBackground(Color.white);
    panel23.setBackground(new Color(color, color1, color2));
    z = 23;
    }      
    }

    if (z == 14)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel14.setBackground(Color.white);
    panel13.setBackground(new Color(color, color1, color2));
    z = 13;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel14.setBackground(Color.white);  
    panel15.setBackground(new Color(color, color1, color2));  
    z = 15;
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel14.setBackground(Color.white);
    panel24.setBackground(new Color(color, color1, color2));  
    z = 24;
    }      
    }

    if (z == 15)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel15.setBackground(Color.white);
    panel14.setBackground(new Color(color, color1, color2));
    z = 14;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel15.setBackground(Color.white);  
    panel16.setBackground(new Color(color, color1, color2));  
    z = 16;
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel15.setBackground(Color.white);
    panel25.setBackground(new Color(color, color1, color2)); 
    z = 25;
    }      
    }

    if (z == 16)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel16.setBackground(Color.white);
    panel15.setBackground(new Color(color, color1, color2));
    z = 15;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel16.setBackground(Color.white);  
    panel17.setBackground(new Color(color, color1, color2)); 
    z = 17;
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel16.setBackground(Color.white);
    panel26.setBackground(new Color(color, color1, color2)); 
    z = 26;
    }      
    }

    if (z == 17)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel17.setBackground(Color.white);
    panel16.setBackground(new Color (color, color1, color2));
    z = 16;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel17.setBackground(Color.white);
    panel18.setBackground(new Color (color, color1, color2));
    z = 18;
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel17.setBackground(Color.white);
    panel27.setBackground(new Color(color, color1, color2));
    z = 27;
    }      
    }

    if (z == 18)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel18.setBackground(Color.white);
    panel17.setBackground(new Color(color, color1, color2));
    z = 17;
    }

    if (control.equalsIgnoreCase("right"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel18.setBackground(Color.white);
    panel28.setBackground(new Color(color, color1, color2));
    z = 28;
    }      
    }

    
    if (z == 23)
    {

    if (control.equalsIgnoreCase("left"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel23.setBackground(Color.white);  
    panel24.setBackground(new Color(color, color1, color2)); 
    z = 24;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel23.setBackground(Color.white);
    panel13.setBackground(new Color(color, color1, color2)); 
    z = 13;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel23.setBackground(Color.white);
    panel33.setBackground(new Color(color, color1, color2));
    z = 33;
    }      
      
      
    }

    if (z == 24)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel24.setBackground(Color.white);
    panel23.setBackground(new Color(color, color1, color2));
    z = 23;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel24.setBackground(Color.white);  
    panel25.setBackground(new Color(color, color1, color2)); 
    z = 25;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel24.setBackground(Color.white);
    panel14.setBackground(new Color(color, color1, color2)); 
    z = 14;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel24.setBackground(Color.white);
    panel34.setBackground(new Color(color, color1, color2));
    z = 34;
    }      
      
      
    }

    if (z == 25)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel25.setBackground(Color.white);
    panel24.setBackground(new Color(color, color1,  color2));
    z = 24;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel25.setBackground(Color.white);  
    panel26.setBackground(new Color(color, color1, color2)); 
    z = 26;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel25.setBackground(Color.white);
    panel15.setBackground(new Color(color, color1, color2)); 
    z = 15;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel25.setBackground(Color.white);
    panel35.setBackground(new Color(color, color1, color2));
    z = 35;
    }      
      
      
    }

    if (z == 26)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel26.setBackground(Color.white);
    panel25.setBackground(new Color(color, color1, color2));
    z = 25;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel26.setBackground(Color.white);  
    panel27.setBackground(new Color(color, color1, color2)); 
    z = 27;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel26.setBackground(Color.white);
    panel16.setBackground(new Color(color, color1, color2)); 
    z = 16;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel26.setBackground(Color.white);
    panel36.setBackground(new Color(color, color1, color2));
    z = 36;
    }      
      
      
    }

    if (z == 27)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel27.setBackground(Color.white);
    panel26.setBackground(new Color(color, color1, color2));
    z = 26;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel27.setBackground(Color.white);  
    panel28.setBackground(new Color(color, color1, color2)); 
    z = 28;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel27.setBackground(Color.white);
    panel17.setBackground(new Color(color, color1, color2)); 
    z = 17;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel27.setBackground(Color.white);
    panel37.setBackground(new Color(color, color1, color2));
    z = 37;
    }      
      
      
    }

    if (z == 28)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel28.setBackground(Color.white);
    panel27.setBackground(new Color(color, color1, color2));
    z = 27;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel28.setBackground(Color.white);  
    panel29.setBackground(new Color(color, color1, color2)); 
    z = 29;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel28.setBackground(Color.white);
    panel18.setBackground(new Color(color, color1, color2)); 
    z = 18;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel28.setBackground(Color.white);
    panel38.setBackground(new Color(color, color1, color2));
    z = 38;
    }      
      
      
    }

    if (z == 29)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel29.setBackground(Color.white);
    panel28.setBackground(new Color(color, color1, color2));
    z = 28;
    }

    if (control.equalsIgnoreCase("right"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel29.setBackground(Color.white);
    panel39.setBackground(new Color(color, color1, color2));
    z = 39;
    }      
      
      
    }


    
    if (z == 32)
    {

    if (control.equalsIgnoreCase("left"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel32.setBackground(Color.white);  
    panel33.setBackground(new Color(color, color1, color2)); 
    z = 33;
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel32.setBackground(Color.white);
    panel42.setBackground(new Color(color, color1, color2));
    z = 42;
    }      
      
      
    }

    if (z == 33)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel33.setBackground(Color.white);
    panel32.setBackground(new Color(color, color1, color2));
    x = 32;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel33.setBackground(Color.white);  
    panel34.setBackground(new Color(color, color1, color2)); 
    z = 34;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel33.setBackground(Color.white);
    panel23.setBackground(new Color(color, color1, color2)); 
    z = 23;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel33.setBackground(Color.white);
    panel43.setBackground(new Color(color, color1, color2));
    z = 43;
    }      
      
      
    }

    if (z == 34)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel34.setBackground(Color.white);
    panel33.setBackground(new Color(color, color1, color2));
    z = 33;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel34.setBackground(Color.white);  
    panel35.setBackground(new Color(color, color1, color2)); 
    z = 35;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel34.setBackground(Color.white);
    panel24.setBackground(new Color(color, color1, color2)); 
    z = 24;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel34.setBackground(Color.white);
    panel44.setBackground(new Color(color, color1, color2));
    z = 44;
    }      
      
      
    }

    if (z == 35)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel35.setBackground(Color.white);
    panel34.setBackground(new Color(color, color1, color2));
    z = 34;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel35.setBackground(Color.white);  
    panel36.setBackground(new Color(color, color1, color2)); 
    z = 36;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel35.setBackground(Color.white);
    panel25.setBackground(new Color(color, color1, color2)); 
    z = 25;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel35.setBackground(Color.white);
    panel45.setBackground(new Color(color, color1, color2));
    z = 45;
    }      
      
      
    }    

    if (z == 36)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel36.setBackground(Color.white);
    panel35.setBackground(new Color(color, color1, color2));
    z = 35;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel36.setBackground(Color.white);  
    panel37.setBackground(new Color(color, color1, color2)); 
    z = 37;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel36.setBackground(Color.white);
    panel26.setBackground(new Color(color, color1, color2)); 
    z = 26;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel36.setBackground(Color.white);
    panel46.setBackground(new Color(color, color1, color2));
    z = 46;
    }      
      
      
    }

    if (z == 37)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel37.setBackground(Color.white);
    panel36.setBackground(new Color(color, color1, color2));
    z = 36;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel37.setBackground(Color.white);  
    panel38.setBackground(new Color(color, color1, color2)); 
    z = 38;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel37.setBackground(Color.white);
    panel27.setBackground(new Color(color, color1, color2)); 
    z = 27;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel37.setBackground(Color.white);
    panel47.setBackground(new Color(color, color1, color2));
    z = 47;
    }      
      
       
    }

    if (z == 38)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel38.setBackground(Color.white);
    panel37.setBackground(new Color(color, color1, color2));
    z = 37;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel38.setBackground(Color.white);  
    panel39.setBackground(new Color(color, color1, color2)); 
    z = 39;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel38.setBackground(Color.white);
    panel28.setBackground(new Color(color, color1, color2)); 
    z = 28;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel38.setBackground(Color.white);
    panel48.setBackground(new Color(color, color1, color2));
    z = 48;
    }      
      
      
    }

    if (z == 39)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel39.setBackground(Color.white);
    panel38.setBackground(new Color(color, color1, color2));
    z = 38;
    }

    if (control.equalsIgnoreCase("right"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel39.setBackground(Color.white);
    panel29.setBackground(new Color(color, color1, color2)); 
    z = 29;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel39.setBackground(Color.white);
    panel49.setBackground(new Color(color, color1, color2));
    z = 49;
    }      
      
      
    }

    if (z == 42)
    {

    if (control.equalsIgnoreCase("left"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel42.setBackground(Color.white);  
    panel43.setBackground(new Color(color, color1, color2)); 
    z = 43;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel42.setBackground(Color.white);
    panel32.setBackground(new Color(color, color1, color2)); 
    z = 32;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel42.setBackground(Color.white);
    panel52.setBackground(new Color(color, color1, color2));
    z = 52;
    }      
      
      
    }

    
    if (z == 43)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel43.setBackground(Color.white);
    panel42.setBackground(new Color(color, color1, color2));
    z = 42;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel43.setBackground(Color.white);  
    panel44.setBackground(new Color(color, color1, color2)); 
    z = 44;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel43.setBackground(Color.white);
    panel33.setBackground(new Color(color, color1, color2)); 
    z = 33;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel43.setBackground(Color.white);
    panel53.setBackground(new Color(color, color1, color2));
    z = 53;
    }       
    }

    if (z == 44)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel44.setBackground(Color.white);
    panel43.setBackground(new Color(color, color1, color2));
    z = 43;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel44.setBackground(Color.white);  
    panel45.setBackground(new Color(color, color1, color2)); 
    z = 45;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel44.setBackground(Color.white);
    panel34.setBackground(new Color(color, color1, color2)); 
    z = 34;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }

    if (z == 45)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel45.setBackground(Color.white);
    panel44.setBackground(new Color(color, color1, color2));
    z = 44;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel45.setBackground(Color.white);  
    panel46.setBackground(new Color(color, color1, color2)); 
    z = 46;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel45.setBackground(Color.white);
    panel35.setBackground(new Color(color, color1, color2)); 
    z = 35;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }

    if (z == 46)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel46.setBackground(Color.white);
    panel45.setBackground(new Color(color, color1, color2));
    z = 45;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel46.setBackground(Color.white);  
    panel47.setBackground(new Color(color, color1, color2)); 
    z = 47;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel46.setBackground(Color.white);
    panel36.setBackground(new Color(color, color1, color2)); 
    z = 36;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }

    if (z == 47)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel47.setBackground(Color.white);
    panel46.setBackground(new Color(color, color1, color2));
    z = 46;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel47.setBackground(Color.white);  
    panel48.setBackground(new Color(color, color1, color2)); 
    z = 48;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel47.setBackground(Color.white);
    panel37.setBackground(new Color(color, color1, color2)); 
    z = 37;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }

    if (z == 48)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel48.setBackground(Color.white);
    panel47.setBackground(new Color(color, color1, color2));
    z = 47;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel48.setBackground(Color.white);  
    panel49.setBackground(new Color(color, color1, color2)); 
    z = 49;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel48.setBackground(Color.white);
    panel38.setBackground(new Color(color, color1, color2)); 
    z = 38;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel48.setBackground(Color.white);
    panel58.setBackground(new Color(color, color1, color2));
    z = 58;
    }       
    }
    
    if (z == 49)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel49.setBackground(Color.white);
    panel48.setBackground(new Color(color, color1, color2));
    z = 48;
    }

    if (control.equalsIgnoreCase("right"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel49.setBackground(Color.white);
    panel39.setBackground(new Color(color, color1, color2)); 
    z = 39;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel49.setBackground(Color.white);
    panel59.setBackground(new Color(color, color1, color2));
    z = 59;
    }       
    }
    
    if (z == 52)
    {

    if (control.equalsIgnoreCase("left"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel52.setBackground(Color.white);  
    panel53.setBackground(new Color(color, color1, color2)); 
    z = 53;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel52.setBackground(Color.white);
    panel42.setBackground(new Color(color, color1, color2)); 
    z = 42;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel52.setBackground(Color.white);
    panel62.setBackground(new Color(color, color1, color2));
    z = 62;
    }       
    }

    if (z == 53)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel53.setBackground(Color.white);
    panel52.setBackground(new Color(color, color1, color2));
    z = 52;
    }

    if (control.equalsIgnoreCase("right"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel53.setBackground(Color.white);
    panel43.setBackground(new Color(color, color1, color2)); 
    z = 43;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel53.setBackground(Color.white);
    panel63.setBackground(new Color(color, color1, color2));
    z = 63;
    }       
    }

    if (z == 58)
    {

    if (control.equalsIgnoreCase("left"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel58.setBackground(Color.white);  
    panel59.setBackground(new Color(color, color1, color2)); 
    z = 59;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel58.setBackground(Color.white);
    panel48.setBackground(new Color(color, color1, color2)); 
    z = 48;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel58.setBackground(Color.white);
    panel68.setBackground(new Color(color, color1, color2));
    z = 68;
    }       
    }


    if (z == 59)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel59.setBackground(Color.white);
    panel58.setBackground(new Color(color, color1, color2));
    z = 58;
    }

    if (control.equalsIgnoreCase("right"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel59.setBackground(Color.white);
    panel49.setBackground(new Color(color, color1, color2)); 
    z = 49;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel59.setBackground(Color.white);
    panel69.setBackground(new Color(color, color1, color2));
    z = 69;
    }       
    }    

    if (z == 62)
    {

    if (control.equalsIgnoreCase("left"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel62.setBackground(Color.white);  
    panel63.setBackground(new Color(color, color1, color2)); 
    z = 63;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel62.setBackground(Color.white);
    panel52.setBackground(new Color(color, color1, color2)); 
    z = 52;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel62.setBackground(Color.white);
    panel72.setBackground(new Color(color, color1, color2));
    z = 72;
    }       
    }

    if (z == 63)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel63.setBackground(Color.white);
    panel62.setBackground(new Color(color, color1, color2));
    z = 62;
    }

    if (control.equalsIgnoreCase("right"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel63.setBackground(Color.white);
    panel53.setBackground(new Color(color, color1, color2)); 
    z = 53;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel63.setBackground(Color.white);
    panel73.setBackground(new Color(color, color1, color2));
    z = 73;
    }       
    }


    if (z == 68)
    {

    if (control.equalsIgnoreCase("left"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel68.setBackground(Color.white);  
    panel69.setBackground(new Color(color, color1, color2)); 
    z = 69;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel68.setBackground(Color.white);
    panel58.setBackground(new Color(color, color1, color2)); 
    z = 58;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel68.setBackground(Color.white);
    panel78.setBackground(new Color(color, color1, color2));
    z = 78;
    }       
    }


    if (z == 69)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel69.setBackground(Color.white);
    panel68.setBackground(new Color(color, color1, color2));
    z = 68;
    }

    if (control.equalsIgnoreCase("right"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel69.setBackground(Color.white);
    panel59.setBackground(new Color(color, color1, color2)); 
    z = 59;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel69.setBackground(Color.white);
    panel79.setBackground(new Color(color, color1, color2));
    z = 79;
    }       
    }

    if (z == 72)
    {

    if (control.equalsIgnoreCase("left"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel72.setBackground(Color.white);  
    panel73.setBackground(new Color(color, color1, color2)); 
    z = 73;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel72.setBackground(Color.white);
    panel62.setBackground(new Color(color, color1, color2)); 
    z = 62;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }

    if (z == 73)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel73.setBackground(Color.white);  
    panel72.setBackground(new Color(color, color1, color2)); 
    z = 72;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel73.setBackground(Color.white);  
    panel74.setBackground(new Color(color, color1, color2)); 
    z = 74;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel73.setBackground(Color.white);
    panel63.setBackground(new Color(color, color1, color2)); 
    z = 63;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }

    if (z == 74)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel74.setBackground(Color.white);  
    panel73.setBackground(new Color(color, color1, color2)); 
    z = 73;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel74.setBackground(Color.white);  
    panel75.setBackground(new Color(color, color1, color2)); 
    z = 75;
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel74.setBackground(Color.white);
    panel84.setBackground(new Color(color, color1, color2));
    z = 84;
    }       
    }

    if (z == 75)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel75.setBackground(Color.white);
    panel74.setBackground(new Color(color, color1, color2));
    z = 74;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel75.setBackground(Color.white);  
    panel76.setBackground(new Color(color, color1, color2)); 
    z = 76;
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel75.setBackground(Color.white);
    panel85.setBackground(new Color(color, color1, color2));
    z = 85;
    }       
    }

    if (z == 76)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel76.setBackground(Color.white);
    panel75.setBackground(new Color(color, color1, color2));
    z = 75;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel76.setBackground(Color.white);  
    panel77.setBackground(new Color(color, color1, color2)); 
    z = 77;
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel76.setBackground(Color.white);
    panel86.setBackground(new Color(color, color1, color2));
    z = 86;
    }       
    }

    if (z == 77)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel77.setBackground(Color.white);
    panel76.setBackground(new Color(color, color1, color2));
    z = 76;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel77.setBackground(Color.white);  
    panel78.setBackground(new Color(color, color1, color2)); 
    z = 78;
    }

    if (control.equalsIgnoreCase("up"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel76.setBackground(Color.white);
    panel86.setBackground(new Color(color, color1, color2));
    z = 86;
    }       
    }

    if (z == 78)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel78.setBackground(Color.white);
    panel77.setBackground(new Color(color, color1, color2));
    z = 77;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel78.setBackground(Color.white);  
    panel79.setBackground(new Color(color, color1, color2)); 
    z = 79;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel78.setBackground(Color.white);
    panel68.setBackground(new Color(color, color1, color2)); 
    z = 68;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel78.setBackground(Color.white);
    panel88.setBackground(new Color(color, color1, color2));
    z = 88;
    }       
    }
    
    if (z == 79)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel79.setBackground(Color.white);
    panel78.setBackground(new Color(color, color1, color2));
    z = 78;
    }

    if (control.equalsIgnoreCase("right"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel79.setBackground(Color.white);
    panel69.setBackground(new Color(color, color1, color2)); 
    z = 69;
    }

    if (control.equalsIgnoreCase("down"))
    {
    panel79.setBackground(Color.white);
    panel89.setBackground(new Color(color, color1, color2));
    z = 89;
    }       
    }

    if (z == 84)
    {

    if (control.equalsIgnoreCase("left"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel84.setBackground(Color.white);
    panel85.setBackground(new Color(color, color1, color2));
    z = 85;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel84.setBackground(Color.white);
    panel74.setBackground(new Color(color, color1, color2)); 
    z = 74;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }

    if (z == 85)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel85.setBackground(Color.white);
    panel84.setBackground(new Color(color, color1, color2));
    z = 84;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel85.setBackground(Color.white);
    panel86.setBackground(new Color(color, color1, color2));
    z = 86;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel85.setBackground(Color.white);
    panel75.setBackground(new Color(color, color1, color2)); 
    z = 75;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }    

    if (z == 86)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel86.setBackground(Color.white);
    panel85.setBackground(new Color(color, color1, color2));
    z = 85;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel86.setBackground(Color.white);
    panel87.setBackground(new Color(color, color1, color2));
    z = 87;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel86.setBackground(Color.white);
    panel76.setBackground(new Color(color, color1, color2)); 
    z = 76;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }

    if (z == 87)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel87.setBackground(Color.white);
    panel86.setBackground(new Color(color, color1, color2));
    z = 86;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel87.setBackground(Color.white);
    panel88.setBackground(new Color(color, color1, color2));
    z = 88;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel87.setBackground(Color.white);
    panel77.setBackground(new Color(color, color1, color2)); 
    z = 77;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }

    if (z == 88)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel88.setBackground(Color.white);
    panel87.setBackground(new Color(color, color1, color2));
    z = 87;
    }

    if (control.equalsIgnoreCase("right"))
    {
    panel88.setBackground(Color.white);
    panel89.setBackground(new Color(color, color1, color2));
    z = 89;
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel88.setBackground(Color.white);
    panel78.setBackground(new Color(color, color1, color2)); 
    z = 78;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }

    if (z == 89)
    {

    if (control.equalsIgnoreCase("left"))
    {
    panel89.setBackground(Color.white);
    panel88.setBackground(new Color(color, color1, color2));
    z = 88;
    }

    if (control.equalsIgnoreCase("right"))
    {
    System.out.println("Not a way");
    }

    if (control.equalsIgnoreCase("up"))
    {
    panel89.setBackground(Color.white);
    panel79.setBackground(new Color(color, color1, color2)); 
    z = 79;
    }

    if (control.equalsIgnoreCase("down"))
    {
    System.out.println("Not a way");
    }       
    }

  

    
    
  if (control.equals("look"))
  {
  System.out.println("Your in a blue room, with a desk, a bed, a door, bookshelf, radio, and a clock. ");
  }

  // look at door, range 
  if (z == 15 || z == 16)
  {
  if (control.equals("look at door"))
  {
  System.out.println("The door is lock. need a key.");
  }  
  }

 



  // look at desk, range 

  if (z == 43 || z == 44 || z == 45 || z == 46 || z == 47 || z == 48 || z == 53 || z == 58 || z == 63 || z == 68 || z == 73 || z == 74 || z == 75 || z == 76 || z == 77 || z == 78)
  {
  if (control.equals("look at desk"))
  {
  System.out.println("At the desk, there is four drawers, two are locks. In the two unlocked drawers, there is a paper, a battery. lock one is a three digt. lock two is a four digt.");
  show = 1;
    
  if (gain == 0)
  {
  count[0] = count[0] + 1; 
  gain++;
  }
  }
  }


    
  // show the locks
  if (show == 1)
  {
  panel64.setBackground(new Color(192,192,192));
  panel67.setBackground(new Color(192,192,192));  
  }


  // lock one range
  if (z == 63 || z == 73 || z == 74)
  {
  if (control.equals("look at lock"))
  {
  if (gain1 == 0)
  {

  System.out.println("The lock is a three digt number lock");
  System.out.println("Enter the first number");
  lockonep1 = scan.nextInt();
  System.out.println("Enter the second number");
  lockonep2 = scan.nextInt();
  System.out.println("Enter the third number");
  lockonep3 = scan.nextInt();

     if (lockonep1 == bread)
  {

    if (lockonep2 == apple)
    {

      if (lockonep3 == juice)
      {
      System.out.println("You found a battery");
      count[0] = count[0] + 1; 
      gain1 = 1;
      }
      }
    
    } 
  }
  else
  {
  System.out.println("There is nothing left");
  }
  }    
  }
    


  if (z == 77 || z == 78 || z == 68)
  {
  if (control.equals("look at lock"))
  {
  if (gain2 == 0)
  {
    System.out.println("The lock is a four digt number lock");
  System.out.println("Enter the first number");
  locktwop1 = scan.nextInt();
  System.out.println("Enter the second number");
  locktwop2 = scan.nextInt();
  System.out.println("Enter the third number");
  locktwop3 = scan.nextInt();
  System.out.println("Enter the fourth number");
  locktwop4 = scan.nextInt();

  if (locktwop1 == 2)
  {
    if (locktwop2 == 1)
    {
      if (locktwop3 == 1)
      {
        if (locktwop4 == 3)
        {
          System.out.println("You got a red key");
          count[1] = count[1] +1;
          gain2 = 1;
        }
      }
    }
  }
  }
  else
  {
  System.out.println("There is nothing");
  }
  }          
  }

 
    
  if (z == 13 || z == 23 || z == 32)
  {
  if (control.equals("look at bed"))
  {
  System.out.println("You find nothing");
  }    
  }

   

  if (z == 43 || z == 44 || z == 53)
  {
  if (control.equals("look at radio") || control.equals("use the radio"))
  {
    
    if (count[0] >= 1)
    {
    if (gain == 1)
    {
    System.out.println("It play, D, R, C, B.");    
    }
    System.out.println("It play, D, R, C, B.");
    if (gain3 == 0)
    {
    count[0] = count[0] - 1;
    gain3 = 1;
    }
    }
    if (gain == 0)
    {
    System.out.println("The radio need a battery");
    }
  
  }    
  }


  if (z == 72 || z == 73 || z == 74 || z == 84)
  {
  if (control.equals("look at bookshelf"))
  {
  System.out.println("On the Bookshelf there is 9 books. In one of the book their is a letter.");
  System.out.println("4.6.8.7.3");
  System.out.println("2.3.2.4.2");
  }    
  }

    
  if (z == 18 || z == 28 || z == 29)
  {
  if (control.equals("look at clock"))
  {
  System.out.println("The time is 9 clock");
  }    
  }
 

 
  if (control.equals("look at paper"))
  {
    System.out.println("there is " + bread + " bread, " + apple + " apple, " + juice + " cup of juice.");
  }

  if (z == 15 || z == 16)
  {
  if (control.equals("use red key"))
  {
    
  if (count[1] == 1)
  {
  System.out.println("The door is open");
  System.out.println("The door lead to a corrider.");
  x = 5;
  loc = 5;
  run = 0;
  }

  if (count[1] == 0)
  {
  System.out.println("You do not have a key");
  }
    
  }    
  }



    } // if x = 1 end bracket


    
  if (x == 5)
  {

    if (loc == 5)
    {
    JOptionPane.showMessageDialog(null, "Your at cross way");
  control = JOptionPane.showInputDialog("You can see three path, in front of you, to the left, and to the right.");  
    }

  



    

    if (loc1 == 1)
    {
    JOptionPane.showMessageDialog(null, "Your back at the cross way");
  control = JOptionPane.showInputDialog("Do you want to go to the front, right, or back");    
    }

    if (loc == 9)
    {
    JOptionPane.showMessageDialog(null, "Your back at the cross way");
    control = JOptionPane.showInputDialog("Do you want to go to the left, right, or back");
    }

    if (loc == 8)
    {
    JOptionPane.showMessageDialog(null, "Your back at the cross way");
    control = JOptionPane.showInputDialog("Do you want to go to the left, front, or back");
    }    

    

    if (control == null)
    {
    if (loc == 5)
    {
    x = 1;
    
    }
    }

    if (control == null)
    {
    if (loc == 9)
    {
    x = 4;
    
    }
    }

    if (control == null)
    {
    if (loc1 == 1)
    {
    x = 2;
    
    }
    }
    
    if (control == null)
    {
    if (loc == 8)
    {
    x = 3;
    
    }
    }

    
    
    if (control.equals("left"))
    {
    x = 2;
    loc = 2;
    run1 = 0;
    control = "look";
    }  
    


    if (control.equals("right"))
    {
    x = 3;
    loc = 3;
    run3 = 0;
    control = "look";
    }      
    


    

    
    if (control.equalsIgnoreCase("front")) // front door
    {
    x = 4;
    loc = 4;
    run4 = 0;
    control = "look";   
    }

    if (control.equalsIgnoreCase("back")) // first door
    {
    x = 1;
    loc5 = 1;
    control = "look";   
    }

    
  }

    
  if (x == 2) // The room to the left 
  {
    // map 2

    if (run1 == 0)
    {
  map [0][0] = "wl";
  map [0][1] = "wl";
  map [0][2] = "wl";
  map [0][3] = "wl";
  map [0][4] = "wl";
  map [0][5] = "wl";
  map [0][6] = "wl";
  map [0][7] = "wl";
  map [0][8] = "wl";
  map [0][9] = "wl";
  map [1][0] = "wl";
  map [1][1] = "  ";
  map [1][2] = "  ";
  map [1][3] = "  ";
  map [1][4] = "  ";
  map [1][5] = "  ";
  map [1][6] = "pt";
  map [1][7] = "pt";
  map [1][8] = "pt";
  map [1][9] = "wl";
  map [2][0] = "wl";
  map [2][1] = "  ";
  map [2][2] = "  ";
  map [2][3] = "  ";
  map [2][4] = "  ";
  map [2][5] = "  ";
  map [2][6] = "  ";
  map [2][7] = "  ";
  map [2][8] = "  ";
  map [2][9] = "wl";
  map [3][0] = "wl";
  map [3][1] = "  ";
  map [3][2] = "  ";
  map [3][3] = "  ";
  map [3][4] = "  ";
  map [3][5] = "  ";
  map [3][6] = "  ";
  map [3][7] = "  ";
  map [3][8] = "  ";
  map [3][9] = "wl";
  map [4][0] = "wl";
  map [4][1] = "  ";
  map [4][2] = "  ";
  map [4][3] = "  ";
  map [4][4] = "  ";
  map [4][5] = "  ";
  map [4][6] = "  ";
  map [4][7] = "  ";
  map [4][8] = "  ";
  map [4][9] = "  ";
  map [5][0] = "wl";
  map [5][1] = "dk";
  map [5][2] = "dk";
  map [5][3] = "dk";
  map [5][4] = "  ";
  map [5][5] = "  ";
  map [5][6] = "  ";
  map [5][7] = "  ";
  map [5][8] = "  ";
  map [5][9] = "  ";
  map [6][0] = "wl";
  map [6][1] = "dk";
  map [6][2] = "dk";
  map [6][3] = "dk";
  map [6][4] = "  ";
  map [6][5] = "  ";
  map [6][6] = "  ";
  map [6][7] = "  ";
  map [6][8] = "  ";
  map [6][9] = "wl";
  map [7][0] = "wl";
  map [7][1] = "dk";
  map [7][2] = "dk";
  map [7][3] = "dk";
  map [7][4] = "  ";
  map [7][5] = "  ";
  map [7][6] = "  ";
  map [7][7] = "  ";
  map [7][8] = "  ";
  map [7][9] = "wl";
  map [8][0] = "wl";
  map [8][1] = "dk";
  map [8][2] = "dk";
  map [8][3] = "dk";
  map [8][4] = "  ";
  map [8][5] = "  ";
  map [8][6] = "  ";
  map [8][7] = "  ";
  map [8][8] = "bx";
  map [8][9] = "wl";
  map [9][0] = "wl";
  map [9][1] = "wl";
  map [9][2] = "wl";
  map [9][3] = "wl";
  map [9][4] = "wl";
  map [9][5] = "wl";
  map [9][6] = "wl";
  map [9][7] = "wl";
  map [9][8] = "wl";
  map [9][9] = "wl";
      
    panel1.setBackground(Color.black);
    panel2.setBackground(Color.black);
    panel3.setBackground(Color.black);
    panel4.setBackground(Color.black);    
    panel5.setBackground(Color.black);
    panel6.setBackground(Color.black);
    panel7.setBackground(Color.black);
    panel8.setBackground(Color.black);
    panel9.setBackground(Color.black);    
    panel10.setBackground(Color.black);
    panel11.setBackground(Color.black);
    panel12.setBackground(Color.white);
    panel13.setBackground(Color.white);
    panel14.setBackground(Color.white);
    panel15.setBackground(Color.white);
    panel16.setBackground(Color.white);
    panel17.setBackground(Color.white);
    panel18.setBackground(Color.white);    
    panel19.setBackground(new Color(158, 82, 63));
    panel20.setBackground(Color.black);
    panel21.setBackground(Color.black);
    panel22.setBackground(Color.white);    
    panel23.setBackground(Color.white);
    panel24.setBackground(Color.white);
    panel25.setBackground(Color.white);
    panel26.setBackground(Color.white);
    panel27.setBackground(Color.white);
    panel28.setBackground(Color.white);
    panel29.setBackground(Color.white);
    panel30.setBackground(Color.black);
    panel31.setBackground(Color.black);
    panel32.setBackground(Color.white);
    panel33.setBackground(Color.white);
    panel34.setBackground(Color.white);
    panel35.setBackground(Color.white);
    panel36.setBackground(Color.white);
    panel37.setBackground(Color.white);
    panel38.setBackground(Color.white);
    panel39.setBackground(Color.white);
    panel40.setBackground(Color.black);
    panel41.setBackground(Color.black);
    panel42.setBackground(Color.white);
    panel43.setBackground(Color.white);
    panel44.setBackground(Color.white);
    panel45.setBackground(Color.white);
    panel46.setBackground(Color.white);
    panel47.setBackground(Color.white);
    panel48.setBackground(Color.white);
    panel49.setBackground(Color.white);
    panel50.setBackground(Color.white);
    panel51.setBackground(Color.black);
    panel52.setBackground(new Color(130, 73, 11));
    panel53.setBackground(new Color(130, 73, 11));
    panel54.setBackground(new Color(130, 73, 11));
    panel55.setBackground(Color.white);
    panel56.setBackground(Color.white);
    panel57.setBackground(Color.white);
    panel58.setBackground(Color.white);
    panel59.setBackground(Color.white);
    panel60.setBackground(Color.white);
    panel61.setBackground(Color.black);
    panel62.setBackground(new Color(130, 73, 11));
    panel63.setBackground(new Color(130, 73, 11));    
    panel64.setBackground(new Color(130, 73, 11));
    panel65.setBackground(Color.white);
    panel66.setBackground(Color.white);    
    panel67.setBackground(Color.white);
    panel68.setBackground(Color.white);
    panel69.setBackground(Color.white);
    panel70.setBackground(Color.black);
    panel71.setBackground(Color.black);
    panel72.setBackground(new Color(130, 73, 11));
    panel73.setBackground(new Color(130, 73, 11));
    panel74.setBackground(new Color(130, 73, 11));
    panel75.setBackground(Color.white);
    panel76.setBackground(Color.white);    
    panel77.setBackground(Color.white);
    panel78.setBackground(Color.white);
    panel79.setBackground(Color.white);
    panel80.setBackground(Color.black);
    panel81.setBackground(Color.black);
    panel82.setBackground(new Color(130, 73, 11));
    panel83.setBackground(new Color(130, 73, 11));
    panel84.setBackground(new Color(130, 73, 11));    
    panel85.setBackground(Color.white);
    panel86.setBackground(Color.white);
    panel87.setBackground(Color.white);
    panel88.setBackground(Color.white);
    panel89.setBackground(new Color(173, 135, 98));
    panel90.setBackground(Color.black);
    panel91.setBackground(Color.black);    
    panel92.setBackground(Color.black);
    panel93.setBackground(Color.black);
    panel94.setBackground(Color.black);    
    panel95.setBackground(Color.black);
    panel96.setBackground(Color.black);
    panel97.setBackground(Color.black);
    panel98.setBackground(Color.black);    
    panel99.setBackground(Color.black);    
    panel100.setBackground(Color.black);
      
    }

  if (loc == 2)
  {
  if (run1 == 0)
  {
  yd = 4;
  xd = 8;  
  map[yd][xd] = player;
  run1 = 1;
  panel49.setBackground(new Color(color, color1, color2));
  z = 49;
  }
  } 






    
    // control
    
    if (z == 12)
    {
    if (control.equals("left"))
    {
    System.out.println("Not a way");
    }
    if (control.equals("right"))
    {
    panel12.setBackground(Color.white);
    panel13.setBackground(new Color(color, color1, color2));
    z = 13;
    }
    if (control.equals("up"))
    {
    System.out.println("Not a way");    
    }
    if (control.equals("down"))
    {
    panel12.setBackground(Color.white);
    panel22.setBackground(new Color(color, color1, color2));
    z = 22;      
    }      
    }

    if (z == 13)
    {
    if (control.equals("left"))
    {
    panel13.setBackground(Color.white);
    panel12.setBackground(new Color(color, color1, color2));
    z = 12;
    }
    if (control.equals("right"))
    {
    panel13.setBackground(Color.white);
    panel14.setBackground(new Color(color, color1, color2));
    z = 14;
    }
    if (control.equals("up"))
    {
    System.out.println("Not a way");    
    }
    if (control.equals("down"))
    {
    panel13.setBackground(Color.white);
    panel23.setBackground(new Color(color, color1, color2));
    z = 23;      
    }      
    }

    if (z == 14)
    {
    if (control.equals("left"))
    {
    panel14.setBackground(Color.white);
    panel13.setBackground(new Color(color, color1, color2));
    z = 13;
    }
    if (control.equals("right"))
    {
    panel14.setBackground(Color.white);
    panel15.setBackground(new Color(color, color1, color2));
    z = 15;
    }
    if (control.equals("up"))
    {
    System.out.println("Not a way");    
    }
    if (control.equals("down"))
    {
    panel14.setBackground(Color.white);
    panel24.setBackground(new Color(color, color1, color2));
    z = 24;      
    }      
    }

    if (z == 15)
    {
    if (control.equals("left"))
    {
    panel15.setBackground(Color.white);
    panel14.setBackground(new Color(color, color1, color2));
    z = 14;
    }
    if (control.equals("right"))
    {
    panel15.setBackground(Color.white);
    panel16.setBackground(new Color(color, color1, color2));
    z = 16;
    }
    if (control.equals("up"))
    {
    System.out.println("Not a way");    
    }
    if (control.equals("down"))
    {
    panel15.setBackground(Color.white);
    panel25.setBackground(new Color(color, color1, color2));
    z = 25;      
    }      
    }

    if (z == 16)
    {
    if (control.equals("left"))
    {
    panel16.setBackground(Color.white);
    panel15.setBackground(new Color(color, color1, color2));
    z = 15;
    }
    if (control.equals("right"))
    {
    panel16.setBackground(Color.white);
    panel17.setBackground(new Color(color, color1, color2));
    z = 17;
    }
    if (control.equals("up"))
    {
    System.out.println("Not a way");    
    }
    if (control.equals("down"))
    {
    panel16.setBackground(Color.white);
    panel26.setBackground(new Color(color, color1, color2));
    z = 26;      
    }      
    }

    if (z == 17)
    {
    if (control.equals("left"))
    {
    panel17.setBackground(Color.white);
    panel16.setBackground(new Color(color, color1, color2));
    z = 16;
    }
    if (control.equals("right"))
    {
    panel17.setBackground(Color.white);
    panel18.setBackground(new Color(color, color1, color2));
    z = 18;
    }
    if (control.equals("up"))
    {
    System.out.println("Not a way");    
    }
    if (control.equals("down"))
    {
    panel17.setBackground(Color.white);
    panel27.setBackground(new Color(color, color1, color2));
    z = 27;      
    }      
    }

    if (z == 18)
    {
    if (control.equals("left"))
    {
    panel18.setBackground(Color.white);
    panel17.setBackground(new Color(color, color1, color2));
    z = 17;
    }
    if (control.equals("right"))
    {
    System.out.println("Not a way");
    }
    if (control.equals("up"))
    {
    System.out.println("Not a way");    
    }
    if (control.equals("down"))
    {
    panel18.setBackground(Color.white);
    panel28.setBackground(new Color(color, color1, color2));
    z = 28;      
    }      
    }



    if (z == 22)
    {
    if (control.equals("left"))
    {
    System.out.println("Not a way");
    }
    if (control.equals("right"))
    {
    panel22.setBackground(Color.white);
    panel23.setBackground(new Color(color, color1, color2));
    z = 23;
    }
    if (control.equals("up"))
    {
    panel22.setBackground(Color.white);
    panel12.setBackground(new Color(color, color1, color2));
    z = 12;      
    }
    if (control.equals("down"))
    {
    panel22.setBackground(Color.white);
    panel32.setBackground(new Color(color, color1, color2));
    z = 32;      
    }      
    }

    if (z == 23)
    {
    if (control.equals("left"))
    {
    panel23.setBackground(Color.white);
    panel22.setBackground(new Color(color, color1, color2));
    z = 22;
    }
    if (control.equals("right"))
    {
    panel23.setBackground(Color.white);
    panel24.setBackground(new Color(color, color1, color2));
    z = 24;
    }
    if (control.equals("up"))
    {
    panel23.setBackground(Color.white);
    panel13.setBackground(new Color(color, color1, color2));
    z = 13;        
    }
    if (control.equals("down"))
    {
    panel23.setBackground(Color.white);
    panel33.setBackground(new Color(color, color1, color2));
    z = 33;      
    }      
    }

    if (z == 24)
    {
    if (control.equals("left"))
    {
    panel24.setBackground(Color.white);
    panel23.setBackground(new Color(color, color1, color2));
    z = 23;
    }
    if (control.equals("right"))
    {
    panel24.setBackground(Color.white);
    panel25.setBackground(new Color(color, color1, color2));
    z = 25;
    }
    if (control.equals("up"))
    {
    panel24.setBackground(Color.white);
    panel14.setBackground(new Color(color, color1, color2));
    z = 14;        
    }
    if (control.equals("down"))
    {
    panel24.setBackground(Color.white);
    panel34.setBackground(new Color(color, color1, color2));
    z = 34;      
    }      
    }

    if (z == 25)
    {
    if (control.equals("left"))
    {
    panel25.setBackground(Color.white);
    panel24.setBackground(new Color(color, color1, color2));
    z = 24;
    }
    if (control.equals("right"))
    {
    panel25.setBackground(Color.white);
    panel26.setBackground(new Color(color, color1, color2));
    z = 26;
    }
    if (control.equals("up"))
    {
    panel25.setBackground(Color.white);
    panel15.setBackground(new Color(color, color1, color2));
    z = 15;       
    }
    if (control.equals("down"))
    {
    panel25.setBackground(Color.white);
    panel35.setBackground(new Color(color, color1, color2));
    z = 35;      
    }      
    }

    if (z == 26)
    {
    if (control.equals("left"))
    {
    panel26.setBackground(Color.white);
    panel25.setBackground(new Color(color, color1, color2));
    z = 25;
    }
    if (control.equals("right"))
    {
    panel26.setBackground(Color.white);
    panel27.setBackground(new Color(color, color1, color2));
    z = 27;
    }
    if (control.equals("up"))
    {
    panel26.setBackground(Color.white);
    panel16.setBackground(new Color(color, color1, color2));
    z = 16;       
    }
    if (control.equals("down"))
    {
    panel26.setBackground(Color.white);
    panel36.setBackground(new Color(color, color1, color2));
    z = 36;      
    }      
    }

    if (z == 27)
    {
    if (control.equals("left"))
    {
    panel27.setBackground(Color.white);
    panel26.setBackground(new Color(color, color1, color2));
    z = 26;
    }
    if (control.equals("right"))
    {
    panel27.setBackground(Color.white);
    panel28.setBackground(new Color(color, color1, color2));
    z = 28;
    }
    if (control.equals("up"))
    {
    panel27.setBackground(Color.white);
    panel17.setBackground(new Color(color, color1, color2));
    z = 17;       
    }
    if (control.equals("down"))
    {
    panel27.setBackground(Color.white);
    panel37.setBackground(new Color(color, color1, color2));
    z = 37;      
    }      
    }

    if (z == 28)
    {
    if (control.equals("left"))
    {
    panel28.setBackground(Color.white);
    panel27.setBackground(new Color(color, color1, color2));
    z = 27;
    }
    if (control.equals("right"))
    {
    panel28.setBackground(Color.white);
    panel29.setBackground(new Color(color, color1, color2));
    z = 29;
    }
    if (control.equals("up"))
    {
    panel28.setBackground(Color.white);
    panel18.setBackground(new Color(color, color1, color2));
    z = 18;       
    }
    if (control.equals("down"))
    {
    panel28.setBackground(Color.white);
    panel38.setBackground(new Color(color, color1, color2));
    z = 38;      
    }      
    }

    if (z == 29)
    {
    if (control.equals("left"))
    {
    panel29.setBackground(Color.white);
    panel28.setBackground(new Color(color, color1, color2));
    z = 24;
    }
    if (control.equals("right"))
    {
    System.out.println("Not a way");
    }
    if (control.equals("up"))
    {
    System.out.println("Not a way");    
    }
    if (control.equals("down"))
    {
    panel29.setBackground(Color.white);
    panel39.setBackground(new Color(color, color1, color2));
    z = 39;      
    }      
    }

    if (z == 32)
    {
    if (control.equals("left"))
    {
    System.out.println("Not a way");
    }
    if (control.equals("right"))
    {
    panel32.setBackground(Color.white);
    panel33.setBackground(new Color(color, color1, color2));
    z = 33;
    }
    if (control.equals("up"))
    {
    panel32.setBackground(Color.white);
    panel22.setBackground(new Color(color, color1, color2));
    z = 22;       
    }
    if (control.equals("down"))
    {
    panel32.setBackground(Color.white);
    panel42.setBackground(new Color(color, color1, color2));
    z = 42;      
    }      
    }

    if (z == 33)
    {
    if (control.equals("left"))
    {
    panel33.setBackground(Color.white);
    panel32.setBackground(new Color(color, color1, color2));
    z = 32;
    }
    if (control.equals("right"))
    {
    panel33.setBackground(Color.white);
    panel34.setBackground(new Color(color, color1, color2));
    z = 34;
    }
    if (control.equals("up"))
    {
    panel33.setBackground(Color.white);
    panel23.setBackground(new Color(color, color1, color2));
    z = 23;       
    }
    if (control.equals("down"))
    {
    panel33.setBackground(Color.white);
    panel43.setBackground(new Color(color, color1, color2));
    z = 43;      
    }      
    }

    if (z == 34)
    {
    if (control.equals("left"))
    {
    panel34.setBackground(Color.white);
    panel33.setBackground(new Color(color, color1, color2));
    z = 33;
    }
    if (control.equals("right"))
    {
    panel34.setBackground(Color.white);
    panel35.setBackground(new Color(color, color1, color2));
    z = 35;
    }
    if (control.equals("up"))
    {
    panel34.setBackground(Color.white);
    panel24.setBackground(new Color(color, color1, color2));
    z = 24;       
    }
    if (control.equals("down"))
    {
    panel34.setBackground(Color.white);
    panel44.setBackground(new Color(color, color1, color2));
    z = 44;      
    }      
    }
    
    if (z == 35)
    {
    if (control.equals("left"))
    {
    panel35.setBackground(Color.white);
    panel34.setBackground(new Color(color, color1, color2));
    z = 34;
    }
    if (control.equals("right"))
    {
    panel35.setBackground(Color.white);
    panel36.setBackground(new Color(color, color1, color2));
    z = 36;
    }
    if (control.equals("up"))
    {
    panel35.setBackground(Color.white);
    panel25.setBackground(new Color(color, color1, color2));
    z = 25;       
    }
    if (control.equals("down"))
    {
    panel35.setBackground(Color.white);
    panel45.setBackground(new Color(color, color1, color2));
    z = 45;      
    }      
    }

    if (z == 36)
    {
    if (control.equals("left"))
    {
    panel36.setBackground(Color.white);
    panel35.setBackground(new Color(color, color1, color2));
    z = 36;
    }
    if (control.equals("right"))
    {
    panel36.setBackground(Color.white);
    panel37.setBackground(new Color(color, color1, color2));
    z = 37;
    }
    if (control.equals("up"))
    {
    panel36.setBackground(Color.white);
    panel26.setBackground(new Color(color, color1, color2));
    z = 26;       
    }
    if (control.equals("down"))
    {
    panel36.setBackground(Color.white);
    panel46.setBackground(new Color(color, color1, color2));
    z = 46;      
    }      
    }
    
    if (z == 37)
    {
    if (control.equals("left"))
    {
    panel37.setBackground(Color.white);
    panel36.setBackground(new Color(color, color1, color2));
    z = 36;
    }
    if (control.equals("right"))
    {
    panel37.setBackground(Color.white);
    panel38.setBackground(new Color(color, color1, color2));
    z = 38;
    }
    if (control.equals("up"))
    {
    panel37.setBackground(Color.white);
    panel27.setBackground(new Color(color, color1, color2));
    z = 27;       
    }
    if (control.equals("down"))
    {
    panel37.setBackground(Color.white);
    panel47.setBackground(new Color(color, color1, color2));
    z = 47;      
    }      
    }

    if (z == 38)
    {
    if (control.equals("left"))
    {
    panel38.setBackground(Color.white);
    panel37.setBackground(new Color(color, color1, color2));
    z = 38;
    }
    if (control.equals("right"))
    {
    panel38.setBackground(Color.white);
    panel39.setBackground(new Color(color, color1, color2));
    z = 39;
    }
    if (control.equals("up"))
    {
    panel38.setBackground(Color.white);
    panel28.setBackground(new Color(color, color1, color2));
    z = 28;       
    }
    if (control.equals("down"))
    {
    panel38.setBackground(Color.white);
    panel48.setBackground(new Color(color, color1, color2));
    z = 48;      
    }      
    }

    if (z == 39)
    {
    if (control.equals("left"))
    {
    panel39.setBackground(Color.white);
    panel38.setBackground(new Color(color, color1, color2));
    z = 38;
    }
    if (control.equals("right"))
    {
    System.out.println("Not a way");
    }
    if (control.equals("up"))
    {
    panel39.setBackground(Color.white);
    panel29.setBackground(new Color(color, color1, color2));
    z = 29;       
    }
    if (control.equals("down"))
    {
    panel39.setBackground(Color.white);
    panel49.setBackground(new Color(color, color1, color2));
    z = 49;      
    }      
    }

    if (z == 42)
    {
    if (control.equals("left"))
    {
    System.out.println("Not a way");
    }
    if (control.equals("right"))
    {
    panel42.setBackground(Color.white);
    panel43.setBackground(new Color(color, color1, color2));
    z = 43; 
    }
    if (control.equals("up"))
    {
    panel42.setBackground(Color.white);
    panel32.setBackground(new Color(color, color1, color2));
    z = 32;       
    }
    if (control.equals("down"))
    {
    System.out.println("Not a way");   
    }      
    }

    if (z == 43)
    {
    if (control.equals("left"))
    {
    panel43.setBackground(Color.white);
    panel42.setBackground(new Color(color, color1, color2));
    z = 42;
    }
    if (control.equals("right"))
    {
    panel43.setBackground(Color.white);
    panel44.setBackground(new Color(color, color1, color2));
    z = 44;        
    }
    if (control.equals("up"))
    {
    panel43.setBackground(Color.white);
    panel33.setBackground(new Color(color, color1, color2));
    z = 33;       
    }
    if (control.equals("down"))
    {
    System.out.println("Not a way");   
    }      
    }

    if (z == 44)
    {
    if (control.equals("left"))
    {
    panel44.setBackground(Color.white);
    panel43.setBackground(new Color(color, color1, color2));
    z = 43;
    }
    if (control.equals("right"))
    {
    panel44.setBackground(Color.white);
    panel45.setBackground(new Color(color, color1, color2));
    z = 45;        
    }
    if (control.equals("up"))
    {
    panel44.setBackground(Color.white);
    panel34.setBackground(new Color(color, color1, color2));
    z = 34;       
    }
    if (control.equals("down"))
    {
    panel44.setBackground(Color.white);
    panel54.setBackground(new Color(color, color1, color2));
    z = 54;      
    }      
    }

    if (z == 45)
    {
    if (control.equals("left"))
    {
    panel45.setBackground(Color.white);
    panel44.setBackground(new Color(color, color1, color2));
    z = 44;
    }
    if (control.equals("right"))
    {
    panel45.setBackground(Color.white);
    panel46.setBackground(new Color(color, color1, color2));
    z = 46;        
    }
    if (control.equals("up"))
    {
    panel45.setBackground(Color.white);
    panel35.setBackground(new Color(color, color1, color2));
    z = 35;       
    }
    if (control.equals("down"))
    {
    panel45.setBackground(Color.white);
    panel55.setBackground(new Color(color, color1, color2));
    z = 55;       
    }      
    }

    if (z == 46)
    {
    if (control.equals("left"))
    {
    panel46.setBackground(Color.white);
    panel45.setBackground(new Color(color, color1, color2));
    z = 45;
    }
    if (control.equals("right"))
    {
    panel46.setBackground(Color.white);
    panel47.setBackground(new Color(color, color1, color2));
    z = 47;        
    }
    if (control.equals("up"))
    {
    panel46.setBackground(Color.white);
    panel36.setBackground(new Color(color, color1, color2));
    z = 36;       
    }
    if (control.equals("down"))
    {
    panel46.setBackground(Color.white);
    panel56.setBackground(new Color(color, color1, color2));
    z = 56;   
    }      
    }

    if (z == 47)
    {
    if (control.equals("left"))
    {
    panel47.setBackground(Color.white);
    panel46.setBackground(new Color(color, color1, color2));
    z = 46;
    }
    if (control.equals("right"))
    {
    panel47.setBackground(Color.white);
    panel48.setBackground(new Color(color, color1, color2));
    z = 48;        
    }
    if (control.equals("up"))
    {
    panel47.setBackground(Color.white);
    panel37.setBackground(new Color(color, color1, color2));
    z = 37;       
    }
    if (control.equals("down"))
    {
    panel47.setBackground(Color.white);
    panel57.setBackground(new Color(color, color1, color2));
    z = 57;  
    }      
    }

    if (z == 48)
    {
    if (control.equals("left"))
    {
    panel48.setBackground(Color.white);
    panel47.setBackground(new Color(color, color1, color2));
    z = 47;
    }
    if (control.equals("right"))
    {
    panel48.setBackground(Color.white);
    panel49.setBackground(new Color(color, color1, color2));
    z = 49;        
    }
    if (control.equals("up"))
    {
    panel48.setBackground(Color.white);
    panel38.setBackground(new Color(color, color1, color2));
    z = 38;       
    }
    if (control.equals("down"))
    {
    panel48.setBackground(Color.white);
    panel58.setBackground(new Color(color, color1, color2));
    z = 58;   
    }      
    }

    if (z == 49)
    {
    if (control.equals("left"))
    {
    panel49.setBackground(Color.white);
    panel48.setBackground(new Color(color, color1, color2));
    z = 48;
    }
    if (control.equals("right"))
    {
    panel49.setBackground(Color.white);
    panel50.setBackground(new Color(color, color1, color2));
    z = 50;
    }
      
      
    if (control.equals("up"))
    {
    panel49.setBackground(Color.white);
    panel39.setBackground(new Color(color, color1, color2));
    z = 39;       
    }
    if (control.equals("down"))
    {
    panel49.setBackground(Color.white);
    panel59.setBackground(new Color(color, color1, color2));
    z = 59;   
    }      
    }

    if (z == 50)
    {
    if (control.equals("left"))
    {
    panel50.setBackground(Color.white);
    panel49.setBackground(new Color(color, color1, color2));
    z = 49;   
    }
    if (control.equals("right"))
    {
    x = 5;
    loc1 = 1; 
    }
      
    if (control.equals("up"))
    {
    System.out.println("Not a way");        
    }
    if (control.equals("down"))
    {
    panel50.setBackground(Color.white);
    panel60.setBackground(new Color(color, color1, color2));
    z = 60;     
    }      
    }    



    if (z == 55)
    {
    if (control.equals("left"))
    {
    panel55.setBackground(Color.white);
    panel54.setBackground(new Color(color, color1, color2));
    z = 54;   
    }
    if (control.equals("right"))
    {
    panel55.setBackground(Color.white);
    panel56.setBackground(new Color(color, color1, color2));
    z = 56;        
    }
    if (control.equals("up"))
    {
    panel55.setBackground(Color.white);
    panel45.setBackground(new Color(color, color1, color2));
    z = 45;       
    }
    if (control.equals("down"))
    {
    panel55.setBackground(Color.white);
    panel65.setBackground(new Color(color, color1, color2));
    z = 65;     
    }      
    }

    if (z == 56)
    {
    if (control.equals("left"))
    {
    panel56.setBackground(Color.white);
    panel55.setBackground(new Color(color, color1, color2));
    z = 55;   
    }
    if (control.equals("right"))
    {
    panel56.setBackground(Color.white);
    panel57.setBackground(new Color(color, color1, color2));
    z = 57;        
    }
    if (control.equals("up"))
    {
    panel56.setBackground(Color.white);
    panel46.setBackground(new Color(color, color1, color2));
    z = 46;       
    }
    if (control.equals("down"))
    {
    panel56.setBackground(Color.white);
    panel66.setBackground(new Color(color, color1, color2));
    z = 66;     
    }      
    }

    if (z == 57)
    {
    if (control.equals("left"))
    {
    panel57.setBackground(Color.white);
    panel56.setBackground(new Color(color, color1, color2));
    z = 56;   
    }
    if (control.equals("right"))
    {
    panel57.setBackground(Color.white);
    panel58.setBackground(new Color(color, color1, color2));
    z = 58;        
    }
    if (control.equals("up"))
    {
    panel57.setBackground(Color.white);
    panel47.setBackground(new Color(color, color1, color2));
    z = 47;       
    }
    if (control.equals("down"))
    {
    panel57.setBackground(Color.white);
    panel67.setBackground(new Color(color, color1, color2));
    z = 67;     
    }      
    }

    if (z == 58)
    {
    if (control.equals("left"))
    {
    panel58.setBackground(Color.white);
    panel57.setBackground(new Color(color, color1, color2));
    z = 57;   
    }
    if (control.equals("right"))
    {
    panel58.setBackground(Color.white);
    panel59.setBackground(new Color(color, color1, color2));
    z = 59;        
    }
    if (control.equals("up"))
    {
    panel58.setBackground(Color.white);
    panel48.setBackground(new Color(color, color1, color2));
    z = 48;       
    }
    if (control.equals("down"))
    {
    panel58.setBackground(Color.white);
    panel68.setBackground(new Color(color, color1, color2));
    z = 68;     
    }      
    }

    if (z == 59)
    {
    if (control.equals("left"))
    {
    panel59.setBackground(Color.white);
    panel58.setBackground(new Color(color, color1, color2));
    z = 58;   
    }
    if (control.equals("right"))
    {
    panel59.setBackground(Color.white);
    panel60.setBackground(new Color(color, color1, color2));
    z = 60;
    }
    if (control.equals("up"))
    {
    panel59.setBackground(Color.white);
    panel49.setBackground(new Color(color, color1, color2));
    z = 49;       
    }
    if (control.equals("down"))
    {
    panel59.setBackground(Color.white);
    panel69.setBackground(new Color(color, color1, color2));
    z = 69;     
    }      
    }

    if (z == 60)
    {
    if (control.equals("left"))
    {
    panel60.setBackground(Color.white);
    panel59.setBackground(new Color(color, color1, color2));
    z = 59;   
    }
    if (control.equals("right"))
    {
    x = 5;
    loc1 = 1;       
    }
    if (control.equals("up"))
    {
    panel60.setBackground(Color.white);
    panel50.setBackground(new Color(color, color1, color2));
    z = 50;       
    }
    if (control.equals("down"))
    {
    System.out.println("Not a way");
    }      
    }


    if (z == 65)
    {
    if (control.equals("left"))
    {
    panel65.setBackground(Color.white);
    panel64.setBackground(new Color(color, color1, color2));
    z = 64;   
    }
    if (control.equals("right"))
    {
    panel65.setBackground(Color.white);
    panel66.setBackground(new Color(color, color1, color2));
    z = 66;       
    }
    if (control.equals("up"))
    {
    panel65.setBackground(Color.white);
    panel55.setBackground(new Color(color, color1, color2));
    z = 55;       
    }
    if (control.equals("down"))
    {
    panel65.setBackground(Color.white);
    panel75.setBackground(new Color(color, color1, color2));
    z = 75;   
    }      
    }    

    if (z == 66)
    {
    if (control.equals("left"))
    {
    panel66.setBackground(Color.white);
    panel65.setBackground(new Color(color, color1, color2));
    z = 65;   
    }
    if (control.equals("right"))
    {
    panel66.setBackground(Color.white);
    panel67.setBackground(new Color(color, color1, color2));
    z = 67;       
    }
    if (control.equals("up"))
    {
    panel66.setBackground(Color.white);
    panel56.setBackground(new Color(color, color1, color2));
    z = 56;       
    }
    if (control.equals("down"))
    {
    panel66.setBackground(Color.white);
    panel76.setBackground(new Color(color, color1, color2));
    z = 76;   
    }      
    } 

    if (z == 67)
    {
    if (control.equals("left"))
    {
    panel67.setBackground(Color.white);
    panel66.setBackground(new Color(color, color1, color2));
    z = 66;   
    }
    if (control.equals("right"))
    {
    panel67.setBackground(Color.white);
    panel68.setBackground(new Color(color, color1, color2));
    z = 68;       
    }
    if (control.equals("up"))
    {
    panel67.setBackground(Color.white);
    panel57.setBackground(new Color(color, color1, color2));
    z = 57;       
    }
    if (control.equals("down"))
    {
    panel67.setBackground(Color.white);
    panel77.setBackground(new Color(color, color1, color2));
    z = 77;   
    }      
    } 

    if (z == 68)
    {
    if (control.equals("left"))
    {
    panel68.setBackground(Color.white);
    panel67.setBackground(new Color(color, color1, color2));
    z = 67;   
    }
    if (control.equals("right"))
    {
    panel68.setBackground(Color.white);
    panel69.setBackground(new Color(color, color1, color2));
    z = 69;       
    }
    if (control.equals("up"))
    {
    panel68.setBackground(Color.white);
    panel58.setBackground(new Color(color, color1, color2));
    z = 58;       
    }
    if (control.equals("down"))
    {
    panel68.setBackground(Color.white);
    panel78.setBackground(new Color(color, color1, color2));
    z = 78;   
    }      
    } 

    if (z == 69)
    {
    if (control.equals("left"))
    {
    panel69.setBackground(Color.white);
    panel68.setBackground(new Color(color, color1, color2));
    z = 68;   
    }
    if (control.equals("right"))
    {
    System.out.println("Not a way");       
    }
    if (control.equals("up"))
    {
    panel69.setBackground(Color.white);
    panel59.setBackground(new Color(color, color1, color2));
    z = 59;       
    }
    if (control.equals("down"))
    {
    panel69.setBackground(Color.white);
    panel79.setBackground(new Color(color, color1, color2));
    z = 79;   
    }      
    } 

    if (z == 75)
    {
    if (control.equals("left"))
    {
    System.out.println("Not a way"); 
    }
    if (control.equals("right"))
    {
    panel75.setBackground(Color.white);
    panel76.setBackground(new Color(color, color1, color2));
    z = 76;      
    }
    if (control.equals("up"))
    {
    panel75.setBackground(Color.white);
    panel65.setBackground(new Color(color, color1, color2));
    z = 65;       
    }
    if (control.equals("down"))
    {
    panel75.setBackground(Color.white);
    panel85.setBackground(new Color(color, color1, color2));
    z = 85;   
    }      
    } 

    if (z == 76)
    {
    if (control.equals("left"))
    {
    panel76.setBackground(Color.white);
    panel75.setBackground(new Color(color, color1, color2));
    z = 75;   
    }
    if (control.equals("right"))
    {
    panel76.setBackground(Color.white);
    panel77.setBackground(new Color(color, color1, color2));
    z = 77;          
    }
    if (control.equals("up"))
    {
    panel76.setBackground(Color.white);
    panel66.setBackground(new Color(color, color1, color2));
    z = 66;       
    }
    if (control.equals("down"))
    {
    panel76.setBackground(Color.white);
    panel86.setBackground(new Color(color, color1, color2));
    z = 86;   
    }      
    } 

    if (z == 77)
    {
    if (control.equals("left"))
    {
    panel77.setBackground(Color.white);
    panel76.setBackground(new Color(color, color1, color2));
    z = 76;   
    }
    if (control.equals("right"))
    {
    panel77.setBackground(Color.white);
    panel78.setBackground(new Color(color, color1, color2));
    z = 78;        
    }
    if (control.equals("up"))
    {
    panel77.setBackground(Color.white);
    panel67.setBackground(new Color(color, color1, color2));
    z = 67;       
    }
    if (control.equals("down"))
    {
    panel77.setBackground(Color.white);
    panel87.setBackground(new Color(color, color1, color2));
    z = 87;   
    }      
    } 

    if (z == 78)
    {
    if (control.equals("left"))
    {
    panel78.setBackground(Color.white);
    panel77.setBackground(new Color(color, color1, color2));
    z = 77;   
    }
    if (control.equals("right"))
    {
    panel78.setBackground(Color.white);
    panel79.setBackground(new Color(color, color1, color2));
    z = 79;        
    }
    if (control.equals("up"))
    {
    panel78.setBackground(Color.white);
    panel68.setBackground(new Color(color, color1, color2));
    z = 68;       
    }
    if (control.equals("down"))
    {
    panel78.setBackground(Color.white);
    panel88.setBackground(new Color(color, color1, color2));
    z = 88;   
    }      
    } 

    if (z == 79)
    {
    if (control.equals("left"))
    {
    panel79.setBackground(Color.white);
    panel78.setBackground(new Color(color, color1, color2));
    z = 78;   
    }
    if (control.equals("right"))
    {
    System.out.println("Not a way");       
    }
    if (control.equals("up"))
    {
    panel79.setBackground(Color.white);
    panel69.setBackground(new Color(color, color1, color2));
    z = 69;       
    }
    if (control.equals("down"))
    {
    System.out.println("Not a way");
    }      
    } 

    if (z == 85)
    {
    if (control.equals("left"))
    {
    System.out.println("Not a way");   
    }
    if (control.equals("right"))
    {
    panel85.setBackground(Color.white);
    panel86.setBackground(new Color(color, color1, color2));
    z = 86;        
    }
    if (control.equals("up"))
    {
    panel85.setBackground(Color.white);
    panel75.setBackground(new Color(color, color1, color2));
    z = 75;       
    }
    if (control.equals("down"))
    {
    System.out.println("Not a way"); 
    }      
    } 

    if (z == 86)
    {
    if (control.equals("left"))
    {
    panel86.setBackground(Color.white);
    panel85.setBackground(new Color(color, color1, color2));
    z = 85;   
    }
    if (control.equals("right"))
    {
    panel86.setBackground(Color.white);
    panel87.setBackground(new Color(color, color1, color2));
    z = 87;        
    }
    if (control.equals("up"))
    {
    panel86.setBackground(Color.white);
    panel76.setBackground(new Color(color, color1, color2));
    z = 76;       
    }
    if (control.equals("down"))
    {
    System.out.println("Not a way");
    }      
    } 

    if (z == 87)
    {
    if (control.equals("left"))
    {
    panel87.setBackground(Color.white);
    panel86.setBackground(new Color(color, color1, color2));
    z = 86;   
    }
    if (control.equals("right"))
    {
    panel87.setBackground(Color.white);
    panel88.setBackground(new Color(color, color1, color2));
    z = 88;        
    }
    if (control.equals("up"))
    {
    panel87.setBackground(Color.white);
    panel77.setBackground(new Color(color, color1, color2));
    z = 77;       
    }
    if (control.equals("down"))
    {
    System.out.println("Not a way");
    }      
    } 

    if (z == 88)
    {
    if (control.equals("left"))
    {
    panel88.setBackground(Color.white);
    panel87.setBackground(new Color(color, color1, color2));
    z = 87;   
    }
    if (control.equals("right"))
    {
    System.out.println("Not a way");      
    }
    if (control.equals("up"))
    {
    panel88.setBackground(Color.white);
    panel78.setBackground(new Color(color, color1, color2));
    z = 78;       
    }
    if (control.equals("down"))
    {
    System.out.println("Not a way");
    }      
    } 



    
    

  

    if (control.equals("look"))
    {
    System.out.println("In the yellow room there is a table, a box, there is a poster.");
    }

    if (z == 42 || z == 43 || z == 44 || z == 45 || z == 55 || z == 65 || z == 75 || z == 85)
    {
    if (control.equals("look at table") || control.equals("look at desk"))
    {
    System.out.println("There is nothing on the table");
    }  
    }



                                
    if (z == 88 || z == 78 || z == 79)
    {
    if (control.equals("look at box"))
    {
    if (count[2] == 1)
    {
    System.out.println("You find a screwdriver");
    count[3] = 1;
    }
    else
    {
    System.out.println("You need a green key");
    } 
    }  
    }



    if (z == 18 || z == 28 || z == 29)
    {
    if (control.equals("look at poster"))
    {
    System.out.println("--------------------------");
    System.out.println("|  1        2        3   |");
    System.out.println("|          ABC      DEF  |");
    System.out.println("|  4        5        6   |");
    System.out.println("| GHI      JKL      MNO  |");
    System.out.println("|  7        8        9   |");
    System.out.println("| PQRS     TUV      WXYZ |");
    System.out.println("|  *        0        #   |");
    System.out.println("|________________________|");
    }      
    }
    
  } // the room to right, end bracket






    
  if (x == 4) // The room to the front
  {

  if (loc == 4)
  {
  map [0][0] = "wl";
  map [0][1] = "wl";
  map [0][2] = "wl";
  map [0][3] = "wl";
  map [0][4] = "wl";
  map [0][5] = "wl";
  map [0][6] = "wl";
  map [0][7] = "wl";
  map [0][8] = "wl";
  map [0][9] = "wl";
  map [1][0] = "wl";
  map [1][1] = "bd";
  map [1][2] = "  ";
  map [1][3] = "  ";
  map [1][4] = "  ";
  map [1][5] = "  ";
  map [1][6] = "  ";
  map [1][7] = "  ";
  map [1][8] = "ss";
  map [1][9] = "wl";
  map [2][0] = "wl";
  map [2][1] = "bd";
  map [2][2] = "  ";
  map [2][3] = "  ";
  map [2][4] = "  ";
  map [2][5] = "  ";
  map [2][6] = "  ";
  map [2][7] = "  ";
  map [2][8] = "  ";
  map [2][9] = "wl";
  map [3][0] = "wl";
  map [3][1] = "  ";
  map [3][2] = "  ";
  map [3][3] = "tb";
  map [3][4] = "tb";
  map [3][5] = "tb";
  map [3][6] = "  ";
  map [3][7] = "  ";
  map [3][8] = "  ";
  map [3][9] = "wl";
  map [4][0] = "wl";
  map [4][1] = "  ";
  map [4][2] = "  ";
  map [4][3] = "tb";
  map [4][4] = "tb";
  map [4][5] = "tb";
  map [4][6] = "  ";
  map [4][7] = "  ";
  map [4][8] = "  ";
  map [4][9] = "wl";
  map [5][0] = "wl";
  map [5][1] = "  ";
  map [5][2] = "  ";
  map [5][3] = "  ";
  map [5][4] = "  ";
  map [5][5] = "  ";
  map [5][6] = "  ";
  map [5][7] = "  ";
  map [5][8] = "  ";
  map [5][9] = "wl";
  map [6][0] = "wl";
  map [6][1] = "  ";
  map [6][2] = "  ";
  map [6][3] = "  ";
  map [6][4] = "  ";
  map [6][5] = "  ";
  map [6][6] = "  ";
  map [6][7] = "  ";
  map [6][8] = "  ";
  map [6][9] = "wl";
  map [7][0] = "wl";
  map [7][1] = "ps";
  map [7][2] = "  ";
  map [7][3] = "  ";
  map [7][4] = "  ";
  map [7][5] = "  ";
  map [7][6] = "  ";
  map [7][7] = "  ";
  map [7][8] = "  ";
  map [7][9] = "wl";
  map [8][0] = "wl";
  map [8][1] = "wl";
  map [8][2] = "wl";
  map [8][3] = "wl";
  map [8][4] = "dr";
  map [8][5] = "dr";
  map [8][6] = "wl";
  map [8][7] = "wl";
  map [8][8] = "wl";
  map [8][9] = "wl";
  map [9][0] = "wl";
  map [9][1] = "wl";
  map [9][2] = "wl";
  map [9][3] = "wl";
  map [9][4] = "  ";
  map [9][5] = "  ";
  map [9][6] = "wl";
  map [9][7] = "wl";
  map [9][8] = "wl";
  map [9][9] = "wl";

    panel1.setBackground(Color.black);
    panel2.setBackground(Color.black);
    panel3.setBackground(Color.black);
    panel4.setBackground(Color.black);    
    panel5.setBackground(Color.black);
    panel6.setBackground(Color.black);
    panel7.setBackground(Color.black);
    panel8.setBackground(Color.black);
    panel9.setBackground(Color.black);    
    panel10.setBackground(Color.black);
    panel11.setBackground(Color.black);
    panel12.setBackground(Color.red);
    panel13.setBackground(Color.white);
    panel14.setBackground(Color.white);
    panel15.setBackground(Color.white);
    panel16.setBackground(Color.white);
    panel17.setBackground(Color.white);
    panel18.setBackground(Color.white);    
    panel19.setBackground(new Color(184, 115, 51));
    panel20.setBackground(Color.black);
    panel21.setBackground(Color.black);
    panel22.setBackground(Color.red);    
    panel23.setBackground(Color.white);
    panel24.setBackground(Color.white);
    panel25.setBackground(Color.white);
    panel26.setBackground(Color.white);
    panel27.setBackground(Color.white);
    panel28.setBackground(Color.white);
    panel29.setBackground(Color.white);
    panel30.setBackground(Color.black);
    panel31.setBackground(Color.black);
    panel32.setBackground(Color.white);
    panel33.setBackground(Color.white);
    panel34.setBackground(new Color(130, 73, 11));
    panel35.setBackground(new Color(130, 73, 11));
    panel36.setBackground(new Color(130, 73, 11));
    panel37.setBackground(new Color(130, 73, 11));
    panel38.setBackground(Color.white);
    panel39.setBackground(Color.white);
    panel40.setBackground(Color.black);
    panel41.setBackground(Color.black);
    panel42.setBackground(Color.white);
    panel43.setBackground(Color.white);
    panel44.setBackground(new Color(130, 73, 11));
    panel45.setBackground(new Color(130, 73, 11));
    panel46.setBackground(new Color(130, 73, 11));
    panel47.setBackground(new Color(130, 73, 11));
    panel48.setBackground(Color.white);
    panel49.setBackground(Color.white);
    panel50.setBackground(Color.black);
    panel51.setBackground(Color.black);
    panel52.setBackground(Color.white);
    panel53.setBackground(Color.white);
    panel54.setBackground(new Color(130, 73, 11));
    panel55.setBackground(new Color(130, 73, 11));
    panel56.setBackground(new Color(130, 73, 11));
    panel57.setBackground(new Color(130, 73, 11));
    panel58.setBackground(Color.white);
    panel59.setBackground(Color.white);
    panel60.setBackground(Color.black);
    panel61.setBackground(Color.black);
    panel62.setBackground(Color.white);
    panel63.setBackground(Color.white);    
    panel64.setBackground(Color.white);
    panel65.setBackground(Color.white);
    panel66.setBackground(Color.white);    
    panel67.setBackground(Color.white);
    panel68.setBackground(Color.white);
    panel69.setBackground(Color.white);
    panel70.setBackground(Color.black);
    panel71.setBackground(Color.black);
    panel72.setBackground(new Color(189, 145, 118));
    panel73.setBackground(Color.white);
    panel74.setBackground(Color.white);
    panel75.setBackground(Color.white);
    panel76.setBackground(Color.white);    
    panel77.setBackground(Color.white);
    panel78.setBackground(Color.white);
    panel79.setBackground(Color.white);
    panel80.setBackground(Color.black);
    panel81.setBackground(Color.black);
    panel82.setBackground(Color.black);
    panel83.setBackground(Color.black);
    panel84.setBackground(Color.black);    
    panel85.setBackground(new Color(93, 41, 6));
    panel86.setBackground(new Color(93, 41, 6));
    panel87.setBackground(Color.black);
    panel88.setBackground(Color.black);
    panel89.setBackground(Color.black);
    panel90.setBackground(Color.black);
    panel91.setBackground(Color.black);    
    panel92.setBackground(Color.black);
    panel93.setBackground(Color.black);
    panel94.setBackground(Color.black);    
    panel95.setBackground(Color.white);
    panel96.setBackground(Color.white);
    panel97.setBackground(Color.black);
    panel98.setBackground(Color.black);    
    panel99.setBackground(Color.black);    
    panel100.setBackground(Color.black);
  }
    
  if (run4 == 0)
  {
  yd = 9;
  xd = 4;
  map[yd][xd] = player;
  run4 = 1; 
  loc = 0;
  panel95.setBackground(new Color(color, color1, color2));
  z = 95;
    
  }

  if (run4 == 2)
  {
  yd = 2;
  xd = 4;
  map[yd][xd] = player;
  run4 = 1; 
  loc = 0;
  panel15.setBackground(new Color(color, color1, color2));
  z = 15;
  }

  //controls



  if (z == 5)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel5.setBackground(Color.white);        
      panel6.setBackground(new Color(color, color1, color2)); 
      z = 6;
      }
      
      if (control.equals("up"))
      {
      x = 6;     
      loc = 10;
      run = 0;       
      }
      
      if (control.equals("down"))
      {
      panel5.setBackground(Color.white);        
      panel15.setBackground(new Color(color, color1, color2));
      z = 15;
      }      

    }
    

    

    
    if (z == 6)
    {
      if (control.equals("left"))
      {
      panel6.setBackground(Color.white);        
      panel5.setBackground(new Color(color, color1, color2)); 
      z = 5;
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      x = 6;     
      loc = 10;
      run = 0;          
      }
      
      if (control.equals("down"))
      {
      panel13.setBackground(Color.white);        
      panel23.setBackground(new Color(color, color1, color2));
      z = 23;
      }      

    }

    if (z == 13)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel13.setBackground(Color.white);        
      panel14.setBackground(new Color(color, color1, color2)); 
      z = 14;
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way");        
      }
      
      if (control.equals("down"))
      {
      panel13.setBackground(Color.white);        
      panel23.setBackground(new Color(color, color1, color2));
      z = 23;
      }      

    }

    
    if (z == 14)
    {
      if (control.equals("left"))
      {
      panel14.setBackground(Color.white);        
      panel13.setBackground(new Color(color, color1, color2)); 
      z = 13;
      }
      
      if (control.equals("right"))
      {
      panel14.setBackground(Color.white);        
      panel15.setBackground(new Color(color, color1, color2)); 
      z = 15;
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way");        
      }
      
      if (control.equals("down"))
      {
      panel14.setBackground(Color.white);        
      panel24.setBackground(new Color(color, color1, color2));
      z = 24;
      }      

    }

    if (z == 15)
    {
      if (control.equals("left"))
      {
      panel15.setBackground(Color.white);        
      panel14.setBackground(new Color(color, color1, color2)); 
      z = 14;
      }
      
      if (control.equals("right"))
      {
      panel15.setBackground(Color.white);        
      panel16.setBackground(new Color(color, color1, color2)); 
      z = 16;
      }
      
      if (loc4 == 1)
      {
      if (control.equals("up"))
      {
      panel15.setBackground(Color.white);        
      panel5.setBackground(new Color(color, color1, color2)); 
      z = 5;  
      }
      }

      if (loc4 == 0)
      {
      if (control.equals("up"))
      {
      System.out.println("Not a way");        
      }  
      }
      if (control.equals("down"))
      {
      panel15.setBackground(Color.white);        
      panel25.setBackground(new Color(color, color1, color2));
      z = 25;
      }      

    }

    if (z == 16)
    {
      if (control.equals("left"))
      {
      panel16.setBackground(Color.white);        
      panel15.setBackground(new Color(color, color1, color2)); 
      z = 15;
      }
      
      if (control.equals("right"))
      {
      panel16.setBackground(Color.white);        
      panel17.setBackground(new Color(color, color1, color2)); 
      z = 17;
      }

      if (loc4 == 1)
      {
      if (control.equals("up"))
      {
      panel16.setBackground(Color.white);        
      panel6.setBackground(new Color(color, color1, color2)); 
      z = 6;  
      }
      }

      if (loc4 == 0)
      {
      if (control.equals("up"))
      {
      System.out.println("Not a way");        
      }  
      }
      
      
      if (control.equals("down"))
      {
      panel16.setBackground(Color.white);        
      panel26.setBackground(new Color(color, color1, color2));
      z = 26;
      }      

    }

    if (z == 17)
    {
      if (control.equals("left"))
      {
      panel17.setBackground(Color.white);        
      panel16.setBackground(new Color(color, color1, color2)); 
      z = 16;
      }
      
      if (control.equals("right"))
      {
      panel17.setBackground(Color.white);        
      panel18.setBackground(new Color(color, color1, color2)); 
      z = 18;
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way");        
      }
      
      if (control.equals("down"))
      {
      panel17.setBackground(Color.white);        
      panel27.setBackground(new Color(color, color1, color2));
      z = 27;
      }      

    }

    if (z == 18)
    {
      if (control.equals("left"))
      {
      panel18.setBackground(Color.white);        
      panel17.setBackground(new Color(color, color1, color2)); 
      z = 17;
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way");        
      }
      
      if (control.equals("down"))
      {
      panel18.setBackground(Color.white);        
      panel28.setBackground(new Color(color, color1, color2));
      z = 28;
      }      

    }

    if (z == 23)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel23.setBackground(Color.white);        
      panel24.setBackground(new Color(color, color1, color2)); 
      z = 24;
      }
      
      if (control.equals("up"))
      {
      panel23.setBackground(Color.white);        
      panel13.setBackground(new Color(color, color1, color2)); 
      z = 13;      
      }
      
      if (control.equals("down"))
      {
      panel23.setBackground(Color.white);        
      panel33.setBackground(new Color(color, color1, color2));
      z = 33;
      }      

    }

    if (z == 24)
    {
      if (control.equals("left"))
      {
      panel24.setBackground(Color.white);        
      panel23.setBackground(new Color(color, color1, color2)); 
      z = 23;
      }
      
      if (control.equals("right"))
      {
      panel24.setBackground(Color.white);        
      panel25.setBackground(new Color(color, color1, color2)); 
      z = 25;
      }
      
      if (control.equals("up"))
      {
      panel24.setBackground(Color.white);        
      panel14.setBackground(new Color(color, color1, color2)); 
      z = 14;     
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

    if (z == 25)
    {
      if (control.equals("left"))
      {
      panel25.setBackground(Color.white);        
      panel24.setBackground(new Color(color, color1, color2)); 
      z = 24;
      }
      
      if (control.equals("right"))
      {
      panel25.setBackground(Color.white);        
      panel26.setBackground(new Color(color, color1, color2)); 
      z = 26;
      }
      
      if (control.equals("up"))
      {
      panel25.setBackground(Color.white);        
      panel15.setBackground(new Color(color, color1, color2)); 
      z = 15;     
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

    if (z == 26)
    {
      if (control.equals("left"))
      {
      panel26.setBackground(Color.white);        
      panel25.setBackground(new Color(color, color1, color2)); 
      z = 25;
      }
      
      if (control.equals("right"))
      {
      panel26.setBackground(Color.white);        
      panel27.setBackground(new Color(color, color1, color2)); 
      z = 27;
      }
      
      if (control.equals("up"))
      {
      panel26.setBackground(Color.white);        
      panel16.setBackground(new Color(color, color1, color2)); 
      z = 16;     
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

    if (z == 27)
    {
      if (control.equals("left"))
      {
      panel27.setBackground(Color.white);        
      panel26.setBackground(new Color(color, color1, color2)); 
      z = 26;
      }
      
      if (control.equals("right"))
      {
      panel27.setBackground(Color.white);        
      panel28.setBackground(new Color(color, color1, color2)); 
      z = 28;
      }
      
      if (control.equals("up"))
      {
      panel27.setBackground(Color.white);        
      panel17.setBackground(new Color(color, color1, color2)); 
      z = 17;     
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }
    
    if (z == 28)
    {
      if (control.equals("left"))
      {
      panel28.setBackground(Color.white);        
      panel27.setBackground(new Color(color, color1, color2)); 
      z = 27;
      }
      
      if (control.equals("right"))
      {
      panel28.setBackground(Color.white);        
      panel29.setBackground(new Color(color, color1, color2)); 
      z = 29;
      }
      
      if (control.equals("up"))
      {
      panel28.setBackground(Color.white);        
      panel18.setBackground(new Color(color, color1, color2)); 
      z = 18;     
      }
      
      if (control.equals("down"))
      {
      panel28.setBackground(Color.white);        
      panel38.setBackground(new Color(color, color1, color2));
      z = 38;
      }      

    }

    if (z == 29)
    {
      if (control.equals("left"))
      {
      panel29.setBackground(Color.white);        
      panel28.setBackground(new Color(color, color1, color2)); 
      z = 28;
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way");   
      }
      
      if (control.equals("down"))
      {
      panel29.setBackground(Color.white);        
      panel39.setBackground(new Color(color, color1, color2));
      z = 39;
      }      

    }

    if (z == 32)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel32.setBackground(Color.white);        
      panel33.setBackground(new Color(color, color1, color2)); 
      z = 33;
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("down"))
      {
      panel32.setBackground(Color.white);        
      panel42.setBackground(new Color(color, color1, color2));
      z = 42;
      }      

    }

    if (z == 33)
    {
      if (control.equals("left"))
      {
      panel33.setBackground(Color.white);        
      panel32.setBackground(new Color(color, color1, color2)); 
      z = 32;
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel33.setBackground(Color.white);        
      panel23.setBackground(new Color(color, color1, color2)); 
      z = 23;     
      }
      
      if (control.equals("down"))
      {
      panel33.setBackground(Color.white);        
      panel43.setBackground(new Color(color, color1, color2));
      z = 43;
      }      

    }

    if (z == 38)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel38.setBackground(Color.white);        
      panel39.setBackground(new Color(color, color1, color2)); 
      z = 39;     
      }
      
      if (control.equals("up"))
      {
      panel38.setBackground(Color.white);        
      panel28.setBackground(new Color(color, color1, color2)); 
      z = 28;     
      }
      
      if (control.equals("down"))
      {
      panel38.setBackground(Color.white);        
      panel48.setBackground(new Color(color, color1, color2));
      z = 48;
      }      

    }

    if (z == 39)
    {
      if (control.equals("left"))
      {
      panel39.setBackground(Color.white);        
      panel38.setBackground(new Color(color, color1, color2)); 
      z = 38;
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel39.setBackground(Color.white);        
      panel29.setBackground(new Color(color, color1, color2)); 
      z = 29;     
      }
      
      if (control.equals("down"))
      {
      panel39.setBackground(Color.white);        
      panel49.setBackground(new Color(color, color1, color2));
      z = 49;
      }      

    }

    if (z == 42)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel42.setBackground(Color.white);        
      panel43.setBackground(new Color(color, color1, color2)); 
      z = 43;
      }
      
      if (control.equals("up"))
      {
      panel42.setBackground(Color.white);        
      panel32.setBackground(new Color(color, color1, color2)); 
      z = 32;     
      }
      
      if (control.equals("down"))
      {
      panel42.setBackground(Color.white);        
      panel52.setBackground(new Color(color, color1, color2));
      z = 52;
      }      

    }

    if (z == 43)
    {
      if (control.equals("left"))
      {
      panel43.setBackground(Color.white);        
      panel42.setBackground(new Color(color, color1, color2)); 
      z = 42;
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel43.setBackground(Color.white);        
      panel33.setBackground(new Color(color, color1, color2)); 
      z = 33;     
      }
      
      if (control.equals("down"))
      {
      panel43.setBackground(Color.white);        
      panel53.setBackground(new Color(color, color1, color2));
      z = 53;
      }      

    }

    if (z == 48)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel48.setBackground(Color.white);        
      panel49.setBackground(new Color(color, color1, color2)); 
      z = 49;
      }
      
      if (control.equals("up"))
      {
      panel48.setBackground(Color.white);        
      panel38.setBackground(new Color(color, color1, color2)); 
      z = 38;     
      }
      
      if (control.equals("down"))
      {
      panel48.setBackground(Color.white);        
      panel58.setBackground(new Color(color, color1, color2));
      z = 58;
      }      

    }

    if (z == 49)
    {
      if (control.equals("left"))
      {
      panel49.setBackground(Color.white);        
      panel48.setBackground(new Color(color, color1, color2)); 
      z = 48;
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel49.setBackground(Color.white);        
      panel39.setBackground(new Color(color, color1, color2)); 
      z = 39;     
      }
      
      if (control.equals("down"))
      {
      panel49.setBackground(Color.white);        
      panel59.setBackground(new Color(color, color1, color2));
      z = 59;
      }      

    }

    if (z == 52)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel52.setBackground(Color.white);        
      panel53.setBackground(new Color(color, color1, color2)); 
      z = 53;
      }
      
      if (control.equals("up"))
      {
      panel52.setBackground(Color.white);        
      panel42.setBackground(new Color(color, color1, color2)); 
      z = 42;     
      }
      
      if (control.equals("down"))
      {
      panel52.setBackground(Color.white);        
      panel62.setBackground(new Color(color, color1, color2));
      z = 62;
      }      

    }

    if (z == 53)
    {
      if (control.equals("left"))
      {
      panel53.setBackground(Color.white);        
      panel52.setBackground(new Color(color, color1, color2)); 
      z = 52;
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel53.setBackground(Color.white);        
      panel43.setBackground(new Color(color, color1, color2)); 
      z = 43;     
      }
      
      if (control.equals("down"))
      {
      panel53.setBackground(Color.white);        
      panel63.setBackground(new Color(color, color1, color2));
      z = 63;
      }      

    }
    
    if (z == 58)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel58.setBackground(Color.white);        
      panel59.setBackground(new Color(color, color1, color2)); 
      z = 59;
      }
      
      if (control.equals("up"))
      {
      panel58.setBackground(Color.white);        
      panel48.setBackground(new Color(color, color1, color2)); 
      z = 48;     
      }
      
      if (control.equals("down"))
      {
      panel58.setBackground(Color.white);        
      panel68.setBackground(new Color(color, color1, color2));
      z = 68;
      }      

    }

    if (z == 59)
    {
      if (control.equals("left"))
      {
      panel59.setBackground(Color.white);        
      panel58.setBackground(new Color(color, color1, color2)); 
      z = 58;
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel59.setBackground(Color.white);        
      panel49.setBackground(new Color(color, color1, color2)); 
      z = 49;     
      }
      
      if (control.equals("down"))
      {
      panel59.setBackground(Color.white);        
      panel69.setBackground(new Color(color, color1, color2));
      z = 69;
      }      

    }

    if (z == 62)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel62.setBackground(Color.white);        
      panel63.setBackground(new Color(color, color1, color2)); 
      z = 63;
      }
      
      if (control.equals("up"))
      {
      panel62.setBackground(Color.white);        
      panel52.setBackground(new Color(color, color1, color2)); 
      z = 52;     
      }
      
      if (control.equals("down"))
      {
      panel62.setBackground(Color.white);        
      panel72.setBackground(new Color(color, color1, color2));
      z = 72;
      }      

    }

    if (z == 63)
    {
      if (control.equals("left"))
      {
      panel63.setBackground(Color.white);        
      panel62.setBackground(new Color(color, color1, color2)); 
      z = 62;
      }
      
      if (control.equals("right"))
      {
      panel63.setBackground(Color.white);        
      panel64.setBackground(new Color(color, color1, color2)); 
      z = 64;
      }
      
      if (control.equals("up"))
      {
      panel63.setBackground(Color.white);        
      panel53.setBackground(new Color(color, color1, color2)); 
      z = 53;     
      }
      
      if (control.equals("down"))
      {
      panel63.setBackground(Color.white);        
      panel73.setBackground(new Color(color, color1, color2));
      z = 73;
      }      

    }

    if (z == 64)
    {
      if (control.equals("left"))
      {
      panel64.setBackground(Color.white);        
      panel63.setBackground(new Color(color, color1, color2)); 
      z = 63;
      }
      
      if (control.equals("right"))
      {
      panel64.setBackground(Color.white);        
      panel65.setBackground(new Color(color, color1, color2)); 
      z = 65;
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way");  
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");  
      }      

    }

    if (z == 65)
    {
      if (control.equals("left"))
      {
      panel65.setBackground(Color.white);        
      panel64.setBackground(new Color(color, color1, color2)); 
      z = 64;
      }
      
      if (control.equals("right"))
      {
      panel65.setBackground(Color.white);        
      panel66.setBackground(new Color(color, color1, color2)); 
      z = 66;
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way");   
      }
      
      if (control.equals("down"))
      {
      panel65.setBackground(Color.white);        
      panel75.setBackground(new Color(color, color1, color2));
      z = 75;
      }      

    }

    if (z == 66)
    {
      if (control.equals("left"))
      {
      panel66.setBackground(Color.white);        
      panel65.setBackground(new Color(color, color1, color2)); 
      z = 65;
      }
      
      if (control.equals("right"))
      {
      panel66.setBackground(Color.white);        
      panel67.setBackground(new Color(color, color1, color2)); 
      z = 67;
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way");     
      }
      
      if (control.equals("down"))
      {
      panel66.setBackground(Color.white);        
      panel76.setBackground(new Color(color, color1, color2));
      z = 76;
      }      

    }

    if (z == 67)
    {
      if (control.equals("left"))
      {
      panel67.setBackground(Color.white);        
      panel66.setBackground(new Color(color, color1, color2)); 
      z = 66;
      }
      
      if (control.equals("right"))
      {
      panel67.setBackground(Color.white);        
      panel68.setBackground(new Color(color, color1, color2)); 
      z = 68;
      }
      
      if (control.equals("up"))
      {
      panel67.setBackground(Color.white);        
      panel57.setBackground(new Color(color, color1, color2)); 
      z = 57;     
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

    if (z == 68)
    {
      if (control.equals("left"))
      {
      panel68.setBackground(Color.white);        
      panel67.setBackground(new Color(color, color1, color2)); 
      z = 67;
      }
      
      if (control.equals("right"))
      {
      panel68.setBackground(Color.white);        
      panel69.setBackground(new Color(color, color1, color2)); 
      z = 69;
      }
      
      if (control.equals("up"))
      {
      panel68.setBackground(Color.white);        
      panel58.setBackground(new Color(color, color1, color2)); 
      z = 58;     
      }
      
      if (control.equals("down"))
      {
      panel68.setBackground(Color.white);        
      panel78.setBackground(new Color(color, color1, color2));
      z = 78;
      }      

    }

    if (z == 69)
    {
      if (control.equals("left"))
      {
      panel69.setBackground(Color.white);        
      panel68.setBackground(new Color(color, color1, color2)); 
      z = 68;
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel69.setBackground(Color.white);        
      panel59.setBackground(new Color(color, color1, color2)); 
      z = 59;     
      }
      
      if (control.equals("down"))
      {
      panel69.setBackground(Color.white);        
      panel79.setBackground(new Color(color, color1, color2));
      z = 79;
      }      

    }    

    if (z == 73)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel73.setBackground(Color.white);        
      panel63.setBackground(new Color(color, color1, color2)); 
      z = 63;     
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }   

    if (z == 75)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel75.setBackground(Color.white);        
      panel76.setBackground(new Color(color, color1, color2)); 
      z = 76;   
      }
      
      if (control.equals("up"))
      {
      panel75.setBackground(Color.white);        
      panel65.setBackground(new Color(color, color1, color2)); 
      z = 65;     
      }
      
      if (control.equals("down"))
      {
      panel75.setBackground(Color.white);        
      panel85.setBackground(new Color(color, color1, color2));
      z = 85;
      }      

    }   

    if (z == 76)
    {
      if (control.equals("left"))
      {
      panel76.setBackground(Color.white);        
      panel75.setBackground(new Color(color, color1, color2)); 
      z = 75; 
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel76.setBackground(Color.white);        
      panel66.setBackground(new Color(color, color1, color2)); 
      z = 66;     
      }
      
      if (control.equals("down"))
      {
      panel76.setBackground(Color.white);        
      panel86.setBackground(new Color(color, color1, color2));
      z = 86;
      }      

    }   
    
    if (z == 78)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel78.setBackground(Color.white);        
      panel79.setBackground(new Color(color, color1, color2)); 
      z = 79; 
      }
      
      if (control.equals("up"))
      {
      panel78.setBackground(Color.white);        
      panel68.setBackground(new Color(color, color1, color2)); 
      z = 68;     
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }   

    if (z == 79)
    {
      if (control.equals("left"))
      {
      panel79.setBackground(Color.white);        
      panel78.setBackground(new Color(color, color1, color2)); 
      z = 78; 
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel79.setBackground(Color.white);        
      panel69.setBackground(new Color(color, color1, color2)); 
      z = 69;     
      }
      
      if (control.equals("down"))
      {
      panel79.setBackground(Color.white);        
      panel89.setBackground(new Color(color, color1, color2));
      z = 89;
      }      

    }   
 

    if (z == 85)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel85.setBackground(Color.white);        
      panel86.setBackground(new Color(color, color1, color2)); 
      z = 86; 
      }
      
      if (control.equals("up"))
      {
      panel85.setBackground(Color.white);        
      panel75.setBackground(new Color(color, color1, color2)); 
      z = 75;     
      }
      
      if (control.equals("down"))
      {
      panel85.setBackground(Color.white);        
      panel95.setBackground(new Color(color, color1, color2));
      z = 95;
      }      

    }   
    
    if (z == 86)
    {
      if (control.equals("left"))
      {
      panel86.setBackground(Color.white);        
      panel85.setBackground(new Color(color, color1, color2)); 
      z = 85; 
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way ");
      }
      
      if (control.equals("up"))
      {
      panel86.setBackground(Color.white);        
      panel76.setBackground(new Color(color, color1, color2)); 
      z = 76;     
      }
      
      if (control.equals("down"))
      {
      panel86.setBackground(Color.white);        
      panel96.setBackground(new Color(color, color1, color2));
      z = 96;
      }      

    }   

    if (z == 95)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel95.setBackground(Color.white);        
      panel96.setBackground(new Color(color, color1, color2)); 
      z = 96;
      }
      
      if (d1 == 1)
      {
      if (control.equals("up"))
      {
      panel95.setBackground(Color.white);        
      panel85.setBackground(new Color(color, color1, color2)); 
      z = 85;     
      }  
      }

      if(d1 == 0)
      {
      if (control.equals("up"))
      {
      System.out.println("Not a way");  
      }
      }
      
      
      if (control.equals("down"))
      {
      x = 5;
      run = 0;
      loc = 9;
      }      

    }   

    if (z == 96)
    {
      if (control.equals("left"))
      {
      panel96.setBackground(Color.white);        
      panel95.setBackground(new Color(color, color1, color2)); 
      z = 95; 
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      if (d1 == 1)
      {
      if (control.equals("up"))
      {
      panel96.setBackground(Color.white);        
      panel86.setBackground(new Color(color, color1, color2)); 
      z = 86;     
      }  
      }
      
      if(d1 == 0)
      {
      if (control.equals("up"))
      {
      System.out.println("Not a way");  
      }
      }
      
      
      if (control.equals("down"))
      {
      x = 5;
      run = 0;
      loc = 9;
      }      

    }   


    




    

  if (z == 95 || z == 96)
  {
  if (d1 == 0)
  {
  if (control.equals("look") || control.equals("look at door"))
  System.out.println("The door is lock with a letter lock, it a 5 letter lock");

  if (control.equals("look at lock"))
  {
  System.out.println("The lock is a 5 letter lock");
  System.out.println("Enter the first letter ");  
  letterlockp1 = scan.next().charAt(0);
  System.out.println("Enter the second letter");  
  letterlockp2 = scan.next().charAt(0);
  System.out.println("Enter the third letter"); 
  letterlockp3 = scan.next().charAt(0);
  System.out.println("Enter the fourth letter");
  letterlockp4 = scan.next().charAt(0);
  System.out.println("Enter the fifth letter");
  letterlockp5 = scan.next().charAt(0);  

  if (letterlockp1 == 'h')
  {
    if (letterlockp2 == 'o')
    {
      if (letterlockp3 == 'u')
      {
        if (letterlockp4 == 's')
        {
          if (letterlockp5 == 'e')
          {
          d1 = 1;
          panel85.setBackground(Color.white);
          panel86.setBackground(Color.white);  
          panel74.setBackground(new Color(93, 41, 6));
          panel77.setBackground(new Color(93, 41, 6));
          control = "look";
          }
        }
      }
    }
      
  } 
  }
  }    
  }

    
    
  
  if (d1 == 1)
  {
    if (control.equals("look"))
    {
      System.out.println("The green room there is a table, a bed, a statue, and a pedal stood.");
    }

    if (z == 13 || z == 23 || z == 32 || z == 33)
    {
    if (control.equals("look at bed"))
    {
    System.out.println("You find a paper under the bed");
    }  
    }

    
    if (control.equals("look at paper"))
    {
    System.out.println("I am a word with two meanings. With one I can be broken, with the second I hold on. What am I? ");
    }

    if (z == 23 || z == 24 || z == 25 || z == 26 || z == 27 || z == 28 || z == 33 || z == 38 || z == 43 || z == 48 || z == 53 || z == 58 || z == 63 || z == 64 || z == 65 || z == 66 || z == 67 || z == 68)
    {
    if (control.equals("look at table"))
    {
    if (gain4 == 0)
    {
    System.out.println("You find a battery");
    count[0] = count[0] + 1;
    gain4 = 1;
    }
    }      
    }

 


    if (z == 18 || z == 28 || z == 29)
    {
    if (control.equals("look at statue"))
    {
    if (gain5 == 0)
    {
    System.out.println("You take the statue");
    count[4] = 1; 
    gain5 = 1;
    }
    }      
    }


    if  (z == 62 || z == 63 || z == 73)
    {
    if (control.equals("use statue"))
    {
    if (loc4 == 0)
    {
    System.out.println("You put the statue on the pedal stool");
    System.out.println("You heard a crank, a door open in front of you.");  
    loc4 = 1;
    map[0][4] = "dr";
    map[0][5] = "dr";
    panel5.setBackground(Color.white);
    panel6.setBackground(Color.white);      
    }
    }      
    }





  


    }
    
  } // The end bracket for the room in the front

    
  if (x == 6) // hiden room
  {
    if (loc == 10)
    {
  map [0][0] = "  ";
  map [0][1] = "  ";
  map [0][2] = "  ";
  map [0][3] = "  ";
  map [0][4] = "  ";
  map [0][5] = "  ";
  map [0][6] = "  ";
  map [0][7] = "  ";
  map [0][8] = "  ";
  map [0][9] = "  ";
  map [1][0] = "  ";
  map [1][1] = "  ";
  map [1][2] = "  ";
  map [1][3] = "  ";
  map [1][4] = "  ";
  map [1][5] = "  ";
  map [1][6] = "  ";
  map [1][7] = "  ";
  map [1][8] = "  ";
  map [1][9] = "  ";
  map [2][0] = "  ";
  map [2][1] = "  ";
  map [2][2] = "  ";
  map [2][3] = "  ";
  map [2][4] = "  ";
  map [2][5] = "  ";
  map [2][6] = "  ";
  map [2][7] = "  ";
  map [2][8] = "  ";
  map [2][9] = "  ";
  map [3][0] = "  ";
  map [3][1] = "  ";
  map [3][2] = "  ";
  map [3][3] = "  ";
  map [3][4] = "  ";
  map [3][5] = "  ";
  map [3][6] = "  ";
  map [3][7] = "  ";
  map [3][8] = "  ";
  map [3][9] = "  ";
  map [4][0] = "  ";
  map [4][1] = "  ";
  map [4][2] = "  ";
  map [4][3] = "  ";
  map [4][4] = "  ";
  map [4][5] = "  ";
  map [4][6] = "  ";
  map [4][7] = "  ";
  map [4][8] = "  ";
  map [4][9] = "  ";
  map [5][0] = "  ";
  map [5][1] = "  ";
  map [5][2] = "  ";
  map [5][3] = "wl";
  map [5][4] = "wl";
  map [5][5] = "wl";
  map [5][6] = "wl";
  map [5][7] = "  ";
  map [5][8] = "  ";
  map [5][9] = "  ";
  map [6][0] = "  ";
  map [6][1] = "  ";
  map [6][2] = "  ";
  map [6][3] = "wl";
  map [6][4] = "bx";
  map [6][5] = "bx";
  map [6][6] = "wl";
  map [6][7] = "  ";
  map [6][8] = "  ";
  map [6][9] = "  ";
  map [7][0] = "  ";
  map [7][1] = "  ";
  map [7][2] = "  ";
  map [7][3] = "wl";
  map [7][4] = "  ";
  map [7][5] = "  ";
  map [7][6] = "wl";
  map [7][7] = "  ";
  map [7][8] = "  ";
  map [7][9] = "  ";
  map [8][0] = "  ";
  map [8][1] = "  ";
  map [8][2] = "  ";
  map [8][3] = "wl";
  map [8][4] = "  ";
  map [8][5] = "  ";
  map [8][6] = "wl";
  map [8][7] = "  ";
  map [8][8] = "  ";
  map [8][9] = "  ";
  map [9][0] = "  ";
  map [9][1] = "  ";
  map [9][2] = "  ";
  map [9][3] = "wl";
  map [9][4] = "  ";
  map [9][5] = "  ";
  map [9][6] = "wl";
  map [9][7] = "  ";
  map [9][8] = "  ";
  map [9][9] = "  ";

    panel1.setBackground(Color.white);
    panel2.setBackground(Color.white);
    panel3.setBackground(Color.white);
    panel4.setBackground(Color.white);    
    panel5.setBackground(Color.white);
    panel6.setBackground(Color.white);
    panel7.setBackground(Color.white);
    panel8.setBackground(Color.white);
    panel9.setBackground(Color.white);    
    panel10.setBackground(Color.white);
    panel11.setBackground(Color.white);
    panel12.setBackground(Color.white);
    panel13.setBackground(Color.white);
    panel14.setBackground(Color.white);
    panel15.setBackground(Color.white);
    panel16.setBackground(Color.white);
    panel17.setBackground(Color.white);
    panel18.setBackground(Color.white);    
    panel19.setBackground(Color.white);
    panel20.setBackground(Color.white);
    panel21.setBackground(Color.white);
    panel22.setBackground(Color.white);    
    panel23.setBackground(Color.white);
    panel24.setBackground(Color.white);
    panel25.setBackground(Color.white);
    panel26.setBackground(Color.white);
    panel27.setBackground(Color.white);
    panel28.setBackground(Color.white);
    panel29.setBackground(Color.white);
    panel30.setBackground(Color.white);
    panel31.setBackground(Color.white);
    panel32.setBackground(Color.white);
    panel33.setBackground(Color.white);
    panel34.setBackground(Color.white);
    panel35.setBackground(Color.white);
    panel36.setBackground(Color.white);
    panel37.setBackground(Color.white);
    panel38.setBackground(Color.white);
    panel39.setBackground(Color.white);
    panel40.setBackground(Color.white);
    panel41.setBackground(Color.white);
    panel42.setBackground(Color.white);
    panel43.setBackground(Color.white);
    panel44.setBackground(Color.white);
    panel45.setBackground(Color.white);
    panel46.setBackground(Color.white);
    panel47.setBackground(Color.white);
    panel48.setBackground(Color.white);
    panel49.setBackground(Color.white);
    panel50.setBackground(Color.white);
    panel51.setBackground(Color.white);
    panel52.setBackground(Color.white);
    panel53.setBackground(Color.white);
    panel54.setBackground(Color.black);
    panel55.setBackground(Color.black);
    panel56.setBackground(Color.black);
    panel57.setBackground(Color.black);
    panel58.setBackground(Color.white);
    panel59.setBackground(Color.white);
    panel60.setBackground(Color.white);
    panel61.setBackground(Color.white);
    panel62.setBackground(Color.white);
    panel63.setBackground(Color.white);    
    panel64.setBackground(Color.black);
    panel65.setBackground(new Color(173, 135, 98));
    panel66.setBackground(new Color(173, 135, 98));    
    panel67.setBackground(Color.black);
    panel68.setBackground(Color.white);
    panel69.setBackground(Color.white);
    panel70.setBackground(Color.white);
    panel71.setBackground(Color.white);
    panel72.setBackground(Color.white);
    panel73.setBackground(Color.white);
    panel74.setBackground(Color.black);
    panel75.setBackground(Color.white);
    panel76.setBackground(Color.white);    
    panel77.setBackground(Color.black);
    panel78.setBackground(Color.white);
    panel79.setBackground(Color.white);
    panel80.setBackground(Color.white);
    panel81.setBackground(Color.white);
    panel82.setBackground(Color.white);
    panel83.setBackground(Color.white);
    panel84.setBackground(Color.black);    
    panel85.setBackground(Color.white);
    panel86.setBackground(Color.white);
    panel87.setBackground(Color.black);
    panel88.setBackground(Color.white);
    panel89.setBackground(Color.white);
    panel90.setBackground(Color.white);
    panel91.setBackground(Color.white);    
    panel92.setBackground(Color.white);
    panel93.setBackground(Color.white);
    panel94.setBackground(Color.black);    
    panel95.setBackground(Color.white);
    panel96.setBackground(Color.white);
    panel97.setBackground(Color.black);
    panel98.setBackground(Color.white);    
    panel99.setBackground(Color.white);    
    panel100.setBackground(Color.white);      
    }
    
    
    if (run == 0)
    {
    yd = 8;
    xd = 5;
    map[yd][xd] = player;
    run = 1; 
    loc = 0;
    panel95.setBackground(new Color(color, color1, color2));
    z = 95;
    }

    // control

    if (z == 75)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel75.setBackground(Color.white);        
      panel76.setBackground(new Color(color, color1, color2)); 
      z = 76; 
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("down"))
      {
      panel75.setBackground(Color.white);        
      panel85.setBackground(new Color(color, color1, color2));
      z = 85;
      }      

    }   
    
    if (z == 76)
    {
      if (control.equals("left"))
      {
      panel76.setBackground(Color.white);        
      panel75.setBackground(new Color(color, color1, color2)); 
      z = 75; 
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way ");
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way");   
      }
      
      if (control.equals("down"))
      {
      panel76.setBackground(Color.white);        
      panel86.setBackground(new Color(color, color1, color2));
      z = 86;
      }      

    }

    if (z == 85)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel85.setBackground(Color.white);        
      panel86.setBackground(new Color(color, color1, color2)); 
      z = 86; 
      }
      
      if (control.equals("up"))
      {
      panel85.setBackground(Color.white);        
      panel75.setBackground(new Color(color, color1, color2)); 
      z = 75;     
      }
      
      if (control.equals("down"))
      {
      panel85.setBackground(Color.white);        
      panel95.setBackground(new Color(color, color1, color2));
      z = 95;
      }      

    }   
    
    if (z == 86)
    {
      if (control.equals("left"))
      {
      panel86.setBackground(Color.white);        
      panel85.setBackground(new Color(color, color1, color2)); 
      z = 85; 
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way ");
      }
      
      if (control.equals("up"))
      {
      panel86.setBackground(Color.white);        
      panel76.setBackground(new Color(color, color1, color2)); 
      z = 76;     
      }
      
      if (control.equals("down"))
      {
      panel86.setBackground(Color.white);        
      panel96.setBackground(new Color(color, color1, color2));
      z = 96;
      }      

    }

    if (z == 95)
    {
      if (control.equals("left"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("right"))
      {
      panel95.setBackground(Color.white);        
      panel96.setBackground(new Color(color, color1, color2)); 
      z = 96; 
      }
      
      if (control.equals("up"))
      {
      panel95.setBackground(Color.white);        
      panel85.setBackground(new Color(color, color1, color2)); 
      z = 85;     
      }
      
      if (control.equals("down"))
      {
      x = 4;
      loc = 4;
      run4 = 2;
      }      

    }   
    
    if (z == 96)
    {
      if (control.equals("left"))
      {
      panel96.setBackground(Color.white);        
      panel95.setBackground(new Color(color, color1, color2)); 
      z = 95; 
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way ");
      }
      
      if (control.equals("up"))
      {
      panel96.setBackground(Color.white);        
      panel86.setBackground(new Color(color, color1, color2)); 
      z = 86;     
      }
      
      if (control.equals("down"))
      {
      x = 4;
      loc = 4;
      run4 = 2;
      }      

    }




    
    
    
    if (control.equals("look"))
    {
    System.out.println("There is a box, with a letter lock,");
    }

    if (z == 75 || z == 76)
    {
    if (control.equals("look at box"))
    {
    System.out.println("The Letter lock is four letter long.");
   if (control.equals("look at lock"))
    {
    System.out.println("The Letter lock is four letter long.");
    System.out.println("Enter first letter");
    riddlep1 = scan.next().charAt(0); 
    System.out.println("Enter second letter");
    riddlep2 = scan.next().charAt(0); 
    System.out.println("Enter third letter");
    riddlep3 = scan.next().charAt(0); 
    System.out.println("Enter fourth letter"); 
    riddlep4 = scan.next().charAt(0); 

    if (riddlep1 == 'a' )
    {
      if (riddlep2 == 't')
      {
        if (riddlep3 == 'i')
        {
          if (riddlep4 == 'e')
          {
          if (gain6 == 0)
          {
          System.out.println("You found a battery");
          count[0] = count[0] + 1;
          gain6 = 1;            
          }
          }
        }
      }
    }
    }    
    }      
    }

 

    



    
    
  } // end bracket for hiden room.



  
    
  if (x == 3) // The room to the right.
  {

  if (loc == 3)
  {
  map [0][0] = "  ";
  map [0][1] = "  ";
  map [0][2] = "  ";
  map [0][3] = "  ";
  map [0][4] = "  ";
  map [0][5] = "  ";
  map [0][6] = "  ";
  map [0][7] = "  ";
  map [0][8] = "  ";
  map [0][9] = "  ";
  map [1][0] = "  ";
  map [1][1] = "  ";
  map [1][2] = "  ";
  map [1][3] = "  ";
  map [1][4] = "  ";
  map [1][5] = "  ";
  map [1][6] = "  ";
  map [1][7] = "  ";
  map [1][8] = "  ";
  map [1][9] = "  ";
  map [2][0] = "  ";
  map [2][1] = "  ";
  map [2][2] = "  ";
  map [2][3] = "  ";
  map [2][4] = "  ";
  map [2][5] = "  ";
  map [2][6] = "  ";
  map [2][7] = "  ";
  map [2][8] = "  ";
  map [2][9] = "  ";
  map [3][0] = "wl";
  map [3][1] = "wl";
  map [3][2] = "wl";
  map [3][3] = "wl";
  map [3][4] = "pt";
  map [3][5] = "wl";
  map [3][6] = "wl";
  map [3][7] = "pl";
  map [3][8] = "pl";
  map [3][9] = "wl";
  map [4][0] = "  ";
  map [4][1] = "  ";
  map [4][2] = "  ";
  map [4][3] = "  ";
  map [4][4] = "  ";
  map [4][5] = "  ";
  map [4][6] = "  ";
  map [4][7] = "  ";
  map [4][8] = "  ";
  map [4][9] = "el";
  map [5][0] = "  ";
  map [5][1] = "  ";
  map [5][2] = "  ";
  map [5][3] = "  ";
  map [5][4] = "  ";
  map [5][5] = "  ";
  map [5][6] = "  ";
  map [5][7] = "  ";
  map [5][8] = "  ";
  map [5][9] = "el";
  map [6][0] = "  ";
  map [6][1] = "  ";
  map [6][2] = "  ";
  map [6][3] = "  ";
  map [6][4] = "  ";
  map [6][5] = "  ";
  map [6][6] = "  ";
  map [6][7] = "  ";
  map [6][8] = "ft";
  map [6][9] = "el";
  map [7][0] = "wl";
  map [7][1] = "wl";
  map [7][2] = "wl";
  map [7][3] = "wl";
  map [7][4] = "wl";
  map [7][5] = "wl";
  map [7][6] = "wl";
  map [7][7] = "wl";
  map [7][8] = "wl";
  map [7][9] = "wl";
  map [8][0] = "  ";
  map [8][1] = "  ";
  map [8][2] = "  ";
  map [8][3] = "  ";
  map [8][4] = "  ";
  map [8][5] = "  ";
  map [8][6] = "  ";
  map [8][7] = "  ";
  map [8][8] = "  ";
  map [8][9] = "  ";
  map [9][0] = "  ";
  map [9][1] = "  ";
  map [9][2] = "  ";
  map [9][3] = "  ";
  map [9][4] = "  ";
  map [9][5] = "  ";
  map [9][6] = "  ";
  map [9][7] = "  ";
  map [9][8] = "  ";
  map [9][9] = "  ";
    panel1.setBackground(Color.white);
    panel2.setBackground(Color.white);
    panel3.setBackground(Color.white);
    panel4.setBackground(Color.white);    
    panel5.setBackground(Color.white);
    panel6.setBackground(Color.white);
    panel7.setBackground(Color.white);
    panel8.setBackground(Color.white);
    panel9.setBackground(Color.white);    
    panel10.setBackground(Color.white);
    panel11.setBackground(Color.white);
    panel12.setBackground(Color.white);
    panel13.setBackground(Color.white);
    panel14.setBackground(Color.white);
    panel15.setBackground(Color.white);
    panel16.setBackground(Color.white);
    panel17.setBackground(Color.white);
    panel18.setBackground(Color.white);    
    panel19.setBackground(Color.white);
    panel20.setBackground(Color.white);
    panel21.setBackground(Color.white);
    panel22.setBackground(Color.white);    
    panel23.setBackground(Color.white);
    panel24.setBackground(Color.white);
    panel25.setBackground(Color.white);
    panel26.setBackground(Color.white);
    panel27.setBackground(Color.white);
    panel28.setBackground(Color.white);
    panel29.setBackground(Color.white);
    panel30.setBackground(Color.white);
    panel31.setBackground(Color.black);
    panel32.setBackground(Color.black);
    panel33.setBackground(Color.black);
    panel34.setBackground(Color.black);
    panel35.setBackground(new Color(0, 0, 139));
    panel36.setBackground(Color.black);
    panel37.setBackground(Color.black);
    panel38.setBackground(new Color(196, 202, 206));
    panel39.setBackground(Color.black);
    panel40.setBackground(Color.black);
    panel41.setBackground(Color.white);
    panel42.setBackground(Color.white);
    panel43.setBackground(Color.white);
    panel44.setBackground(Color.white);
    panel45.setBackground(Color.white);
    panel46.setBackground(Color.white);
    panel47.setBackground(Color.white);
    panel48.setBackground(Color.white);
    panel49.setBackground(Color.white);
    panel50.setBackground(new Color(159, 154, 183));
    panel51.setBackground(Color.white);
    panel52.setBackground(Color.white);
    panel53.setBackground(Color.white);
    panel54.setBackground(Color.white);
    panel55.setBackground(Color.white);
    panel56.setBackground(Color.white);
    panel57.setBackground(Color.white);
    panel58.setBackground(Color.white);
    panel59.setBackground(Color.white);
    panel60.setBackground(new Color(159, 154, 183));
    panel61.setBackground(Color.white);
    panel62.setBackground(Color.white);
    panel63.setBackground(Color.white);    
    panel64.setBackground(Color.white);
    panel65.setBackground(Color.white);
    panel66.setBackground(Color.white);    
    panel67.setBackground(Color.white);
    panel68.setBackground(Color.white);
    panel69.setBackground(new Color(158, 82, 63));
    panel70.setBackground(new Color(159, 154, 183));
    panel71.setBackground(Color.black);
    panel72.setBackground(Color.black);
    panel73.setBackground(Color.black);
    panel74.setBackground(Color.black);
    panel75.setBackground(Color.black);
    panel76.setBackground(Color.black);    
    panel77.setBackground(Color.black);
    panel78.setBackground(Color.black);
    panel79.setBackground(Color.black);
    panel80.setBackground(Color.black);
    panel81.setBackground(Color.white);
    panel82.setBackground(Color.white);
    panel83.setBackground(Color.white);
    panel84.setBackground(Color.white);    
    panel85.setBackground(Color.white);
    panel86.setBackground(Color.white);
    panel87.setBackground(Color.white);
    panel88.setBackground(Color.white);
    panel89.setBackground(Color.white);
    panel90.setBackground(Color.white);
    panel91.setBackground(Color.white);    
    panel92.setBackground(Color.white);
    panel93.setBackground(Color.white);
    panel94.setBackground(Color.white);    
    panel95.setBackground(Color.white);
    panel96.setBackground(Color.white);
    panel97.setBackground(Color.white);
    panel98.setBackground(Color.white);    
    panel99.setBackground(Color.white);    
    panel100.setBackground(Color.white);
  
  }
    
  if (run3 == 0)
  {
  yd = 5;
  xd = 1;
  map[yd][xd] = player;
  run3 = 1; 
  loc = 0;
  panel53.setBackground(new Color(color, color1, color2));
  z = 53;

    
  }
    

  // control


     if (z == 41)
      {
      if (control.equals("left"))
      {
      x = 5;
      loc = 8;
      run = 0;      
      }
      
      if (control.equals("right"))
      {
      panel41.setBackground(Color.white);        
      panel42.setBackground(new Color(color, color1, color2)); 
      z = 42; 
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("down"))
      {
      panel41.setBackground(Color.white);        
      panel51.setBackground(new Color(color, color1, color2));
      z = 51;
      }      

    }   
    
     if (z == 42)
      {
      if (control.equals("left"))
      {
      panel42.setBackground(Color.white);        
      panel41.setBackground(new Color(color, color1, color2)); 
      z = 41; 
      }
      
      if (control.equals("right"))
      {
      panel42.setBackground(Color.white);        
      panel43.setBackground(new Color(color, color1, color2)); 
      z = 43; 
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("down"))
      {
      panel42.setBackground(Color.white);        
      panel52.setBackground(new Color(color, color1, color2));
      z = 52;
      }      

    }   
  
   if (z == 43)
    {
      if (control.equals("left"))
      {
      panel43.setBackground(Color.white);        
      panel42.setBackground(new Color(color, color1, color2)); 
      z = 42; 
      }
      
      if (control.equals("right"))
      {
      panel43.setBackground(Color.white);        
      panel44.setBackground(new Color(color, color1, color2)); 
      z = 44; 
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("down"))
      {
      panel43.setBackground(Color.white);        
      panel53.setBackground(new Color(color, color1, color2));
      z = 53;
      }      

    }   

   if (z == 44)
    {
      if (control.equals("left"))
      {
      panel44.setBackground(Color.white);        
      panel43.setBackground(new Color(color, color1, color2)); 
      z = 42; 
      }
      
      if (control.equals("right"))
      {
      panel44.setBackground(Color.white);        
      panel45.setBackground(new Color(color, color1, color2)); 
      z = 45; 
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("down"))
      {
      panel44.setBackground(Color.white);        
      panel54.setBackground(new Color(color, color1, color2));
      z = 54;
      }      

    }   

   if (z == 45)
    {
      if (control.equals("left"))
      {
      panel45.setBackground(Color.white);        
      panel44.setBackground(new Color(color, color1, color2)); 
      z = 44; 
      }
      
      if (control.equals("right"))
      {
      panel45.setBackground(Color.white);        
      panel46.setBackground(new Color(color, color1, color2)); 
      z = 46; 
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("down"))
      {
      panel45.setBackground(Color.white);        
      panel55.setBackground(new Color(color, color1, color2));
      z = 55;
      }      

    }   

   if (z == 46)
    {
      if (control.equals("left"))
      {
      panel46.setBackground(Color.white);        
      panel45.setBackground(new Color(color, color1, color2)); 
      z = 45; 
      }
      
      if (control.equals("right"))
      {
      panel46.setBackground(Color.white);        
      panel47.setBackground(new Color(color, color1, color2)); 
      z = 47; 
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("down"))
      {
      panel46.setBackground(Color.white);        
      panel56.setBackground(new Color(color, color1, color2));
      z = 56;
      }      

    }   

   if (z == 47)
    {
      if (control.equals("left"))
      {
      panel47.setBackground(Color.white);        
      panel46.setBackground(new Color(color, color1, color2)); 
      z = 46; 
      }
      
      if (control.equals("right"))
      {
      panel47.setBackground(Color.white);        
      panel48.setBackground(new Color(color, color1, color2)); 
      z = 48; 
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("down"))
      {
      panel47.setBackground(Color.white);        
      panel57.setBackground(new Color(color, color1, color2));
      z = 57;
      }      

    }   

   if (z == 48)
    {
      if (control.equals("left"))
      {
      panel48.setBackground(Color.white);        
      panel47.setBackground(new Color(color, color1, color2)); 
      z = 47; 
      }
      
      if (control.equals("right"))
      {
      panel48.setBackground(Color.white);        
      panel49.setBackground(new Color(color, color1, color2)); 
      z = 49; 
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("down"))
      {
      panel48.setBackground(Color.white);        
      panel58.setBackground(new Color(color, color1, color2));
      z = 58;
      }      

    }   

   if (z == 49)
    {
      if (control.equals("left"))
      {
      panel49.setBackground(Color.white);        
      panel48.setBackground(new Color(color, color1, color2)); 
      z = 48; 
      }

      if (p == 0)
      {
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }        
      }
      
      if (p == 1)
      {
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }        
      }
      
      if (control.equals("up"))
      {
      System.out.println("Not a way"); 
      }
      
      if (control.equals("down"))
      {
      panel49.setBackground(Color.white);        
      panel59.setBackground(new Color(color, color1, color2));
      z = 59;
      }      

    }   

   if (z == 51)
    {
      if (control.equals("left"))
      {
      x = 5;
      loc = 8;
      run = 0;  
      }
      
      if (control.equals("right"))
      {
      panel51.setBackground(Color.white);        
      panel52.setBackground(new Color(color, color1, color2)); 
      z = 52; 
      }
      
      if (control.equals("up"))
      {
      panel51.setBackground(Color.white);        
      panel41.setBackground(new Color(color, color1, color2));
      z = 41;
      }
      
      if (control.equals("down"))
      {
      panel51.setBackground(Color.white);        
      panel61.setBackground(new Color(color, color1, color2));
      z = 61;
      }      

    }   
    
   if (z == 52)
    {
      if (control.equals("left"))
      {
      panel52.setBackground(Color.white);        
      panel51.setBackground(new Color(color, color1, color2)); 
      z = 51; 
      }
      
      if (control.equals("right"))
      {
      panel52.setBackground(Color.white);        
      panel53.setBackground(new Color(color, color1, color2)); 
      z = 53; 
      }
      
      if (control.equals("up"))
      {
      panel52.setBackground(Color.white);        
      panel42.setBackground(new Color(color, color1, color2));
      z = 42;
      }
      
      if (control.equals("down"))
      {
      panel52.setBackground(Color.white);        
      panel62.setBackground(new Color(color, color1, color2));
      z = 62;
      }      

    }   

   if (z == 53)
    {
      if (control.equals("left"))
      {
      panel53.setBackground(Color.white);        
      panel52.setBackground(new Color(color, color1, color2)); 
      z = 52; 
      }
      
      if (control.equals("right"))
      {
      panel53.setBackground(Color.white);        
      panel54.setBackground(new Color(color, color1, color2)); 
      z = 54; 
      }
      
      if (control.equals("up"))
      {
      panel53.setBackground(Color.white);        
      panel43.setBackground(new Color(color, color1, color2));
      z = 43;
      }
      
      if (control.equals("down"))
      {
      panel53.setBackground(Color.white);        
      panel63.setBackground(new Color(color, color1, color2));
      z = 63;
      }      

    }   

   if (z == 54)
    {
      if (control.equals("left"))
      {
      panel54.setBackground(Color.white);        
      panel53.setBackground(new Color(color, color1, color2)); 
      z = 53; 
      }
      
      if (control.equals("right"))
      {
      panel54.setBackground(Color.white);        
      panel55.setBackground(new Color(color, color1, color2)); 
      z = 55; 
      }
      
      if (control.equals("up"))
      {
      panel54.setBackground(Color.white);        
      panel44.setBackground(new Color(color, color1, color2));
      z = 44;
      }
      
      if (control.equals("down"))
      {
      panel54.setBackground(Color.white);        
      panel64.setBackground(new Color(color, color1, color2));
      z = 64;
      }      

    }

   if (z == 55)
    {
      if (control.equals("left"))
      {
      panel55.setBackground(Color.white);        
      panel54.setBackground(new Color(color, color1, color2)); 
      z = 54; 
      }
      
      if (control.equals("right"))
      {
      panel55.setBackground(Color.white);        
      panel56.setBackground(new Color(color, color1, color2)); 
      z = 56; 
      }
      
      if (control.equals("up"))
      {
      panel55.setBackground(Color.white);        
      panel45.setBackground(new Color(color, color1, color2));
      z = 45;
      }
      
      if (control.equals("down"))
      {
      panel55.setBackground(Color.white);        
      panel65.setBackground(new Color(color, color1, color2));
      z = 65;
      }      

    }

   if (z == 56)
    {
      if (control.equals("left"))
      {
      panel56.setBackground(Color.white);        
      panel55.setBackground(new Color(color, color1, color2)); 
      z = 55; 
      }
      
      if (control.equals("right"))
      {
      panel56.setBackground(Color.white);        
      panel57.setBackground(new Color(color, color1, color2)); 
      z = 57; 
      }
      
      if (control.equals("up"))
      {
      panel56.setBackground(Color.white);        
      panel46.setBackground(new Color(color, color1, color2));
      z = 43;
      }
      
      if (control.equals("down"))
      {
      panel56.setBackground(Color.white);        
      panel66.setBackground(new Color(color, color1, color2));
      z = 66;
      }      

    }    

   if (z == 57)
    {
      if (control.equals("left"))
      {
      panel57.setBackground(Color.white);        
      panel56.setBackground(new Color(color, color1, color2)); 
      z = 56; 
      }
      
      if (control.equals("right"))
      {
      panel57.setBackground(Color.white);        
      panel58.setBackground(new Color(color, color1, color2)); 
      z = 58; 
      }
      
      if (control.equals("up"))
      {
      panel57.setBackground(Color.white);        
      panel47.setBackground(new Color(color, color1, color2));
      z = 47;
      }
      
      if (control.equals("down"))
      {
      panel57.setBackground(Color.white);        
      panel67.setBackground(new Color(color, color1, color2));
      z = 67;
      }      

    }    

   if (z == 58)
    {
      if (control.equals("left"))
      {
      panel58.setBackground(Color.white);        
      panel57.setBackground(new Color(color, color1, color2)); 
      z = 57; 
      }
      
      if (control.equals("right"))
      {
      panel58.setBackground(Color.white);        
      panel59.setBackground(new Color(color, color1, color2)); 
      z = 59; 
      }
      
      if (control.equals("up"))
      {
      panel58.setBackground(Color.white);        
      panel48.setBackground(new Color(color, color1, color2));
      z = 48;
      }
      
      if (control.equals("down"))
      {
      panel58.setBackground(Color.white);        
      panel68.setBackground(new Color(color, color1, color2));
      z = 68;
      }      

    }

   if (z == 59)
    {
      if (control.equals("left"))
      {
      panel59.setBackground(Color.white);        
      panel58.setBackground(new Color(color, color1, color2)); 
      z = 59; 
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel59.setBackground(Color.white);        
      panel49.setBackground(new Color(color, color1, color2));
      z = 49;
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

   if (z == 61)
    {
      if (control.equals("left"))
      {
      x = 5;
      loc = 8;
      run = 0;  
      }
      
      if (control.equals("right"))
      {
      panel61.setBackground(Color.white);        
      panel62.setBackground(new Color(color, color1, color2)); 
      z = 62; 
      }
      
      if (control.equals("up"))
      {
      panel61.setBackground(Color.white);        
      panel51.setBackground(new Color(color, color1, color2));
      z = 51;
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

   if (z == 62)
    {
      if (control.equals("left"))
      {
      panel62.setBackground(Color.white);        
      panel61.setBackground(new Color(color, color1, color2)); 
      z = 61; 
      }
      
      if (control.equals("right"))
      {
      panel62.setBackground(Color.white);        
      panel63.setBackground(new Color(color, color1, color2)); 
      z = 63; 
      }
      
      if (control.equals("up"))
      {
      panel62.setBackground(Color.white);        
      panel52.setBackground(new Color(color, color1, color2));
      z = 52;
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

   if (z == 63)
    {
      if (control.equals("left"))
      {
      panel63.setBackground(Color.white);        
      panel62.setBackground(new Color(color, color1, color2)); 
      z = 62; 
      }
      
      if (control.equals("right"))
      {
      panel63.setBackground(Color.white);        
      panel64.setBackground(new Color(color, color1, color2)); 
      z = 64; 
      }
      
      if (control.equals("up"))
      {
      panel63.setBackground(Color.white);        
      panel63.setBackground(new Color(color, color1, color2));
      z = 53;
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

   if (z == 64)
    {
      if (control.equals("left"))
      {
      panel64.setBackground(Color.white);        
      panel63.setBackground(new Color(color, color1, color2)); 
      z = 63; 
      }
      
      if (control.equals("right"))
      {
      panel64.setBackground(Color.white);        
      panel65.setBackground(new Color(color, color1, color2)); 
      z = 65; 
      }
      
      if (control.equals("up"))
      {
      panel64.setBackground(Color.white);        
      panel54.setBackground(new Color(color, color1, color2));
      z = 54;
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

   if (z == 65)
    {
      if (control.equals("left"))
      {
      panel65.setBackground(Color.white);        
      panel64.setBackground(new Color(color, color1, color2)); 
      z = 64; 
      }
      
      if (control.equals("right"))
      {
      panel65.setBackground(Color.white);        
      panel66.setBackground(new Color(color, color1, color2)); 
      z = 66; 
      }
      
      if (control.equals("up"))
      {
      panel65.setBackground(Color.white);        
      panel65.setBackground(new Color(color, color1, color2));
      z = 65;
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

   if (z == 66)
    {
      if (control.equals("left"))
      {
      panel66.setBackground(Color.white);        
      panel65.setBackground(new Color(color, color1, color2)); 
      z = 65; 
      }
      
      if (control.equals("right"))
      {
      panel66.setBackground(Color.white);        
      panel67.setBackground(new Color(color, color1, color2)); 
      z = 67; 
      }
      
      if (control.equals("up"))
      {
      panel66.setBackground(Color.white);        
      panel66.setBackground(new Color(color, color1, color2));
      z = 66;
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

   if (z == 67)
    {
      if (control.equals("left"))
      {
      panel67.setBackground(Color.white);        
      panel66.setBackground(new Color(color, color1, color2)); 
      z = 66; 
      }
      
      if (control.equals("right"))
      {
      panel67.setBackground(Color.white);        
      panel68.setBackground(new Color(color, color1, color2)); 
      z = 68; 
      }
      
      if (control.equals("up"))
      {
      panel67.setBackground(Color.white);        
      panel57.setBackground(new Color(color, color1, color2));
      z = 57;
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }

   if (z == 68)
    {
      if (control.equals("left"))
      {
      panel68.setBackground(Color.white);        
      panel67.setBackground(new Color(color, color1, color2)); 
      z = 67; 
      }
      
      if (control.equals("right"))
      {
      System.out.println("Not a way");
      }
      
      if (control.equals("up"))
      {
      panel68.setBackground(Color.white);        
      panel68.setBackground(new Color(color, color1, color2));
      z = 68;
      }
      
      if (control.equals("down"))
      {
      System.out.println("Not a way");
      }      

    }










    
    if (control.equals("look"))
    {
    System.out.println("Their is a painting, a flower pot, a elevator, a panel.");
    }
    
    if (z == 49 || z == 59)
    {
    if (control.equals("look at elevator") || control.equals("go to elevator"))
    {
    if (p == 1)
    {
    System.out.println("Good job, you escape");
    break;
    }

    else
    {
    System.out.println("The elevator has no power");
    }
      
    }      
    }
  
    
        
    if (z == 49 || z == 48)
    {
    if (panel == 0)
    {
    if (control.equals("look at panel"))
    {
    if (count[3] == 1)
    {
    System.out.println("You unscrew the panel");
    panel = 1;
    }
    else
    System.out.println("You need a screwdriver to unscrew the panel");
    }      
    }      
    }

   
    

    if (z == 49 || z == 48)
    {
    if (panel == 1)
    {
    if (control.equals("look at panel"))
    {
    if (count[0] == 4)
    {
    System.out.println("You put in the four battery, the elevator is starting to power up");
    p = 1;
    }
    else
    {
    System.out.println("The panel need four battery");
    }
    }
    }      
    }

 

    if (z == 45 || z == 46 || z == 47)
    {
    if (safe == 0)
    {
    if (control.equals("look at painting"))
    {
    System.out.println("You find a hiden safe behind the painting");
    safe = 1;
    }      
    }
    
    if (safe == 1)
    {
      if (control.equals("look at painting"))
      {
        System.out.println("This is a great painting");
      }

      if (control.equals ("look at safe"))
      {
      System.out.println("The lock is a color lock");
      System.out.println("Enter first color");
      colorp1 = scan.next().charAt(0);  
      System.out.println("Enter second color");
      colorp2 = scan.next().charAt(0);   
      System.out.println("Enter third color");
      colorp3 = scan.next().charAt(0);  

      if (colorp1 == 'b')
      {
        if (colorp2 == 'y')
        {
          if (colorp3 == 'g')
          {
          if (gain3 == 0)
          {
          System.out.println("You find a battery");
          count[0] = count[0] + 1; 
          gain3 = 1;
          }
          }
        }
      }         
      }
  
    }      
    }

  
    
    if (z == 68 || z == 58 || z == 59)
    {
    if (control.equals("look at flower pot"))
    {
    System.out.println("You find a green key");
    count[2] = 1;
    }      
    }


 


    
  } // room 3 or the room to the right, end braket.



    
  
    }// while true end bracket


    
  
    



    
  }
}