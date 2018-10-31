import java.util.*;

public class FullArrayEx {
    public static void main(String[] args) {
        
        // Creating the array list of type String 
        ArrayList<String> obj = new ArrayList<String>();

        // adding elements to the array 
        obj.add("McLaren");
        obj.add("Koenseggig");
        obj.add("Ferrari");
        obj.add("Tesla");
        obj.add("BMW");

        // Display Elements of this list 
        System.out.println("Original ArrayList: ");
        for (String str : obj) {
            System.out.println(str);
        }

        // Add an element
        obj.add(0, "Mercedes");
        obj.add(1, "Lexus");

        // Display New Elements
        System.out.println("ArrayList after added values: ");
        for (String str : obj) {
            System.out.println(str);
            
        }

        
        

    }
}

