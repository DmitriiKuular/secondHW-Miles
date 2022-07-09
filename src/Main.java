public class Main {
    public static void main(String[] args) {

        int cost = 19019; // сторимость билета
        int amountRubles = 20; // количество рублей для начисления 1 мили
        int amountMiles = cost / amountRubles;

        System.out.println("Мили, начисленные за покупку билета - " + amountMiles);
    }
}
