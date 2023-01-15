public class Main {
    public static void main(String[] args) {

        int a = 50;
        int p = 1000;
        int b = p / 100;

        if (p >= 1000) {
        System.out.println("Итоговый счет " + (a + p + b));
        System.out.println("Количество бонусных рублей составило " + b );
        } else {
            System.out.println("Итоговый счет " + (a + p));
        }
    }
}