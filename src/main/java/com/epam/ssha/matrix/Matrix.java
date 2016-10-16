package com.epam.ssha.matrix;

import com.epam.ssha.matrix.entity.MonthlyActivity;

/**
 * Created by aika-ssha on 07.10.2016.
 *
 * My first steps on java
 * for learning OOP concepts, language basics, code styles and etc.
 *
 * This is package for operations on matrices, like addition and transposition
 */

public class Matrix {

    private int [][] matrixResult = new int[2][3];

    MonthlyActivity monthlyActivity = new MonthlyActivity();

    public int[][] getJanuary() {
        return monthlyActivity.getActivityOfJanuary();
    }

    public int[][] getFebruary() {
        return monthlyActivity.getActivityOfFebruary();
    }

    public int[][] getMarch() {
        return monthlyActivity.getActivityOfMarch();
    }

    public int[][] getApril() {
        return monthlyActivity.getActivityOfApril();
    }

    public int[][] getMay() {
        return monthlyActivity.getActivityOfMay();
    }

    public int[][] getJune() {
        return monthlyActivity.getActivityOfJune();
    }

    public int[][] getJule() {
        return monthlyActivity.getActivityOfJule();
    }

    public int[][] getAugust() {
        return monthlyActivity.getActivityOfAugust();
    }

    public int[][] getSeptember() {
        return monthlyActivity.getActivityOfSeptember();
    }

    public int[][] getOctober() {
        return monthlyActivity.getActivityOfOctober();
    }

    public int[][] getNovember() {
        return monthlyActivity.getActivityOfNovember();
    }

    public int[][] getDecember() {
        return monthlyActivity.getActivityOfDecember();
    }

    public Matrix (){
        setMatrixResult(matrixResult);
    }

    public int[][] getMatrixResult() {
        return matrixResult;
    }

    public int[][] setMatrixResult(int[][] matrixResult) {

        for (int i = 0; i < matrixResult.length; i++) {

            for (int j = 0; j < matrixResult[0].length; j++) {

                matrixResult[i][j] =
                        getJanuary()[i][j] + getFebruary()[i][j]
                        + getMarch()[i][j] + getApril()[i][j]
                        + getMay()[i][j] + getJune()[i][j]
                        + getJule()[i][j] + getAugust()[i][j]
                        + getSeptember()[i][j] + getOctober()[i][j]
                        + getNovember()[i][j] + getDecember()[i][j];
            }
        }

        return matrixResult;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("MatrixJanuary:").append("\n").append("\n");
        for (int i = 0; i < getJanuary().length; i++) {

            for (int j = 0; j < getJanuary()[0].length; j++) {

                sb.append(getJanuary()[i][j]).append("\t\t");
            }
            sb.append("\n");
        }

        sb.append("\n").append("MatrixFebruary:").append("\n").append("\n");
        for (int i = 0; i < getFebruary().length; i++) {

            for (int j = 0; j < getFebruary()[0].length; j++) {

                sb.append(getFebruary()[i][j]).append("\t\t");
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
