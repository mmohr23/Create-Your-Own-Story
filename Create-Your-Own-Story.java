import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        // Start by importing your code from the previous exercise
        //scanner
        Scanner scanner = new Scanner(System.in);
        
        //give destination choices and ask for input
        System.out.println("Do you wwant to travel to [F]rance or [G]reece?");
        String firstChoice = scanner.nextLine();
        //user chooses first france. 
        if(firstChoice.toUpperCase().substring(0,1).equals("F")){
            //option 1-Eiffel tower
            System.out.println("Option 1: Eiffel Tower");
            //option 2- Palace of Versailles
            System.out.println("Option 2: Palace of Versailles");
            //option 3- Louvre Museum
            System.out.println("Option 3: Louvre Museum");
            //option 4- Notre Dame Cathedral 
            System.out.println("Option 4: Notre Dame Cathedral");
            
            //ask user which option they choose. 
            System.out.println("Pleasee enter the number of the option you would like to do: ");
            int secondChoice = scanner.nextInt();
            
            if(secondChoice == 1){
                System.out.println("Enjoy the Eiffel Tower!");
            }
            else if(secondChoice == 2){
                System.out.println("Enjoy the Palace of Versailles!");
            }
            else if(secondChoice == 3){
                System.out.println("Enjoy the Louvre Museum!");
            }
            else if(secondChoice == 4){
                System.out.println("Enjoy the Notre Dame Cathedral!");
            }
        }
        
        //user chooses Greece
        if(firstChoice.toUpperCase().substring(0,1).equals("G")){
            //option 1- Acropolis Museum
            System.out.println("Option 1: Acropolis Museum");
            //option 2- Santorini
            System.out.println("Option 2: Santorini");
            //option 3- Acropolis of Athens
            System.out.println("Option 3: Acropolis of Athens");
            //option 4- Meteora
            System.out.println("Option 4: Meteora");
            
            //ask user which option they choose. 
            System.out.println("Please enter the number of the option you would like to do: ");
            int secondChoice = scanner.nextInt();
            
            if(secondChoice == 1){
                System.out.println("Enjoy the Acropolis Museum!");
            }
            else if(secondChoice == 2){
                System.out.println("Enjoy Santorini!");
            }
            else if(secondChoice == 3){
                System.out.println("Enjoy the Acopolis of Athens!");
            }
            else if(secondChoice == 4){
                System.out.println("Enjoy Meteora!");
            }
        }
        
    }
}