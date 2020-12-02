package com.BasicOfJava.dev;
import java.util.*;
import java.util.Scanner;
/**
 * QUESTION
 * Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting .
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
 *
 */
public class Java_Anagrams_WithoutUsinng_String {
	static boolean isAnagram(String a, String b)
    {int i;
       // Complete the function
	int x=a.length();
	int y=b.length();
	 if(x==y)
       {
        String[] s1=new String[x];
           
           String[] s2=new String[y];
           String ls1=a.toLowerCase();
           String ls2=b.toLowerCase();
           
       for(i=0;i<x;++i)
       {
       	s1[i]=ls1.substring(i,i+1);
       }
       for(i=0;i<y;++i)
       {
       	s2[i]=ls2.substring(i,i+1);
       }
    
       String temp;
       for(i=0;i<x;++i)
       {
       	for(int j=i+1;j<x;++j)
       	{
       		if(s1[i].compareTo(s1[j])>0) {
       			temp=s1[i];
       			s1[i]=s1[j];
       		   s1[j]=temp;
       		   
       		}
       	}System.out.print(s1[i]+" ");
       }
       for(i=0;i<x;++i)
       {
       	for(int j=i+1;j<x;++j)
       	{
       		if(s2[i].compareTo(s2[j])>0) {
       			temp=s2[i];
       			s2[i]=s2[j];
       		   s2[j]=temp;
       		}
       	}System.out.print(s2[i]+" ");
       }
      
StringBuffer sb1=new StringBuffer();
StringBuffer sb2=new StringBuffer();
System.out.println();
for(i=0;i<x;++i)
{
	 sb1.append(s1[i]);
}System.out.println(sb1);
for(i=0;i<x;++i)
{
	 sb2.append(s2[i]);
}System.out.println(sb2);
String sr1=new String(sb1);
String sr2=new String(sb2);
      if(sr1.equals(sr2))
       		return true;
       	else		
       		return false;
   }
else 
	return false;
    }
   public static void main(String[] args)
   {
   
       Scanner scan = new Scanner(System.in);
       String a = scan.next();
       String b = scan.next();
       scan.close();
       boolean ret = isAnagram(a, b);
       System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}