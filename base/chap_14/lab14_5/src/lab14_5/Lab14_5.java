/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_5;

import java.util.*;
/**
 *
 * @author james.wang
 */
public class Lab14_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar calendar = new GregorianCalendar();
        
        System.out.println("Current time: " + new Date());
        System.out.println("Year: " + calendar.get(Calendar.YEAR) + 
                ", Month: " + calendar.get(Calendar.MONTH) +
                ", Date: " + calendar.get(Calendar.DATE) +
                ", Hour: " + calendar.get(Calendar.HOUR) +
                ", Hour of day: " + calendar.get(Calendar.HOUR_OF_DAY) );
        
        Calendar calendar1 = new GregorianCalendar(2018, 10, 19);
        System.out.println("11/19/2018: " + 
                dayNameOfWeek(calendar1.get(Calendar.DAY_OF_WEEK)));
    }
    
    public static String dayNameOfWeek(int dayOfWeek) {
        switch(dayOfWeek) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return null;
        }
    }
    
}
