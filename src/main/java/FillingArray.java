package main.java;

public class FillingArray {
    static int[] getFilledArray(final int size, final int modifier, final Filling way) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = way.process(i, modifier);
        }
        return result;
    }

}
