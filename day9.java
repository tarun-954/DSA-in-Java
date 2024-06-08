/*

import java.util.*;
public class day9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String firstname=sc.nextLine();
        String lastname=sc.nextLine();
        System.out.println(firstname+" "+lastname);

    }
}

 */
/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
public class day9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String firstname=sc.nextLine();
        String lastname=sc.nextLine();
        System.out.println(firstname+" "+lastname);
        // finding the length 
        // use inbuild length function
        String fullName=firstname+lastname;
        System.out.println(fullName.length());
    }
}
