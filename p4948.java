import java.util.Scanner;

public class Main {
  public static boolean prime (int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int n = sc.nextInt();
      int count = 0;

      if (n == 0) {
        break;
      }
      else {
        for (int i = n+1; i <= 2 * n; i++) {
          if (prime(i)) {
            count++;
          }
          else {
            continue;
          }
        }
      }
      System.out.println(count);
    }
  }
}
