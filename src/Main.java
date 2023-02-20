import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arraySize;
        int foundNameCounter = 0;
        String nameToFound;
        String againFounder;

        Boolean foundNameAgain = true;

        String[] namesArray = new String[] { "Damian", "Stanisław", "Karol", "Bartosz", "Dariusz", "Tomasz",
                "Daniel", "Jakub", "Wojciech", "Piotr"};

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        try
        {
            do
            {
                System.out.print("Enter array size: ");
                arraySize = scanner.nextInt();
                if (arraySize <= 0)
                {
                    System.out.println("Arrays size must be bigger then 0!");
                }
            } while (arraySize <= 0);

            String[] namesFilled = new String[arraySize];

            Random randomNumber = new Random();

            for (int i = 0; i < namesFilled.length; i++)
            {
                namesFilled[i] = namesArray[randomNumber.nextInt(0, namesArray.length)];
            }

            System.out.println("This are all names that has been generated:");
            int nameNumber = 1;
            for(String names : namesFilled)
            {
                System.out.println("Name number " + nameNumber + " is: " +names);
                nameNumber++;
            }
            do{
                foundNameCounter=0;
                foundNameAgain = true;

                System.out.print("Enter name to found and I will count how many times it has been found in random names array: ");
                nameToFound = scanner2.next();
                nameToFound = nameToFound.toUpperCase();

                for(int i = 0; i < namesFilled.length; i++){
                    namesFilled[i] = namesFilled[i].toUpperCase();
                }
                for(String names : namesFilled)
                {
                    if(names.equals(nameToFound)){
                        foundNameCounter++;
                    }
                }

                System.out.println("Name " + nameToFound + " has been found: " + foundNameCounter + " times in all generated names.");
                System.out.print("Do You want to found other name? (Y/N)");
                againFounder = scanner3.next();
                againFounder = againFounder.toUpperCase();
                if(againFounder.equals("N")){
                    foundNameAgain = false;
                }
            }while(foundNameAgain == true);
        }
        catch (Exception ex)
        {
            System.out.println("Something went wrong.");
        }
    }
}