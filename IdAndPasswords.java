import java.util.HashMap;

public class IdAndPasswords {
  //A map containing all users usernames and password
  HashMap<String, String> idAndPasswords = new HashMap<String, String>();

  public HashMap<String, String> getLoginInfo() {
    return idAndPasswords;
  }


  public void appendUser(Person user) {
    idAndPasswords.put(user.getUsername(), user.getPassword());
  }

}
