package ProjectWithSolutions.Lab4.Lab43;
import java.util.Arrays;
public class Array {
    private char [] array;
    public Array(int size) {
        if(size > 100){
            System.out.println("Used size 100");
            this.array = new char[100];
        }
else {
            this.array = new char[size];
        }
    }
    public void clearArray(){
        for (int i = 0;
 i < array.length;
 i++){
            array[i] = '0';
        }
    }
    public char[] getArray() {
        return array;
    }
    public void setArray(char[] array) {
        this.array = array;
    }
    @Override    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return Arrays.equals(array, array1.array);
    }
    @Override    public int hashCode() {
        return Arrays.hashCode(array);
    }
    @Override    public String toString() {
        return Arrays.toString(array);
    }
}
