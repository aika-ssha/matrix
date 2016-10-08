package com.epam.ssha.matrix;

/**
 * Created by aika-ssha on 07.10.2016.
 *
 * My first steps on java
 * for learning OOP concepts, language basics, code styles and etc.
 *
 * This is package for operations on matrices, like addition and transposition
 */

public class Matrix {

    private int [][] values;

    public Matrix(int cols, int rows, int[][] values){

        this.values = values;
    }

    public int[][] getValues() {
        return values;
    }

    public void setValues(int[][] values) {
        this.values = values;

    }

    public void addition (Matrix matrix2){
        if (matrix2 == null) {
            throw new NullPointerException();
        }

        int matrix1cols = values.length;
        int matrix1rows = values[0].length;


    }

}
