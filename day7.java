
/*       
Two numbers are entered by the user, x and n. Write a function to find the value of 
one number raised to the power of another i.e. x power n.              */

/*

import java.util.*;
 public class day7{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int x=sc.nextInt();
        double result=power(n,x);
        System.out.printf("%.0f",result);
    }
    public static double power(double n,double x){
       return Math.pow(n,x);
    }
 }
  */
/////////////////////////////////////////////////////////////////////////////////////////////////

// Write a function that calculates the Greatest Common Divisor of 2 numbers.
/*
import java.util.*;

public class day7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0)
{
    if(a>b){
        a=a-b;
    }
    else{
        b=b-a;
    }

}   
System.out.println(a); 
}
}

 */
/////////////////////////////////////////////////////////////////////////////////////////////////
/*

 Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

*/

/*
import java.util.*;
public class day7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int temp;
        System.out.print(first+" "+second+" ");
        for(int i=2;i<n;i++){
temp=first+second;
System.out.print(temp+" ");
first=second;
second=temp;

        }
    }
}
 */
/////////////////////////////////////////////////////////////////////////////////////////////////

                /* List of items of same datatype in java  */
                             /*    Array   */

//creation of array
/*
import java.util.*;
public class day7{
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[] array=new int[size];
for(int i=0;i<size;i++){
    array[i]=sc.nextInt();

}
for(int i=0;i<size;i++){
    System.out.print(array[i]+" ");
}

}
}

*/

//////////////////////////////////////////////////////////////////////////////////////////////////////

 /*     Take an array as input from the user. Search for a given number x and print the index at which it occure    */  

 /*
 import java.util.*;
 public class day7{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
               array[i]=sc.nextInt();

        }
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //element to find
        int x=sc.nextInt();

        for(int i=0;i<size;i++){
            if(array[i]==x){
                System.out.print("Element is at index : "+i);
            }
        }
    }
 }

*/

//////////////////////////////////////////////////////////////////////////////////////////////////////
/* Take array as am input from the user. search for a given number x and print the index at which  */































