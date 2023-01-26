public class Main {
    public static void main(String[] args) {

        int primordial = 50;
        int added = 1000;
        int bonus = added / 100;

        if (added >= 1000) {
            System.out.println("Итоговый счет " + (primordial + added + bonus));
            System.out.println("Количество бонусных рублей составило " + bonus);
        } else {
            System.out.println("Итоговый счет " + (primordial + added));
        }
    }
}