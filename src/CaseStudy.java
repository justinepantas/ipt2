/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class CaseStudy {

   public static void main(String[] args) {
     
            
       Student srini = new Student(); 
      
        srini.name = "Srinivas";
        srini.english = 87;
        srini.telugu = 84;
        srini.hindi = 76;
        srini.maths = 100;
        srini.science = 92;
        srini.social = 88;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Detailed Marks");
        System.out.println("-------------------------------------------------");
        srini.printMarksDetails();
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Summary Marks");
        System.out.println("-------------------------------------------------");
        srini.printMarksSummary();
        System.out.println("-------------------------------------------------");
    
      int a = 11;
      int b = 6;
      double c = 7.3;
      double p = 9.4;
      int result1 = minFunction(a, b);
      
      // same function name with different parameters
      double result2 = minFunction(c, p);
      System.out.println("Minimum Value = " + result1);
      System.out.println("Minimum Value = " + result2);
      
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


   // for integer
   public static int minFunction(int n1, int n2) {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
   
   // for double
   public static double minFunction(double n1, double n2) {
     double min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
}

class Student
{
    String name;
    // Marks in various subjects
    int english;
    int telugu;
    int hindi;
    int maths;
    int science;
    int social;

    int getLanguagesTotal()
    {
        return english + telugu + hindi;
    }

    int getNonLanguagesTotal()
    {
        return maths + science + social;
    }

    int getAllSubjectsTotal()
    {
        return getLanguagesTotal() + getNonLanguagesTotal();
    }

    double getPCMPercentage()
    {
        return 100.0 * (maths + science) / 200.0;
    }

    void printMarksSummary()
    {
        System.out.println("Languages: " + getLanguagesTotal());
        System.out.println("Non languages: " + getNonLanguagesTotal());
        System.out.println("PCM Percentage: " + getPCMPercentage());
        System.out.println("Total: " + getAllSubjectsTotal());
    }

    void printMarksDetails()
    {
        System.out.println("English : " + english);
        System.out.println("Telugu : " + telugu);
        System.out.println("Hindi : " + hindi);
        System.out.println("Maths : " + maths);
        System.out.println("Science : " + science);
        System.out.println("Social : " + social);
        }
    
   
   }

    
