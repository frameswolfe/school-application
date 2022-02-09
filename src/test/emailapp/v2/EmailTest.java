package test.emailapp.v2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import main.emailapp.v2.Email;

public class EmailTest {

  Email testEmail = new Email("James", "Wolfe");

  @Test
  void emailCreatedInCorrectFormat() {
    assertEquals("james.wolfe@enfieldgrammar.co.uk", testEmail.email);
  }

  // @Test
  // void passwordGeneratedWithEightCharacters() {
  //   assertEquals(8, testEmail.getPassword().length());
  // }
}
