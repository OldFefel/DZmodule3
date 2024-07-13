import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
        Необходимо посчитать зарплату рабочего за месяц. На консоль вводится, сколько дней в месяце было отработано, дальше вводится вещественное число — зарплата за день. Нужно вывести зарплату рабочего за весь месяц. Например, если в месяце было отработано 10 дней, а зарплата в день была 5500.25 рублей, то программа должна вывести в результате — 55002.5
         */
        System.out.println("Введите количество отработаных дней");
                Scanner scanner = new Scanner(System.in);
             int a = scanner.nextInt();
        //колво отработаных дней
        System.out.println("Введите дневной доход");
        int b = scanner.nextInt();
        //дневная зп
int result= a * b;
                System.out.println("Ежемесячная зарпалата:" + result);
    }
}