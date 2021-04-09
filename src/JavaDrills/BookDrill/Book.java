package JavaDrills.BookDrill;

public class Book {
    public Book(int numCopies){
        this.numCopies = numCopies;
    }
    private int numCopies;
    //Makes Book and prints out message for successful creation
    void made(){
        System.out.println("Books were successfully made");
    }

   int getStartingCopies(){
        return numCopies;
    }

    //Sets num of copies sold

    public void setCopiesSold(int numCopies){
        if(numCopies > 0 ){
            this.numCopies = numCopies;
        }
    }

    //Gets the num of copies sold
    int getCopies(){
        return numCopies;
    }

    //Increase && Decrease books sold and decrease books sold
    public void increaseCopiesSold(int howMuch){
        setCopiesSold(this.numCopies + howMuch);
    }
    public void decreaseCopiesSold(int howMuch){
        setCopiesSold(this.numCopies - howMuch);
    }
}
