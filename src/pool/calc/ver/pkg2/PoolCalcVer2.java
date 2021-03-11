/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pool.calc.ver.pkg2;

import java.util.Scanner;



/**
 *
 * @author val
 */
public class PoolCalcVer2 {
    static boolean exit;
    static String username;                                                      //declaring global variable
    static String password;
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        username = "val";                                                        //assigning the global variables to a string to be used for the login
        password = "123";
        login();                                                                 //calls the login method that contains my main loop
                    
        }
            
                
        
    
    public static void printMenu(){                                              //prints the menu text
        System.out.println(   "Please make a selection for the pool shape: ");
        System.out.println("1. Rectangular: ");
        System.out.println("2. Circular: ");
        System.out.println("0. Exit");
        //how the menu will look in the console
    }
    private static void printHeader(){                                           //prints a lovely header
        System.out.println("+---------------------+");
        System.out.println("| Welcome to the Pool |");
        System.out.println("|   Calculator 3000   |");
        System.out.println("+---------------------+");
        //how the header will look 
         }
    public static void login(){
        Scanner scan = new Scanner(System.in);                                   //gets user input for the login and checks it's the corerect login
            System.out.println("Log in");
            System.out.println("username: ");
        username = scan.nextLine();
            System.out.println("password: ");
        password = scan.nextLine();
        if (username.equals("val") && (password.equals("123")))
        {System.out.println("Login successful!");
                printHeader();
                printMenu();}        
        else {
            System.out.println("Incorrect username or password");
               login();
        }              
        Scanner userInput = new Scanner(System.in);
        while(exit!=true){                                                       //start of he menu loop, allows user to choose 3 options including the choice to kill the program
        String input = userInput.next();
        String kill = "0";
        String cuboid = "1";
        String cylinder = "2";
        if (input.equals(cuboid))                                                //if statement to determine whether to use the cuboid or cylinder method
        {volCuboid();                                                            
            reRun();}
        else if (input.equals(cylinder))
        {volCylinder();
            reRun();}
        else if (input.equals(kill))
                {exit = true;}
        else
            System.out.println("Invalid input. Please select 1, 2 or 0");
            printMenu();
       
        
                        
        }}
    private static void reRun(){                                                 //this method allows the program to go back to the login 
   double choice;
   
        System.out.println("Would you like to run again?  ");
        System.out.println("1. yes  ");
        System.out.println("0. no  ");
   Scanner scan = new Scanner(System.in);
   choice = scan.nextDouble();
   while (choice != 0){
       if (choice == 1) 
               login();
        System.out.println("Incorrect");
       reRun();
       break;
                  }
   System.exit(0);
   }

    
    
    private static void volCylinder(){                                           // method for working out the volume of the pool if its a cylinder
    Scanner SC = new Scanner(System.in);
        System.out.println("Enter pool radius: ");
    double radius = SC.nextDouble();
        System.out.println("Enter depth at the deepest point: ");
    double deepestPoint = SC.nextDouble();
        System.out.println("Enter depth at the shallowest point: ");
    double shallowestPoint = SC.nextDouble();
    double depthAvg = (shallowestPoint + deepestPoint) / 2;
    double volume = 3.1415 * Math.pow(radius, 2) * depthAvg;
        System.out.println("Volume is " + volume);
            
    
    String sAlignLeft = "| %10s %-1s %-27s | \r\n";
        String sAlign1 = "| %10s %-12.12s %-5s %-12s | \r\n";
        String sAlign2 = "| %10s %-12.12s %-5s %-12s | \r\n";
        String sAlign3 = "| %10s %-12.12s %-5s %-7s | \r\n";
        String sAlignCentre = "";        
        String sFiller = ("|                                            | \n");
        
        System.out.println("\n");
        System.out.format("+--------------------------------------------+\n");
        System.out.print(sFiller);
        System.out.format(sAlignLeft,"Name:",username,"");
        System.out.print(sFiller);
        System.out.format(sAlign1,"Radius: ",radius,"","");
        System.out.format(sAlign3,"Average depth: ",depthAvg,"","");    
        System.out.print(sFiller);
        System.out.print(sFiller);
        System.out.format(sAlign1,"Volume: ",volume,"","");
        System.out.print(sFiller);
        System.out.println("+--------------------------------------------+");
        System.out.println("\n");
    }
    

    
    
    private static void volCuboid(){                                             //method for working out the volume of cuboid
        
    Scanner SC = new Scanner(System.in);
        System.out.println("Enter pool length: ");
    double length = SC.nextDouble();
        System.out.println("Enter pool width: ");
    double width = SC.nextDouble();
        System.out.println("Enter depth at the deepest point: ");
    double deepestPoint = SC.nextDouble();
        System.out.println("Enter depth at the shallowest point: ");
    double shallowestPoint = SC.nextDouble();
    double depthAvg = (shallowestPoint + deepestPoint) / 2;
    double volume = length * width * depthAvg;
    
        String sAlignLeft = "| %10s %-1s %-27s | \r\n";
        String sAlign1 = "| %10s %-12.12s %-5s %-12s | \r\n";
        String sAlign2 = "| %10s %-12.12s %-5s %-12s | \r\n";
        String sAlign3 = "| %10s %-12.12s %-5s %-7s | \r\n";
        String sAlignCentre = "";        
        String sFiller = ("|                                            | \n");
        
        System.out.println("\n");
        System.out.format("+--------------------------------------------+\n");
        System.out.print(sFiller);
        System.out.format(sAlignLeft,"Name:",username,"");
        System.out.print(sFiller);
        System.out.format(sAlign1,"Length: ",length,"","");
        System.out.format(sAlign2,"Width: ",width,"","");    
        System.out.format(sAlign3,"Average depth: ",depthAvg,"","");    
        System.out.print(sFiller);
        System.out.print(sFiller);
        System.out.format(sAlign1,"Volume ",volume,"","");
        System.out.print(sFiller);
        System.out.println("+--------------------------------------------+");
        System.out.println("\n");   

}   
    
    
    
    }



      


    
