import java.util.Scanner;

public class Dzhard2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();
        float x3 = scanner.nextFloat();
        float y3 = scanner.nextFloat();
        float result1 = (x2-x1);
        float result2 =(y3-y1);
        float result3 =(x3 - x1);
        float result4 =(y2-y1);
        float result5 =result1 * result2;
        float result6 =result3 * result4;
        float result7=result5 - result6;
        float result8 = result7 / 2;
        System.out.println(result8);


    }
}
