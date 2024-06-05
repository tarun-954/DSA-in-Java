/* Functions and methods praactice questions  */
//Q1

// Enter 3 numbers  from the user and make a function to print their average
/*
import java.util.*;
public class day6 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int result=average(a,b,c);
System.out.println(result);

}
public static int average(int a,int b,int c){
return (a+b+c)/3;

}
}
    */ 

/////////////////////////////////////////////////////////////////////////////////////////////////////
// Q2
// write a function to print the sum of all odd numbers from 1 to n ;
  /*

import java.util.*;
public class day6{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int result=sumOfOddNumbers(n);
System.out.println(result);

    }
    public static int sumOfOddNumbers(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
                   }
       return sum;
                }
            }

           */

//////////////////////////////////////////////////////////////////////////////////////////////////////
// write a functin to take two input from the user and return the greater of those 
/*
import java.util.*;
public class day6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();

        long result=greater(a,b);
        System.out.println(result);
    }
    public static long greater(long a,long b){
        if(a==b){
            return 0;
        }
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}

 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////

 // write a function that takes in the radius as input and return the circumfrence of a circle 

 /*
 import java.util.*;
 public class day6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double result = circumfrence(r);
        System.out.printf("%.2f",result);
    }
public static double circumfrence(int r){
    return 2*Math.PI*r;
}
 }
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a function that takes age as input and returns if that person is eligible to vote or not . A person of age > 18 is eligible for vote
/*
import java.util.*;
public class day6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    boolean result=IsEligible(age);
    if(result==true){
        System.out.println("Eligible for voting");
    }
    else
    {
        System.out.println("Not Eligible for voting");
    }

    }
    public static boolean IsEligible(int age){
        if(age>18){
            return true;
        }
        else{
            return false;
        }
    }
}
 */

////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Write an infinity loop using do while condition
/*
import java.util.*;
public class day6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        infinityloop();
    }
    public static void infinityloop(){
        int i=0;
        do{
            i++;
            System.out.print(i+" ");
            
        }
        while(i>0);

    }
}

 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////
//write a program to enter the numbers  till the user wants and at the end it should display the count of positive negative
/* 
import java.util.*;
public class day6{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        int positive=0;
        int negative=0;

        while(choice!=0){
         choice=sc.nextInt();
         if(choice>=0){
            positive++;
         }
         else{
            negative++;
         }

            
        }
        System.out.println("positive values are : "+positive );
        System.out.println("Negative values are : "+negative);
        
    }
}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered 
import java.util.*;

 

public class day6{

   public static void main(String args[]) {

       int positive = 0, negative = 0, zeros = 0;

       System.out.println("Press 1 to continue & 0 to stop");

       Scanner sc = new Scanner(System.in);

       int input = sc.nextInt();

 

       while(input == 1) {

           System.out.println("Enter your number : ");

           int number = sc.nextInt();

           if(number > 0) {

               positive++;

           } else if(number < 0) {

               negative++;

           } else {

               zeros++;

           }

 

           System.out.println("Press 1 to continue & 0 to stop");

           input = sc.nextInt();

       }

 

       System.out.println("Positives : "+ positive);

       System.out.println("Negatives : "+ negative);

       System.out.println("Zeros : "+ zeros);

   }   

}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*         Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x power n.              */


