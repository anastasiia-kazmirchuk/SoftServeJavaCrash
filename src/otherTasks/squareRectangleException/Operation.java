package otherTasks.squareRectangleException;

//Create a method for calculating an area of a rectangle
//
//int squareRectangle(int a, int b), which should throw an IllegalArgumentException with message "both arguments should be more than zero" if at least one of its arguments is non positive.
//
//Create trySquareRectangle method which takes two parameters and calls squareRectangle to evaluate an area of a rectangle. Catch exceptions that can be generated.
//
//trySquareRectangle shouldn't generate any exceptions. In case when one or two parameters are non positive the method should return -1.

public class Operation {
    public static int squareRectangle(int a, int b) {
        if (a > 0 && b > 0) {
            return a * b;
        } else {
            throw new IllegalArgumentException("both arguments should be more than zero");
        }
        //your code
    }

    public static int trySquareRectangle(int a, int b) {
        int result = -1;
        try {
            result = squareRectangle(a, b);
        } catch (IllegalArgumentException illegalArgumentException) {
            return result;
        }
        return result;
    }
}
