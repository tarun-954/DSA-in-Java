// git remote add origin https://github.com/tarun-954/DSA-in-Java.git
// git branch -M main
// git commit -m "Day1"
// git push -u origin main
// git push -u origin main

// ///////////////////////////////////////////////////////////////////////////////////////////////////////
/*

public class day1{
    public static void main(String[] args){
    System.out.println("Hello world! DSA in Java");
    System.out.println("Start today or never");

 }
 }
 */
///////////////////////////////////////////////////////////////////////////////////////////////////////
    /*  design a pattern in java

    *
    **
    ***
    *****
    ****** 

    */
/*

import java.util.*;
    public class day1{
public static void main(String[] agrs)

{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=0;i<n;i++){
    for(int j=0;j<=i;j++){
System.out.print("*");

    }
    System.out.println(" ");
}
}    
    }
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////

// print priamid of stars 
import java.util.*;

public class day1{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        for(int i=0;i<=n;i++){
         for(int j=0;j<=n-i-1;j++){
            System.out.print(" ");
         }
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                    System.out.print("*");
                }
                System.out.println();
        }
     sc.close();
    }
}






///////////////////////////////////////////////////////////////////////////////////////////////////////
    