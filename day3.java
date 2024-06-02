// loops in java 
// for loop
//while loop
// do while loop
//////////////////////////////////////////////////////////////////////////////////////////////////
//print the numbers from one to ten
/*
import java.util.*;
public class day3 {
    public static void main(String[] args)
{
for(int i=1;i<=10;i++){

    System.out.println(i);
}
}
}
 */
/////////////////////////////////////////////////////////////////////////////////////////////////
// while loop
// print numbers froom one to ten using while loop 
/*
import java.util.*;
public class day3 {
    public static void main(String[] args)
{
int i=1;
while (i<11){
    System.out.println(i);;
    i++;
}

}
}
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////

// write from 1 to 10 using  do while 
// do while is used when we need atleast one value to be printed without checking the condition 
/*
import java.util.*;
public class day3 {
    public static void main(String[] args)
{
    int i=0;
do{
    i++;
System.err.println(i);

}
while(i<10);
}
}
 */

/////////////////////////////////////////////////////////////////////////////////////////////////////
// print the sum of first n natural numbers using for loop

/*
import java.util.*;
public class day3 {
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++){
sum=sum+i;
}
System.out.println(sum);
}
}
*/


/////////////////////////////////////////////////////////////////////////////////////////////////////

// write a code too print the table  of a number input by the user
/* 
import java.util.*;
public class day3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n +" * "+i+" "+" = "+n*i);
        }

    }
}
*/


/////////////////////////////////////////////////////////////////////////////////////////////////


// VIP pattern questions for placements
// 1. Solid rectangle
/* 

 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *

 
  */
/*
import java.util.Scanner;

public class day3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int rows=sc.nextInt();
        int colm=sc.nextInt();
        for(int i=0;i<rows;i++){
         for(int j=0;j<colm;j++){
            System.out.print("* ");
         }
         System.out.println();
        }
       

    }
}

 */
//////////////////////////////////////////////////////////////////////////////////////////////////////
// 2. Hollow Rectangle 
/*

 *  *  *  *  *
 *           *
 *           *
 *  *  *  *  *
 
 */

 /*
import java.util.*;
public class day3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int coln=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                if (i==0 || i==row-1 || j==0 || j==coln-1) {
                System.out.print(" * ");
            }
            else{
            System.out.print("   ");
            }
        }
            System.out.println();
    }
}
}

*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//print the pattern
// half piramid 
/*

 * 
 * *
 * * *
 * * * *
 * * * * *
 
 */
/* 
import java.util.*;
public class day3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){

            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



// print the pattern
// inverted half piramid 

/*

* * * * *
* * * *
* * *
* *
*

*/
/*
import java.util.*;
public class day3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){

            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}

*/

///////////////////////////////////////////////////////////////////////////////////////////////////
// Print the pattern
// half inverted patternn 
// rotated by 180 deg
/*
        *
      * *
    * * *
  * * * *
* * * * *

*/
import java.util.*;
public class day3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
                                       
            for(int j=0;j<n-i;j++)
            {
                System.out.print("v");
                   
                }
                System.out.println("* ");
        }
        sc.close();
    }
}





