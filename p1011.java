import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();	// 테스트 케이스

		for(int i = 0; i < T; i++) {

			int X = sc.nextInt();
			int Y = sc.nextInt();

			int distance = Y - X;	// 거리

			int max = (int)Math.sqrt(distance);	// 소수점 버림

      int count = 0; // 작동 횟수

			if(max == Math.sqrt(distance)) {
				count = max * 2 - 1;
			}
			else if(distance <= max * max + max) {
				count = max * 2;
			}
			else {
				count = max * 2 + 1;
			}
      System.out.println(count);
		}
	}
}
