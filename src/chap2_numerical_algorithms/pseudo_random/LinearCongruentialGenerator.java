package chap2_numerical_algorithms.pseudo_random;

/**
 * Created by Adib on 10-Apr-17.
 *
 * This is the first simple code to generate Pseudo-random number
 */
public class LinearCongruentialGenerator {

    private int a = 0;
    private int b = 0;
    private int m = 0;
    private int seed = 0;

    private static LinearCongruentialGenerator instance = null;

    /**
     * constructor
     */
    public LinearCongruentialGenerator() {
    }

    /**
     * singleton instance generation
     * @return
     */
    public static LinearCongruentialGenerator getInstance() {
        if (instance == null) {
            instance = new LinearCongruentialGenerator();
        }
        return instance;
    }

    /**
     * singleton setters
     */
    public LinearCongruentialGenerator setA(int a) {
        this.instance.a = a;
        return this.instance;
    }

    public LinearCongruentialGenerator setB(int b) {
        this.instance.b = b;
        return this.instance;
    }

    public LinearCongruentialGenerator setM(int m) {
        this.instance.m = m;
        return this.instance;
    }

    public LinearCongruentialGenerator setSeed(int seed) {
        this.instance.seed = seed;
        return this.instance;
    }

    /**
     * Generates the next random number based on seed
     * @return random number
     */
    public int getNextRandom() {
        this.instance.seed = ( this.instance.a * this.instance.seed + this.instance.b ) % this.instance.m;
        return this.instance.seed;
    }

}
