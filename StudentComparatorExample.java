import java.util.Comparator;

public class StudentComparatorExample {
    private String studentName;
    private int studentId;
    private int studentAge;

    public StudentComparatorExample(int studentId, String studentName, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    // Comparator for sorting the list by Student Name 
    public static Comparator<StudentComparatorExample> sComparator = new Comparator<StudentComparatorExample>() {

        public int compare(StudentComparatorExample s1, StudentComparatorExample s2) {
            String StudentName1 = s1.getStudentName().toUpperCase();
            String StudentName2 = s2.getStudentName().toUpperCase();

            //ascending order
            return StudentName1.compareTo(StudentName2);

            // Descending order
            // return StudentName2.compareTo(StudentName1);

    }};

    // Comparator for sorting the list by roll no
    public static Comparator<StudentComparatorExample> sComparator2 = new Comparator<StudentComparatorExample>() {

        public int compare(StudentComparatorExample s1, StudentComparatorExample s2) {

            int studentId1 = s1.getStudentId();
            int studentId2 = s2.getStudentId();

            // Ascending order
            return studentId1-studentId2;

            // Descending order
            // return studentId2-studentId1;

    }};
    @Override
    public String toString() {
        return "[ studentId=" + studentId + ", name=" + studentName + ", age=" + studentAge + "]";
    }
}