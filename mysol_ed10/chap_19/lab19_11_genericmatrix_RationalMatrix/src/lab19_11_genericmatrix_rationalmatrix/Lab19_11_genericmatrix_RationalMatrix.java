/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_11_genericmatrix_rationalmatrix;

/**
 *
 * @author james.wang
 */

// RationalMatrix
public class Lab19_11_genericmatrix_RationalMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rational[][] m1 = new Rational[3][3];
        Rational[][] m2 = new Rational[3][3];
        for (int i = 0; i < m1.length; i++) {
          for (int j = 0; j < m1[0].length; j++) {
            m1[i][j] = new Rational(i + 1, j + 5);
            m2[i][j] = new Rational(i + 1, j + 6);
          }
        }
        
        RationalMatrix ratMat = new RationalMatrix();

        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, ratMat.addMatrix(m1, m2), '+');

        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m1, m2, ratMat.multiplyMatrix(m1, m2), '*');
    }
    
}
