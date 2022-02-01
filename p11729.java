import java.util.Scanner;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int count = 0;

  public static void hanoi (int n, int a, int b, int c) {
    if (n == 1) {
      sb.append(a + " " + c + "\n");
    }
    else {
      hanoi(n-1,a,c,b);
      sb.append(a + " " + c + "\n");
      hanoi(n-1,b,a,c);
    }
    count++;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    hanoi(N,1,2,3);

    System.out.println(count);
    System.out.println(sb);
  }
}
