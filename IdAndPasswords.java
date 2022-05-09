import java.util.HashMap;

public class IdAndPasswords {
  HashMap<String, String> idAndPasswords = new HashMap<String, String>();

  IdAndPasswords() {
    idAndPasswords.put("omar77", "12345");
  }

  public HashMap<String, String> getLoginInfo() {
    return idAndPasswords;
  }


  public void appendUser(Person user) {
    idAndPasswords.put(user.getUsername(), user.getPassword());
  }

}
