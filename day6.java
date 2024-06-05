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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
