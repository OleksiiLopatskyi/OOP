package ProjectWithSolutions.Lab1.Lab14;

import java.util.Scanner;

public class Array {
    private String[] strings;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array: ");
        for (int i = 0;
             i < strings.length;
             i++) {
            strings[i] = scanner.nextLine();
        }
    }

    public void display() {
        for (String s : this.strings) {
            System.out.println(s);
        }
    }

    public void init(int size) {
        if (size <= 0) {
            System.out.println("Size must be > 0!");
            return;
        }
        this.strings = new String[size];
    }

    public Array concatenate(Array second) {
        int size = strings.length + second.getStrings().length;
        Array result = new Array(size);
        for (int i = 0;
             i < strings.length;
             i++) {
            result.strings[i] = strings[i];
        }
        for (int i = 0;
             i < second.getStrings().length;
             i++) {
            boolean skip = false;
            for (int j = 0;
                 j < result.strings.length;
                 j++) {
                if (second.strings[i].equals(result.strings[j])) {
                    skip = true;
                    break;
                }
            }
            if (skip) {
                continue;
            }
            result.strings[i + strings.length] = second.strings[i];
        }
        return result.clean();
    }

    public Array(int size) {
        if (size <= 0) {
            System.out.println("Size must be > 0!");
            return;
        }
        this.strings = new String[size];
    }

    public String getByIndex(int index) {
        if (index < strings.length && index <= 0) {
            return null;
        }
        return strings[index];
    }

    public void setValueByIndex(int index, String s) {
        if (index >= strings.length || index < 0) {
            System.out.println("Index out of array bound!");
            return;
        }
        this.strings[index] = s;
    }

    public void printByIndex(int index) {
        System.out.println(getByIndex(index));
    }

    private Array clean() {
        int countNulls = 0;
        for (String s : this.strings) {
            if (s == null) {
                ++countNulls;
            }
        }
        Array result = new Array(this.strings.length - countNulls);
        int index = 0;
        for (String s : this.strings) {
            if (s != null) {
                result.strings[index] = s;
                ++index;
            }
        }
        return result;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }
}
