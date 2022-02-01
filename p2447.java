import java.util.Scanner;
import java.util.Arrays;

public class Main {
  static char ary[][];

  public static void star (int N, int x, int y) {
    int n = N / 3;
    if (N == 1) {
      ary[x][y] = '*';
      return;
    }
    else {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (i == 1 && j == 1) {
            continue;
          }
          else {
            star(n, x + (n * i), y + (n * j));
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    ary = new char[N][N];

    // 初期値
    for (int i = 0; i < ary.length; i++) {
      Arrays.fill(ary[i],' ');
    }

    star (N, 0, 0);

    for (int i = 0; i < N; i++) {
      System.out.println(ary[i]);
    }
  }
}
