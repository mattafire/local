
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Collections {
    
    static ArrayList animalNames = new ArrayList();//just a list
    static HashSet animalType = new HashSet();
    static TreeMap animalSpecs = new TreeMap();
    
    public static void main (String[] args){
        animalNames.add("Toby");
        animalNames.add("Flipper");
        animalNames.add("Spot");
        animalNames.add("Poody");
        animalNames.add("Chispa");
        
        animalType.add("Dog");
        animalType.add("Dolphin");
        animalType.add("Dog");
        animalType.add("Cat");
        animalType.add("Dog");
        
        animalSpecs.put("Toby", "Dog");
        animalSpecs.put("Chispa", "Dog");
        animalSpecs.put("Spot", "Dog");
        animalSpecs.put("Flipper", "Dolphin");
        animalSpecs.put("Poody", "Cat");
        
        menu();
    }
    
    private static void menu(){
        boolean done = false;
        String in = new String();
        do{
            printNames();
            printTypes();
            //printMenu();
            getAnimal();
            in = getUserIn();
            printSpecs(in);
            
        }while(!done);
    }
    
    private static void printMenu(){
        System.out.println();
        System.out.println("Please choose an option:");
        System.out.println("1 ");
        System.out.print(">>");
    }

    private static String getUserIn() {
        Scanner systemInScanner = new Scanner(System.in);
        return systemInScanner.nextLine();
    }
    
    private static void getAnimal(){
        System.out.println();
        System.out.print("Please enter an animal name:");
    }

    private static void printNames() {
        System.out.println();
        for(int i = 0; i< animalNames.size();i++){
            System.out.println(animalNames.get(i));
        }
    }
    private static void printTypes() {
        System.out.println();
        Iterator type = animalType.iterator();
        while(type.hasNext()){
            System.out.println(type.next());
        }
    }

    private static void printSpecs(String in) {
        System.out.println();
        System.out.println(in + " is a " + animalSpecs.get(in));
    }
    
    
}
