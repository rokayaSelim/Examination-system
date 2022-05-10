import java.util.*; import java.io.*;

class Main {
  public static Login login  = new Login();
  public static List<Student> students = new ArrayList<Student>();
  public static List<Instructor> instructors = new ArrayList<Instructor>();
  public static IdAndPasswords info = new IdAndPasswords();
  public static void main(String[] args) {
    System.out.println("Welcome to Mini-LMS");
    while(true) {
      System.out.println("A) Admin  U) User");
      Admin admin = new Admin();
      Scanner scanner = new Scanner(System.in);
      String str = scanner.next();
      if(str.toLowerCase().equals("a")) {
        loginAdmin();
      }
      else if(str.toLowerCase().equals("u")) {
        //Either the user will Signup or Signin
        System.out.println("ss) Sign-up as a student  si) Signup as Instructor ls) Login as a student li) Login as instructor");
        String sign = scanner.next();
        if(sign.toLowerCase().equals("ss")) {
          Student student = new Student();
          signUp(student);
        }
        if(sign.toLowerCase().equals("si")) {
          Instructor instructor = new Instructor();
          signUp(instructor);
        }
        if(sign.toLowerCase().equals("li")) {
          Instructor instructor = new Instructor();
          loginUser(instructor);
        }
        else if(sign.toLowerCase().equals("ls")) {
          Student student = new Student();
          loginUser(student);
        }
      }
    }
  }

public static void loginAdmin(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your username and password");
    System.out.print("Username: ");
    String username = scanner.next();
    System.out.print("Password: ");
    String pass = scanner.next();
    login.validateAdmin(username, pass);
    //To-DO
    //You should prompt the admin to sendresult() or logout if validation was sucssesfull
}

public static void signUp(Person user){
    if(user instanceof Student) {
      Scanner scanner = new Scanner(System.in);
      Scanner scanner2 = new Scanner(System.in);
      System.out.println("Please enter your username and password");
      System.out.print("Username: ");
      String username = scanner.next();
      user.setUsername(username);
      System.out.print("Password: ");
      String pass = scanner.next();
      user.setPassword(pass);
      System.out.println("Signup process was done sucssesfully");
      System.out.println("Please enter the following data");
      System.out.print("Name: ");
      String name = scanner.next();
      user.setName(name);
      System.out.print("Phone number: ");
      String phoneNumber = scanner2.next();
      user.setPhoneNumber(phoneNumber);         
      System.out.print("Email adress: ");
      String emailAdress = scanner2.next();
      user.setEmailAdress(emailAdress);
      System.out.print("id: ");
      int id = scanner2.nextInt();
      ((Student)user).setId(id);
      students.add((Student)user);
      info.appendUser(user);
      login.addInfo(info.getLoginInfo());
    }
    else if(user instanceof Instructor) {
      Scanner scanner = new Scanner(System.in);
      Scanner scanner2 = new Scanner(System.in);
      System.out.println("Please enter your username and password");
      System.out.print("Username: ");
      String username = scanner.next();
      user.setUsername(username);
      System.out.print("Password: ");
      String pass = scanner.next();
      user.setPassword(pass);
      System.out.println("Please enter the following data");
      System.out.print("Name: ");
      String name = scanner.next();
      user.setName(name);
      System.out.print("Phone number: ");
      String phoneNumber = scanner2.next();
      user.setPhoneNumber(phoneNumber);         
      System.out.print("Email adress: ");
      String emailAdress = scanner2.next();
      user.setEmailAdress(emailAdress);
      System.out.print("Age: ");
      String age = scanner2.next();
      ((Instructor)user).setEmailAdress(emailAdress);
      instructors.add((Instructor)user);
      info.appendUser(user);
      login.addInfo(info.getLoginInfo());
    }
}


public static void loginUser(Person user){
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Please enter your username and password");
    System.out.print("Username: ");
    String username = scanner.next();
    user.setUsername(username);
    System.out.print("Password: ");
    String pass = scanner.next();
    user.setPassword(pass);
    if(login.validateUser(username, pass)) {
      System.out.println("User exists and can login");
    }
    else{
      System.out.println("User dosen't exist");
    }
    //To-DO
    // You should prompt the user to choose between all the things he can do 
    //if the user is a Student you should prompt him to use his functions(giveExam(), checkResult()) or logout
    if(user instanceof Student) {
      //To-DO
    }
    //if the user is an Instructor you should prompt him to use his functions(addExam(), addCourse(), etc..) or logout
    else if(user instanceof Instructor) {
      //To-DO
    }
}
    
}
