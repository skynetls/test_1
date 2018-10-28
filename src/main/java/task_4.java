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

        /* Находим среднего арифметического значения X, Y и Z
        Результат ограничиваем четырьмя знаками после запятой */
        float n = (X + Y + Z)/3;
        System.out.println("Среднее арифметическое значение: " + n);

        //Делим на 2 без остатка
        float i = n/2;
        int result = (int)Math.round(i);
        System.out.println("Деление среднего арифметического без остатка: " + result);

        if (i > 3) {
            System.out.println("Программа выполнена корректно");
        }

        else {
            System.out.println("Попробуйте еще раз");
        }

        scanner.close();
    }
}
