package chap2_numerical_algorithms.gcd;

/**
 * Created by Adib on 12-Apr-17.
 */
public class GCD {

    public static int getGcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

}
