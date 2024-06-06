public class Demo {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }


  public boolean isPrimeNumber(int input) {
    if (input < 2) {
      return false;
    }
    for (int i = 2; i < input; i++) {
      if (input % i == 0)
        return false;
    }
    return true;
  }
}
