import java.util.Date;
public class Exam {
  private int id;
  private String courseCode;
  private String instructorName;
  private float Duration;
  private float startTime;
  private float endTime;
  private Question[] questions;
  private float mark;
  // private Date date;
  private boolean validationStatus;


  Exam(int id, String courseCode ,String instructorName,
      float Duration, float startTime,float endTime, 
      Question[] questions, float mark,
      boolean validationStatus) {
      this.id = id;
      this.courseCode = courseCode;
      this.instructorName = instructorName;
      this.Duration = Duration;
      this.startTime = startTime;
      this.endTime = endTime;
      // this.date = date;
      this.validationStatus = validationStatus;
      this.mark = mark;
      for(int i = 0; i < questions.length; i++) {
        this.questions[i] = questions[i];
      }
  }

  public int getId() {
    return id;
  }

  public String getCourseCode() {
    return courseCode;
  }
  
  public String getInstructorName() {
    return instructorName;
  }

  public float getDuration() {
    return Duration;
  }

  // public Date getDate() {
  //   return date;
  // }

  public float getStartTime() {
    return startTime;
  }

  public float getEndTime() {
    return endTime;
  }

  public float getMark() {
    return mark;
  }

  public void setMark(float mark) {
    this.mark = mark;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  // public float calculateGrade(Question[] questions) {
    //TO-DO
  // }





}
