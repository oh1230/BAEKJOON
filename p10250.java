import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); //테스트

    for (int i = 0; i < T; i++) {
      int H = sc.nextInt();
      int W = sc.nextInt();
      int N = sc.nextInt();

      int floor;
      int steps;
      int roomNum;

      if (N % H == 0) {
        floor = H * 100;
        steps = N / H;
      }
      else {
        floor = (N % H) * 100;
        steps = (N / H) + 1;
      }
      roomNum = floor + steps;

      System.out.println(roomNum);
    }
  }
}
