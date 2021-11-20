package homework22;

public class Main {
    public static long Recursion(int number) {
        if (number == 0 || number == 1) {
            return 1;

        } else {
            return number * Recursion(number - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Your result of factorial = ");
        System.out.println(Recursion(4));
    }
}
