public class Main {

    public static void main(String[] args) {
        int amount = 10;
        System.out.println("Покупка билета на сумму: " + amount + " руб");
        int freeMiles = 20;

        int amountMiles = amount / freeMiles;

        System.out.println("Бонусных миль: " + amountMiles);
    }
}
