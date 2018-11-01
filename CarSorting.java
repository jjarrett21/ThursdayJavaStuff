import java.util.List;
import java.util.*;


public class CarSorting {
    public static void main(String args[]) {
        // Scanner scan = new Scanner(System.in); 
        Scanner scan = new Scanner(System.in);
        List<Cars> list = new ArrayList<>();
        int listSize;
        String make;
        String model;
        int year;
        
        System.out.println("Please enter the size of your list");
        listSize = scan.nextInt();
        System.out.println("Your array size is " + listSize);

        for(int i=0; i<listSize; i++) {
            System.out.println("Please enter the year of the vehicle ");
            year = scan.nextInt();

            System.out.println("Please enter the make of the vehicle ");
            make = scan.next();
            scan.nextLine();

            System.out.println("Please enter the model of the vehicle ");
            model = scan.nextLine();

            list.add(new Cars(make, model, year));
            
        }
        scan.close();

        // Sorting based on make
        System.out.println("Car Make Sorting");
        Collections.sort(list, Cars.makeSort);

        for (Cars c : list) {
            System.out.println(c);
        }

        // Sorting based on model
        System.out.println("Car Model Sorting");
        Collections.sort(list, Cars.modelSort);

        for (Cars c : list) {
            System.out.println(c);
        }

        // Sorting based on year
        System.out.println("Car Year Sorting");
        Collections.sort(list, Cars.yearSort);

        for (Cars c : list) {
            System.out.println(c);
        }

    }
    
}