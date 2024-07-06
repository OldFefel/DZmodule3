import java.util.Scanner;

public class Dzmiddle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            float c = scanner.nextFloat();
           float result1;
           float result2;
           float result3;
            result1 = b * b;
            result2 = 4 * a * c ;
            result3 = result1 - result2;

            System.out.println(result3);
        }
}
