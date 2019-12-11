/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_10_genericmatrix_IntegerMatrix;

/**
 *
 * @author james.wang
 */

// IntegerMatrix
public class Lab19_10_genericMatrix_IntegerMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
        Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};
        
        IntegerMatrix intMat = new IntegerMatrix();

        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, intMat.addMatrix(m1, m2), '+');

        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m1, m2, intMat.multiplyMatrix(m1, m2), '*');
    }
    
}
