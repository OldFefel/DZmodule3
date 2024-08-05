import java.util.Scanner;
public class MiddleQ1 {
    public static void main(String[] args) {
        /*
        Определить, какое из трёх введённых пользователем значений наименьшее, наибольшее, среднее.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение");
        int firstnum = scanner.nextInt();
        System.out.println("Введите второе значение");
        int secondnum = scanner.nextInt();
        System.out.println("Введите третье значение");
        int thirthnum = scanner.nextInt();
if (firstnum < secondnum & firstnum < thirthnum){
    System.out.println("Min number is " + firstnum);
}
else if (firstnum > secondnum & firstnum > thirthnum){
    System.out.println("Max number is " + firstnum);
}
else {
    System.out.println("Mid number is " + firstnum);
}
    if (secondnum < firstnum & secondnum < thirthnum){
        System.out.println("Min number is " + secondnum);
}
    else  if (secondnum > firstnum & secondnum > thirthnum){
        System.out.println("Max number is " + secondnum);
    }
    else {
        System.out.println("Mid number is " + secondnum);
    }
    if (thirthnum < firstnum & thirthnum < firstnum){
        System.out.println("Min number is " + thirthnum);
    }
    else  if (thirthnum > firstnum & thirthnum > firstnum){
        System.out.println("Max number is " + thirthnum);
    }
    else {
        System.out.println("Mid number is " + thirthnum);
    }
    }
}
