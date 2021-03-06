package study.step3;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public int enterNumberOfCars() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public int enterNumberOfAttempts() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        int numberOfAttempts = scanner.nextInt();
        System.out.println();
        return numberOfAttempts;
    }
}
