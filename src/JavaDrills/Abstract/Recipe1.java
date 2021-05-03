package JavaDrills.Abstract;

public class Recipe1 extends AbstractRecipe{

    @Override
    void getReady() {
        System.out.println("Get Ingredients");
        System.out.println("Get utencils and pans ready");
    }

    @Override
    void doDishes() {
        System.out.println("Clean dishes");
        System.out.println("Clean utencils and pans");
    }

    @Override
    void cleanUp() {
        System.out.println("Dry it all");
        System.out.println("Dry em up");
    }
}
