import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int[] tri = new int[3];
      for (int i = 0; i < 3; i++) {
        tri[i] = sc.nextInt();
      }
      if (tri[0] == 0 && tri[1] == 0 && tri[2] == 0) {
        break;
      }
      else {
        int a = tri[0] * tri[0];
        int b = tri[1] * tri[1];
        int c = tri[2] * tri[2];

        if (a + b == c || a + c == b || b + c == a) {
          System.out.println("right");
        }
        else {
          System.out.println("wrong");
        }
      }
    }
  }
}
