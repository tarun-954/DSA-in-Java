                        /* 2D array in java */
import java.util.*;

public class day8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int coln=sc.nextInt();
        int array[][]=new int[row][coln];
        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                array[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                System.out.print(array[i][j]+ " ");          
            }
            System.out.println();
        }
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////









