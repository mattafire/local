/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateExample;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mattafire
 */
public class PumkpinStarter {
     public static void main(String[] arugs){
         prompts();
     }
     static PumpkinHibernate hib = new PumpkinHibernate();
     public static void prompts(){
         int number = 0;
         ArrayList pumpkins = new ArrayList();
         System.out.print("How many Pumpkins would you like?");
         number = Integer.parseInt(getUserInput());
         String color;
         int diam;
         int weight;
         for(int i = 0;i<number;i++){
             System.out.print("Please enter the color of Pumkin "+ (i+1) +":(Orange)");
             color = getUserInput();
             System.out.print("Please enter the size of Pumkin "+ (i+1) +":(Diamiter in Inches)");
             diam = Integer.parseInt(getUserInput());
             System.out.print("Please enter the weight of Pumkin "+ (i+1) +":(Weight in Pounds)");
             weight = Integer.parseInt(getUserInput());
             pumpkins.add(new Pumpkin(color,weight,diam));
         }
         for(int i = 0; i < pumpkins.size();i++){
             System.out.println("Pumpkin " + (i+1)+" is "+((Pumpkin)pumpkins.get(i)).getColor() + " is " + ((Pumpkin)pumpkins.get(i)).getDiamiter() + " inches and weights " + ((Pumpkin)pumpkins.get(i)).getWeight());
                            hib.updatePumpkin((Pumpkin)pumpkins.get(i));
                        }
     }
     private static String getUserInput() {
        Scanner input = new Scanner(System.in);
        String userIn = input.nextLine();
        return userIn;
    }
}
