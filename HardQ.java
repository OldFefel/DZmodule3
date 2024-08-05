import java.util.Scanner;

public class HardQ {
    public static void main(String[] args) {
        /*
        Написать программу, которая в зависимости от выбора пользователя вычисляет площадь одной из трёх геометрических фигур: прямоугольника, треугольника или круга.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите цифру по соответствию фигуре");
        System.out.println("<1> Треугольник");
        System.out.println("<2> Прямоугольник");
        System.out.println("<3> Окружность");
        String figure = scanner.next();
        switch (figure) {
            case ("1"): {
                System.out.println("Площадь треугольника");
                System.out.println("Введите значение основания (A)");
                float a = scanner.nextInt();
                System.out.println("Введите значение высоты (h)");
                float h = scanner.nextFloat();
                float res1 = a * h;
                int z = 2;
                //magic number
                float s = res1 / z;
                System.out.println("Площадь треугольника равна " + s);
                break;
            }
            case ("2"): {
                System.out.println("Площадь прямоугольника");
                System.out.println("Введите значение основания (A)");
                float a = scanner.nextInt();
                System.out.println("Введите значение высоты (h)");
                float h = scanner.nextFloat();
                float s = a * h;
                System.out.println("Площадь прямоугольника равна " + s);
                break;
            }
            case ("3"): {
                System.out.println("Площадь окружности ");
                System.out.println("Введите радиус окружности");
                double r = scanner.nextDouble();
                double r2 = r * r;
                //r^2
                double s = r2 * Math.PI;
                System.out.println("Площадь окружности равняется " + s);
                break;
            }
            default: {
                System.out.println("Некорректный ввод");
            }
        }
    }
}
