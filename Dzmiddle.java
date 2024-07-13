import java.util.Scanner;

public class Dzmiddle {
        public static void main(String[] args) {
            /**
            Посчитать дискриминант квадратного уравнения. Дискриминант рассчитывается по формуле D=b^2-4ac. Пользователем вводятся значения a, b и c. Нужно вывести дискриминант уравнения.
             */
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значения для переменной 'a'");
            float a = scanner.nextFloat();
            //Переменная а
            System.out.println("Введите значения для переменной 'b'");
            float b = scanner.nextFloat();
            //переменная б
            System.out.println("Введите значения для переменной 'c'");
            float c = scanner.nextFloat();
            //переменная c
           float result1= b * b;
           int z=4;
           //вынесение магического числа
           float result2= z * a * c ;
           float result3= result1 - result2;
            System.out.println("Ответ:" + result3);
        }
}
