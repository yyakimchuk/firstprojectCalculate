import java.util.Scanner;

/** @author Yaroslav Yakimchuk
 */
public class Base {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        Ввод первого дробного числа a
         */
        System.out.println("Введите первое число и нажмите Enter:");
        float a = scanner.nextFloat();
        /*
        Ввод второго дробного числа b
         */
        System.out.println("Введите второе число и нажмите Enter:");
        float b = scanner.nextFloat();
        /*
        Ввод оператора
         */
        System.out.println("Введите операцию(+)(-)(/)(*) и нажмите Enter:");
        String i = scanner.next();
        /*
        Выбор действия по оператору
         */
        if ((i).equals("+")){
            /**
             @param с Переменная суммы чисел
             */
            float c = a+b;
            System.out.printf("Сумма: %.4f",c);
            scanner.close();
        }
        if ((i).equals("-")){
            /**
             @param с Переменная разности чисел
             */
            float c = a-b;
            System.out.printf("Разность: %.4f",c);
            scanner.close();
        }
        if ((i).equals("/")){
            /**
             @param с Переменная деления чисел
             */
            float c = a/b;
            System.out.printf("Деление: %.4f",c);
            scanner.close();
        }
        if ((i).equals("*")){
            /**
             @param с Переменная произведения чисел
             */
            float c = a*b;
            System.out.printf("Произведение: %.4f",c);
            scanner.close();
        }
    }
}
