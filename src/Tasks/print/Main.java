package Tasks.print;

import java.util.Scanner;

public class Main {
    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Санды киргизиңиз: ");
        int num = scanner.nextInt();

        int result = addDigits(num);
        System.out.println("Жыйынтык: " + result);
    }
}