package PrimeNumber;

public class Program {
    public static void main(String[] args) {
        int number = 17;
        int initialMultiplicand = 2;
        int initialMultiplier = 1;
        String message = primeNumber(number,initialMultiplicand,initialMultiplier);

        System.out.println(message);
    }

    public static String primeNumber(int a, int b, int c) {
        if (a == 0 || a == 1) {
            return a+" es un número especial que no se considera primo ni compuesto";
        }

        if (b == a) {
            return "Si";
        } else if(b * c == a) {
            return "No";
        }

        if(b * c > a) {
            c = 1;
            b++;
        }

        return primeNumber(a, b, c+1);
    }
}
