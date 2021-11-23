package ProjectWithSolutions.Lab4.Lab43;

public class Lab4_3 {
    public static void main(String[] args) {
        Money money = new Money(5);
        Money money1 = new Money(5);
        money.setMoney(20);
        money1.setMoney(30);
        System.out.println("Аdding money: ");
        System.out.println(money.add(money1));
        System.out.println("Subtraction of money: ");
        System.out.println(money.sub(money1));
        System.out.println();
        System.out.println();
        Hex hex = new Hex(6);
        Hex hex1 = new Hex(8);
        hex.setHex("ab");
        hex1.setHex("10");
        System.out.println("Аdding hex values: ");
        System.out.println(hex.add(hex1));
        System.out.println("Subtraction of hex values: ");
        System.out.println(hex.subs(hex1));
        System.out.println("Product of hex values: ");
        System.out.println(hex.product(hex1));
        System.out.println();
        System.out.println("Equals of hex values");
        System.out.println(hex.equals(hex1));
    }
}
