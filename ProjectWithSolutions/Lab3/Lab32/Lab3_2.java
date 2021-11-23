package ProjectWithSolutions.Lab3.Lab32;

public class Lab3_2 {
    public static void main(String[] args) {
        AlcoholicDrink alcoholicDrink = new AlcoholicDrink();
        alcoholicDrink.setName("Scotch whisky");
        System.out.println("Name of alcoholic drink: " + alcoholicDrink.getName());
        alcoholicDrink.read();
        System.out.println("Destiny of alcoholic drink: " + alcoholicDrink.getDensity());
        alcoholicDrink.setAlcoholicStrength(70);
        System.out.println("Alcoholic strength: " + alcoholicDrink.getAlcoholicStrength() + "% ABV");
        System.out.println(alcoholicDrink.toString());
        alcoholicDrink.display();
        alcoholicDrink.display();
        alcoholicDrink.display();
        Liquid liquid = new AlcoholicDrink();
        liquid.setName("Water");
        System.out.println("Name of liquid: " + liquid.getName());
        liquid.read();
        System.out.println("Destiny of liquid: " + liquid.getDensity());
//        liquid.setAlcoholicStrength(70);
//        System.out.println("Alcoholic strength: " + liquid.getAlcoholicStrength() + "% ABV");
//        liquid.display();
        System.out.println(liquid.toString());
    }
}
