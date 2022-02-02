import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int M = sc.nextInt();
    int N = sc.nextInt();

    boolean prime[] = new boolean[N+1];

    for (int i = 0; i < N+1; i++) {
      prime[i] = true;
    }

    prime[0] = false;
    prime[1] = false;

    for (int i = 2; i <= Math.sqrt(N+1); i++) {
      for (int j = i*i; j < N+1; j += i) {
        prime[j] = false;
      }
    }

    for (int i = M; i < N+1; i++) {
      if (prime[i] == true) {
        System.out.println(i);
      }
    }
  }
}
