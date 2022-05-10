import java.util.HashMap;

public class Login {

  //A Map that will contain all users username and password
  private HashMap<String, String> loginInfo = new HashMap<String, String>();

  private Admin admin; 

  Login() {
    //Intializing admin account
    this.admin = new Admin("admin", "password");
  }

  Login(HashMap<String,String> loginInfoOrig) {
    loginInfo = loginInfoOrig;
    this.admin = new Admin("admin", "password");
  }



  //Checks if the user entered the right username and password
  public boolean validateUser(String username, String password) {
    //loop over the map and checking if the user provided the right username and password
    for (HashMap.Entry<String, String> entry : loginInfo.entrySet()) {
      if(entry.getKey().equals(username) && entry.getValue().equals(password)){
        return true;
      }
    }
    return false;
  }

  //Checks if the admin entered the right username and password
  public boolean validateAdmin(String username, String password) {
    if(admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
      System.out.println("Now you are looged in as admin");
      return true;
    }
    return false;
  }

  public void addInfo(HashMap<String, String> loginInfoOrig) {
    loginInfo = loginInfoOrig;
  }

}
