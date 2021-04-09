package JavaDrills.InterestCalc;

import java.math.BigDecimal;

public class SimpleCalc {
    BigDecimal principal;
    BigDecimal interest;

    public SimpleCalc(String principal, String interest){
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int numYears) {
        BigDecimal numYearsBigDecimal = new BigDecimal(numYears);
        BigDecimal totalValue= principal.add(principal.multiply(interest).multiply(numYearsBigDecimal));
        return totalValue;
    }
}
