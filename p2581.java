import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int M = sc.nextInt();
    int N = sc.nextInt();

    int count = 0;
    int min = 0;
    int sum = 0;

    for (int i = M; i <= N; i++) {
      boolean isPrime = true;
      if (i == 1) {
        continue;
      }
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          isPrime = false;
        }
      }
      if (isPrime) {
        count++;
        sum += i;
        if (count == 1) {
          min = i;
        }
      }
    }

    if (count == 0) {
      System.out.println(-1);
    }
    else {
      System.out.println(sum);
      System.out.println(min);
    }
  }
}
