package JavaDrills.InterestCalc;

import java.math.BigDecimal;

public class IntrestCalcRunner {

    public static void main(String[] args) {
        SimpleCalc calculator = new SimpleCalc("4500.00", "7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);
    }
}
