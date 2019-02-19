package richo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuthorizationTest {

  @Test
  public void shouldAllowUppercaseAdmin() {
    final Authorization authorization = new Authorization();

    final User user = new User("richo", "ADMIN", "asd");

    final boolean result = authorization.isAdmin(user);

    // detta kommer misslyckas eftersom vi inte ser ADMIN som admin
    assertTrue("en användare som är ADMIN ska vara admin", result);
  }
}