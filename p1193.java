import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int X = sc.nextInt();

    int n = 1;
    int plus = 2;

    while (true) {
      if (X <= n) {
        if (plus % 2 == 0) {
          System.out.println((n - X + 1) + "/" + (plus - (n - X + 1)));
        }
        else {
          System.out.println((plus - (n - X + 1)) + "/" + (n - X + 1));
        }
        break;
      }
      else {
        n += plus;
        plus++;
      }
    }
  }
}
