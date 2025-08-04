import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int [] salary = {20000, 30000, 40000, 50000};
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача 2");

        int max = salary[0];
        int min = salary[0];
        for (int i : salary) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. \nМаксимальная сумма трат за неделю составила " + max + " рублей.");

        System.out.println("Задача 3");

        double averageNumber = salary [0];
        for (int i = 0; i < salary.length; i++) {
            if (averageNumber > 0) {
                averageNumber = sum / 4;
            }
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageNumber + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char buff = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = buff;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}