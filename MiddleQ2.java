import java.util.Scanner;

public class MiddleQ2 {
    public static void main(String[] args) {
        /*
        Написать программу, которая будет определять, есть ли действительные корни у квадратного уравнение. Квадратное уравнение можно записать следующим образом: ax^2+bx+c=0. Пользователь вводит параметры a, b и c. Если дискриминант квадратного уравнения больше или равен 0, то уравнение имеет действительные корни, если дискриминант меньше нуля, то уравнение не имеет корней.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения для параметра 'a'");
        int a = scanner.nextInt();
        System.out.println("Введите значения для параметра 'b'");
        int b = scanner.nextInt();
        System.out.println("Введите значения для параметра 'c'");
        int c = scanner.nextInt();
        int z=4;
        //magic number
        int p = b * b;
        //b^2
        int h = z * a * c;
        //4ac
        int d = p - h;
        //b^2 - 4ac
        if (d<0){
            System.out.println("Уравнение не имеет корней " + d);
        }
else if (d>=0) {
            System.out.println("Дискриминант равен " + d);
        }
    }
}
