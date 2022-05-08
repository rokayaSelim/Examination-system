import java.util.*;

class Main {
  public static void main(String[] args) {
    Student student = new Student("omar77","123","Omar Magdy", "12345", "omar77@gmail.com", 1900884);
    Course course1 = new Course(123, "CSE224");
    List<Course> courses = new ArrayList<Course>();
    Instructor instructor = new Instructor("khalil77", "1234", "Khalil", "12345","Khalil@gmail.com", 52);
    System.out.println(instructor.getName());
    instructor.addCourse(course1);
    instructor.printCourses();
  }
}
