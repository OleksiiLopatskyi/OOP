package ProjectWithSolutions.Lab6.Lab61;

public class Lab6_1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("Generated array: ");
        for (int i = 0;
             i < a.length;
             i++) {
            a[i] = (int) Math.round((Math.random() * 100) - 50);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();
        int sum = 0;
        for (int j : a) {
            sum += Math.abs(j);
        }
        int average = sum / a.length;
        System.out.print("Product: ");
        System.out.println(product(a));
        System.out.println();
        DynamicArray dynamicArray = new DynamicArray(a);
        dynamicArray.add(sum);
        dynamicArray.add(average);
        System.out.println("Generated array with sum and average in absolute value: ");
        dynamicArray.display();
    }

    protected static int product(int[] a) {
        int firstNegative = 1;
        int result = 0;
        for (int i : a) {
            if (i < 0) {
                firstNegative = i;
                break;
            }
        }
        for (int i = 0;
             i < a.length;
             i++) {
            if (a[i] % 2 == 0) {
                a[i] = firstNegative * a[i];
                result = a[i];
            }
        }
        return result;
    }
}
