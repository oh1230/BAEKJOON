import java.util.Scanner;

public class Main {
  public static int fac (int n) {
    if (n <= 1) {
      return 1;
    }
    else {
      n *= fac(n-1);
      return n;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int sum = fac(N);

    System.out.println(sum);
  }
}
