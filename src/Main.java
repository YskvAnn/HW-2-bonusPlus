public class Main {
    public static void main(String[] args) {

        int actualBalance = 1690;
        int addend = 1100;

        int bonus;

        if (addend > 1000) {
            bonus = addend / 100;
        } else {
            bonus = 0;
        }

        int endBalance = actualBalance + addend + bonus;

        System.out.println(bonus);
        System.out.println(endBalance);
    }
}