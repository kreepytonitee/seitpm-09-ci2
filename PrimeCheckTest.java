import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23);

    for (int prime : primes) {
      assertEquals("Test prime number " + prime, true, PrimeCheck.isPrime(prime));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    List<Integer> nonPrimes = Arrays.asList(0, 1, 4, 6, 8, 9, 10, 12, 14);

    for (int nonPrime : nonPrimes) {
      assertEquals("Test non-prime number " + nonPrime, false, PrimeCheck.isPrime(nonPrime));
    }
  }
}
