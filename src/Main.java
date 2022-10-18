import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static Integer square(Integer value) {
        Integer result = value * value;
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        /*
        String name = "Макс";
        Integer age = 29;
        Float height = 186.6F;
        Boolean student = true;
        System.out.println("Hello, " + name + "!");
        System.out.println("age:" + age);
        System.out.println("height:" + height);
        System.out.println("student:" + student);

        String value_1 = "13";
        String value_2 = "23";
        System.out.println(Integer.parseInt(value_1) + Integer.parseInt(value_2));
        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите свое имя: ");
        String name_1 = scanner.nextLine();
        System.out.print("Укажите свой возраст: ");
        Integer age_1 = scanner.nextInt();
        System.out.print("Вы студент? ");
        Boolean student_1 = scanner.nextBoolean();
        System.out.println("Hello, " + name_1 + "!");
        System.out.println("age:" + age_1);
        System.out.println("student:" + student_1);

        File file = new File("src/text.txt");
        Scanner scanner_1 = new Scanner(file);
        System.out.println(scanner_1.nextLine());
        System.out.println(scanner_1.nextLine());
        */
        /*
        String value_3 = "Привет";
        String value_4 = "Друг";
        Formatter formatter = new Formatter();
        formatter.format("%s %s.", value_3, value_4);
        System.out.printf("%s %s.", value_3, value_4);
        System.out.println(formatter);

        String value = "Привет Дорогой Друг";
        System.out.println(value.substring(7));
        System.out.println(value.substring(7, 14));
        System.out.println(value.indexOf("Дорогой"));
        System.out.println(value.lastIndexOf("о"));
        System.out.println(value.replace("Дорогой", "мой"));
        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        Integer int_value = scanner.nextInt();
        if (int_value % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
        if (int_value < 0) {
            System.out.println("Отрицательное");
        } else if (int_value > 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Ноль");
        }
        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        Integer int_value = scanner.nextInt();

        if (int_value % 4 == 0 && int_value % 100 != 0 || int_value % 400 == 0) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
        */
        /*
        Integer[] int_arr = {12, 4, 32, 6, 32};
        System.out.println(int_arr[2]);
        int_arr[2] = -1;
        System.out.println(int_arr[2]);

        for(int i = 0; i < int_arr.length; i++) {
            System.out.println(int_arr[i]);
        }
        */
        System.out.println(square(12));
    }
}
