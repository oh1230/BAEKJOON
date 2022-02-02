import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] first = {sc.nextInt(), sc.nextInt()};
    int[] second = {sc.nextInt(), sc.nextInt()};
    int[] third = {sc.nextInt(), sc.nextInt()};

    int[] xy = new int[2];

    for (int i = 0; i < 2; i++) {
      if (first[i] == second[i]) {
        xy[i] = third[i];
      }
      else if (first[i] == third[i]) {
        xy[i] = second[i];
      }
      else {
        xy[i] = first[i];
      }
    }

    for (int i = 0; i < 2; i++) {
      System.out.println(xy[i]);
    }
  }
}
