import javax.swing.*;
import java.awt.*;
import java.util.*;

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
  int x = 1;
  int d1 = 0; // door open or close
  int p = 0; // power for elevator.
  int panel = 0; // panel open or close
  int safe = 0; // safe, hiden or not.
  int door2 = 0; // tell user that the door is unlock.
  int g = 0; // help to show map
  int b = 0; // help display map
  String player; // player
  int xd = 2; // initial pos
  int yd = 1; // initial pos
  int pos = 1; // no or yes for possiably movement
  int gain = 0; // if taken before.
  int gain1 = 0; // if taken before.
  int gain2 = 0; // if taken before.
  int gain3 = 0; // if taken before.
  int gain4 = 0; // if taken before.
  int show = 0; // show the locks
  int loc = 0; // postion
  int run = 0; // let the program run.
  int run1 = 0; // let the program run
  int run2 = 0; // let the program run
  int run3 = 0; // let the program run
  int loc7 = 0;
  int loc1 = 0;
  int loc2 = 0;
  int loc3 = 0;
  int loc4 = 0;
  int loc5 = 0;
  int run4 = 0;
  int run5 = 1; // postion going back from 5 to 1
  // loc 7 = postion of player when going from room 2 to room 5
  int gain5 = 0;
  int gain6 = 0;
    
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
    






    



// map

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




  System.out.println("Enter player Initials in all Caps. Two letter only");
  player = scan.nextLine();
  map[1][2] = player;

