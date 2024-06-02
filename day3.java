// loops in java 
// for loop
//while loop
// do while loop

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
