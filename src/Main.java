public class Main {
    public static void main(String[] args) {
        int score = 100;
        int refill = 1100;
        int bonus = 0;

        if (refill > 1000) {
            bonus = refill / 100;
        }
        score += refill + bonus;

        System.out.println("Счет пополнен на " + refill + " руб.");
        System.out.println("Бонус составил " + bonus + " руб.");
        System.out.println("Итоговая сумма по счету составила " + score + " руб.");
    }
}
