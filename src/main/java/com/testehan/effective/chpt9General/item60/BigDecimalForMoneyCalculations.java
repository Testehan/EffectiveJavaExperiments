package com.testehan.effective.chpt9General.item60;

import java.math.BigDecimal;

public class BigDecimalForMoneyCalculations {


    public static void main(String[] args) {
        // Broken - uses floating point for monetary calculation!
        doubleForMoneyCalculations();

        // correct way with BigDecimal
        BigDecimalForMoneyCalculations();

        // also correct way, of using int/long and calculting in cents:
        usingIntAndPerformingCalculationsOnCentsLevelNotOnDollarLevel();
    }

    private static void BigDecimalForMoneyCalculations() {
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS;
             funds.compareTo(price) >= 0;
             price = price.add(TEN_CENTS)) {

            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds);
    }

    private static void doubleForMoneyCalculations() {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; funds >= price; price += 0.10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }

   /*   An alternative to using BigDecimal is to use int or long, depending on the
        amounts involved, and to keep track of the decimal point yourself. In this
        example, the obvious approach is to do all computation in cents instead of dollars.
        Here’s a straightforward transformation that takes this approach:
    */
    private static void usingIntAndPerformingCalculationsOnCentsLevelNotOnDollarLevel() {
        int itemsBought = 0;
        int funds = 100;
        for (int price = 10; funds >= price; price += 10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Cash left over: " + funds + " cents");
    }
}
