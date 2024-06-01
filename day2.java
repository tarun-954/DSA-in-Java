//condinational statements in java

//if else in java 
// write a code to check if a number is odd or even using if and else

/* 
import java.util.Scanner;

public class day2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+ " Number is even");
            
        }
        else {
            System.out.println(n+ " Number is odd");
        }
    }
}

*/



// compare two numbers 
/*
import java.util.*;
public class day2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a==b){
            System.out.println("Both the numbers are equal");
        }
        else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");

        }
    }
}
 */


 // print the greatings using if else 
import java.util.*;
 public class day2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num==1){
    System.out.println("Hello");

}
else if(num==2)
{
    System.out.println("Namaste");
}
else if(num==3){
    System.out.println("Sayonara");
}
else{
    System.out.println("Please enter a valid input");
}



    }
 }