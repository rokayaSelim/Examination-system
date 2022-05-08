public class Student extends Person {
  private int id;
  Student(String username, String password, String name,
          String phoneNumber, String emailAdress, int id) {
    super(username, password, name, phoneNumber, emailAdress);
    this.id = id;
  } 

  public int getId() {
    return id;
  }

  public void giveExam() {
    //TO-DO
  }

  public void checkResult() {
    //TO-DO
  }
}
