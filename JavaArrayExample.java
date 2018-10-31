import java.util.*;

class JavaArrayExample {
    public static void main(String args[]) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("James");
        alist.add("Nik");
        alist.add("Connor");
        alist.add("Ben");
        alist.add("House");
        alist.add("Michael");
        alist.add("Ron");

        // Display elements
        System.out.println(alist);

        // Adding someone at position 4
        alist.add(3, "Pennywise");

        // Re-displaying elements
        System.out.println(alist);
    }
}