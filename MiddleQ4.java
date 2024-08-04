import java.util.Scanner;

public class MiddleQ4 {
    public static void main(String[] args) {
        /*
         Заданы длины сторон треугольника. Необходимо определить, может ли существовать треугольник с такими сторонами.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение");
        int firstnum = scanner.nextInt();
        System.out.println("Введите второе значение");
        int secondnum = scanner.nextInt();
        System.out.println("Введите третье значение");
        int thirthnum = scanner.nextInt();
        if (firstnum+secondnum>thirthnum &&secondnum+thirthnum>firstnum &&firstnum+thirthnum>secondnum){
            System.out.println("Треугольник пропорционален");
        }else if (firstnum+secondnum<thirthnum ||secondnum+thirthnum<firstnum||firstnum+thirthnum<secondnum){
                System.out.println("Треугольник не пропорционален");
            }else {
            System.out.println("Ошибка ввода");
        }
    }
}
