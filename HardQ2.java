import java.util.Scanner;

public class HardQ2 {
    public static void main(String[] args) {
        /*
        Заданы координаты двух фигур — пешки и слона. Определить, находится ли пешка под боем слона. Слон ходит по диагонали, а пешка находится под боем, если стоит на одной диагонали со слоном. Шахматное поле состоит из восьми клеток в ширину и в длину.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение первую координату Y");
        int y1 = scanner.nextInt();
        System.out.println("Введите значение вторую координату Y");
        int y2 = scanner.nextInt();
        char x1 = 'A';
        char x2 = 'H';
        int res1 = (Math.abs(x1 - x2));
        int res2 = y1 - y2;
        if (-res1 == res2) {
            System.out.println("Клетки находятся на одной диагонали ");
        } else {
            System.out.println("Клетки не находятся на одной диагонали ");
        }

    }
}
