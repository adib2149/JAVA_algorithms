package chap2_numerical_algorithms.pseudo_random;

/**
 * Created by Adib on 10-Apr-17.
 *
 * Second sampl code on how to randomize arrays
 */
public class ArrayRandomizer {

    private int[] mainArray;

    public ArrayRandomizer(int[] mainArray) {
        this.mainArray = mainArray;
    }

    public int[] getRandomizedArray() {

        // set an m for pseudo random number generator
        int m = 100;

        // get random number generator
        LinearCongruentialGenerator randomGenerator = LinearCongruentialGenerator.getInstance().setA(2).setB(3).setM(m).setSeed(0);

        // get array max and min index
        int min = 0;
        int max = mainArray.length;

        // iterate to randomize
        for (int i = 0; i < max; i++) {

            // get pseudo random
            int pseudoRandomNumber = randomGenerator.getNextRandom();

            // get random index within range from min to max
            int randomPosition = min + (pseudoRandomNumber % (max - min));

            // swap array item of index i and random index
            int temp = mainArray[i];
            mainArray[i] = mainArray[randomPosition];
            mainArray[randomPosition] = temp;
        }

        return mainArray;

    }
}
