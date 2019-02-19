package richo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// En testklass för Calculator, dvs en klass som testar klassen calculator.
// I regel så testar man inte 2 klasser på en gång, utan varje för sig
public class CalculatorTest {

  // en testmetod som testar en sak. vi skulle ju kunnda testa både addition och subtraktion här
  // men man skriver hellre många små testmetoder än en stor
  @Test
  public void shouldAddOneAndTwo() {
    // Här instansierar vi klassen vi vill testa
    final Calculator calc = new Calculator();

    // Vi anropar metoden vi vill testa och sparar världet i en variabel
    final int result = calc.add(1, 2);

    // Vi använder assertEquals för att testa ifall vi fick det värdet vi förväntade oss
    assertEquals("1 + 2 ska bli 3", 3, result);
  }

  @Test
  public void shouldSubtract5From10() {
    final Calculator calc = new Calculator();

    final int result = calc.subtract(10, 5);

    assertEquals("10 - 5 ska bli 5", 5, result);

  }
}
