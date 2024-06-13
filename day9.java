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
/* 
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


        // Access all the elements in String
        for(int i=0;i<fullName.length();i++)
{
System.out.println(fullName.charAt(i));
}    }
}
*/
/////////////////////////////////////////////////////////////////////////////////////////////

// comparing the strings in java 

import java.util.*;
public class day9{
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String name1=sc.nextLine();
String name2=sc.nextLine();

if(name1.compareTo(name2)==0){
System.out.println("String are equals");


}
else{
    System.out.println("Strings are not equal");
}
sc.close();

}

}