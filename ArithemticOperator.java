package practice;

import java.util.Scanner;

public class ArithemticOperator  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int time = scanner.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time /60) /60;

        System.out.print(time + "는 ");
        System.out.print(hour + "시간, ");
        System.out.print(minute + "분, ");
        System.out.print(second + "초 ");
        scanner.close();

    }
}


