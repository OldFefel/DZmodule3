import java.util.Scanner;

public class MiddleQ5 {
    public static void main(String[] args) {
        /*
        Нужно написать программу — помощника по кухне. Помощник должен определять, какое блюдо можно приготовить из имеющихся продуктов. В программу сначала вводятся продукты. А далее нужно определить, возможно ли из имеющихся продуктов приготовить яичницу, омлет или кофе. Для омлета требуется молоко и яйца, для яичницы только яйца, для кофе — кофе и молоко.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите доступные ингридиенты");
        String foodtype = scanner.next();
        switch (foodtype) {
            case ("яйца,молоко,кофе"): {
                System.out.println("Можно приготовить омлет или яичницу и кофе");
                break;
            }
            case ("молоко,яйца"): {
                System.out.println("Можно приготовить омлет ");
                break;
            }
            case ("яйца"): {
                System.out.println("Можно приготовить яичницу");
                break;
            }
            case ("молоко"): {
                System.out.println("Можно выпить молоко");
                break;
            }
            case ("кофе,молоко"): {
                System.out.println("Можно приготовить кофе с молоком(на любителя)");
                break;
            }
        }
    }
}
