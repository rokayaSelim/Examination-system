import java.util.*;
public class Instructor extends Person {
  private int age;
  private List<Course> courses;
  Instructor() {
    super();
    this.courses = new ArrayList<Course>();
    this.age = 0;
  }
  Instructor(String username, String password,
             String name, String phoneNumber,
             String emailAdress, int age) {
    super(username, password, name, phoneNumber, emailAdress);
    this.age = age;
    this.courses = new ArrayList<Course>();
  }

  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }

  public void printCourses() {
    if(!courses.isEmpty()) {
      for(Course course : courses) {
        System.out.println(course.getCourseCode());
      }
    }
  }

  public void prepareExam(Exam exam) {
    //TO-DO
  }

  public void addExam(Exam exam) {
     //TO-DO 
  }

  public void addCourse(Course course) {
    this.courses.add(course);  
  }

  public void insertQuestion(Question question) {
  //   //To-Do
  }

  public void provideReport(Exam exam) {
  //   //To-Do
  }
  //
  public void rankQuestions(Student[] students) {
  //   //To-Do
  }

}
