/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringsinjava;

/**
 *
 * @author USER
 */
public class StringsInJava {

    public static void main(String[] args) {
    /*    
      String str;//String declaration
      String str1 = "abc";//String initialization(String literal)
      
    String st1 = "hello world";//declaring string literals like this makes more efficeint in terms of memory optimization
    String st2 =  "hello world";
    String st3 =  "hello world";
    
    System .out.println(st1 == st2);
      System .out.println(st1 == st3);
      
      String str4 = new String("hello");//creating string objects with the new keyword makes it to  be less memory efficient
      String str5 = new String("hello");
      
          System .out.println(str4 == str5);
          
          //CONCATENATION IN STRINGS USES THE PLUS(+) OPERATOR
          
          String g = "I am here now,";
          String d ="we can be friends";
         int num1 = 10;
         int num2 = 30;
 //AFTER THE STRING, JAVA SEES EVERY OTHER VALUE AS A STRING REGARDLESS OF ITS DATA TYPE
          System.out.println( num1+num2+g+d+num1+num2);
          System.out.print(num1+num2);
                    System.out.print(g+d);
                              System.out.print(num1+num2);
                              */
                              
                       //STRING METHODS       
                         // LENGTH METHOD  
                         
                         String r = "howfar you";     
                         String e = "C0ME";    
                System.out.println(r.length());
                 System.out.println(e.length());  
                 //BELOW IS THE charAT METHOD(IT PRINTS THE CHJARACYERS OF THE TEXT BASED ON THE INDEX GIVEN....MORE LIKE ARRAYS)
                 //unlike length that counts actual value, charAT uses index from 0 
                 System.out.println("my character is:"+ r.charAt(0));
                   System.out.println("my character is:"+r.charAt(4)); 
                    System.out.println("my character is:"+r.charAt(2));
                    System.out.println("my character is:"+r.charAt(5));
                       System.out.println("my character is:"+e.charAt(3));
                       
                       // THE substring METHOD (the output has beginning and end based on the index given, which can be into chunks of a text)
                  String m = "we will get there";  
                 System.out.println(m.substring(3,17 ));
                 
                 //THE indexOf METHOD
  System.out.println("My index output is :" + m.indexOf('g') );
                 
  //THE lastIndexOf METHOD
  System.out.println("last index of"+ "'w'" + "is:" + m.indexOf('w'));
        
  // THE startsWith(prefix) and endsWith(suffix) METHOD this uses the booleanm data types to check if its TRUE or FALSE
  
    System.out.println("starts with 'we':" + m.startsWith("we"));
    System.out.println("ends with 'there':" + m.endsWith("there"));      
                 
  // THE toLowerCase and toUpperCase METHOD
  
  System.out.println("Displays the characters of 'm' in uppercase:" + m.toUpperCase());
    System.out.println("Displays the characters of 'm' in lowercase:" +m.toLowerCase());                           
                              
    System.out.println("..................................................");                 
  // THE trim METHOD (used specifically to cut off the spaces only at the beginning and at the end of a text or sentence)
  //case 1 with leading and trailing spaces
  String k1 = "      i will be a good java developer      ";
  
       //case 2 with leading white space   
   String k2 = "       i will be a good java developer";
   
    //case 3 without white space  
    String k3 = "i will be a good java developer";
    
       //case 4 trailing white space      
    String k4 = "i will be a good java developer     ";
    
           //case 5 no unecessarry white space      
    String k5 = "i will be a good java developer";    
    
      //case 6 white spcaes at the midlle    
    String k6 = "i will be a           good java developer";    
                              
   System.out.println("case 1: with leading and trailing spaces:" + k1.trim());
   System.out.println("case 2: with leading white space  :" + k2.trim());          
   System.out.println("case 3: without white space " + k3.trim());
   System.out.println("case 4: trailing white space:" + k4.trim());
   System.out.println("case 5: no unecessarry white space   :" + k5.trim());
   System.out.println("case 6: white spaces at the midlle:" + k6.trim());
    
    System.out.println("..................................................");        
    // THE replace METHOD (this replaces and old character with a new one )
    String k = "KENNEDY";
    System.out.println("my name is :" +k);
    System.out.println("'K' will be replaced with 'J':" + k.replace('K','J'));
    
     System.out.println(".................................................."); 
    // THE replaceAll METHOD(this replaces a text with a new one)
    String kj = "God will help us all. I know God is good all the time";
     System.out.println("the word 'God' will be replaced with the word 'Jesus':" +kj.replaceAll("God", "Jesus"));
    
      System.out.println(".................................................."); 
    // THE split METHOD(this breaks each word in a sentence to start on the next line 
//white space or punctuation marks are used within semi colon to differiantaite each words)

// the code below uses white spaces to saperate each word
    String str = "this is to show how the 'split' method works";
    String[] splitted = str.split(" ");
    for (String  words : splitted ) {
    System.out.println(words);
    }
    
    //the code below uses the coma(,) to saperate each word
    String st = "this, is, to, show, how, the, 'split', method, works";
    String[] splitt = st.split(",");
    for (String  word : splitt ) {
    System.out.println(word);
    }
    
      System.out.println(".................................................."); 
    //the code below uses different puntuation marks or delimeter to saperate each word
     String s = "this, is. to: show; how? the, 'split', method, works";
    String[] spitt = s.split("[,.:;?,,,]");
    for (String  wrd : spitt ) {
    System.out.println(wrd);
    }
    
    //the code below uses limit numbers which could be any integer to saperate each word
    System.out.println(".................................................."); 
    String tg = "this is to show how the 'split' method works";
    String[] sptt = tg.split(" ", 4);
    for (String  wd : sptt ) {
    System.out.println(wd);
    }
    
    
      System.out.println(".................................................."); 
    // the concat METHOD (this method concatenates without using the plus(+) operator )
    String g = "nkweatu ";
    System.out.println("this will concatenate: " + g.concat("kennedy"));
    
    // the eqauls METHOD (returns either TRUE or FALSE)
    String ch = "love";
    String R =  "respect";
    System.out.println("This code checks if the condition is true or false :" +ch.equals(R));
    
    // the eqaulsIgnoreCase METHOD (returns either TRUE or FALSE irrespective of the case)
    String T= "love";
    String F ="Love";
    System.out.println("This code checks if the condition is true or false not minding the case :" +T.equalsIgnoreCase(F));

     // the isEmpty METHOD (checks if a variable string is empty or not and returns either TRUE or FALSE)
    String Q ="";
    System.out.println("This code checks if the varaiable string is empty and returns either true or false:" + Q.isEmpty());
    
    // the compareTo method(checks if strings lexical value are thesame or not and returms either 0 for true or a number less or greater the string value)
    String b = "fine";
    String a = "fine";
    System.out.println("This checks if the strings value are same:" + b.compareTo(a));
    
    //the formatting METHOD (this helps to format numbers with much decimal value so they can be read easily)
    
    double var = 324.453543544;// the code is to format double numbers to float
    String formatted = String.format("%.1f", var);
    System.out.println("The formatted value is:" + formatted);
    
   int va = 324; //the code is to format integer to double
    String formatt = String.format("%d", va);
    System.out.println("The formatted value is:" + formatt);
    
    String lastName = "Titus";
    String formatted1 = String.format("the full name is chubueze %s", lastName);
    System.out.println(formatted1);
    
    //The bolean formatting METHOD(checks if a boolean type is true or false)
    boolean jacinta = true;
    String formatted2 = String.format("jacinta is a girl %b", jacinta);
     System.out.println(formatted2);
    
   int ken = 223;// the printf(function) can be used to format numbers
   System.out.printf("the value of ken %5d", ken);
   
  System.out.println("..................................................");  
    System.out.printf("the value of the following %d %b %s", ken, jacinta, lastName);
     
  System.out.println("..................................................");  
    //heap and String constant pool-scp(memory allocation in strings)
    
    String str1 = new String("new year");//str1 and str2 different memory location but same content
    String str2 = new String("new year");//in this case, two objets are created using the new keyword
    String str3 = "new year";//str3 is same as str4 only one object is created refering to thesame memory allocation
    String str4 = "new year";
    
    System.out.println(str1==str2);//false, because this is object referencing not the content
    System.out.println(str1.equals(str2)); //true, this is content comparison  
    System.out.println(str3==str4);
    System.out.println(str3.equals(str4));
    
    String h = new String("hope");
    String hf = h.concat("  ogedengbe");
    String f = hf.concat(" hello");
    System.out.println(f);
    
    // to study string immutablity and token sizer.....
    //string class is immutable in nature which means when a variable is being 
    //initialized in a memory allocation, the content cannnot be changed
    //below is how to create our own immutable class
    //the 'final' keyword is used to declare a constant which cannoty be changed in the course of a executing a program
    
  
    
    
    // using the StringBuffer() METHOD
    StringBuffer obj = new StringBuffer();// default initial capacity is 16
    System.out.println("The capacity of the object is:" +obj.capacity());//the capacity method checks how many charcters can hold a string
    //capacity changes like:(curret capacity + 1)*2
    obj.append("abcdefghijklmnopq");
    System.out.println(obj.capacity());
    
    String ob = "mine";
    StringBuffer obj2 = new StringBuffer(ob);
    System.out.println(obj2.capacity());
    
    //setCharAt method inStringBuffer is the same with the 'replace' method in Strings
    StringBuffer obj4 = new StringBuffer("i am the best");
    obj4.setCharAt(2, 'k');
    System.out.println(obj4.toString());// replaces the character of the index given
    
    //The 'append()' METHOD in StringBuffer is the same as the 'concat' METHOD in String
    StringBuffer obj5 = new StringBuffer("best");
    obj5.append(" hope");
    System.out.println(obj5.toString());
    
    //The'insert(' METHOD still behaves like the concat method in string, the number index must correspond with the string you are to insert to the new word created
     StringBuffer obj6 = new StringBuffer("nice");
    obj6.insert(4, " guy");
    System.out.println(obj6.toString());
    
    //The 'delete()' METHOD in StringBuffer delets a string based on the index of number choosen from strat of the word to the end
    StringBuffer obj7 = new StringBuffer("nice one here");//indices starts from 0
    obj7.delete(5, 8);
    System.out.println(obj7.toString());
    
    //The 'deleteCharAt()' METHOD deletes just a character from a string based on the index given
    StringBuffer obj8 = new StringBuffer("we love youu");//indices starts from 0
    obj8.deleteCharAt(11);
    System.out.println(obj8.toString());
    
    //The 'reverse' METHOD brings out the string characters in a reverse way i.e starting from behind 
    StringBuffer obj9 = new StringBuffer("becareful!");//indices starts from 0
    obj9.reverse();
    System.out.println(obj9.toString());
    
    //The 'setLength' METHOD which outputs the string based on the given length by the programmer which starts from 0
    StringBuffer obj10 = new StringBuffer("becareful! i am here now");//indices starts from 0
    System.out.println("Before setting length:" + obj10.toString());
    obj10.setLength(20);
    System.out.println("After setting length:" + obj10.toString());
    
    //The 'ensureCapacity' METHOD
    StringBuffer obj11 = new StringBuffer("i am here for you");//indices starts from 0
    System.out.println("original content is:" + obj11.toString());
    System.out.println("original capacity:" + obj11.capacity());
    
    obj11.ensureCapacity(25);
    System.out.println("updated content:" + obj11.toString());
    System.out.println("updated capacity:" + obj11.capacity());
    
    // The 'trimToSize()' METHOD mostly sued for memory efficieny
    StringBuffer obj12 = new StringBuffer("we are united in christ");//indices starts from 0
    System.out.println("Original size is:" + obj12.toString());
    System.out.println(obj12.capacity());      
    
    StringBuffer obj13 = new StringBuffer("welcome");
    System.out.println(obj13); 
    
     StringBuffer obj14 = new StringBuffer("welcome");
    System.out.println(obj14);
    
    String gd = "good";
    System.out.println(gd);
    
    String gdd = "good";
    System.out.println(gdd);
    
    //StringBuilder() method is almost thesame as the StringBuffer method
    }
}
