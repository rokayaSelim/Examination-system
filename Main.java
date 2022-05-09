import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<Student>();
    List<Instructor> instructors = new ArrayList<Instructor>();
    Admin admin = new Admin();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to Mini-LMS");
    System.out.println("Enter a) Admin  u) User");
    String str = scanner.next();
    if(str.toLowerCase().equals("a")) {
      loginAdmin(admin);
    }
    // System.out.println(admin.getPassword());
    else if(str.toLowerCase().equals("u")) {
      Student student  = new Student();
      signUpStudent(student);
      students.add(student);
    }
    System.out.println(admin.getUsername());
    Student student = new Student("omar77","123","Omar Magdy", "12345", "omar77@gmail.com", 1900884);
    Course course1 = new Course(123, "CSE224");
    List<Course> courses = new ArrayList<Course>();
    Instructor instructor = new Instructor("khalil77", "1234", "Khalil", "12345","Khalil@gmail.com", 52);
    System.out.println(instructor.getName());
    instructor.addCourse(course1);
    instructor.printCourses();
  }

public static void loginAdmin(Admin admin){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter your username and password");
      System.out.print("Username: ");
      String username = scanner.next();
      admin.setUsername(username);
      char password[] = null;
      try {
         password = PasswordField.getPassword(System.in, "Password: ");
      } catch(IOException ioe) {
         ioe.printStackTrace();
      }
      if(password == null ) {
         System.out.println("No password entered");
      } else {
         admin.setPassword(String.valueOf(password));
      }
}

public static void signUpStudent(Student student){
      Scanner scanner = new Scanner(System.in);
      Scanner scanner2 = new Scanner(System.in);
      System.out.println("Please enter your username and password");
      System.out.print("Username: ");
      String username = scanner.next();
      student.setUsername(username);
      char password[] = null;
      try {
         password = PasswordField.getPassword(System.in, "Password: ");
      } catch(IOException ioe) {
         ioe.printStackTrace();
      }
      if(password == null ) {
         System.out.println("No password entered");
      } else {
         student.setPassword(String.valueOf(password));
      }
      System.out.println("Please enter the following data");
      System.out.print("Name: ");
      String name = scanner.next();
      student.setName(name);
      System.out.print("Phone number: ");
      String phoneNumber = scanner2.next();
      student.setPhoneNumber(phoneNumber);          
      System.out.print("Email adress: ");
      String emailAdress = scanner2.next();
      student.setEmailAdress(emailAdress);
      System.out.print("id: ");
      int id = scanner2.nextInt();
      student.setId(id);
}

}
