import static com.google.common.truth.Truth.assertThat;

public class ArrayExercises {
    /**
     * Returns an array [1, 2, 3, 4, 5, 6]
     */
    public static int[] makeDice() {
        int[] dice = new int[6];
        for (int i = 0; i < 6; i++) {
            dice[i] = i + 1;
        }
        return dice;
    }

    /**
     * Returns the positive difference between the maximum element and minimum element of the given array.
     * Assumes array is nonempty.
     */
    public static int findMinMax(int[] array) {
        assertThat(array).isNotNull();
        int legth = array.length;
        int maximum = array[0];
        int minimum = maximum;
        for (int i = 1; i < legth; i++) {
            int ia = array[i];
            if (ia > maximum) {
                maximum = ia;
            }
            if (ia < minimum) {
                minimum = ia;
            }
        }
        return Math.abs(maximum-minimum);
    }

}
