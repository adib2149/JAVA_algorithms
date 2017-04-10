import chap2_numerical_algorithms.pseudo_random.LinearCongruentialGenerator;

/**
 * Created by Adib on 10-Apr-17.
 */
public class CheckImplementation {

    public static void main(String[] args) {
        checkLinearCongruentialGenerator();
    }

    private static void checkLinearCongruentialGenerator() {

        LinearCongruentialGenerator randomGenerator = LinearCongruentialGenerator.getInstance().setA(2).setB(3).setM(100).setSeed(0);

        for (int i = 0; i < 20; i++) {
            System.out.println(randomGenerator.getNextRandom());
        }

    }

}
