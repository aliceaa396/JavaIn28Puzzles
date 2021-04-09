package JavaDrills.ForLoopDrills;

public class MyNumber {
    private int num;

    public MyNumber(int num) {
        this.num = num;
    }

    public boolean isPrime() {
        //Guard condition: Checks if the input if valid before the code is executed
        if(num < 2){
            return false;
        }
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumUpToN() {
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum = sum + i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        //dont want to return 1 or num being summed
        int sum = 0;

        for(int i = 2; i <= num - 1; i++) {
            if(num % i == 0){
                sum = sum + i ;
            }
        }
        return sum;
    }
    public void printANumTriangle(){
    //Loop within a loop: set n = 1; have n stop incrementing once it reaches i, increment n.
        for(int i = 1; i <= num; i++ ){
            for(int n = 1; n <= i; n++){
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
