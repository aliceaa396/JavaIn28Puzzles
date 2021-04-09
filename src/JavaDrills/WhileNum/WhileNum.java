package JavaDrills.WhileNum;

public class WhileNum {
    private int limit;

    public WhileNum(int limit) {
        this.limit = limit;
    }

    public void printSquaresUpToLimit(){
        int i = 1;
        while( i * i < limit) {
            System.out.print(i * i + " ");
            i++;
        }
    }

    public void printCubesUpToLimit(){
        int i = 1;
        while( i * i * i < limit) {
            System.out.println(i * i * i + " ");
            i++;
        }
    }
}
