public class GCD {
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        System.out.println("GCD(" + a + ", " + b + ") = " + calculateGCD(a, b));

        a = 10;
        b = 7;
        System.out.println("GCD(" + a + ", " + b + ") = " + calculateGCD(a, b));
    }
}
