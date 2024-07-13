import java.util.Scanner;

public class Dzhard2 {
    public static void main(String[] args) {
            /**
            Заданы координаты вершин треугольника, необходимо вычислить площадь. Для этого сначала необходимо найти длины сторон треугольника, а затем вычислить площадь треугольника по длинам сторон.
             */
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение 'X' для первой вершины");
float x1 = scanner.nextFloat();
            System.out.println("Введите значение 'Y' для первой вершины");
        float y1 = scanner.nextFloat();
            System.out.println("Введите значение 'X' для второй вершины");
        float x2 = scanner.nextFloat();
            System.out.println("Введите значение 'Y' для второй вершины");
        float y2 = scanner.nextFloat();
            System.out.println("Введите значение 'X' для третьей вершины");
        float x3 = scanner.nextFloat();
            System.out.println("Введите значение 'Y' для третьей вершины");
        float y3 = scanner.nextFloat();
        float result1 = (x2-x1);
        float result2 =(y3-y1);
        float result3 =(x3 - x1);
        float result4 =(y2-y1);
        float result5 =result1 * result2;
        float result6 =result3 * result4;
        float result7=result5 - result6;
        float result8 = result7 / 2;
        System.out.println("Ответ:" + result8);


    }
}
