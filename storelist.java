package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Storelist {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> Shop = new ArrayList<String>();
       
        

        Shop.add(0, "Blacksmith");
        Shop.add(1, "Armory");
        Shop.add( 2,"Adventuring Supplies");
        Shop.add(3, "General Store");
        Shop.add(4, "Jeweler");
        Shop.add( 5,"Stonecutter");
        Shop.add( 6,"Leatherworker");
        Shop.add( 7,"Woodworker");
        Shop.add(8, "Bowyer");
        Shop.add(9, "Shady Dealer");
        Shop.add(10, "Tailor");
        Shop.add(11, "Textiles");
        Shop.add(12, "Potion Shop");
        Shop.add(13, "Temple of Faith");
        Shop.add(14, "Arcane Shop");
        Shop.add(15, "Inn");
        Shop.add( 16, "Tavern");
        Shop.add(17, "Stable");
        Shop.add(18, "Farm Animals");
        Shop.add(19, "Dock");
        Shop.add(20, "Shipyard");
          
        
        
        System.out.printf("What Store do you choose? ");
        String s = input.nextLine();
        
        input.close();

        
            if(s.contentEquals(Shop.get(0))){
            System.out.println("You have chosen the " + Shop.get(0) +".");
                    return;
            }    
           
            
             if(s.contentEquals(Shop.get(1))){
                System.out.println("You have chosen the " + Shop.get(1) +".");
                    return;
        }
            
             if(s.contains(Shop.get(2))){
                System.out.println("You have chosen " + Shop.get(2) +".");
                    return;
        }
        
            if(s.contains(Shop.get(3))){
            System.out.println("You have chosen the "+ Shop.get(3) +".");
                return;
        }
           
            if(s.contains(Shop.get(4))){
            System.out.println("You have chosen "+Shop.get(4)+".");
                return;
        }
            
            if(s.contains(Shop.get(5))){
            System.out.println("You have chosen "+Shop.get(5)+".");
                return;
        }
                
            if(s.contains(Shop.get(6))){
            System.out.println("You have chosen "+Shop.get(6)+".");
            return;
        }
               
            if(s.contains(Shop.get(7))){
            System.out.println("You have chosen "+Shop.get(7)+".");
            return;
        }
            
            if(s.contains(Shop.get(8))){
            System.out.println("You have chosen "+Shop.get(8)+".");
            return;
        }
            
            if(s.contains(Shop.get(9))){
            System.out.println("You have chosen "+Shop.get(9)+".");
            return;
        }
            
            if(s.contains(Shop.get(10))){
            System.out.println("You have chosen "+Shop.get(10)+".");
            return;
        }
            
            if(s.contains(Shop.get(11))){
            System.out.println("You have chosen "+Shop.get(11)+".");
            return;
        }
        
            if(s.contains(Shop.get(12))){
            System.out.println("You have chosen "+Shop.get(12)+".");
            return;
        }
            
            if(s.contains(Shop.get(13))){
            System.out.println("You have chosen "+Shop.get(13)+".");
            return;
        }
        
            if(s.contains(Shop.get(14))){
            System.out.println("You have chosen "+Shop.get(14)+".");
            return;
        }
    
            if(s.contains(Shop.get(15))){
            System.out.println("You have chosen "+Shop.get(15)+".");
            return;
        }
      
            if(s.contains(Shop.get(16))){
            System.out.println("You have chosen "+Shop.get(16)+".");
            return;
        }
   
            if(s.contains(Shop.get(17))){
            System.out.println("You have chosen "+Shop.get(17)+".");
            return;
        }
        
            if(s.contains(Shop.get(18))){
            System.out.println("You have chosen "+Shop.get(18)+".");
            return;
        }
   
            if(s.contains(Shop.get(19))){
            System.out.println("You have chosen "+Shop.get(19)+".");
            return;
        }
 
            if(s.contains(Shop.get(20))){
            System.out.println("You have chosen "+Shop.get(20)+".");
            return;
        }
            else{
                System.out.println("Your choice was invalid. Please try again.");
                return;
            }
    }
    }





