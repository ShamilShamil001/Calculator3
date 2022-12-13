import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt(); // Просим вывести первое число // вызываем метод getInt
        int num2 = getInt(); // Просим вывести второе число // вызываем метод getInt
        char operation = getOperation(); // Просим ввести операцию
        int result = calc(num1, num2, operation); // Считаем
        System.out.println("Результат: " +result); // Выводим результат
    }
    public static int getInt() {
        System.out.println("Введите число:");
        if (scanner.hasNextInt()){
            return scanner.nextInt();
        } else {
            System.out.println("Ошибка!");
            scanner.next();
            return getInt();
        }
    }
    public static char getOperation() {
        System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить");
        int operationNumber = 0;
        if (scanner.hasNextInt()) {
            operationNumber = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не число! Повторите ввод!");
            scanner.next();
            return getOperation();
        }
        switch (operationNumber) {
            case 1 :
                return '+';
            case 2 :
                return '-';
            case 3 :
                return '*';
            case 4 :
                return '/';
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOperation();
        }
    }
    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation){
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка! Повторите ввод!");
                result = calc(num1, num2, getOperation());
        }

        return result;
    }

}