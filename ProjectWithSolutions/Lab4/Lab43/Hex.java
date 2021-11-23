package ProjectWithSolutions.Lab4.Lab43;

public class Hex extends Array {
    public Hex(int size) {
        super(size);
    }

    public Hex() {
        super(100);
    }

    public void setHex(String value) {
        clearArray();
        char[] arr = value.toCharArray();
        if (arr.length > this.getArray().length) {
            System.out.println("First array must be < then second!");
            return;
        }
        for (int i = 0;
             i < arr.length;
             i++) {
            this.getArray()[this.getArray().length - arr.length + i] = arr[i];
        }
    }

    public Hex product(Hex hex) {
        int a = Integer.valueOf(clearHexString(String.valueOf(this.getArray())), 16);
        int b = Integer.valueOf(clearHexString(String.valueOf(hex.getArray())), 16);
        int s = a * b;
        Hex result = new Hex();
        result.setHex(Integer.toOctalString(s));
        return result;
    }

    public Hex subs(Hex hex) {
        int a = Integer.valueOf(clearHexString(String.valueOf(this.getArray())), 16);
        int b = Integer.valueOf(clearHexString(String.valueOf(hex.getArray())), 16);
        int s = a - b;
        Hex result = new Hex();
        result.setHex(Integer.toOctalString(s));
        return result;
    }

    public Hex add(Hex hex) {
        int a = Integer.valueOf(clearHexString(String.valueOf(this.getArray())), 16);
        int b = Integer.valueOf(clearHexString(String.valueOf(hex.getArray())), 16);
        int s = a + b;
        Hex result = new Hex();
        result.setHex(Integer.toOctalString(s));
        return result;
    }

    private String clearHexString(String string) {
        int count = 0;
        for (int i = 0;
             i <= string.length();
             i++) {
            if (string.toCharArray()[i] == '0') {
                count++;
            } else {
                break;
            }
        }
        return string.substring(count);
    }
}
