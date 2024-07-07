// import java.util.*;

// public class One_shot_java_practice 
// {

//     public static void main(String[] args){
   
//         System.out.println("Hello World");
//         System.out.print("Tanmay");

       
//     }

// }

public class One_Shot_practice
{

    public static void main (String[] args)
    {
            // basic program print statement
        //System.out.print("hello world");
        /*
        byte  - 1 
        short - 2 
        int  -4 
        long - 8
        float - 4
        double - 8
        char - 2
        boolean - 1
 */

        // variables in java
        String name="Tarun choudhary";
        int age =1234567890;

        System.out.println(name);
        System.out.println(age);
        // length of the string
        System.out.println(name.length());

        //Strings in details
        // concatenate 
        String name1="Tarun";
        String lastName=" Choudhary";
        System.out.println(name1+lastName);
        //to print that char at the index
        //char at 
        System.out.println(name1.charAt(0));

        // replaceut    
        String name2=name1.replace('T','t');
        System.out.println(name2);
     

    
    }
}