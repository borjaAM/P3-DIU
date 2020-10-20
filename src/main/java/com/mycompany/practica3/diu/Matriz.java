/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica3.diu;

import java.util.Random;

/**
 *
 * @author Grupo 06
 */
public class Matriz {

    private int min;
    private int max;
    private int[][] matrix;
    
    public Matriz(int min, int max) {
        matrix = new int[10][10];
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    
    public void actualizarMatriz(){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(getMax() + 1 - getMin()) + getMin();
            }
        }
    }
    
    public String umbral(int umbral){
        String matrizUmbral = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > umbral){
                    matrizUmbral += String.valueOf(matrix[i][j]) + "\t";
                } else {
                    matrizUmbral += "-\t";
                }
            }
            matrizUmbral += "\n";
        }
        return matrizUmbral;
    }
    
    @Override
    public String toString(){
        String res ="";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res += matrix[i][j] + "\t";
            }
            res += "\n";
        }
        return res;
    }
}
