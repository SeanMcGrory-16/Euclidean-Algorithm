public class EA_and_EEA_TEST {

    public static int euclideanAlgorithm(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;   
        }
        return a;
    }

    public static int[] extendedEuclideanAlgorithm(int a, int b) {
        if (b == 0) {
            return new int[] { a, 1, 0 };
        } else {
            int[] results = extendedEuclideanAlgorithm(b, a % b);
            int g = results[0];
            int x = results[2];
            int y = results[1] - (a / b) * results[2];
            return new int[] { g, x, y };
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java GCDAlgorithms <number1> <number2>");
            return;
        }
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int gcd = euclideanAlgorithm(a, b);
            int[] extendedGcd = extendedEuclideanAlgorithm(a, b);

            System.out.println("GCD: " + gcd);
            System.out.println("Extended GCD: " + extendedGcd[0] + " x: " + extendedGcd[1] + " y: " + extendedGcd[2]);
        } catch (NumberFormatException e) {
            System.out.println("Both arguments have to be integers.");

        }
    }
}