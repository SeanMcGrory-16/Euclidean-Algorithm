public class EA_and_EEA {

    public static void main(String[] args) {
        // Test for (EA)
        testEuclideanAlgorithm(7, 77, 2);
        testEuclideanAlgorithm(360, 192, 24);


        // Test for (EEA)
        testExtendedEuclideanAlgorithm(7, 77, 7);
        testExtendedEuclideanAlgorithm(360, 192, 24);

    }

    private static void testEuclideanAlgorithm(int a, int b, int expectedGcd) {
        int gcd = EA_and_EEA_TEST.euclideanAlgorithm(a, b);
        if (gcd == expectedGcd) {
            System.out.println("PASS: GCD of " + a + " and " + b + " is " + gcd);
        } else {
            System.out.println("FAIL: GCD of " + a + " and " + b + " expected " + expectedGcd + " but got " + gcd);
        }
    }

    private static void testExtendedEuclideanAlgorithm(int a, int b, int expectedGcd) {
        int[] result = EA_and_EEA_TEST.extendedEuclideanAlgorithm(a, b);
        int gcd = result[0];
        if (gcd == expectedGcd) {
            System.out.println("PASS: Extended GCD of " + a + " and " + b + " is " + gcd + " with coefficients (" + result[1] + ", " + result[2] + ")");
        } else {
            System.out.println("FAIL: Extended GCD of " + a + " and " + b + " expected " + expectedGcd + " but got " + gcd + " with coefficients (" + result[1] + ", " + result[2] + ")");
        }
    }
}