//print the pattern 
/*

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

 */

/* 
import java.util.*;
public class day4 {
   public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
//outer loop
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
   System.out.print(j+" ");
}

   System.out.println();
}


sc.close();
   }
}
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//print the pattern
/*
    
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1

 */

/*
import java.util.*;
public class day4{
   public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
   for(int j=1;j<=n-i+1;j++){
   System.out.print(j+" ");
   }
   System.out.println();
}

sc.close();

   }
}

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//print the pattern 

/*
 1 
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15

 */

/*
import java.util.*;
public class day4{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int number=1;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(number+" ");
               number++;
           }
           System.out.println();
       }
   }
}
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// print the pattern 
/*

 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1

 */
/*
 import java.util.*;
 public class day4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
             
                if((i+j)%2==0){
                    System.out.print("1 ");

                }
                else{
                System.out.print("0 ");

                }
            }

                System.out.println();
        }
    }
 }

 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Very advance questions 
// print the pattern 

/*     Butterfly Pattern      */
/*

 *             *
 * *         * *
 * * *     * * *
 * * * * * * * *
 * * * * * * * *
 * * *     * * *
 * *         * *
 *             *

 */

 /*
import java.util.*;

public class day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
           
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

        for (int j = i; j <= n; j++) {
            System.out.print("* ");
            
        }
        
        for (int j = 1; j <= 2*i-2; j++) {
            System.out.print("  ");
        }
        for (int j = i; j <= n; j++) {
            System.out.print("* ");
            
        }
        System.out.println();

    }

    }
}
 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  print the pattern
                                 /*       Solid Rhombus         */
 /*
        * * * * *
       * * * * *
      * * * * *
     * * * * *
    * * * * *

     */

     import java.util.*;
     public class day4{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
                    


            sc.close();
        }
     }




