/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

/**
 *
 * @author ajay
 */
public class GradeScheme {

    public static String getGrade(int score) {
        if (score < 70) {
            return "D";
        } else if (score < 80) {
            return "C";
        } else {
            return "A";
        }
    }
    
    public static boolean isFreezing(double temp){
        if(temp<0)
            return true;
        else{
            return false;
        }
    }
}
