import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();

    int n = 1;
    int i = 1;

    while (true) {
      if (x <= n) {
        System.out.println(i);
        break;
      }
      else {
        n += i * 6;
        i++;
      }
    }
  }
}
