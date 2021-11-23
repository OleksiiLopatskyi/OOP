package ProjectWithSolutions.Lab4.Lab43;

public class Money extends Array {
    public Money(int size) {
        super(size);
    }

    public Money() {
        super(100);
    }

    public void setMoney(double value) {
        clearArray();
        char[] arr = String.valueOf(value).toCharArray();
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

    public Money add(Money money) {
        double a = Double.parseDouble(String.valueOf(this.getArray()));
        double b = Double.parseDouble(String.valueOf(money.getArray()));
        double s = a + b;
        Money result = new Money();
        result.setMoney(s);
        return result;
    }

    public Money sub(Money money) {
        double a = Double.parseDouble(String.valueOf(this.getArray()));
        double b = Double.parseDouble(String.valueOf(money.getArray()));
        double s = a - b;
        Money result = new Money();
        result.setMoney(s);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
