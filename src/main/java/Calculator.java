public class Calculator {
  public int add(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  public int multiple(int a, int b) {
    return a * b;
  }

  public String div(int a, int b){
    if (b == 0) {
      return "undefined";
    }
    return String.valueOf(a * 1.0 / b);
  }

}
