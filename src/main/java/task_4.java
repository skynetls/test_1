import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Объявляем переменную X
        System.out.print("Введите значение X: ");
        float X = scanner.nextFloat();

        //Объявляем переменную Y
        System.out.print("Введите значение Y: ");
        float Y = scanner.nextFloat();

        //Объявляем переменную Z
        System.out.print("Введите значение Z: ");
        float Z = scanner.nextFloat();

        // Находим среднего арифметического значения X, Y и Z
        float n = (X + Y + Z)/3;
        System.out.println("Среднее арифметическое значение: " + n);

        //Делим на 2 без остатка
        float i = n/2;
        int result = Math.round(i);
        System.out.println("Деление среднего арифметического без остатка: " + result);

        //Если результат больше 3, то выводим "Программа выполнена корректно"
        if (i > 3) {
            System.out.println("Программа выполнена корректно");
        }

        //Если результат равен или меньше 3, то выводим "Попробуйте еще раз"
        else {
            System.out.println("Попробуйте еще раз");
        }

        scanner.close();
    }
}
