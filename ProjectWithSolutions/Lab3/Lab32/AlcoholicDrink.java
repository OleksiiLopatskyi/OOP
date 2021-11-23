package ProjectWithSolutions.Lab3.Lab32;

public class AlcoholicDrink extends Liquid {
    private int alcoholicStrength;

    public AlcoholicDrink(String name, double density, int alcoholicStrength) {
        super(name, density);
        this.alcoholicStrength = alcoholicStrength;
    }

    public AlcoholicDrink() {
    }

    public int getAlcoholicStrength() {
        return alcoholicStrength;
    }

    public void setAlcoholicStrength(int alcoholicStrength) {
        this.alcoholicStrength = alcoholicStrength;
    }
}
