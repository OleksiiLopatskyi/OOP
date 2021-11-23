package ProjectWithSolutions.Lab3.Lab34;

public class Lab3_4 {
    public static void main(String[] args) {
        OctString octString = new OctString(4);
        OctString octString1 = new OctString(5);
        SymString symString = new SymString();
        System.out.println("Octal value: ");
        System.out.println(octString.getOctValue());
        symString.setString("ab");
        System.out.println("Symbol string: ");
        System.out.println(symString.getString());
        System.out.println("Image of the decimal value of the object: ");
        octString.showDec();
        System.out.println("Adding octal numbers: ");
        OctString result = octString.plus(octString1);
        System.out.println(result.toString());
    }
}
