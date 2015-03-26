package tasks_with_temperate_complexity.search_max_value;

/**
 * Created by yevhen.tsyba on 3/26/2015.
 */
public class MaxValueSearcher {

    /**
     * Find max value of two parameters without
     * using if-else operators or same ones.
     *
     * @param a
     * @param b
     * @return max value
     */
    public int getMax(int a, int b) {

        return a >= b ? a : b;
    }
}
