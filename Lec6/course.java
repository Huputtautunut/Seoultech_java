public class course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public course(String courseName) {
        this.courseName = courseName;
        students = new String[1]; // Initial size of the array
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            // Increase the array size
            String[] newStudents = new String[students.length * 2];
            System.arraycopy(students, 0, newStudents, 0, students.length);
            students = newStudents;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            // Shift elements to remove the student
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            numberOfStudents--;
        }
    }

    public void clear() {
        // Simply reset the number of students to 0
        numberOfStudents = 0;
    }

    public String[] getStudents() {
        String[] currentStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, currentStudents, 0, numberOfStudents);
        return currentStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
