package com.epam.ssha.matrix;

import static com.epam.ssha.matrix.util.PropertyManager.propertyManager;

/**
 * Created by aika-ssha on 07.10.2016.
 *
 * My first steps on java
 * for learning OOP concepts, language basics, code styles and etc.
 *
 * This is package for operations on matrices, like addition and transposition
 */

public class Matrix {

    private int [][] matrixJanuary = new int[2][3];
    private int [][] matrixFebruary = new int[2][3];
    private int [][] matrixMarch = new int[2][3];
    private int [][] matrixApril = new int[2][3];
    private int [][] matrixMay = new int[2][3];
    private int [][] matrixJune = new int[2][3];
    private int [][] matrixJule = new int[2][3];
    private int [][] matrixAugust = new int[2][3];
    private int [][] matrixSeptember = new int[2][3];
    private int [][] matrixOctober = new int[2][3];
    private int [][] matrixNovember = new int[2][3];
    private int [][] matrixDecember = new int[2][3];

    private int [][] matrixResult = new int[2][3];

    public Matrix() {

        setMatrixJanuary(matrixJanuary);
        setMatrixFebruary(matrixFebruary);
        setMatrixResult(matrixResult);
    }

    public Matrix(int[][] matrixResult) {
        this.matrixResult = matrixResult;
    }


    public int[][] getMatrixJanuary() {
        return matrixJanuary;
    }

    public void setMatrixJanuary(int[][] matrixJanuary) {

        matrixJanuary[0][0] = propertyManager.getIntProperty("user1.january.amountmoney");
        matrixJanuary[0][1] = propertyManager.getIntProperty("user1.january.numpurchase");
        matrixJanuary[0][2] = propertyManager.getIntProperty("user1.january.numberactiveday");
        matrixJanuary[1][0] = propertyManager.getIntProperty("user2.january.amountmoney");
        matrixJanuary[1][1] = propertyManager.getIntProperty("user2.january.numpurchase");
        matrixJanuary[1][2] = propertyManager.getIntProperty("user2.january.numberactiveday");

    }

    public int[][] getMatrixFebruary() {
        return matrixFebruary;
    }

    public void setMatrixFebruary(int[][] matrixFebruary) {

        matrixFebruary[0][0] = propertyManager.getIntProperty("user1.february.amountmoney");
        matrixFebruary[0][1] = propertyManager.getIntProperty("user1.february.numpurchase");
        matrixFebruary[0][2] = propertyManager.getIntProperty("user1.february.numberactiveday");
        matrixFebruary[1][0] = propertyManager.getIntProperty("user2.february.amountmoney");
        matrixFebruary[1][1] = propertyManager.getIntProperty("user2.february.numpurchase");
        matrixFebruary[1][2] = propertyManager.getIntProperty("user2.february.numberactiveday");

    }

    public int[][] getMatrixMarch() {
        return matrixMarch;
    }

    public void setMatrixMarch(int[][] matrixMarch) {

        matrixMarch[0][0] = propertyManager.getIntProperty("user1.march.amountmoney");
        matrixMarch[0][1] = propertyManager.getIntProperty("user1.march.numpurchase");
        matrixMarch[0][2] = propertyManager.getIntProperty("user1.march.numberactiveday");
        matrixMarch[1][0] = propertyManager.getIntProperty("user2.march.amountmoney");
        matrixMarch[1][1] = propertyManager.getIntProperty("user2.march.numpurchase");
        matrixMarch[1][2] = propertyManager.getIntProperty("user2.march.numberactiveday");

    }

    public int[][] getMatrixApril() {
        return matrixApril;
    }

    public void setMatrixApril(int[][] matrixApril) {

        matrixApril[0][0] = propertyManager.getIntProperty("user1.april.amountmoney");
        matrixApril[0][1] = propertyManager.getIntProperty("user1.april.numpurchase");
        matrixApril[0][2] = propertyManager.getIntProperty("user1.april.numberactiveday");
        matrixApril[1][0] = propertyManager.getIntProperty("user2.april.amountmoney");
        matrixApril[1][1] = propertyManager.getIntProperty("user2.april.numpurchase");
        matrixApril[1][2] = propertyManager.getIntProperty("user2.april.numberactiveday");

    }

    public int[][] getMatrixMay() {
        return matrixMay;
    }

    public void setMatrixMay(int[][] matrixMay) {

        matrixMay[0][0] = propertyManager.getIntProperty("user1.may.amountmoney");
        matrixMay[0][1] = propertyManager.getIntProperty("user1.may.numpurchase");
        matrixMay[0][2] = propertyManager.getIntProperty("user1.may.numberactiveday");
        matrixMay[1][0] = propertyManager.getIntProperty("user2.may.amountmoney");
        matrixMay[1][1] = propertyManager.getIntProperty("user2.may.numpurchase");
        matrixMay[1][2] = propertyManager.getIntProperty("user2.may.numberactiveday");

    }

    public int[][] getMatrixJune() {
        return matrixJune;
    }

    public void setMatrixJune(int[][] matrixJune) {

        matrixJune[0][0] = propertyManager.getIntProperty("user1.june.amountmoney");
        matrixJune[0][1] = propertyManager.getIntProperty("user1.june.numpurchase");
        matrixJune[0][2] = propertyManager.getIntProperty("user1.june.numberactiveday");
        matrixJune[1][0] = propertyManager.getIntProperty("user2.june.amountmoney");
        matrixJune[1][1] = propertyManager.getIntProperty("user2.june.numpurchase");
        matrixJune[1][2] = propertyManager.getIntProperty("user2.june.numberactiveday");

    }

    public int[][] getMatrixJule() {
        return matrixJule;
    }

