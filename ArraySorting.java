import java.util.*;

public class ArraySorting {
    public static void main(String args[]) {
        ArrayList<NewStudent> arraylist = new ArrayList<NewStudent>();
        arraylist.add(new NewStudent(223, "James", 25));
        arraylist.add(new NewStudent(245, "Nik", 23));
        arraylist.add(new NewStudent(209, "Ben", 26));
        arraylist.add(new NewStudent(288, "Connor", 27));

        Collections.sort(arraylist);

        for (NewStudent stu : arraylist) {
            System.out.println(stu);
        }
        
    }
}
