public class Person {
  private String username;
  private String password;
  private String name;
  private String phoneNumber;
  private String emailAdress;
  Person() {
    this.username = "";
    this.password = "";
    this.name = "";
    this.phoneNumber = "";
    this.emailAdress = "";
  }
  Person(String username, String password, String name, String phoneNumber, String emailAdress) {
    this.username = username;
    this.password = password;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.emailAdress = emailAdress;
  }

  //Getters
  public String getUsername() {
    return username;
  }
  public String getPassword() {
    return password;
  }
  public String getName() {
    return name;
  }
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public String getEmailAdress() {
    return emailAdress;
  }

  // Setters
  public void setUsername(String username) {
    this.username = username;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public void setEmailAdress(String emailAdress) {
    this.emailAdress = emailAdress;
  }

  // public String toString() {
    //TO-DO
  // }
}
