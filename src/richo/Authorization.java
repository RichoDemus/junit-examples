package richo;

public class Authorization {
  boolean isAdmin(User user) {
    if (user.role.equals("admin")) {
      return true;
    } else {
      return false;
    }
  }
}
