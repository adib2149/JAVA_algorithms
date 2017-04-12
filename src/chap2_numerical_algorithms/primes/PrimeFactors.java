package chap2_numerical_algorithms.primes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adib on 12-Apr-17.
 */
public class PrimeFactors {

    public static List<Integer> findPrimeFactors(int n) {

        // initialize blank list
        List<Integer> factors = new ArrayList<>();

        // removing factors of 2
        while (n % 2 == 0) {
            factors.add(2);
            n = n / 2;
        }

        // now find odd factors
        int i = 3;
        int maxFactor = (int) Math.floor(Math.sqrt((double) n));

        while (i <= maxFactor) {
            // get factors of i
            while (n % i == 0) {
                // i is a factor, add it to list
                factors.add(i);
                // divide numbe by i
                n = n / i;
                // set new upper bound
                maxFactor = (int) Math.floor(Math.sqrt((double) n));
            }
            // increment i
            i += 2;
        }

        // if anything's left, that's a factor too
        if (n > 1) {
            factors.add(n);
        }

        return factors;

    }

}
