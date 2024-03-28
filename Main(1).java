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
  String colorp1, colorp2, colorp3;

System.out.println("Enter command, no caps");
System.out.println("If you need help, type help");
System.out.println("To access inventory, type inv");
System.out.println("");
    

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
  System.out.println("type go, to go to a different room must be at the crossroad");
  System.out.println("type use, to use something");
  }

  System.out.println("Enter controls");
  control = scan.nextLine(); 






    
  if (x == 1)
  {

  if (control.equals("look"))
  {
  System.out.println("Your in a blue room, with a desk, a bed, a door, bookshelf, radio, and a clock. ");
  }
    
  if (control.equals("look at door"))
  {
  System.out.println("The door is lock. need a key.");
  }

  if (control.equals("look at desk"))
  {
  System.out.println("At the desk, there is four drawers, two are locks. In the two unlocked drawers, there is a paper, a battery. lock one is a three digt. lock two is a four digt.");
  count[0] = count[0] + 1;
  }

    
  if (control.equals("look at lock"))
  {
  System.out.println("There is two lock, lock one is a four number lock, lock two is a three number");
  }

  if (control.equals("look at lock one"))
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
      }
    
    }
    
  }
  
  }

  if (control.equals("look at lock two"))
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
        }
      }
    }
  }
    

  
  }    

  if (control.equals("look at bed"))
  {
  System.out.println("You find nothing");
  }

  if (control.equals("look at radio") || control.equals("use the radio"))
  {
    if (count[0] >= 1)
    {
    System.out.println("It play, D, R, C, B.");
    count[0] = count[0] - 1;
    }
    else
    {
    System.out.println("The radio need a battery");
    }
  
  }

  if (control.equals("look at bookshelf"))
  {
  System.out.println("On the Bookshelf there is 9 books. In one of the book their is a letter.");
  System.out.println("4.6.8.7.3");
  System.out.println("2.3.2.4.2");
  }

  if (control.equals("look at clock"))
  {
  System.out.println("The time is 9 clock");
  }

    
  if (control.equals("look at paper"))
  {
    System.out.println("there is " + bread + " bread, " + apple + " apple, " + juice + " cup of juice.");
  }
  
  if (control.equals("use red key"))
  {
    
  if (count[1] == 1)
  {
  System.out.println("The door is open");
  System.out.println("The door lead to a corrider.");
  x = 5;
  }

  if (count[1] == 0)
  {
  System.out.println("You do not have a key");
  }
    
  }



  } // if x = 1 end bracket

  if (x == 5)
  {
  System.out.println("Your at a crossway");
  System.out.println("You can see three path, in front of you, to the left, and to the right.");  
  if (control.equals("go left"))
  {
  x = 2;
  control = "look";
  }

  if (control.equals("go right"))
  {
  x = 3;
  control = "look";  
  }

  if (control.equals("go front"))
  {
  x = 4;
  control = "look";  
  }

  if (control.equals("go back"))
  {
  x = 1; 
  control = "look";  
  }
    
  }

    
  if (x == 2) // The room to the left 
  {
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

    if (control.equals("look at table"))
    {
    System.out.println("There is nothing on the table");
    }

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

    if (control.equals("go back"))
    {
    System.out.println("You go back to crossway");
    x = 5;
    }

    
    
  } // the room to right, end bracket

  if (x == 4) // The room to the front
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
  
  if (d1 == 1)
  {
    if (control.equals("look"))
    {
      System.out.println("The green room there is a table, a bed, a statue, and a pedal stood.");
    }

    if (control.equals("look at bed"))
    {
    System.out.println("You find a paper under the bed");
    }

    if (control.equals("look at paper"))
    {
    System.out.println("I am a word with two meanings. With one I can be broken, with the second I hold on. What am I? ");
    }

    if (control.equals("look at table"))
    {
    System.out.println("You find a battery");
    count[0] = count[0] + 1; 
    }

    if (control.equals("look at statue"))
    {
    System.out.println("You take the statue");
    count[4] = 1;
    }

    if (control.equals("use statue"))
    {
    System.out.println("You put the statue on the pedal stool");
    System.out.println("You heard a crank, a door open in front of you.");
    }

    if (control.equals("look at table"))
    {
    System.out.println("You find a battery");
    count[0] = count[0] + 1;
    }

    if (count[4] == 1)
    {
    if (control.equals("go front"))
    {
    System.out.println("You go into the hiden room");
    x = 6;
    }      
    }

  }

    if (control.equals("go back"))
    {
    System.out.println("You went back to the crossway");
    x = 5;
    }
    
  } // The end bracket for the room in the front

  if (x == 6)
  {

    if (control.equals("look"))
    {
    System.out.println("There is a box, with a letter lock,");
    }

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
          System.out.println("You found a battery");
          count[0] = count[0] + 1;
          }
        }
      }
    }
    
    
    }

    if (control.equals("go back"))
    {
    System.out.println("You went back to the green room");
    x = 4;
    }

    
    
  } // end bracket for hiden room.




    
  if (x == 3) // The room to the right.
  {
    if (control.equals("look"))
    {
    System.out.println("Their is a painting, a flower pot, a elevator, a panel.");
    }

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
      colorp1 = scan.nextLine(); 
      System.out.println("Enter second color");
      colorp2 = scan.nextLine(); 
      System.out.println("Enter third color");
      colorp3 = scan.nextLine(); 

      if (colorp1 == "blue")
      {
        if (colorp2 == "yellow")
        {
          if (colorp3 == "green")
          {
          System.out.println("You find a battery");
          count[0] = count[0] + 1;
          }
        }
      }        
      }
  
    }

 
    if (control.equals("look at flower pot"))
    {
    System.out.println("You find a green key");
    count[2] = 1;
    }    

    if (control.equals("go back"))
    {
    System.out.println("You went back to the crossway");
    x = 5;
    }
    
  } // room 3 or the room to the right, end braket.

    
  } // while true end bracket
  
    

    




    
  }
}