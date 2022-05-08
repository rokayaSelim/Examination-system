import java.util.List;
public class Course { 
  private int id;
  private String courseCode;
  private Instructor instructor = new Instructor();

  Course() {
    this.id = 0;
    this.courseCode = "";
  }
  
  Course(int id, String courseCode) {
    this.id = id;
    this.courseCode = courseCode;
  }

  public int getId() {
    return id;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public Instructor getInstructor() {
    return instructor;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public void setInstructor(Instructor instructor) {
    this.instructor = instructor;
  }


}
