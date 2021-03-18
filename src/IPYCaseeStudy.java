/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipycaseestudy;

import java.util.Scanner;

/**
 *
 * @author Rebb
 */
public class IPYCaseeStudy {

   
static     Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("Are you a student here");
      
            System.out.println(legalage(18));
             System.out.println("This is your Subject");
            String[][] sb={{"Math(2.50)","Enlish(1.50)","Programming(2.0)"},{"Capstone(2.25)","IPT(1.0)","SAM(1.25)"}};
            sub(sb);
             System.out.println("this is your average");
             double d = grade(2.50,1.50,2.0,2.25,1.0,1.25);
             System.out.println(d/6);
            
    }
    
    public static boolean legalage(int age){
   
    if(age >= (18)){ 
        return true;
       
    }  else{
        return false;
    } 
}
    public static void sub(String[][] sb ){
    
        for(String[] Sub: sb){
        for(String s: Sub){
        System.out.print(s+" ");
        }
        System.out.println();
        }
        
    }
    public static double grade(double m, double e, double p, double c, double i, double s){
        return m+e+p+c+i+s;
        
        
    }  
}
