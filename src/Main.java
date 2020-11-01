public class Main {
    public static void main(String[] args) {
        float ticket_price = 3578.50f;
        int summa_one_mile = 20;
        int amount_mile = (int) (ticket_price / summa_one_mile);
        System.out.println("За билет Вам начисленно: " + amount_mile + " миль!");
    }
}
