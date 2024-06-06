import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestCalculate {
  @ParameterizedTest
  @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
  void testAdd(int a, int b, int addResult, int diffResult, int multResult, String divResult) {
    Calculator calculator = new Calculator();
    Assertions.assertEquals(addResult, calculator.add(a, b));
  }
  @ParameterizedTest
  @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
  void testDiff(int a, int b, int addResult, int diffResult, int multResult, String divResult) {
    Calculator calculator = new Calculator();
    Assertions.assertEquals(diffResult, calculator.sub(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
  void testMult(int a, int b, int addResult, int diffResult, int multResult, String divResult) {
    Calculator calculator = new Calculator();
    Assertions.assertEquals(multResult, calculator.multiple(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
  void testDiv(int a, int b, int addResult, int diffResult, int multResult, String divResult) {
    Calculator calculator = new Calculator();
    Assertions.assertEquals(divResult, calculator.div(a, b));
  }

}
