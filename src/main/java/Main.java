public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 2_000;
        boolean registered = true;
        long expected = 100;
        long actual = service.calculate(amount, registered);

        System.out.println("Bonus: " + actual);

    }
}
