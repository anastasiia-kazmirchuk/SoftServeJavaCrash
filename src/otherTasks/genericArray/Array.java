package otherTasks.genericArray;
//In the class ArrayUtil write static method named "averageValue(...)" that takes an object of Array type as input, and returns the average value its elements.
//
//The given method should returns value of double type and take any array, whose elements extends Number type.

public class Array<T> {

    private T[]array;

    public Array(T[]array){
        this.array= array;
    }
    public T get(int index){
        return array[index];
    }
    public int length(){
        return array.length;
    }
}