System.out.println("bd is the bed. wl is the wall.");
System.out.println("dk is the desk. rd is the radio.");
System.out.println("bk is the book shelf. dr is the door");
System.out.println("ck is the clock.");










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




    System.out.println("---------------------------------------------------"); 

    for(int i = 0; i < map.length; i++)
    {
      
      for (int a = 0; a < map.length; a++){
      if (b > 9)
      {

      System.out.println("---------------------------------------------------");
      b = 0;

      }
      System.out.print( "| " + map[i][a] + " ");
      b++;
      }
      System.out.println("|");  
    }
      System.out.println("---------------------------------------------------");
    
    // map variables

  if (control.equals("map key"))
  {
  System.out.println("");
  System.out.println("bd is the bed. wl is the wall.");
  System.out.println("tb is the table. rd is the radio.");
  System.out.println("bk is the book shelf. dr is the door");
  System.out.println("ck is the clock.");
  }
    


    

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
    
      if (control.equals("left"))
      {
      
      if (xd == 1)
      {
      System.out.println("not a way");   
      pos = 0;
      }
    

      if (yd == 1 && xd == 2 )
      {
      System.out.println("not a way");
      pos = 0;
      }

      if (yd == 2 && xd == 2)
      {
      System.out.println("not a way");
      pos = 0;
      }

      if (yd == 8 && xd == 3)
      {
      System.out.println("not a way");
      pos = 0;
      }

      if (yd == 5 && xd == 7)
      {
      System.out.println("not a way");
      pos = 0;
      }

      if (yd == 6 && xd == 7)
      {
      System.out.println("not a way");
      pos = 0; 
      }

      // important, this is to control movement for left
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      xd = xd - 1;   
      map[yd][xd] = player;  
      }
    
      } // end bracket for left

      if (control.equals("right"))
      {
        if (xd == 8)
        {
          System.out.println("not a way");
          pos = 0;
        }

        if (yd == 1 && xd == 7)
        {
          System.out.println("not a way");
          pos = 0;
        }

        if (yd == 5 && xd == 2)
        {
          System.out.println("not a way");
          pos = 0;
        }

        if (yd == 6 && xd == 2)
        {
          System.out.println("not a way");
          pos = 0;
        }



        
        // important, this is to control movement for right
        if (pos == 1)
        {
        map[yd][xd] = "  ";
        xd = xd + 1;     
        map[yd][xd] = player;

        }
          
      } // end bracket for right

      if (control.equals("down"))
      {

      if (yd == 8)
      {
        System.out.println("not a way");
        pos = 0;
      }

      if (yd == 4 && xd == 3)
      {
        System.out.println("not a way");
        pos = 0;
      }

      if (yd == 4 && xd == 4)
      {
        System.out.println("not a way");
        pos = 0;
      }

      if (yd == 4 && xd == 5)
      {
        System.out.println("not a way");
        pos = 0;
      }

      if (yd == 4 && xd == 6)
      {
        System.out.println("not a way");
        pos = 0;
      }

      if (yd == 7 && xd == 1)
      {
        System.out.println("not a way");
        pos = 0;
      }

      if (yd == 7 && xd == 2)
      {
        System.out.println("not a way");
        pos = 0;
      }


        
    // important, this is to control movement for down
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd + 1;
      map[yd][xd] = player;
      }

   
      } // end bracket for down

      if (control.equals("up"))
      {

        if (yd == 1)
        {
        System.out.println("not a way");
        pos = 0;
        }

        if (yd == 3 && xd == 1)
        {
        System.out.println("not a way");
        pos = 0;
        }

        if (yd == 2 && xd == 8)
        {
        System.out.println("not a way");
        pos = 0;
        }

        if (yd == 7 && xd == 3)
        {
        System.out.println("not a way");
        pos = 0;
        }

        if (yd == 7 && xd == 4)
        {
        System.out.println("not a way");
        pos = 0;
        }

        if (yd == 7 && xd == 5)
        {
        System.out.println("not a way");
        pos = 0;
        }

        if (yd == 7 && xd == 6)
        {
        System.out.println("not a way");
        pos = 0;
        }

        

        
      // important, this is to control movement for up
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd - 1;
      map[yd][xd] = player;
      }


        
        
      } // end bracket for up




    
  if (control.equals("look"))
  {
  System.out.println("Your in a blue room, with a desk, a bed, a door, bookshelf, radio, and a clock. ");
  }

  // look at door, range 
  if (map[1][4] == player)
  {
  if (control.equals("look at door"))
  {
  System.out.println("The door is lock. need a key.");
  }  
  }


  if (map[1][5] == player)
  {
  if (control.equals("look at door"))
  {
  System.out.println("The door is lock. need a key.");
  }  
  }



  // look at desk, range 

  if (map[4][2] == player)
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


  if (map[4][3] == player)
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

  if (map[4][4] == player)
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


  if (map[4][5] == player)
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

    
  if (map[4][6] == player)
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

    
  if (map[4][7] == player)
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

    
  if (map[5][2] == player)
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

    
  if (map[5][7] == player)
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

    
  if (map[6][2] == player)
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

    
  if (map[6][7] == player)
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

    
  if (map[7][2] == player)
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
  

  if (map[7][3] == player)
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

    
  if (map[7][4] == player)
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

    
  if (map[7][5] == player)
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

    
  if (map[7][6] == player)
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
 
    
  if (map[7][7] == player)
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
  map[6][3] = "l1";
  map[6][6] = "l2";
  }


  // lock one range
  if (map[5][2] == player)
  {
  if (control.equals("look at lock one"))
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
  }    
  }
    
  if (map[6][2] == player)
  {
  if (control.equals("look at lock one"))
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
  }    
  }
    
  if (map[7][2] == player)
  {
  if (control.equals("look at lock one"))
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
  }    
  }

  if (map[7][3] == player)
  {
  if (control.equals("look at lock one"))
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
  }    
  }
    
  if (map[7][4] == player)
  {
  if (control.equals("look at lock one"))
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
  }    
  }

  if (map [5][7] == player)
  {
  if (control.equals("look at lock two"))
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
  }          
  }

  if (map [6][7] == player)
  {
  if (control.equals("look at lock two"))
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
  }          
  }

  if (map [7][7] == player)
  {
  if (control.equals("look at lock two"))
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
  }          
  }

  if (map [7][6] == player)
  {
  if (control.equals("look at lock two"))
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
  }          
  }
    
  if (map [7][5] == player)
  {
  if (control.equals("look at lock two"))
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
  }          
  }
    
  if (map[1][2] == player)
  {
  if (control.equals("look at bed"))
  {
  System.out.println("You find nothing");
  }    
  }

  if (map[2][2] == player)
  {
  if (control.equals("look at bed"))
  {
  System.out.println("You find nothing");
  }    
  }    

  if (map[3][1] == player)
  {
  if (control.equals("look at bed"))
  {
  System.out.println("You find nothing");
  }    
  }    

  if (map[4][2] == player)
  {
  if (control.equals("look at radio") || control.equals("use the radio"))
  {
    if (count[0] >= 1)
    {
    System.out.println("It play, D, R, C, B.");
    if (gain3 == 0)
    {
    count[0] = count[0] - 1;
    gain3 = 1;
    }
    }
    else
    {
    System.out.println("The radio need a battery");
    }
  
  }    
  }

  if (map[5][2] == player)
  {
  if (control.equals("look at radio") || control.equals("use the radio"))
  {
    if (count[0] >= 1)
    {
    System.out.println("It play, D, R, C, B.");
    if (gain3 == 0)
    {
    count[0] = count[0] - 1;
    gain3 = 1;
    }
    }
    else
    {
    System.out.println("The radio need a battery");
    }
  
  }    
  }

  if (map[6][2] == player)
  {
  if (control.equals("look at radio") || control.equals("use the radio"))
  {
    if (count[0] >= 1)
    {
    System.out.println("It play, D, R, C, B.");
    if (gain3 == 0)
    {
    count[0] = count[0] - 1;
    gain3 = 1;
    }
    }
    else
    {
    System.out.println("The radio need a battery");
    }
  
  }    
  }

  if (map[4][3] == player)
  {
  if (control.equals("look at radio") || control.equals("use the radio"))
  {
    if (count[0] >= 1)
    {
    System.out.println("It play, D, R, C, B.");
    if (gain3 == 0)
    {
    count[0] = count[0] - 1;
    gain3 = 1;
    }
    }
    else
    {
    System.out.println("The radio need a battery");
    }
  
  }    
  }

  if (map[4][4] == player)
  {
  if (control.equals("look at radio") || control.equals("use the radio"))
  {
    if (count[0] >= 1)
    {
    System.out.println("It play, D, R, C, B.");
    if (gain3 == 0)
    {
    count[0] = count[0] - 1;
    gain3 = 1;
    }
    }
    else
    {
    System.out.println("The radio need a battery");
    }
  
  }    
  }

  if (map[7][1] == player)
  {
  if (control.equals("look at bookshelf"))
  {
  System.out.println("On the Bookshelf there is 9 books. In one of the book their is a letter.");
  System.out.println("4.6.8.7.3");
  System.out.println("2.3.2.4.2");
  }    
  }

  if (map[7][2] == player)
  {
  if (control.equals("look at bookshelf"))
  {
  System.out.println("On the Bookshelf there is 9 books. In one of the book their is a letter.");
  System.out.println("4.6.8.7.3");
  System.out.println("2.3.2.4.2");
  }    
  }

  if (map[7][3] == player)
  {
  if (control.equals("look at bookshelf"))
  {
  System.out.println("On the Bookshelf there is 9 books. In one of the book their is a letter.");
  System.out.println("4.6.8.7.3");
  System.out.println("2.3.2.4.2");
  }    
  }
    
  if (map[8][3] == player)
  {
  if (control.equals("look at bookshelf"))
  {
  System.out.println("On the Bookshelf there is 9 books. In one of the book their is a letter.");
  System.out.println("4.6.8.7.3");
  System.out.println("2.3.2.4.2");
  }    
  }
    
  if (map[1][7] == player)
  {
  if (control.equals("look at clock"))
  {
  System.out.println("The time is 9 clock");
  }    
  }
 
  if (map[2][7] == player)
  {
  if (control.equals("look at clock"))
  {
  System.out.println("The time is 9 clock");
  }    
  }
 
  if (map[2][8] == player)
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

  if (map[1][4] == player)
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

  if (map[1][5] == player)
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

  
  if (run == 0)
  {
  
  map [0][0] = "  ";
  map [0][1] = "  ";
  map [0][2] = "  ";
  map [0][3] = "wl";
  map [0][4] = "dr";
  map [0][5] = "dr";
  map [0][6] = "wl";
  map [0][7] = "  ";
  map [0][8] = "  ";
  map [0][9] = "  ";
  map [1][0] = "  ";
  map [1][1] = "  ";
  map [1][2] = "  ";
  map [1][3] = "wl";
  map [1][4] = "  ";
  map [1][5] = "  ";
  map [1][6] = "wl";
  map [1][7] = "  ";
  map [1][8] = "  ";
  map [1][9] = "  ";
  map [2][0] = "  ";
  map [2][1] = "  ";
  map [2][2] = "  ";
  map [2][3] = "wl";
  map [2][4] = "  ";
  map [2][5] = "  ";
  map [2][6] = "wl";
  map [2][7] = "  ";
  map [2][8] = "  ";
  map [2][9] = "  ";
  map [3][0] = "  ";
  map [3][1] = "  ";
  map [3][2] = "  ";
  map [3][3] = "wl";
  map [3][4] = "  ";
  map [3][5] = "  ";
  map [3][6] = "wl";
  map [3][7] = "  ";
  map [3][8] = "  ";
  map [3][9] = "  ";
  map [4][0] = "wl";
  map [4][1] = "wl";
  map [4][2] = "wl";
  map [4][3] = "wl";
  map [4][4] = "  ";
  map [4][5] = "  ";
  map [4][6] = "wl";
  map [4][7] = "wl";
  map [4][8] = "wl";
  map [4][9] = "wl";
  map [5][0] = "dr";
  map [5][1] = "  ";
  map [5][2] = "  ";
  map [5][3] = "  ";
  map [5][4] = "  ";
  map [5][5] = "  ";
  map [5][6] = "  ";
  map [5][7] = "  ";
  map [5][8] = "  ";
  map [5][9] = "  ";
  map [6][0] = "dr";
  map [6][1] = "  ";
  map [6][2] = "  ";
  map [6][3] = "  ";
  map [6][4] = "  ";
  map [6][5] = "  ";
  map [6][6] = "  ";
  map [6][7] = "  ";
  map [6][8] = "  ";
  map [6][9] = "  ";
  map [7][0] = "wl";
  map [7][1] = "wl";
  map [7][2] = "wl";
  map [7][3] = "wl";
  map [7][4] = "  ";
  map [7][5] = "  ";
  map [7][6] = "wl";
  map [7][7] = "wl";
  map [7][8] = "wl";
  map [7][9] = "wl";
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
  }
    
  if (loc == 5)
  {
  if (run == 0)
  {
  yd = 9;
  xd = 5;  
  map[yd][xd] = player;
  run = 1;
  }

  } 

  if (loc == 7) // loction apper for when, chara when from room 2 to 5
  {
  if (run == 0)
  {
  yd = 5;
  xd = 1;
  map[yd][xd] = player;
  run = 1;
  }
  }

  if (loc == 8) // loction apper for when, char went back from room 3 to 5
  {
  if (run == 0)
  {
  yd = 5;
  xd = 9;  
  map[yd][xd] = player;
  run = 1;  
  }
  }

  if (loc == 9)
  {
  if (run == 0)
  {
  yd = 2;
  xd = 5;  
  map[yd][xd] = player;
  run = 1;    
  }
  }
    

    
  // controls

      if (control.equals("left"))
      {

      if (xd == 1)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      if (yd == 1)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      if (yd == 1 && xd == 4)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      if (yd == 2 && xd == 4)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 3 && xd == 4)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      if (yd == 3 && xd == 5)
      {
      System.out.println("not a way");   
      pos = 0;  
      }      

      if (yd == 8 && xd == 4)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      if (yd == 7 && xd == 4)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 9 && xd == 4)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      // important, this is to control movement for left
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      xd = xd - 1;   
      map[yd][xd] = player;  
      }
    
      } // end bracket for left

      if (control.equals("right"))
      {

      if (yd == 1 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 2 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 3 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      if (yd == 4 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      if (yd == 7 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 8 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      if (yd == 9 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
        // important, this is to control movement for right
        if (pos == 1)
        {
        map[yd][xd] = "  ";
        xd = xd + 1;     
        map[yd][xd] = player;

        }
          
      } // end bracket for right

      if (control.equals("down"))
      {

      if (yd == 6 && xd == 8)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 6 && xd == 1)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 6 && xd == 2)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      if (yd == 6 && xd == 3)
      {
      System.out.println("not a way");   
      pos = 0;  
      }


        
      if (yd == 6 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 6 && xd == 7)
      {
      System.out.println("not a way");   
      pos = 0;  
      }


        

    // important, this is to control movement for down
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd + 1;
      map[yd][xd] = player;
      }

   
      } // end bracket for down

      if (control.equals("up"))
      {

      if (yd == 5 && xd == 1)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 5 && xd == 2)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 5 && xd == 3)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      if (yd == 5 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 5 && xd == 7)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      if (yd == 5 && xd == 8)
      {
      System.out.println("not a way");   
      pos = 0;  
      }

      if (yd == 5 && xd == 9)
      {
      System.out.println("not a way");   
      pos = 0;  
      }


        
        
      // important, this is to control movement for up
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd - 1;
      map[yd][xd] = player;
      }


        
        
      } // end bracket for up




  System.out.println("Your at a crossway");
  System.out.println("You can see three path, in front of you, to the left, and to the right.");  

    if (map[6][1] == player) // left door
    {
    if (control.equals("use door"))
    {
    x = 2;
    loc = 2;
    run1 = 0;
    control = "look";
    }  
    }

    if (map[5][1] == player)
    {
    if (control.equals("use door"))
    {
    x = 2;
    loc = 2;
    run1 = 0;
    control = "look";
    }      
    }


    
    if (map[1][4] == player) // front door
    {
    x = 4;
    loc = 4;
    run4 = 0;
    control = "look";   
    }

    if (map[1][5] == player)
    {
    x = 4;
    loc = 4;
    run4 = 0;
    control = "look";    
    }

    if (map[9][4] == player)// first room
    {
    if (control.equals("go back")) 
    {
    x = 1;
    loc5 = 1;
    run5 = 0;
    control = "look";  
    }      
    }

    if (map[9][5] == player)
    {
    if (control.equals("go back"))
    {
    x = 1;
    loc5 = 1;
    run5 = 0;
    control = "look";  
    }      
    }

    if (map[6][9] == player) // right
    {
    x = 3;
    loc = 3;
    run3 = 0;
    control = "look";  
    }
    
    if (map[5][9] == player)
    {
    x = 3;
    loc = 3;
    run3 = 0;
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
    }

  if (loc == 2)
  {
  if (run1 == 0)
  {
  yd = 4;
  xd = 8;  
  map[yd][xd] = player;
  run1 = 1;
  }
  } 






    

    
      if (control.equals("left"))
      {
      
      if (xd == 1)
      {
      System.out.println("not a way");   
      pos = 0;
      }
    

      if (yd == 5 && xd == 4 )
      {
      System.out.println("not a way");
      pos = 0;
      }

      if (yd == 6 && xd == 4)
      {
      System.out.println("not a way");
      pos = 0;
      }

      if (yd == 7 && xd == 4)
      {
      System.out.println("not a way");
      pos = 0;
      }

      if (yd == 8 && xd == 4)
      {
      System.out.println("not a way");
      pos = 0;
      }



      // important, this is to control movement for left
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      xd = xd - 1;   
      map[yd][xd] = player;  
      }
    
      } // end bracket for left

      if (control.equals("right"))
      {

      if (yd == 1 && xd == 8)
      {
      System.out.println("not a way");
      pos = 0; 
      }

      if (yd == 2 && xd == 8)
      {
      System.out.println("not a way");
      pos = 0; 
      }

      if (yd == 3 && xd == 8)
      {
      System.out.println("not a way");
      pos = 0; 
      }
        
      if (yd == 6 && xd == 8)
      {
      System.out.println("not a way");
      pos = 0; 
      }

      if (yd == 7 && xd == 8)
      {
      System.out.println("not a way");
      pos = 0; 
      }
        
        
      if (yd == 1 && xd == 8)
      {
      System.out.println("not a way");
      pos = 0; 
      }

        
      if (yd == 1 && xd == 7)
      {
      System.out.println("not a way");
      pos = 0; 
      }

      if (yd == 8 && xd == 7)
      {
      System.out.println("not a way");
      pos = 0; 
      }
        

        
        // important, this is to control movement for right
        if (pos == 1)
        {
        map[yd][xd] = "  ";
        xd = xd + 1;     
        map[yd][xd] = player;

        }
          
      } // end bracket for right

      if (control.equals("down"))
      {

      if (yd == 8)
      {
      System.out.println("not a way");
      pos = 0; 
      }

      if (yd == 4 && xd == 1)
      {
      System.out.println("not a way");
      pos = 0; 
      }

      if (yd == 4 && xd == 2)
      {
      System.out.println("not a way");
      pos = 0; 
      }
        
      if (yd == 4 && xd == 3)
      {
      System.out.println("not a way");
      pos = 0; 
      }
        
      if (yd == 7 && xd == 8)
      {
      System.out.println("not a way");
      pos = 0; 
      }

      if (yd == 9)
      {
      System.out.println("not a way");
      pos = 0; 
      }

        
        
    // important, this is to control movement for down
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd + 1;
      map[yd][xd] = player;
      }

   
      } // end bracket for down

      if (control.equals("up"))
      {

      if (xd == 1)
      {
      System.out.println("not a way");
      pos = 0; 
      }

      if (yd == 2 && xd == 8)
      {
      System.out.println("not a way");
      pos = 0; 
      }
        

        
        
      // important, this is to control movement for up
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd - 1;
      map[yd][xd] = player;
      }


        
        
      } // end bracket for up

    
    
    if (door2 == 0)
    {
    if (control.equals("look"))
    {
    System.out.println("there is a door. The door is not lock.");
    door2 = 1;
    }  
    }
  

    if (control.equals("look"))
    {
    System.out.println("In the yellow room there is a table, a box, there is a poster.");
    }

    if (map[8][4] == player)
    {
    if (control.equals("look at table"))
    {
    System.out.println("There is nothing on the table");
    }  
    }

    if (map[7][4] == player)
    {
    if (control.equals("look at table"))
    {
    System.out.println("There is nothing on the table");
    }      
    }

    if (map[6][4] == player)
    {
    if (control.equals("look at table"))
    {
    System.out.println("There is nothing on the table");
    }      
    }

    if (map[5][4] == player)
    {
    if (control.equals("look at table"))
    {
    System.out.println("There is nothing on the table");
    }      
    }

    if (map[4][4] == player)
    {
    if (control.equals("look at table"))
    {
    System.out.println("There is nothing on the table");
    }      
    }

    if (map[4][3] == player)
    {
    if (control.equals("look at table"))
    {
    System.out.println("There is nothing on the table");
    }      
    }

    if (map[4][2] == player)
    {
    if (control.equals("look at table"))
    {
    System.out.println("There is nothing on the table");
    }      
    }

    if (map[4][1] == player)
    {
     if (control.equals("look at dk"))
    {
    System.out.println("There is nothing on the desk");
    }     
    }

                                
    if (map[8][7] == player)
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

    if (map[7][7] == player)
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
    
    if (map[7][8] == player)
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


    if (map[1][7] == player)
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

    if (map[2][7] == player)
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

    if (map[2][8] == player)
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

    if (map[4][9] == player)
    {
    System.out.println("You go back to crossway");
    x = 5;
    loc = 7;
    run = 0;     
    }

    if (map[5][9] == player)
    {
    System.out.println("You go back to crossway");
    x = 5;
    loc = 7;
    run = 0;     
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
  }
    
  if (run4 == 0)
  {
  yd = 9;
  xd = 4;
  map[yd][xd] = player;
  run4 = 1; 
  loc = 0;
  }

  if (run4 == 2)
  {
  yd = 2;
  xd = 4;
  map[yd][xd] = player;
  run4 = 1; 
  loc = 0;    
  }

  //controls

      if (control.equals("left"))
      {
      
      if (xd == 1)
      {
      System.out.println("not a way");   
      pos = 0;
      }
    
      if (yd == 1 && xd == 2)
      {
      System.out.println("not a way");   
      pos = 0;        
      }

      if (yd == 2 && xd == 2)
      {
      System.out.println("not a way");   
      pos = 0;        
      }

      if (yd == 3 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;        
      }

      if (yd == 4 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;        
      }

      if (yd == 7 && xd == 2)
      {
      System.out.println("not a way");   
      pos = 0;        
      }
        

      // important, this is to control movement for left
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      xd = xd - 1;   
      map[yd][xd] = player;  
      }
    
      } // end bracket for left

      if (control.equals("right"))
      {

      if (xd == 8)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 1 && xd == 7)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 3 && xd == 2)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 4 && xd == 2)
      {
      System.out.println("not a way");   
      pos = 0;
      } 

        
        // important, this is to control movement for right
        if (pos == 1)
        {
        map[yd][xd] = "  ";
        xd = xd + 1;     
        map[yd][xd] = player;

        }
          
      } // end bracket for right

      if (control.equals("down"))
      {

      if (yd == 7 && xd == 1)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 7 && xd == 2)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 7 && xd == 3)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 7 && xd == 6)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 7 && xd == 7)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 7 && xd == 8)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 2 && xd == 3)
      {
      System.out.println("not a way");   
      pos = 0;
      }
        
      if (yd == 2 && xd == 4)
      {
      System.out.println("not a way");   
      pos = 0;
      }
        
      if (yd == 2 && xd == 5)
      {
      System.out.println("not a way");   
      pos = 0;
      }
        
      if (yd == 6 && xd == 1)
      {
      System.out.println("not a way");   
      pos = 0;
      }


        

    // important, this is to control movement for down
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd + 1;
      map[yd][xd] = player;
      }

   
      } // end bracket for down

      if (control.equals("up"))
      {

      if (yd == 1)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 3 && xd == 1)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 5 && xd == 3)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 5 && xd == 4)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 5 && xd == 5)
      {
      System.out.println("not a way");   
      pos = 0;
      }

      if (yd == 2 && xd == 8)
      {
      System.out.println("not a way");   
      pos = 0;
      }
       
        
      // important, this is to control movement for up
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd - 1;
      map[yd][xd] = player;
      }


        
        
      } // end bracket for up





    

  if (map [9][4] == player)
  {
  if (d1 == 0)
  {
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
          }
        }
      }
    }
      
  } 
  }
  }    
  }

  if (map [9][5] == player)
  {
  if (d1 == 0)
  {
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

    if (map [1][2] == player)
    {
    if (control.equals("look at bed"))
    {
    System.out.println("You find a paper under the bed");
    }  
    }

    if (map [2][2] == player)
    {
    if (control.equals("look at bed"))
    {
    System.out.println("You find a paper under the bed");
    }  
    }

    if (map [3][1] == player)
    {
    if (control.equals("look at bed"))
    {
    System.out.println("You find a paper under the bed");
    }  
    }
    
    if (map[3][2] == player)
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

    if (map [2][2] == player)
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

    if (map [2][3] == player)
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

    if (map [2][4] == player)
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
  
    if (map [2][5] == player)
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

    if (map [2][6] == player)
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

    if (map [3][2] == player)
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

    if (map [3][6] == player)
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
    
    if (map [4][2] == player)
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

    if (map [4][6] == player)
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

    if (map [5][2] == player)
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

    if (map [5][3] == player)
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

    if (map [5][4] == player)
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

    if (map [5][5] == player)
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

    if (map [5][6] == player)
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


    if (map [1][7] == player)
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

    if (map [2][7] == player)
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

    if (map [2][8] == player)
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

    if  (map [6][1] == player)
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
    }
    }      
    }

    if  (map [6][2] == player)
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
    }
    }      
    }

    if  (map [7][2] == player)
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
    }
    }      
    }

    if (map[1][4] == player)
    {
    if (loc4 == 1)
    {
    System.out.println("You go into the hiden room");
    x = 6;     
    loc = 10;
    run = 0;
    }      
    }
      
    if (map[1][5] == player)
    {
    if (loc4 == 1)
    {
    System.out.println("You go into the hiden room");
    x = 6;
    loc = 10;
    run = 0;
    }    
    }      
    } 


  

    if (control.equals("go back"))
    {
    System.out.println("You went back to the crossway");
    x = 5;
    run = 0;
    loc = 9;
      
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
    }
    
    
    if (run == 0)
    {
    yd = 8;
    xd = 5;
    map[yd][xd] = player;
    run = 1; 
    loc = 0;      
    }

      if (control.equals("left"))
      {
      
      if (xd == 4)
      {
      System.out.println("not a way");   
      pos = 0;
      }
    

      // important, this is to control movement for left
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      xd = xd - 1;   
      map[yd][xd] = player;  
      }
    
      } // end bracket for left

      if (control.equals("right"))
      {

      if (xd == 5)
      {
      System.out.println("not a way");   
      pos = 0;
      }


        
        // important, this is to control movement for right
        if (pos == 1)
        {
        map[yd][xd] = "  ";
        xd = xd + 1;     
        map[yd][xd] = player;

        }
          
      } // end bracket for right

      if (control.equals("down"))
      {


    // important, this is to control movement for down
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd + 1;
      map[yd][xd] = player;
      }

   
      } // end bracket for down

      if (control.equals("up"))
      {

      if (yd == 7)
      {
      System.out.println("not a way");   
      pos = 0;
      }        
        
      // important, this is to control movement for up
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd - 1;
      map[yd][xd] = player;
      }


        
        
      } // end bracket for up
    
    
    
    if (control.equals("look"))
    {
    System.out.println("There is a box, with a letter lock,");
    }

    if (map[7][4] == player)
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

    if (map[7][5] == player)
    {
    if (control.equals("look at box"))
    {
    System.out.println("The Letter lock is four letter long.");
    }
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

    



    if (map[9][4] == player)
    {
    System.out.println("You went back to the green room");
    x = 4;
    loc = 4;
    run4 = 2;
    }

    if (map[9][5] == player)
    {
    System.out.println("You went back to the green room");
    x = 4;
    loc = 4;
    run4 = 2;
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
  }
    
  if (run3 == 0)
  {
  yd = 5;
  xd = 1;
  map[yd][xd] = player;
  run3 = 1; 
  loc = 0;
  }
    

      if (control.equals("left"))
      {

      
        
      // important, this is to control movement for left
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      xd = xd - 1;   
      map[yd][xd] = player;  
      }
    
      } // end bracket for left

      if (control.equals("right"))
      {

        if (xd == 8)
        {
        System.out.println("not a way");
        pos = 0;
        }
        
        // important, this is to control movement for right
        if (pos == 1)
        {
        map[yd][xd] = "  ";
        xd = xd + 1;     
        map[yd][xd] = player;

        }
          
      } // end bracket for right

      if (control.equals("down"))
      {

      if (yd == 6)
      {
      System.out.println("not a way");   
      pos = 0;    
      }

        
    // important, this is to control movement for down
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd + 1;
      map[yd][xd] = player;
      }

   
      } // end bracket for down

      if (control.equals("up"))
      {

      if (yd == 4)
      {
      System.out.println("not a way");   
      pos = 0;  
      }
        
      // important, this is to control movement for up
      if (pos == 1)
      {
      map[yd][xd] = "  ";
      yd = yd - 1;
      map[yd][xd] = player;
      }


        
        
      } // end bracket for up

    if (control.equals("look"))
    {
    System.out.println("Their is a painting, a flower pot, a elevator, a panel.");
    }
    
    if (map[4][8] == player)
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
    
    if (map[5][8] == player)
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
        
    if (map[4][7] == player)
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

    if (map[4][8] == player)
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

    if (map[4][7] == player)
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

    if (map[4][8] == player)
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

    if (map[4][4] == player)
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

    if (map[4][5] == player)
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
    
    if (map[4][6] == player)
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
    
    if (map[6][7] == player)
    {
    if (control.equals("look at flower pot"))
    {
    System.out.println("You find a green key");
    count[2] = 1;
    }      
    }

    if (map[5][7] == player)
    {
    if (control.equals("look at flower pot"))
    {
    System.out.println("You find a green key");
    count[2] = 1;
    }          
    }

    if (map[5][8] == player)
    {
    if (control.equals("look at flower pot"))
    {
    System.out.println("You find a green key");
    count[2] = 1;
    }          
    }    
    
 
    if (map[4][0] == player)
    {
    System.out.println("You went back to the crossway");
    x = 5;
    loc = 8;
    run = 0;    
    }

    if (map[5][0] == player)
    {

    System.out.println("You went back to the crossway");
    x = 5;
    loc = 8;
    run = 0;
    }

    if (map[6][0] == player)
    {
    System.out.println("You went back to the crossway");
    x = 5;
    loc = 8;
    run = 0;
    }
    

    
  } // room 3 or the room to the right, end braket.



    
  }// while true end bracket


    
  
    



    
  }
}
