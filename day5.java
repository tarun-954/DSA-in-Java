
// Print the pattern

/* palindromic Piramid */

/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  
 */
/*
  import java.util.*;
  public class day5 {
  public static void main(String[] agrs){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  
  for(int i=1;i<=n;i++){
  for(int j=i;j<=n;j++){
  System.out.print("  ");
  }
  
  for(int j=i;j>=1;j--){
  System.out.print(j+ " ");
  
  }
  for(int j=2;j<=i;j++){
  
  System.out.print(j+" ");
  }
  
  System.out.println();
  }
  sc.close();
 
  }
  
  }
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////
// print the pattern
                        /*      Diamond pattern        */
 
/*   *
    * *
   * * *
  * * * *
 * * * * *
 * * * * *
  * * * * 
   * * *
    * *
     *

 */
/*
import java.util.*;
public class day5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=i;j<=n;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      // bottom part

      
      System.out.println();
    }
    for(int i=1;i<=n;i++){
      for(int j=n+1;j<=n+i;j++){
         System.out.print(" ");
      }
      for(int j=i;j<=n;j++){
        System.out.print("* ");
      }

      System.out.println();

    }
  }
}
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////
//Functions and methods
//Basic of the function calling and creating 
// In memorty the functions are stored in stack
// one function in the stack is called stack frame 
/*
import java.util.*;

public class day5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String n=sc.nextLine();
    // calling the function 
    printName(n);
  }
  // creating the function named printName and giving the argunment name 
  public static void printName(String name){
    System.out.println(name);
    return;
  }
}

 */
///////////////////////////////////////////////////////////////////////////////////////////////////

// Make a functions to add two numbers and return the sum oof the numbers 
/*

import java.util.*;
public class day5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
System.err.println(sum(a,b));

  }
  public static int sum(int a,int b){
    return a+b;
  }       
}

 */

//////////////////////////////////////////////////////////////////////////////////////////////////

// Make a function to multiply two numbers and return the prooduct of the twoo numbers 
/*
 
import java.util.*;
public class day5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    int pro=product(a,b);
    System.out.println(pro);
  }
  public static int product(int a,int b){
    int pro=a*b;
    return pro;
  }
}


 */

/////////////////////////////////////////////////////////////////////////////////////////////////////

// Write a function to find the factorial of number taken from user
/*
import java.util.*;
public class day5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int result=calculateFactorial(a);
    System.err.println(result);
  }
  public static int calculateFactorial(int a){
    int x=1;
    for(int i=1;i<=a;i++){
      x=x*i;

    }
    return x;
  }
}

 */
///////////////////////////////////////////////////////////////////////////////////////////////////
