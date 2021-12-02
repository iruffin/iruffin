/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personal.projects;
import java.util.Scanner;
/**
 *
 * @author Ivey
 */
public class ProblemSolver {
    public Scanner user = new Scanner(System.in);

    //public ProblemSolver(){
    //}

    private int[][] matrix;
    private int[][] newMatrix;

    public int[][] getMatrix(){
        return matrix;
    }

    //METHODS

    //gets the new matrix and prints it back out turned 90 degrees to the right
    public void getNewMatrix(){
        for(int i = 0; i < newMatrix.length; i++){
            for(int j = 0; j < newMatrix[0].length; j++){
                System.out.print(newMatrix[i][j]);
            }
            System.out.println();
        }
    }
    
    //sets new matrix up with double array
    public void setMatrix(int rows, int columns){
        matrix = new int[rows][columns];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = user.nextInt();
            }
        }
    }

    //turns a matrix of 2d array by 90 degrees to the right
    public void flipMatrix(int[][] matrix){
        newMatrix = new int[matrix.length][matrix[0].length];
        
        for(int i = 0; i < matrix[0].length; i++){
            int k = 0;
            for(int j = matrix.length - 1; j >= 0; j--){
                newMatrix[i][k] = matrix[j][i];
                k++;
            }
        }
        //return newMatrix;
    }

    public static void main(String[] args){
        ProblemSolver me = new ProblemSolver();
        me.setMatrix(3, 3);
        //int[][] array = new int
        me.flipMatrix(me.getMatrix());
        me.getNewMatrix();
              
    }
}
