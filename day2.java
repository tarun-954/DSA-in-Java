//condinational statements in java

//if else in java 
// write a code to check if a number is odd or even using if and else


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


 /*
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
 */


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 //Switch case in java 
// write a switch case to print the greeting using the numbers
/* 
import java.util.*;
public class day2{
    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
int button=sc.nextInt();
switch(button){
    case 1:
    System.out.println("Hello");
    break;
    case 2:
    System.out.println("Namaste");
    break;
    case 3:
    System.out.println("Sayonara");
    break;
    default:
    System.out.println("Please choose a valid option");
    break;
}
sc.close();
    }
}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Practice questions 

// if else and switch
/*

Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.

 */

//  Solution
 /*
import java.util.*;
 public class day2{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
char c=sc.next().charAt(0);
switch(c){
    case '+' :
    System.out.println(a+b);
    break;
    case '-' :
    System.out.println(a-b);
    break;
    case '*':
    System.out.println(a*b);
    break;
    case '/':
    System.out.println(a/b);
    break;
    case '%':
    System.out.println(a%b);
    break;
    default:
    System.out.println("Please enter a valid operator");
}
    }
 }
 */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

/*

import java.util.*;
 
public class day2 {
public static void main(String[] args){
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
   
    int value=sc.nextInt();
    // function called 
    checkmonth(value);
}


// function made 
static void checkmonth(int value){
switch (value) {
    case 1:
      System.out.println("January");
        break;
        case 2:
        System.out.println("Febuary");
          break;
          case 3:
          System.out.println("March");
            break;
            case 4:
            System.out.println("April");
              break;
              case 5:
              System.out.println("May");
                break;
                case 6:
                System.out.println("June");
                  break;
                  case 7:
                  System.out.println("July");
                    break;
                    case 8:
                    System.out.println("August");
                      break;
                      case 9:
                      System.out.println("September");
                        break;
                        case 10:
                        System.out.println("Octuber");
                          break;
                          case 11:
                          System.out.println("November");
                            break;
                            case 12:
                            System.out.println("December");
                              break;


    
    default:
    System.out.println("Please enter valid month");
        break;
}
}
    
}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
