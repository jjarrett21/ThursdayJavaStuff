public  class NewStudent implements Comparable {
    private String studentName;
    private int rollNo;
    private int studentAge;

    public NewStudent(int rollNo, String studentName, int studentAge) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public int comprareTo(NewStudent comparestu) {
        int compareage=((NewStudent)comparestu).getStudentAge();

        return this.studentAge-compareage;
    }

    @Override
    public String toString() {
        return "[ rollno=" + rollNo + ", name=" + studentName + ", age=" + studentAge + "]";
    }
}
