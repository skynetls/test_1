import java.math.BigInteger;
import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Объявляем переменную X
        System.out.print("Введите значение X: ");
        String X = scanner.next();

        BigInteger b= new BigInteger(X,2);

        System.out.println("Перевод в десятичную систему исчисления: " + b);

        scanner.close();
    }
}
