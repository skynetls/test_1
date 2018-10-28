import java.math.BigInteger;
import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение в двоичной системе счисления: ");
        String X = scanner.next();

        BigInteger b= new BigInteger(X,2);

        System.out.println("Перевод в десятичную систему счисления: " + b);

        scanner.close();
    }
}
