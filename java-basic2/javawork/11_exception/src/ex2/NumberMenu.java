package ex2;

import java.util.Scanner;

public class NumberMenu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        NumberController controller = new NumberController();

        try {
            System.out.print("정수1: ");
            int num1 = scanner.nextInt();

            System.out.print("정수2: ");
            int num2 = scanner.nextInt();

            boolean result = controller.check(num1, num2);
            System.out.println(num1 + "은(는) " + num2 + "의 배수인가? " + result);
        } catch (NumRangeException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("올바른 정수를 입력하세요.");
        }
    }
}

