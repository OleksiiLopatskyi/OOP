package ProjectWithSolutions.Lab6.Lab61;
import java.util.Arrays;
public class DynamicArray implements ArrayBase{
    static final int COEF = 2;
    private int length;
    private int[] array;
    private int index = -1;
    public DynamicArray(int[] array) {
        this.length = array.length;
        this.array = new int[this.length];
        for (int i = 0;
 i < array.length;
 i++) {
            this.array[i] = array[i];
        }
        this.index = this.length - 1;
    }
    @Override    public void add(int a) {
        if(index == length - 1){
            int[] newArray = new int[length * COEF];
            for (int i = 0;
 i < array.length;
 i++) {
                    newArray[i] = array[i];
            }
            array = newArray;
            length = array.length;
        }
        ++index;
        array[index] = a;
    }
    @Override    public void remove() {
        --index;
    }
    @Override    public void clean() {
        index = -1;
    }
    @Override    public void display() {
        for (int i = 0;
 i <= index;
 i++) {
                System.out.print(array[i] + " ");
        }
    }
    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}

