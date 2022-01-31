import java.util.Scanner;

public class Main {
  public static int apt (int k, int n) {
    int[][] apt = new int[k+1][n+1];

    for (int i = 0; i <= k; i++) {
      apt[i][1] = 1;
    }
    for (int i = 0; i <= n; i++) {
      apt[0][i] = i;
    }

    for (int i = 1; i <= k; i++) {
      for (int j = 2; j <= n; j++) {
        apt[i][j] = apt[i-1][j] + apt[i][j-1];
      }
    }
    return apt[k][n];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      int k = sc.nextInt();
      int n = sc.nextInt();

      System.out.println(apt(k,n));
    }
  }
}
