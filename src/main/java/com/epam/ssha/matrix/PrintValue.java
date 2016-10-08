package com.epam.ssha.matrix;

/**
 * Created by aika-ssha on 08.10.2016.
 *
 * My first steps on java
 * for learning OOP concepts, language basics, code styles and etc.
 *
 * This is package for operations on matrices, like addition and transposition
 */

import static com.epam.ssha.matrix.util.PropertyManager.propertyManager;

public class PrintValue {

    public static void main (String[] args) {
        String currency = propertyManager.getProperty("user1.january.currencymoney");
        String name = propertyManager.getProperty("user1.name");
        int numpurchase = propertyManager.getIntProperty("user1.january.numpurchase");
        int amountmoney = propertyManager.getIntProperty("user1.january.amountmoney");
        int numberactiveday = propertyManager.getIntProperty("user1.january.numberactiveday");


        System.out.println(currency);
        System.out.println(name);
        System.out.println(numpurchase);
        System.out.println(numberactiveday);
        System.out.println(amountmoney);
    }
}
