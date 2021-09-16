package otherTasks.genericArray;

public class ArrayUtil {
    public static double averageValue(Array<? extends Number> array) {
        double sum = 0.0;

        for (int i = 0; i < array.length(); i++) {
            if (array.get(i) instanceof Double) {
                sum += (Double) array.get(i);
            } else if (array.get(i) instanceof Integer) {
                sum += (Integer) array.get(i);
            } else if (array.get(i) instanceof Float) {
                sum += (Float) array.get(i);
            } else {
                return 0;
            }
        }
        return sum / array.length();
    }
}
