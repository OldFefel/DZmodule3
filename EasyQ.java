import java.util.Scanner;

public class EasyQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yeartime = scanner.next();
        switch (yeartime) {
            case ("1"): {
                System.out.println("Зима");
                break;
            }
            case ("2"): {
                System.out.println("Весна");
                break;
            }
            case ("3"): {
                System.out.println("Лето");
                break;
            }
            case ("4"): {
                System.out.println("Осень");
                break;
            }
            default: {
                System.out.println("Неверный ввод данных");
            }
        }
    }
}
