package JavaDrills.Abstract;

public abstract class AbstractRecipe {

    public void execute() {
        getReady();
        doDishes();
        cleanUp();
    }

    abstract void getReady();
    abstract void doDishes();
    abstract void cleanUp();



}
