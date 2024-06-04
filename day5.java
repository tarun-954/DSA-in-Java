
// Print the pattern 

                       /*     palindromic  Piramid      */

/*
                        1
                      2 1 2
                    3 2 1 2 3
                  4 3 2 1 2 3 4
                5 4 3 2 1 2 3 4 5
                 
                 */

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
