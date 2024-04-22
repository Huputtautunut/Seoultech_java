public class Practice1 {
    public static void main(String[] args) {
        // Create two courses
        course course1 = new course("Math");
        course course2 = new course("Science");

        // Add three students to course1
        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        // Add four students to course2
        course2.addStudent("S1");
        course2.addStudent("S2");
        course2.addStudent("S3");
        course2.addStudent("S4");

        // Display number of students in each course
        System.out.println("Number of students in " + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        System.out.print("Students in " + course1.getCourseName() + ": ");
        displayStudents(course1);

        System.out.println("\nNumber of students in " + course2.getCourseName() + ": " + course2.getNumberOfStudents());
        System.out.print("Students in " + course2.getCourseName() + ": ");
        displayStudents(course2);

        // Drop one student from course1 and display
        course1.dropStudent("Peter Jones");
        System.out.println("\nNumber of students in " + course1.getCourseName() + " after dropping a student: " + course1.getNumberOfStudents());
        System.out.print("Students in " + course1.getCourseName() + " after dropping a student: ");
        displayStudents(course1);

        // Clear course1 and display
        course1.clear();
        System.out.println("\nNumber of students in " + course1.getCourseName() + " after clearing: " + course1.getNumberOfStudents());

        // Drop one student from course2 and display
        course2.dropStudent("S2");
        course2.dropStudent("S1");
        System.out.println("Number of students in " + course2.getCourseName() + " after dropping a student:" + course2.getNumberOfStudents());
        System.out.print("Students in " + course2.getCourseName() + " after dropping ");
        displayStudents(course2);

        // Clear course2 and display
        course2.clear();
        System.out.println("\nNumber of students in " + course2.getCourseName() + " after clearing: " + course2.getNumberOfStudents());
    }

    // Helper method to display students
    public static void displayStudents(course course) {
        String[] students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(students[i]);
            if (i < course.getNumberOfStudents() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}