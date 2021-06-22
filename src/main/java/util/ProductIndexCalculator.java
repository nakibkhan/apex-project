package util;

public class ProductIndexCalculator {
    public static int determineIndexUp(int index, int size) {
        index++;
        return  index % size;
    }

    public static int determineIndexDown(int index, int size) {
        index--;
        int rem = index % size;
        if (rem < 0)    {
            return size + rem;
        }

        return rem;
    }
}
