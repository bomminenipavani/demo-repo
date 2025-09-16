import Student;

package third_operators;
public class studenttask1 {
    public static void main(String[] args) {
        int id = 1;
        String name = "ganesh";
        int age = 20;
        double quizscore = 60;
        double Assignmentscore = 70;
        double examscore = 80;
        int attendancedays ;
        int totaldays;
        System.out.println("id=1");
        System.out.println("name = ganesh");
        System.out.println("age = 20");
        System.out.println("quizscore = 60");
        System.out.println("Assigmentscore = 70");
        System.out.println("examscore = 80");
        System.out.println("attendancedays = 70%");
        System.out.println("totaldays = 100");

        public class Student {
    // Attributes
    int id;
    String name;
    int age;
    String course;
        

    // Constructor
    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Student ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);
    }

    // Main method with example
    public static void main(String[] args) {
        Student s1 = new Student(101, "RiyaSharma", 20, "ComputerScience");
        s1.displayInfo();
    }
}


        // Example student data
        String studentName = "ganesh";
        int marks = 75;

        // Check pass or fail
        if (marks >= 40) {
            System.out.println(studentName + " has PASSED with " + marks + " marks.");
        } else {
            System.out.println(studentName + " has FAILED with " + marks + " marks.");
        }




        
    }
    

