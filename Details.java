import java.util.*;

public class Details {

    public static void main(String args[]) {
        ArrayList<StudentComparatorExample> arrayList = new ArrayList<>();
        arrayList.add(new StudentComparatorExample(101, "James", 25));
        arrayList.add(new StudentComparatorExample(505, "Nik", 23));
        arrayList.add(new StudentComparatorExample(800, "Ben", 26));

        // Sorting based on student name 
        System.out.println("Student Name Sorting");
        Collections.sort(arrayList, StudentComparatorExample.sComparator);

        for (StudentComparatorExample str : arrayList) {
            System.out.println(str);
        }

        // Sorting on id property
        System.out.println("Id Sorting: ");
        Collections.sort(arrayList, StudentComparatorExample.sComparator2);
        for (StudentComparatorExample str2 : arrayList) {
            System.out.println(str2);
            
        }
    }
}