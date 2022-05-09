public class Student extends Person {
  private int id;
  Student() {
    super();
    this.id = 0000000;
  }
  Student(String username, String password, String name,
          String phoneNumber, String emailAdress, int id) {
    super(username, password, name, phoneNumber, emailAdress);
    this.id = id;
  } 

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void giveExam() {
    //TO-DO
  }

  public void checkResult() {
    //TO-DO
  }
}
