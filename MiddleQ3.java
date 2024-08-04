import java.util.Scanner;
public class MiddleQ3 {
    /*
    Вводятся два числа (большее и меньшее). Определить, кратно ли первое число второму, то есть делится ли первое число нацело на второе. Вывести на экран сообщение об этом, а также остаток от деления, если первое число не кратно второму.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение");
        int first_number = scanner.nextInt();
        System.out.println("Введите второе значение");
        int second_number = scanner.nextInt();
        int firstresult = first_number/second_number;
        int secondresult = first_number%second_number;
        if (secondresult>0){
            System.out.println("Первое число не кратно второму и имеет остаток равный "+ secondresult);
            }else {
            System.out.println("Первое число кратно второму " +firstresult);
        }
        }
    }
