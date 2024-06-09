public class day10 {
    public static void main(String[] args){
        String s1="Welcome";  
String s2="Welcome";//It doesn't create a new instance



/* In the above example, only one object will be created. Firstly, JVM will not find any string object with the value "Welcome" in string constant pool that is why it will create a new object. After that it will find the string with the value "Welcome" in the pool, it will not create a new object but will return the reference to the same instance.

Note: String objects are stored in a special memory area known as the "string constant pool".
*/

String s4="java";//creating string by Java string literal    
char ch[]={'s','t','r','i','n','g','s'};    
String s5=new String(ch);//converting char array to string    
String s6=new String("example");//creating Java string by new keyword    
System.out.println(s4);    
System.out.println(s5);    
System.out.println(s6);   



//java String charAt() Method

String name="Tarun choudhary";  
char ch1=name.charAt(4);//returns the char value at the 4th index  
System.out.println(ch1);  

// java String format()
String name2="Tarun";  
String sf1=String.format("name is %s",name2);  
String sf2=String.format("value is %f",32.33434);  
String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
  
System.out.println(sf1);  
System.out.println(sf2);  
System.out.println(sf3);  


String str1 = String.format("%d", 101);          // Integer value  
String str2 = String.format("%s", "Tarun choudhary"); // String value  
String str3 = String.format("%f", 101.00);       // Float value  
String str4 = String.format("%x", 101);          // Hexadecimal value  
String str5 = String.format("%c", 'c');          // Char value  
System.out.println(str1);  
System.out.println(str2);  
System.out.println(str3);  
System.out.println(str4);  
System.out.println(str5);  

    }
}
