import chap2_numerical_algorithms.gcd.GCD;
import chap2_numerical_algorithms.pseudo_random.ArrayRandomizer;
import chap2_numerical_algorithms.pseudo_random.LinearCongruentialGenerator;

/**
 * Created by Adib on 10-Apr-17.
 */
public class CheckImplementation {

    public static void main(String[] args) {
        checkGcdCalculation();
    }

    /**
     * print to check linear congruential generator
     */
    private static void checkLinearCongruentialGenerator() {

        // get the randomizer
        LinearCongruentialGenerator randomGenerator = LinearCongruentialGenerator.getInstance().setA(2).setB(3).setM(100).setSeed(0);

        // print in loop
        for (int i = 0; i < 20; i++) {
            System.out.println(randomGenerator.getNextRandom());
        }

    }

    /**
     * print to check array randomization
     */
    private static void checkRandomizationOnArray() {

        // set array length
        int arrayLength = 10;

        // initialize and array of decide length, the value is same as indexed
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = i;
        }

        // print regular array
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
            System.out.print(" ");
        }

        // just adding a line break
        System.out.print("\n");

        // call out the randomizer
        ArrayRandomizer arrayRandomizer = new ArrayRandomizer(array);
        int[] randomArray = arrayRandomizer.getRandomizedArray();

        // print randomized array
        for (int k = 0; k < randomArray.length; k++) {
            System.out.print(randomArray[k]);
            System.out.print(" ");
        }

    }

    /**
     * print to check GCD calculation
     */
    private static void checkGcdCalculation() {
        System.out.println(GCD.getGcd(4851, 3003));
    }

}
