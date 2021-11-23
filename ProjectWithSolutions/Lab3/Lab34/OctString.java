package ProjectWithSolutions.Lab3.Lab34;

public class OctString extends SymString {
    private String octValue = "0" ;

    public OctString(String octValue) {
        this.octValue = octValue;
    }

    public OctString() {
    }

    public OctString(int octValue) {
        this.octValue = Integer.toOctalString(octValue);
    }

    public void showDec() {
        System.out.println(Integer.valueOf(octValue));
    }

    public OctString plus(OctString octString) {
        int a = Integer.parseInt(octValue);
        int b = Integer.parseInt(octString.octValue);
        int c = a + b;
        return new OctString(c);
    }

    @Override
    public String toString() {
        return "OctString{" +
                "octValue='" + octValue + '\'' +
                '}';
    }

    public String getOctValue() {
        return octValue;
    }

    public void setOctValue(String octValue) {
        this.octValue = octValue;
    }
}
