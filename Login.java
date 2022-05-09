import java.util.HashMap;

public class Login {

  private HashMap<String, String> loginInfo = new HashMap<String, String>();
  private Admin admin; 

  Login() {
    this.admin = new Admin("admin", "password");
  }

  Login(HashMap<String,String> loginInfoOrig) {
    loginInfo = loginInfoOrig;
    this.admin = new Admin("admin", "password");
  }



  public boolean validateUser(String username, String password) {
    //loop over the map and checking if the user provided the right username and password
    for (HashMap.Entry<String, String> entry : loginInfo.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
      if(entry.getKey().equals(username) && entry.getValue().equals(password)){
        return true;
      }
    }
    return false;
  }

  public boolean validateAdmin(String username, String password) {
    if(admin.getUsername() == username && admin.getPassword() == password) {
      return true;
    }
    return false;
  }

  public void addInfo(Person user) {
    loginInfo.put(user.getUsername(), user.getPassword());
    System.out.println(loginInfo.get("omar7"));
  }

}
