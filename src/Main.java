public class Main {

    public static void main(String[] args) {
        int balance = 500;
        int payment = 1840;
        int bonus = 0;

        bonus = (payment > 1000) ? payment / 100 : 0;

        balance = balance + payment + bonus;
        System.out.println("Bonus: " + bonus + " rubles");
        System.out.println("Total balance: " + balance + " rubles");
    }
}