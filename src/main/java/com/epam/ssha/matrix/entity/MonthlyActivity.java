package com.epam.ssha.matrix.entity;

import static com.epam.ssha.matrix.util.PropertyManager.propertyManager;

/**
 * Created by aika-ssha on 17.10.2016.
 * <p>
 * My first steps on java
 * for learning OOP concepts, language basics, code styles and etc.
 * <p>
 * This is package for operations on matrices, like addition and transposition
 */
public class MonthlyActivity {

    private int [][] activityOfJanuary = new int[2][3];
    private int [][] activityOfFebruary = new int[2][3];
    private int [][] activityOfMarch = new int[2][3];
    private int [][] activityOfApril = new int[2][3];
    private int [][] activityOfMay = new int[2][3];
    private int [][] activityOfJune = new int[2][3];
    private int [][] activityOfJule = new int[2][3];
    private int [][] activityOfAugust = new int[2][3];
    private int [][] activityOfSeptember = new int[2][3];
    private int [][] activityOfOctober = new int[2][3];
    private int [][] activityOfNovember = new int[2][3];
    private int [][] activityOfDecember = new int[2][3];

    public MonthlyActivity(){
        setActivityOfJanuary(activityOfJanuary);
        setActivityOfFebruary(activityOfFebruary);
        setActivityOfMarch(activityOfMarch);
        setActivityOfApril(activityOfApril);
        setActivityOfMay(activityOfMay);
        setActivityOfJune(activityOfJune);
        setActivityOfJule(activityOfJule);
        setActivityOfAugust(activityOfAugust);
        setActivityOfSeptember(activityOfSeptember);
        setActivityOfOctober(activityOfOctober);
        setActivityOfNovember(activityOfNovember);
        setActivityOfDecember(activityOfDecember);
    }


    public int[][] getActivityOfJanuary() {
        return activityOfJanuary;
    }

    public void setActivityOfJanuary(int[][] activityOfJanuary) {

        activityOfJanuary[0][0] = propertyManager.getIntProperty("user1.january.amountmoney");
        activityOfJanuary[0][1] = propertyManager.getIntProperty("user1.january.numpurchase");
        activityOfJanuary[0][2] = propertyManager.getIntProperty("user1.january.numberactiveday");
        activityOfJanuary[1][0] = propertyManager.getIntProperty("user2.january.amountmoney");
        activityOfJanuary[1][1] = propertyManager.getIntProperty("user2.january.numpurchase");
        activityOfJanuary[1][2] = propertyManager.getIntProperty("user2.january.numberactiveday");

    }

    public int[][] getActivityOfFebruary() {
        return activityOfFebruary;
    }

    public void setActivityOfFebruary(int[][] activityOfFebruary) {

        activityOfFebruary[0][0] = propertyManager.getIntProperty("user1.february.amountmoney");
        activityOfFebruary[0][1] = propertyManager.getIntProperty("user1.february.numpurchase");
        activityOfFebruary[0][2] = propertyManager.getIntProperty("user1.february.numberactiveday");
        activityOfFebruary[1][0] = propertyManager.getIntProperty("user2.february.amountmoney");
        activityOfFebruary[1][1] = propertyManager.getIntProperty("user2.february.numpurchase");
        activityOfFebruary[1][2] = propertyManager.getIntProperty("user2.february.numberactiveday");

    }

    public int[][] getActivityOfMarch() {
        return activityOfMarch;
    }

    public void setActivityOfMarch(int[][] activityOfMarch) {

        activityOfMarch[0][0] = propertyManager.getIntProperty("user1.march.amountmoney");
        activityOfMarch[0][1] = propertyManager.getIntProperty("user1.march.numpurchase");
        activityOfMarch[0][2] = propertyManager.getIntProperty("user1.march.numberactiveday");
        activityOfMarch[1][0] = propertyManager.getIntProperty("user2.march.amountmoney");
        activityOfMarch[1][1] = propertyManager.getIntProperty("user2.march.numpurchase");
        activityOfMarch[1][2] = propertyManager.getIntProperty("user2.march.numberactiveday");

    }

    public int[][] getActivityOfApril() {
        return activityOfApril;
    }

    public void setActivityOfApril(int[][] activityOfApril) {

        activityOfApril[0][0] = propertyManager.getIntProperty("user1.april.amountmoney");
        activityOfApril[0][1] = propertyManager.getIntProperty("user1.april.numpurchase");
        activityOfApril[0][2] = propertyManager.getIntProperty("user1.april.numberactiveday");
        activityOfApril[1][0] = propertyManager.getIntProperty("user2.april.amountmoney");
        activityOfApril[1][1] = propertyManager.getIntProperty("user2.april.numpurchase");
        activityOfApril[1][2] = propertyManager.getIntProperty("user2.april.numberactiveday");

    }

    public int[][] getActivityOfMay() {
        return activityOfMay;
    }

    public void setActivityOfMay(int[][] activityOfMay) {

        activityOfMay[0][0] = propertyManager.getIntProperty("user1.may.amountmoney");
        activityOfMay[0][1] = propertyManager.getIntProperty("user1.may.numpurchase");
        activityOfMay[0][2] = propertyManager.getIntProperty("user1.may.numberactiveday");
        activityOfMay[1][0] = propertyManager.getIntProperty("user2.may.amountmoney");
        activityOfMay[1][1] = propertyManager.getIntProperty("user2.may.numpurchase");
        activityOfMay[1][2] = propertyManager.getIntProperty("user2.may.numberactiveday");

    }

