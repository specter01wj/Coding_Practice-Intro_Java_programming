/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_8;

import java.util.*;
/**
 *
 * @author james.wang
 */
public class Lab11_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList cityList = new ArrayList();
        
        cityList.add("DC");
        cityList.add("Denver");
        cityList.add("Miami");
        cityList.add("New York");
        cityList.add("LA");
        cityList.add("Salt Lake City");
        
        System.out.println("List size: " + cityList.size() 
                + "; Miami in list?: " + cityList.contains("Miami")
                + ";loc of Denver: " + cityList.indexOf("Denver") 
                + ";is empty?: " + cityList.isEmpty());
        System.out.println("ArrayList total: " + cityList.toString());
        
        cityList.add(2, "College Park");
        cityList.remove("Miami");
        cityList.remove(1);
        System.out.println("ArrayList total: " + cityList.toString());
        
        for(int i = cityList.size() - 1; i >= 0; i--) {
            System.out.println(cityList.get(i) + " ");
        }
        
        cityList.add(new Circle4(10));
        cityList.add(new Circle4(15));
        
        System.out.println("ArrayList area1: " + ((Circle4)cityList.get(5)).getArea()
            + "; ArrayList area2: " + ((Circle4)cityList.get(6)).getArea());
        
    }
    
}
