/*
Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below: 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
*/

import java.util.*;
public class Masks{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your marks");
            int n = sc.nextInt();
            masks(n);
        }
    }

    public static void masks(int n){
        
       if(n<=100 && n>=91) {System.out.println("AA");}
       if(n<=90 && n>=81) {System.out.println("AB");}
       if(n<=80 && n>=71) {System.out.println("BB");}
       if(n<=70 && n>=61) {System.out.println("BC");}
       if(n<=60 && n>=51) {System.out.println("CD");}
       if(n<=50 && n>=41) {System.out.println("DD");}
       if(n<=40) {System.out.println("FAIL");}
        
    }

}