    public int[][] getActivityOfJune() {
        return activityOfJune;
    }

    public void setActivityOfJune(int[][] activityOfJune) {

        activityOfJune[0][0] = propertyManager.getIntProperty("user1.june.amountmoney");
        activityOfJune[0][1] = propertyManager.getIntProperty("user1.june.numpurchase");
        activityOfJune[0][2] = propertyManager.getIntProperty("user1.june.numberactiveday");
        activityOfJune[1][0] = propertyManager.getIntProperty("user2.june.amountmoney");
        activityOfJune[1][1] = propertyManager.getIntProperty("user2.june.numpurchase");
        activityOfJune[1][2] = propertyManager.getIntProperty("user2.june.numberactiveday");

    }

    public int[][] getActivityOfJule() {
        return activityOfJule;
    }

    public void setActivityOfJule(int[][] activityOfJule) {

        activityOfJule[0][0] = propertyManager.getIntProperty("user1.jule.amountmoney");
        activityOfJule[0][1] = propertyManager.getIntProperty("user1.jule.numpurchase");
        activityOfJule[0][2] = propertyManager.getIntProperty("user1.jule.numberactiveday");
        activityOfJule[1][0] = propertyManager.getIntProperty("user2.jule.amountmoney");
        activityOfJule[1][1] = propertyManager.getIntProperty("user2.jule.numpurchase");
        activityOfJule[1][2] = propertyManager.getIntProperty("user2.jule.numberactiveday");

    }

    public int[][] getActivityOfAugust() {
        return activityOfAugust;
    }

    public void setActivityOfAugust(int[][] activityOfAugust) {
        activityOfAugust[0][0] = propertyManager.getIntProperty("user1.august.amountmoney");
        activityOfAugust[0][1] = propertyManager.getIntProperty("user1.august.numpurchase");
        activityOfAugust[0][2] = propertyManager.getIntProperty("user1.august.numberactiveday");
        activityOfAugust[1][0] = propertyManager.getIntProperty("user2.august.amountmoney");
        activityOfAugust[1][1] = propertyManager.getIntProperty("user2.august.numpurchase");
        activityOfAugust[1][2] = propertyManager.getIntProperty("user2.august.numberactiveday");

    }

    public int[][] getActivityOfSeptember() {
        return activityOfSeptember;
    }

    public void setActivityOfSeptember(int[][] activityOfSeptember) {

        activityOfSeptember[0][0] = propertyManager.getIntProperty("user1.september.amountmoney");
        activityOfSeptember[0][1] = propertyManager.getIntProperty("user1.september.numpurchase");
        activityOfSeptember[0][2] = propertyManager.getIntProperty("user1.september.numberactiveday");
        activityOfSeptember[1][0] = propertyManager.getIntProperty("user2.september.amountmoney");
        activityOfSeptember[1][1] = propertyManager.getIntProperty("user2.september.numpurchase");
        activityOfSeptember[1][2] = propertyManager.getIntProperty("user2.september.numberactiveday");

    }

    public int[][] getActivityOfOctober() {
        return activityOfOctober;
    }

    public void setActivityOfOctober(int[][] activityOfOctober) {

        activityOfOctober[0][0] = propertyManager.getIntProperty("user1.october.amountmoney");
        activityOfOctober[0][1] = propertyManager.getIntProperty("user1.october.numpurchase");
        activityOfOctober[0][2] = propertyManager.getIntProperty("user1.october.numberactiveday");
        activityOfOctober[1][0] = propertyManager.getIntProperty("user2.october.amountmoney");
        activityOfOctober[1][1] = propertyManager.getIntProperty("user2.october.numpurchase");
        activityOfOctober[1][2] = propertyManager.getIntProperty("user2.october.numberactiveday");

    }

    public int[][] getActivityOfNovember() {
        return activityOfNovember;
    }

    public void setActivityOfNovember(int[][] activityOfNovember) {

        activityOfNovember[0][0] = propertyManager.getIntProperty("user1.november.amountmoney");
        activityOfNovember[0][1] = propertyManager.getIntProperty("user1.november.numpurchase");
        activityOfNovember[0][2] = propertyManager.getIntProperty("user1.november.numberactiveday");
        activityOfNovember[1][0] = propertyManager.getIntProperty("user2.november.amountmoney");
        activityOfNovember[1][1] = propertyManager.getIntProperty("user2.november.numpurchase");
        activityOfNovember[1][2] = propertyManager.getIntProperty("user2.november.numberactiveday");

    }

    public int[][] getActivityOfDecember() {
        return activityOfDecember;
    }

    public void setActivityOfDecember(int[][] activityOfDecember) {

        activityOfDecember[0][0] = propertyManager.getIntProperty("user1.december.amountmoney");
        activityOfDecember[0][1] = propertyManager.getIntProperty("user1.december.numpurchase");
        activityOfDecember[0][2] = propertyManager.getIntProperty("user1.december.numberactiveday");
        activityOfDecember[1][0] = propertyManager.getIntProperty("user2.december.amountmoney");
        activityOfDecember[1][1] = propertyManager.getIntProperty("user2.december.numpurchase");
        activityOfDecember[1][2] = propertyManager.getIntProperty("user2.december.numberactiveday");

    }
}