    public void setMatrixJule(int[][] matrixJule) {

        matrixJule[0][0] = propertyManager.getIntProperty("user1.jule.amountmoney");
        matrixJule[0][1] = propertyManager.getIntProperty("user1.jule.numpurchase");
        matrixJule[0][2] = propertyManager.getIntProperty("user1.jule.numberactiveday");
        matrixJule[1][0] = propertyManager.getIntProperty("user2.jule.amountmoney");
        matrixJule[1][1] = propertyManager.getIntProperty("user2.jule.numpurchase");
        matrixJule[1][2] = propertyManager.getIntProperty("user2.jule.numberactiveday");

    }

    public int[][] getMatrixAugust() {
        return matrixAugust;
    }

    public void setMatrixAugust(int[][] matrixAugust) {
        matrixAugust[0][0] = propertyManager.getIntProperty("user1.august.amountmoney");
        matrixAugust[0][1] = propertyManager.getIntProperty("user1.august.numpurchase");
        matrixAugust[0][2] = propertyManager.getIntProperty("user1.august.numberactiveday");
        matrixAugust[1][0] = propertyManager.getIntProperty("user2.august.amountmoney");
        matrixAugust[1][1] = propertyManager.getIntProperty("user2.august.numpurchase");
        matrixAugust[1][2] = propertyManager.getIntProperty("user2.august.numberactiveday");

    }

    public int[][] getMatrixSeptember() {
        return matrixSeptember;
    }

    public void setMatrixSeptember(int[][] matrixSeptember) {

        matrixSeptember[0][0] = propertyManager.getIntProperty("user1.september.amountmoney");
        matrixSeptember[0][1] = propertyManager.getIntProperty("user1.september.numpurchase");
        matrixSeptember[0][2] = propertyManager.getIntProperty("user1.september.numberactiveday");
        matrixSeptember[1][0] = propertyManager.getIntProperty("user2.september.amountmoney");
        matrixSeptember[1][1] = propertyManager.getIntProperty("user2.september.numpurchase");
        matrixSeptember[1][2] = propertyManager.getIntProperty("user2.september.numberactiveday");

    }

    public int[][] getMatrixOctober() {
        return matrixOctober;
    }

    public void setMatrixOctober(int[][] matrixOctober) {

        matrixOctober[0][0] = propertyManager.getIntProperty("user1.october.amountmoney");
        matrixOctober[0][1] = propertyManager.getIntProperty("user1.october.numpurchase");
        matrixOctober[0][2] = propertyManager.getIntProperty("user1.october.numberactiveday");
        matrixOctober[1][0] = propertyManager.getIntProperty("user2.october.amountmoney");
        matrixOctober[1][1] = propertyManager.getIntProperty("user2.october.numpurchase");
        matrixOctober[1][2] = propertyManager.getIntProperty("user2.october.numberactiveday");

    }

    public int[][] getMatrixNovember() {
        return matrixNovember;
    }

    public void setMatrixNovember(int[][] matrixNovember) {

        matrixNovember[0][0] = propertyManager.getIntProperty("user1.november.amountmoney");
        matrixNovember[0][1] = propertyManager.getIntProperty("user1.november.numpurchase");
        matrixNovember[0][2] = propertyManager.getIntProperty("user1.november.numberactiveday");
        matrixNovember[1][0] = propertyManager.getIntProperty("user2.november.amountmoney");
        matrixNovember[1][1] = propertyManager.getIntProperty("user2.november.numpurchase");
        matrixNovember[1][2] = propertyManager.getIntProperty("user2.november.numberactiveday");

    }

    public int[][] getMatrixDecember() {
        return matrixDecember;
    }

    public void setMatrixDecember(int[][] matrixDecember) {

        matrixDecember[0][0] = propertyManager.getIntProperty("user1.december.amountmoney");
        matrixDecember[0][1] = propertyManager.getIntProperty("user1.december.numpurchase");
        matrixDecember[0][2] = propertyManager.getIntProperty("user1.december.numberactiveday");
        matrixDecember[1][0] = propertyManager.getIntProperty("user2.december.amountmoney");
        matrixDecember[1][1] = propertyManager.getIntProperty("user2.december.numpurchase");
        matrixDecember[1][2] = propertyManager.getIntProperty("user2.december.numberactiveday");

    }

    public int[][] getMatrixResult() {
        return matrixResult;
    }

    public int[][] setMatrixResult(int[][] matrixResult) {

        for (int i = 0; i < matrixResult.length; i++) {

            for (int j = 0; j < matrixResult[0].length; j++) {

                matrixResult[i][j] = getMatrixFebruary()[i][j] + getMatrixJanuary()[i][j];
            }
        }

        return matrixResult;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("MatrixJanuary:").append("\n").append("\n");
        for (int i = 0; i < getMatrixJanuary().length; i++) {

            for (int j = 0; j < getMatrixJanuary()[0].length; j++) {

                sb.append(getMatrixJanuary()[i][j]).append("\t\t");
            }
            sb.append("\n");
        }

        sb.append("\n").append("MatrixFebruary:").append("\n").append("\n");
        for (int i = 0; i < getMatrixFebruary().length; i++) {

            for (int j = 0; j < getMatrixFebruary()[0].length; j++) {

                sb.append(getMatrixFebruary()[i][j]).append("\t\t");
            }
            sb.append("\n");
        }

        sb.append("\n").append("RESULT:").append("\n").append("\n");
        for (int i = 0; i < getMatrixResult().length; i++) {

            for (int j = 0; j < getMatrixResult()[0].length; j++) {

                sb.append(getMatrixResult()[i][j]).append("\t\t");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}
