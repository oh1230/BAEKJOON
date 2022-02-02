import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      int n = sc.nextInt();

      int x = n / 2;
      int y = n / 2;

      while (true) {
        if (prime(x) && prime(y)) {
          System.out.println(x + " " + y);
          break;
        }
        x--;
        y++;
      }
    }
  }

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
}
