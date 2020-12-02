package com.BasicOfJava.dev;
import java.util.Scanner;
/**
 * 	QUESTION
 * We define the following terms:
       A<B<C....<Z
Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Input Format

The first line contains a string denoting .
The second line contains an integer denoting .

Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
 
Output Format

Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

Sample Input 0

welcometojava
3

Sample Output 0

ava
wel

Explanation 0

String  has the following lexicographically-ordered substrings of length :
wel,elc,lco,com,ome,met,eto,toj,oja,jav,ava;

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
 * 
 *
 */
public class Java_SubString_Comparision {

	

	

	    public static String getSmallestAndLargest(String s, int k) {
	        
	        int a=s.length();
	        String[] s1= new String[a];
	        
	        for(int i=0;i<=s.length()-k;i++)
	        {
	            s1[i]=s.substring(i,i+k);
	            
	           // System.out.print(s1[i]+" ");
	        }
	        String smallest = s1[0];
	        String largest = s1[0];
	        for(int i=0;i<=s1.length-k;i++)
	        {   
	            String a1=s1[i];
	             String b1=s1[i];
	            if((smallest.compareTo(a1))>0)
	            smallest=a1;
	            if((largest.compareTo(b1))<0)
	            largest=b1;
	        }
	        return smallest + "\n" + largest;
	        
	    }


}
